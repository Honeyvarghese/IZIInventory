/**
 * 
 */
package reports;

import java.util.List;

/**
 * @author Honey Varghese
 * This class act as the external api
 */
public class ReportFactory {
	
	public static List<String> getAnimalAverageReport() {
		AnimalAverageFeedingReport animalAverageFeedingReport = new AnimalAverageFeedingReport();
		return animalAverageFeedingReport.generateReport();
	}
	
}
