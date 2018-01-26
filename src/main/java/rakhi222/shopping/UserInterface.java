package shopping;

import java.util.Scanner;

import models.CartItem;
import models.CatalogItem;
import services.CartService;
import services.CatalogService;

public class UserInterface {

	private CartService cartService;
	private CatalogService catalogService;

	public UserInterface(CartService cartService, CatalogService catalogService) {

		this.cartService = cartService;
		this.catalogService = catalogService;
	}

	public void intializeUI() {

		while (true) {

			System.out.println("1. Start/Continue  shopping \n2. View Cart \n3. Exit \n");

			Scanner s = new Scanner(System.in);
		
			String input = s.nextLine();

			switch (input) {

			case "1":
				this.catalogService.getCatalog().showCatalog();
				System.out.println("Select Item to add to cart");
				int itemId = Integer.parseInt(s.nextLine());
				
				System.out.println("Give quantity to add to cart");
				int quantity = Integer.parseInt(s.nextLine());
				
				CatalogItem catalogItem = catalogService.getItemById(itemId);
				this.cartService.addToCart(catalogItem, quantity);
				break;

			case "2":
				this.cartService.showCart();
                 break;
			case "3":
				System.out.println("thank you Bye! Bye !");
				s.close();
				System.exit(0);

			}

		}

	}

}
