/**
 * 
 */
package reports;

import java.util.ArrayList;
import java.util.List;

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
	public AnimalAverageFeedingReport(){
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<String> generateReport() {
		DataAccessObject dao = Controller.getDao();
		List<Animal> animals = dao.getAllAnimals();
		List<String> animalAverages = new ArrayList<String>();
		for(Animal animal : animals){
			List<FeedRecord> feedRecords = dao.getAllFeedRecordsbyAnimalId(animal.getAnimalId());
		}
		return null;
	}

}
