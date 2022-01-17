/**
 * 
 * @author Ashleigh Rufus
 * CS215-ON: Assignment1.1
 * Item Class used to implement methods previously created in ADT
 *
 */
public class Item implements ItemInterface{

	public static Object item;
	private String itemName;
	private int quantity;
	private double itemPrice;
	private String itemInformation;
	private String recommendations;
	
	//Constructors
	public Item() {
		itemName = "";
		quantity = 1 ;
		itemPrice = 1.00;
		itemInformation = "";
		recommendations = "";
	} //end empty-argument constructor
	
	public Item(String name, int quantity, double price, String information) {
		this.itemName = name;
		this.quantity = quantity;
		this.itemPrice = price;
		this.itemInformation = information;
	} //end preferred constructor
	
	//Getters & Setters
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return itemName;
	} //end getName

	public int getQuantity() {
		return quantity;
	} //end getQuantity
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return itemPrice;
	} //end getPrice

	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return true;
		
	} //end isAvailable

	@Override
	public String getInformation() {
		// TODO Auto-generated method stub
		return itemInformation;
	} //end getInformation

	@Override
	public String getRecommendations() {
		// TODO Auto-generated method stub
		return recommendations;
	} //end getRecommendations
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	} //end setItemName
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	} //end setQuantity
	
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	} //end setItemPrice
	
	public void setItemInformation(String itemInformation) {
		this.itemInformation = itemInformation;
	} //end setItemInformation
	
	public void setRecommendations(String recommendations) {
		this.recommendations = recommendations;
	} //end setRecommendations
	
	/**
	 * Task: create a string with all of the information of each created item
	 * @return String with all item's information
	 */
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", quantity=" + quantity + ", itemPrice=" + itemPrice
				+ ", itemInformation=" + itemInformation + ", recommendations=" + recommendations + "]";
	} //end toString

	
} //end Item class
