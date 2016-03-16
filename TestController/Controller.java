/**
 * 
 */
package TestController;

import java.io.IOException;

import DataAccessLayer.DAO;
import DataAccessLayer.Memory;
import ModuleInterfaces.DataAccessObject;
import Utils.FileOperations;

/**
 * @author Honey Varghese
 * This class enables the developer to test the model.
 */
public class Controller {

	private static final String ANIMAL_DATABASE_PATH = "Databases\\AnimalDatabase.txt";
	private static final String FEED_RECORD_DATABASE = "Databases\\FeedRecordDatabase.txt";
	private static final String FOOD_INVENTORY_DATABASE = "Databases\\FoodInventoryDatabase.txt";
	
	private static DataAccessObject dao;
	
	/**
	 * Constructor of controller class
	 */
	public Controller() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * Entry point for this project.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		dao = new DAO();
		//Loading the database
		loadDatabase();

	}

	/**
	 * @throws IOException
	 * Loads the text based database to the in-memory database.
	 */
	private static void loadDatabase() throws IOException {
		Memory.setAnimalDatabase(FileOperations.readFile(ANIMAL_DATABASE_PATH));
		Memory.setFeedRecordDatabase(FileOperations.readFile(FEED_RECORD_DATABASE));
		Memory.setFoodInventoryDatabase(FileOperations.readFile(FOOD_INVENTORY_DATABASE));
		
	}

}
