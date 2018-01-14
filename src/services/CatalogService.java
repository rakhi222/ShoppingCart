package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

import models.Catalog;
import models.CatalogItem;

public class CatalogService {

	private static final String FILENAME = "resources/catalog.txt";

	private Catalog catalog = new Catalog();

	public CatalogService() {
		this.initializeCatalog();
	}

	public Catalog getCatalog() {
		return this.catalog;
	}

	public CatalogItem getItemById(int id) {

		return this.catalog.getItemById(id);

	}

	private void initializeCatalog() {

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
	}
}
