/**
 * 
 */
package vo;

/**
 * @author Honey Varghese
 * VO for the feed records
 */
public class FeedRecord {

	private String date;
	private float quantity;
	private String foodId;
	private String zooId;
	private String animalId;
	
	/**
	 * @param date
	 * @param quantity
	 * @param foodId
	 * @param zooId
	 * @param animalId
	 */
	public FeedRecord(String animalId, String zooId, String foodId, float quantity, String date) {
		super();
		this.date = date;
		this.quantity = quantity;
		this.foodId = foodId;
		this.zooId = zooId;
		this.animalId = animalId;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the quantity
	 */
	public float getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the foodId
	 */
	public String getFoodId() {
		return foodId;
	}

	/**
	 * @param foodId the foodId to set
	 */
	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}

	/**
	 * @return the zooId
	 */
	public String getZooId() {
		return zooId;
	}

	/**
	 * @param zooId the zooId to set
	 */
	public void setZooId(String zooId) {
		this.zooId = zooId;
	}

	/**
	 * @return the animalId
	 */
	public String getAnimalId() {
		return animalId;
	}

	/**
	 * @param animalId the animalId to set
	 */
	public void setAnimalId(String animalId) {
		this.animalId = animalId;
	}
	
	
}
