import java.util.ArrayList;

/**
 * This class will store an array list of all exercise items.
 */

public class ExerciseModel {
	// This list will store each menu item's name and calories, and fat
	private ArrayList<ExItems> exerciseList;

	public ExerciseModel() {
		exerciseList = new ArrayList<ExItems>();
	}

	public ExerciseModel(ArrayList<ExItems> exerciseList) {
		this.exerciseList = exerciseList;
	}

	// Retrieves the data stored in menu list
	public ArrayList<ExItems> getExerciseItems() {
		return exerciseList;
	}

	// Adds the name and calories burnt to list
	public void addExerciseItem(String exName, int calBurnt) {
		exerciseList.add(new ExItems(exName, calBurnt));
	}
}