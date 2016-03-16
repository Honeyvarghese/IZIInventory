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
 * Generates the individual animal average report.
 */
public class AnimalAverageFeedingReport  implements Report{

	private static final String REPORT_HEADER = "Animal ID,Daily Feed Average Quantity";
	private static final String REPORT_DELIMITER = ",";

	/**
	 * 
	 */
	protected AnimalAverageFeedingReport(){
		// TODO Auto-generated constructor stub
	}

	/*
	 * This function returns the report 
	 * (non-Javadoc)
	 * @see moduleInterfaces.Report#generateReport()
	 */
	@Override
	public List<String> getReport() {
		DataAccessObject dao = Controller.getDao(); //database access
		List<Animal> animals = dao.getAllAnimals(); //all animals in database
		List<String> animalAverages = new ArrayList<String>();//animal feeding quantity averages.
		animalAverages.add(REPORT_HEADER);//adding headers.
		for(Animal animal : animals){
			List<FeedRecord> feedRecords = dao.getAllFeedRecordsbyAnimalId(animal.getAnimalId()); //getting all feed record of the individual
			Map<String,Float> dailyFeed = new HashMap<String,Float>();
			for(FeedRecord f: feedRecords){
				if(dailyFeed.get(f.getDate()) != null){
					Float newVal = dailyFeed.get(f.getDate());
					newVal+=dailyFeed.get(f.getDate());
					dailyFeed.put(f.getDate(),newVal);
				}else
					dailyFeed.put(f.getDate(), f.getQuantity());
			}
			Float average = 0f;
			for(Float f: dailyFeed.values()){
				average+=f;
			}
			average/=dailyFeed.keySet().size(); //Calculating the average daily feed quantity
			animalAverages.add(animal.getAnimalId() + REPORT_DELIMITER + average);
		}
		return animalAverages;
	}

}
