import java.util.ArrayList;

/**
 * This class will store an array list of all food items.
 */

public class ItemsModel {
	private ArrayList<Items> itemList;

	public ItemsModel() {
		itemList = new ArrayList<Items>();
	}

	public ItemsModel(ArrayList<Items> itemList) {
		this.itemList = itemList;
	}

	// Retrieves the data stored in menu list
	public ArrayList<Items> getItems() {
		return itemList;
	}

	// Adds the name, calories, fat and protein to list
	public void addItem(String name, int calories, int fat, int protein) {
		itemList.add(new Items(name, calories, fat, protein));
	}
}
