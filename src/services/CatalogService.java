package services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;

import models.Catalog;
import models.CatalogItem;
import utility.DBUtil;

public class CatalogService {

	//private static final String FILENAME = "resources/catalog.txt";

	private Catalog catalog = new Catalog();

	public CatalogService() {
		this.initializeCatalogWithDB();
	}

	public Catalog getCatalog() {
		return this.catalog;
	}

	public CatalogItem getItemById(int id) {

		for (CatalogItem item : catalog.getItems()) {
			if (item.getId() == id) {
				return item;
			}

		}

		return null;

	}
	
	private void initializeCatalogWithDB()
	{
		DBUtil db = new DBUtil();
		ResultSet rs =db.initializeDB();
		try {
			HashSet<CatalogItem> items = new HashSet<CatalogItem>();
			while(rs.next())
			{
				
				String itemName = rs.getString(2);
				int id = rs.getInt(1);
				float price = rs.getFloat(3);
				String description = rs.getString(4);
				CatalogItem e = new CatalogItem(id, itemName, price, description);
				items.add(e);
			}
			this.catalog.setItems(items);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	/*private void initializeCatalog() {

		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			HashSet<CatalogItem> items = new HashSet<CatalogItem>();

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				String[] itemDetailArray = sCurrentLine.split(",");
				String itemName = itemDetailArray[1];
				int id = Integer.parseInt(itemDetailArray[0]);
				float price = Float.parseFloat(itemDetailArray[2]);
				String description = itemDetailArray[3];
				CatalogItem e = new CatalogItem(id, itemName, price, description);
				items.add(e);
			}

			this.catalog.setItems(items);
		} catch (IOException e) {
		} finally {
			try {
				if (br != null)
					br.close();

				if (fr != null)
					fr.close();
			} catch (IOException ex) {
			}
		}
	}*/
}
