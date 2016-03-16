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

	/**
	 * 
	 */
	protected AnimalAverageFeedingReport(){
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<String> generateReport() {
		DataAccessObject dao = Controller.getDao();
		List<Animal> animals = dao.getAllAnimals();
		List<String> animalAverages = new ArrayList<String>();
		for(Animal animal : animals){
			List<FeedRecord> feedRecords = dao.getAllFeedRecordsbyAnimalId(animal.getAnimalId());
			Map<String,Float> dailyFeed = new HashMap<String,Float>();
			for(FeedRecord f: feedRecords){
				if(dailyFeed.get(f.getDate()) != null){
					Float newVal = dailyFeed.get(f.getDate());
					newVal+=dailyFeed.get(f.getQuantity());
					dailyFeed.put(f.getDate(),newVal);
				}else
					dailyFeed.put(f.getDate(), f.getQuantity());
			}
			Float average = 0f;
			for(Float f: dailyFeed.values()){
				average+=f;
			}
			average/=dailyFeed.keySet().size();
			animalAverages.add(animal.getAnimalId() + " " + average);
		}
		return animalAverages;
	}

}
