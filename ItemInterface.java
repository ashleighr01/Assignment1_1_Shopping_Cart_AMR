/**
 * 
 * @author arufus
 * Version 1.0
 * 
 * Interface to describe the operations of each item
 *
 */
public interface ItemInterface {

	/**
	 * Task: get the name of the item
	 * @return String of the item's name
	 */
	public String getName();
	
	/**
	 * Task: get the price of the item
	 * @return Double number correlating to item's price
	 */
	public double getPrice();
	
	/**
	 * Task: see if item is available
	 * @return True if item is available, false if not
	 */
	public boolean isAvailable();

	/**
	 * Task: get information on the item
	 * @return String with brief information on item
	 */
	public String getInformation();
	
	/**
	 * Task: show recommended items
	 * @return String of other item names
	 */
	public String getRecommendations();
	
} //end ItemInterface
