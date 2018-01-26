package models;

import java.util.HashSet;
import java.util.Set;

public class Cart {

	Set<CartItem> cartItems = new HashSet<CartItem>();

	public Set<CartItem> getCartItems() {
		return this.cartItems;
	}

	public void addItem(CartItem cartItem) {
		cartItems.add(cartItem);

	}

	public void removeItem(CartItem cartItem) {
		cartItems.remove(cartItem);

	}

	public void showCart() {

		System.out.println("My Cart Items:");

		for (CartItem cartItem : cartItems) {
			System.out.println(cartItem.toString());
		}

		System.out.println("Total " + calculateTotalCart());

	}

	private float calculateTotalCart() {

		float total = 0;

		for (CartItem cartItem : cartItems) {
			total = total + cartItem.itemPrice();
		}

		return total;

	}

	public CartItem getItemById(int id) {

		for (CartItem item : cartItems) {
			if (item.getItemId() == id) {
				return item;
			}

		}

		return null;

	}

}
