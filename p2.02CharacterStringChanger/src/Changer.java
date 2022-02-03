import java.util.ArrayList;
import java.util.List;

public class Changer {
 private List<Change> ist;
	public Changer() {
		ist = new ArrayList<>();
	}
	public void addChange(Change change) {
		ist.add(change);
	}
	public String change(String characterString) {
		
		for (Change ch : ist) {
			characterString=ch.change(characterString);
		}
		
		return characterString;
		
	}
}
