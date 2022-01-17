/**
 * @author arufus
 * Version 1.0
 * 
 * Interface to describe the operations of a shopping cart
 * 
 */
public interface ShoppingCartInterface <T> {

	/**
	 * Task: get the number of items in the shopping cart
	 * @return The integer number of items in the shopping cart
	 */
	public int getCurrentSize();
	
	/**
	 * Task: show final total price of shopping cart
	 * 
	 */
	public double calculateTotalPrice();
	
	/**
	 *Task: see whether the shopping cart is empty
	 * @return True if cart is empty, false if not
	 */
	public boolean isEmpty();
	
	/**
	 * Task: add a given item to the shopping cart
	 * @param newItem The item to be added
	 * @return True if addition is successful, false if not
	 */
	public boolean add(T newItem );
	
	/**
	 * Task: remove any chosen item from the shopping cart
	 * @return Either removed item, if removal was 
	 * 	successful, null if not
	 */
	public T remove();
	
	/**
	 * Task: remove a specific item from the shopping cart, if possible
	 * @param anItem The item being removed
	 * @return True if removal was successful, false if not
	 */
	public boolean remove(T anItem);
	
	/**
	 * Task: remove all items from the shopping cart
	 */
	public void clear();
	
	/**
	 * Task: count how often a specific item is in the shopping cart
	 * @param anItem The item to be counted
	 * @return Number of times anItem appears in shopping cart
	 */
	public int getFrequencyOf(T anItem);
	
	/**
	 * Task: display all items in the shopping cart
	 * @return A newly allocated array of all items in the cart
	 * 	If the cart is empty, the returned array will be empty
	 */
	public T[] toArray();
} //end ShoppingCartInterface
