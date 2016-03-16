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

	/* (non-Javadoc)
	 * @see moduleInterfaces.Report#getReport()
	 */
	@Override
	public List<String> getReport() {
		DataAccessObject dao = Controller.getDao();
		List<Animal> animals = dao.getAllAnimals();
		List<String> animalAverages = new ArrayList<String>();
		Map<String, Float> speciesAverages = new HashMap<String, Float>();
		Map<String, Integer> animalCountbySpecies = new HashMap<String, Integer>();
		for (Animal animal : animals) {
			List<FeedRecord> feedRecords = dao.getAllFeedRecordsbyAnimalId(animal.getAnimalId());
			Map<String, Integer> dailyFeed = new HashMap<String, Integer>();

			for (FeedRecord f : feedRecords) {
				if (dailyFeed.get(f.getDate()) != null) {
					Integer newVal = dailyFeed.get(f.getDate());
					newVal++;
					dailyFeed.put(f.getDate(), newVal);
				} else
					dailyFeed.put(f.getDate(), 0);
			}
			Float average = 0f;
			for (Integer f : dailyFeed.values()) {
				average += f;
			}
			average /= dailyFeed.keySet().size();
			animalAverages.add(animal.getAnimalId() + " " + average);

			if (speciesAverages.get(animal.getSpeciesName()) != null) {
				Float newVal = speciesAverages.get(animal.getSpeciesName());
				newVal += average;
				speciesAverages.put(animal.getSpeciesName(), newVal);
				Integer count = animalCountbySpecies.get(animal.getSpeciesName());
				count++;
				animalCountbySpecies.put(animal.getSpeciesName(), count);
			} else {
				speciesAverages.put(animal.getSpeciesName(), average);
				animalCountbySpecies.put(animal.getSpeciesName(), 1);
			}
		}

		List<String> speciesReport = new ArrayList<String>();
		for (String species : speciesAverages.keySet()) {
			speciesReport.add(species + " " + (speciesAverages.get(species) / animalCountbySpecies.get(species)));
		}

		return speciesReport;
	}

}
