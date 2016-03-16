/**
 * 
 */
package reports;

import java.util.List;
import java.util.ResourceBundle.Control;

import dataAccessLayer.DAO;
import moduleInterfaces.DataAccessObject;
import moduleInterfaces.Report;
import testController.Controller;
import vo.Animal;

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
		return null;
	}

}
