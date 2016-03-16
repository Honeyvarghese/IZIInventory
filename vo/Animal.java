package vo;

/**
 * @author Honey Varghese
 * This object is a model for individual animals.
 */
public class Animal extends Species{
	
	private String animalId; // Unique id for each animal.
	private String zooId; //Unique id for each zoo.
	
	/**
	 * @param animalId
	 * @param zooId
	 * @param speciesName
	 * @param foodId
	 */
	protected Animal(String animalId, String zooId, String speciesName, String foodId){
		super(speciesName,foodId);
		this.animalId = animalId;
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

}
