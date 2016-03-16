/**
 * 
 */
package moduleInterfaces;

import java.util.List;

import vo.Animal;
import vo.FeedRecord;

/**
 * @author Honey Varghese This interface acts as the contract between the
 *         persistance layer and the model layer.
 */
public interface DataAccessObject {

	/**
	 * @return List of animals in the database
	 */
	public List<Animal> getAllAnimals();

	/**
	 * @param animalId
	 * @return List of feed records of that individual animal.
	 */
	public List<FeedRecord> getAllFeedRecordsbyAnimalId(String animalId);
	
}
