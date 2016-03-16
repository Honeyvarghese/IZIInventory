/**
 * 
 */
package reports;

import java.util.List;

import moduleInterfaces.Report;

/**
 * @author Honey Varghese
 * This class act as the external api
 */
public class ReportFactory {
	
	/**
	 * @return Report of how much each individual animals are fed per day on average
	 */
	public static Report getAnimalAverageReport() {
		return new AnimalAverageFeedingReport();
	}
	
	/**
	 * @return Report of how many times per day are animals fed on average. Group by species.
	 */
	public static Report getSpeciesDailyTimesAverageReport(){
		return new SpeciesDailyTimesAverageReport();
	}
}
