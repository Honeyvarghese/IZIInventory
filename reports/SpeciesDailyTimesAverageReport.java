/**
 * 
 */
package reports;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import moduleInterfaces.DataAccessObject;
import moduleInterfaces.Report;
import testController.Controller;
import vo.Animal;
import vo.FeedRecord;

/**
 * @author Honey Varghese
 * This class creates the animal average feeding times grouped by species
 */
public class SpeciesDailyTimesAverageReport implements Report {

	private static final String REPORT_DELIMITER = ",";
	private static final String REPORT_HEADER = "Species,Daily Feed Average Quantity";
	
	
	/**
	 * New instances should be created through report factory. 
	 */
	protected SpeciesDailyTimesAverageReport() {
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see moduleInterfaces.Report#getReport()
	 */
	@Override
	public List<String> getReport() {
		DataAccessObject dao = Controller.getDao(); //dao
		List<Animal> animals = dao.getAllAnimals(); // List of all animals
		List<String> animalAverages = new ArrayList<String>(); // list to hold the individual daily averages
		Map<String, Float> speciesAverages = new HashMap<String, Float>(); // list to hold the species averages
		Map<String, Integer> animalCountbySpecies = new HashMap<String, Integer>(); //list to hold individual count of animals in each species.
		for (Animal animal : animals) {
			List<FeedRecord> feedRecords = dao.getAllFeedRecordsbyAnimalId(animal.getAnimalId()); //getting all the feed records of the individual.
			Map<String, Integer> dailyFeed = new HashMap<String, Integer>(); //daily feed count

			for (FeedRecord feedRecord : feedRecords) {
				if (dailyFeed.get(feedRecord.getDate()) != null) {
					Integer newVal = dailyFeed.get(feedRecord.getDate());
					newVal++;
					dailyFeed.put(feedRecord.getDate(), newVal);
				} else
					dailyFeed.put(feedRecord.getDate(), 1);
			}
			Float averageFeedTime = 0f; //initializing average feed times.
			for (Integer f : dailyFeed.values()) {
				averageFeedTime += f;
			}
			averageFeedTime /= dailyFeed.keySet().size(); // Calculating average feed times 
			animalAverages.add(animal.getAnimalId() + " " + averageFeedTime); //Store animal averages.
			
			//Calculating species total and individual count
			if (speciesAverages.get(animal.getSpeciesName()) != null) {
				Float newVal = speciesAverages.get(animal.getSpeciesName());
				newVal += averageFeedTime;
				speciesAverages.put(animal.getSpeciesName(), newVal);
				Integer count = animalCountbySpecies.get(animal.getSpeciesName());
				count++;
				animalCountbySpecies.put(animal.getSpeciesName(), count);
			} else {
				speciesAverages.put(animal.getSpeciesName(), averageFeedTime);
				animalCountbySpecies.put(animal.getSpeciesName(), 1);
			}
		}

		//Creating the report
		List<String> speciesReport = new ArrayList<String>();
		speciesReport.add(REPORT_HEADER);
		for (String species : speciesAverages.keySet()) {
			speciesReport.add(species + REPORT_DELIMITER + (speciesAverages.get(species) / animalCountbySpecies.get(species)));
		}

		return speciesReport;
	}

}
