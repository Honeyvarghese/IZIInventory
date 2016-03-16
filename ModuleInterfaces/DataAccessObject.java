/**
 * 
 */
package moduleInterfaces;

import java.util.List;

import vo.Animal;

/**
 * @author Honey Varghese This interface acts as the contract between the
 *         persistance layer and the model layer.
 */
public interface DataAccessObject {

	public List<Animal> getAllAnimals();
	
}
