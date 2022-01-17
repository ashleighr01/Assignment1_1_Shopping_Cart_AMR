/**
 * 
 * @author Ashleigh Rufus
 * CS215-ON: Assignment1.1
 * Shopping Class used to implement the ADT previously created
 * as well as instantiate the ArrayBag class from Carrano
 *
 * @param <T>
 */
public class ShoppingCart<T> implements ShoppingCartInterface<T> {

	ArrayBag<T> bag = new ArrayBag<T> (10);
	private double currentTotal = 0;
	
	/**
	 * Task: get the number of items in the shopping cart
	 * @return The integer number of items in the shopping cart
	 */
	@Override
	public int getCurrentSize() {
		// TODO Auto-generated method stub
		
		return bag.getCurrentSize();
	} //end getCurrentSize

	/**
	 *Task: see whether the shopping cart is empty
	 * @return True if cart is empty, false if not
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub	
		return bag.isEmpty();
	} //end isEmpty
	
	/**
	 * Task: add a given item to the shopping cart
	 * @param newItem The item to be added
	 * @return True if addition is successful, false if not
	 */
	@Override
	public boolean add(T newItem) {
		// TODO Auto-generated method stub	
		return bag.add(newItem);
	} //end add method for an item

	/**
	 * Task: remove any chosen item from the shopping cart
	 * @return Either removed item, if removal was 
	 * 	successful, null if not
	 */
	@Override
	public T remove() {
		// TODO Auto-generated method stub	
		return bag.remove();
	} //end remove method for any item

	/**
	 * Task: remove a specific item from the shopping cart, if possible
	 * @param anItem The item being removed
	 * @return True if removal was successful, false if not
	 */
	@Override
	public boolean remove(T anItem) {
		// TODO Auto-generated method stub	
		return bag.remove(anItem);
	} //end remove method for specific method

	/**
	 * Task: remove all items from the shopping cart
	 */
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		bag.clear();
	} //end clear

	/**
	 * Task: count how often a specific item is in the shopping cart
	 * @param anItem The item to be counted
	 * @return Number of times anItem appears in shopping cart
	 */
	@Override
	public int getFrequencyOf(T anItem) {
		// TODO Auto-generated method stub
		
		return bag.getFrequencyOf(anItem);
	} //end getFrequencyOf

	/**
	 * Task: calculate the total price of the cart
	 * @return total; the double number that is the outcome of this method
	 */
	@Override
	public double calculateTotalPrice() {
		// TODO Auto-generated method stub
		double total = 0;
		
		for (int count = 0; count < bag.getCurrentSize(); count++) {
			Item item = (Item) bag.toArray()[count];
			total += currentTotal + (item.getPrice() * item.getQuantity());
		} //end for
		return total;
	} //end calculateTotalPrice
	
	/**
	 * Task: used to present all items in one array
	 * @return array with all information from the cart that is specified later
	 */
	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub	
		return bag.toArray();
	} // end toArray

} // end ShoppingCart
