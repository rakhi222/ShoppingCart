package shopping;

import services.CartService;
import services.CatalogService;

public class App {

	public static void main(String Args[])
	{
	CatalogService catalogService = new CatalogService();
		CartService cartService = new CartService();
		
		new UserInterface(cartService, catalogService).intializeUI();
		
	}
}
