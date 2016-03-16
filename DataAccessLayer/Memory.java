/**
 * 
 */
package dataAccessLayer;

import java.util.List;

/**
 * @author Honey Varghese
 * This class act as the in-memory database for the project.
 */
public class Memory {

	//Below variables act as the three in-memory databases.
	private static List<String> feedRecordDatabase;
	private static List<String> foodInventoryDatabase;
	private static List<String> animalDatabase;
	
	/**
	 * This class holds the in-memory database for test purposes.
	 */
	public Memory() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the feedRecordDatabase
	 */
	public static List<String> getFeedRecordDatabase() {
		return feedRecordDatabase;
	}

	/**
	 * @param feedRecordDatabase the feedRecordDatabase to set
	 */
	public static void setFeedRecordDatabase(List<String> feedRecordDatabase) {
		Memory.feedRecordDatabase = feedRecordDatabase;
	}

	/**
	 * @return the foodInventoryDatabase
	 */
	public static List<String> getFoodInventoryDatabase() {
		return foodInventoryDatabase;
	}

	/**
	 * @param foodInventoryDatabase the foodInventoryDatabase to set
	 */
	public static void setFoodInventoryDatabase(List<String> foodInventoryDatabase) {
		Memory.foodInventoryDatabase = foodInventoryDatabase;
	}

	/**
	 * @return the animalDatabase
	 */
	public static List<String> getAnimalDatabase() {
		return animalDatabase;
	}

	/**
	 * @param animalDatabase the animalDatabase to set
	 */
	public static void setAnimalDatabase(List<String> animalDatabase) {
		Memory.animalDatabase = animalDatabase;
	}

}
