/**
 * 
 */
package vo;

/**
 * @author Honey Varghese
 * This abstract class holds the details about animal species
 */
public abstract class Species {

	private String speciesName; //Species taxonomy name.
	private String foodId; //Food of that species.
	
	public Species(String speciesName, String foodId) {
		this.speciesName = speciesName;
		this.foodId = foodId;
	}

	/**
	 * @return the speciesName
	 */
	public String getSpeciesName() {
		return speciesName;
	}

	/**
	 * @param speciesName the speciesName to set
	 */
	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
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
	
}
