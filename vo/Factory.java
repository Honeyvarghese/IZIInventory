package vo;

/**
 * @author Honey Varghese Factory method to create VOs
 */
public class Factory {

	private static int animalId = 0; // Animal id generator;

	//Only static functions
	private Factory() {
	};

	/**
	 * @param animalId
	 * @param zooId
	 * @param speciesName
	 * @param foodId
	 * @return Animal object with all the data
	 */
	public static Animal getAnimalVO(String animalId, String zooId, String speciesName, String foodId) {
		return new Animal(animalId, zooId, speciesName, foodId);
	}

	/**
	 * @param animalId
	 * @param zooId
	 * @param foodId
	 * @param quantity
	 * @param date
	 * @return Feed Record VO
	 */
	public static FeedRecord getFeedRecordVO(String animalId, String zooId, String foodId, float quantity,
			String date) {
		return new FeedRecord(animalId, zooId, foodId, quantity, date);
	}
}
