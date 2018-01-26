package models;

import java.util.Set;

public class Catalog {

	private  Set<CatalogItem> items;

	public Set<CatalogItem> getItems() {
		return items;
	}

	public void setItems(Set<CatalogItem> items) {
		this.items = items;
	}

	public void showCatalog() {
		System.out.println("Catalog: \n\n" );
		for(CatalogItem item: items){
			System.out.println(item.getId() + "\t" + item.getItemName() + "\t\t\t" + item.getItemPricec() );
		}
	}
	
	public CatalogItem getItemById(int id) {

		for (CatalogItem item : items) {
			if (item.getId() == id) {
				return item;
			}

		}

		return null;

	}
}