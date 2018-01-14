package models;

public class CartItem {

	private CatalogItem item;
	private int quantity;

	public CartItem(CatalogItem item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	public String toString() {

		Float itemPrice = this.item.getItemPricec();
		String itemName = this.item.getItemName();
		String cartView = itemName + "\t(" + itemPrice + "X" + this.quantity + ") \t" + itemPrice * quantity;

		return cartView;

	}

	public float itemPrice() {
		float totalItemPrice = this.item.getItemPricec() * this.quantity;

		return totalItemPrice;

	}

}
