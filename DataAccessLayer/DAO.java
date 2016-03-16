/**
 * 
 */
package dataAccessLayer;

import java.util.ArrayList;
import java.util.List;

import moduleInterfaces.DataAccessObject;
import vo.Animal;
import vo.Factory;
import vo.FeedRecord;

/**
 * @author Honey Varghese This class is an implementation of the interface
 *         DataAccessObject.
 */
public class DAO implements DataAccessObject {

	private static final String COMMA_DATABASE_DELIMITER = ",";

	/**
	 * 
	 */
	public DAO() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see moduleInterfaces.DataAccessObject#getAllAnimals();
	 */
	@Override
	public List<Animal> getAllAnimals() {
		List<Animal> animals = new ArrayList<Animal>();
		List<String> animalDatabase = Memory.getAnimalDatabase();
		for (String animalData : animalDatabase) {
			String[] animalDataArray = animalData.split(COMMA_DATABASE_DELIMITER);
			Animal animal = Factory.getAnimalVO(animalDataArray[0], animalDataArray[1], animalDataArray[2],
					animalDataArray[3]);
			animals.add(animal);
		}
		return animals;
	}
	
	/**
	 * @param animalId
	 * @return List of feed records of that particular animal
	 */
	@Override
	public List<FeedRecord> getAllFeedRecordsbyAnimalId(String animalId) {
		List<FeedRecord> feedRecords = new ArrayList<FeedRecord>();
		List<String> feedRecordDatabase = Memory.getFeedRecordDatabase();
		for (String feedData : feedRecordDatabase) {
			String[] feedDataArray = feedData.split(COMMA_DATABASE_DELIMITER);
			if (animalId.equals(feedDataArray[0])) {
				FeedRecord feedRecord = Factory.getFeedRecordVO(feedDataArray[0], feedDataArray[1], feedDataArray[2],
						Float.parseFloat(feedDataArray[3]), feedDataArray[4]);
				feedRecords.add(feedRecord);
			}
		}
		return feedRecords;
	}

}
