/**
 * 
 */
package dataAccessLayer;

import java.util.ArrayList;
import java.util.List;

import moduleInterfaces.DataAccessObject;
import vo.Animal;

/**
 * @author Honey Varghese
 * This class is an implementation of the interface DataAccessObject.
 */
public class DAO implements DataAccessObject{

	private static final String COMMA_DATABASE_DELIMITER = ",";

	/**
	 * 
	 */
	public DAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Animal> getAllAnimals() {
		List<Animal> animals = new ArrayList<Animal>();
		List<String>  animalDatabase = Memory.getAnimalDatabase();
		for(String animalData: animalDatabase){
			String[] animalDataArray = animalData.split(COMMA_DATABASE_DELIMITER);
		}
		return null;
	}

}
