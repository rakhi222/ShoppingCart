package models;


public class CatalogItem {
	
	private int id;
	private final String itemName;
	private  final Float itemPricec;
	private String description;

	public CatalogItem( int id, String itemName, Float itemPrice ){
		this.itemName = itemName;
		this.itemPricec = itemPrice;
		this.id = id;
	}
	public CatalogItem(int id,String itemName, Float itemPrice, String  description ){
		this(id, itemName, itemPrice);
		this.description= description;

	}
	public int getId() {
		return id;
	}
	public String getItemName() {
		return itemName;
	}
	public Float getItemPricec() {
		return itemPricec;
	}
	public String getDescription() {
		return description;
	}
	
}
