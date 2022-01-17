

/**
 * Demo used to test the shopping cart class and
 * all methods attached with it
 * @author Ashleigh Rufus
 *
 */
public class ShoppingCartDemo {

	/**
	 * Task: used to create a way to display the cart with the prices, items, and quantities
	 * @param myCart
	 */
	private static void displayCart(ShoppingCart<Item> myCart) {
		System.out.println("The cart contains " + myCart.getCurrentSize() +
		                   " item(s), as follows:");		
		Object[] bagArray = myCart.toArray();
		for (int index = 0; index < bagArray.length; index++) {
			
			Item toDisplay = new Item();
			toDisplay = (Item)bagArray[index];
			
			System.out.print("["+ toDisplay.getName() + " " + toDisplay.getPrice() + " " + toDisplay.getQuantity() + "] \n");
		} // end for
		
		System.out.println();
	} // end displayBag
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creation of the shopping cart
		//ArrayBag <String> bag = new ArrayBag <String> (10);
		ShoppingCart<Item> myCart = new ShoppingCart<Item> ();
		
		//Test if the shopping cart is empty
		System.out.println("Is the cart empty? " + myCart.isEmpty());
		
		//Creating items for the shopping cart
		System.out.println("***********Items have been created*************\nOne will be used as a test of the Item class.\n");
		
		//The item "bread" was used to test each method of the Item class
		Item bread = new Item ("Bread", 2, 4.50, "Half loaf, white bread");
		bread.setItemName("Bread");
		bread.setQuantity(2);
		bread.setItemPrice(4.50);
		bread.setItemInformation("Half loaf, white bread");
		bread.setRecommendations("Sara Lee loaves or French bread are great recommendations!");
		System.out.println(bread.toString());
		
		//Items below were created from the Item class
		Item milk = new Item ("Milk", 1, 2.75, "Pint of whole milk");
		Item eggs = new Item ("Eggs", 2, 2.50, "One dozen cage free eggs");
		Item water = new Item ("Water", 1,  3.75, "24 pack of bottled water");
		Item pButter = new Item ("Peanut butter", 4 , 4.15, "Smooth peanut butter with honey");
		
		//Add items to the shopping cart
		System.out.println("\n**************Now items will be added****************\n");
		System.out.println("Has bread been added? "+ myCart.add(bread));
		System.out.println("Has milk been added? " + myCart.add(milk));
		System.out.println("Have eggs been added? " + myCart.add(eggs));
		System.out.println("Has water been added? " + myCart.add(water));
		System.out.println("Has peanut butter been added? " + myCart.add(pButter));
		
		//Review what is currently in the shopping cart
		
		System.out.println("\nCurrently in the cart: ");
		displayCart(myCart);
		
		//Two more items will be created and add
		Item jelly = new Item ("Jelly", 1, 1.25, "A jar of grape jelly");
		Item bacon = new Item ("Bacon", 1, 6.45, "A pound of bacon");
		
		System.out.println("\n***********More items have been added*************");
		System.out.println("Has jelly been added? " + myCart.add(jelly));
		System.out.println("Has bacon been added? " + myCart.add(bacon));

		//Review & display the shopping cart
		System.out.println("\nCurrently in the cart: ");
		displayCart(myCart);
		
		System.out.println("How many different items are in the cart? " + myCart.getCurrentSize());

		//Display cart's current total
		System.out.println("Here is the current total: $" + myCart.calculateTotalPrice());
		
		//Two items will be removed
		System.out.println("\n********Two items will be removed********");
		System.out.println("I do not need any more eggs. " + myCart.remove(eggs));
		System.out.println("Something else needs to be removed..." + myCart.remove());
		
		//Reviewing the cart & total again
		System.out.println("\nCurrently in the cart: ");
		displayCart(myCart);
		System.out.println("Here is the current total: $" + myCart.calculateTotalPrice());
		
		//Testing frequency of an item in the cart
		System.out.println("\n**********Testing Frequency***********");
		System.out.println("How many milks are in the cart? " + myCart.getFrequencyOf(milk));
		System.out.println("How many peanut butters are in the cart? " + myCart.getFrequencyOf(pButter));
		//This one should print four, but Number of entries does not equate to Item Quantity
		
		//The whole cart needs to be cleared
		System.out.println("\n**********Clear the Shopping Cart*************");
		myCart.clear();
		System.out.println("Is this shopping cart empty? " + myCart.isEmpty());
		
		//Review cart & total
		System.out.println("\nCurrently in the cart: ");
		displayCart(myCart);
		System.out.println("Here is the current total: $" + myCart.calculateTotalPrice());
		
	} //end main

} //end ShoppingCartDemo
