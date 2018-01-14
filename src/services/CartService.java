package services;

import models.Cart;
import models.CartItem;
import models.CatalogItem;

public class CartService {

	private Cart cart = new Cart();

	public Cart getCart() {
		return this.cart;
	}

	public void addToCart(CatalogItem item, int quantity) {

		CartItem cartItem = new CartItem(item, quantity);
		this.cart.addItem(cartItem);

	}

	public void showCart() {

		this.cart.showCart();

	}

}
