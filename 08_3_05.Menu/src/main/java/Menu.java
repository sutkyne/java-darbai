
import java.util.ArrayList;
import java.util.Objects;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
public void addMeal(String meal) {
	if (!(meals.contains(meal))) {

		meals.add(meal);
	}
}
public void printMeals() {
	for (String s : meals) {
		System.out.println(s);
	}
}
public void clearMenu() {
	meals.clear();
}
    // implement the required methods here
@Override
public int hashCode() {
	return Objects.hash(meals);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Menu))
		return false;
	Menu other = (Menu) obj;
	return Objects.equals(meals, other.meals);
}
}
