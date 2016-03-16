/**
 * 
 */
package moduleInterfaces;

import java.util.List;

/**
 * @author Honey Varghese This interface act as the contract between the UI
 *         modules and the model layeer.
 */
public interface Report {

	/**
	 * @return Formatted report lines
	 */
	public List<String> getReport();
}
