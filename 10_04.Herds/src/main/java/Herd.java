import java.util.ArrayList;
import java.util.Iterator;

public class Herd implements Movable{
	private ArrayList<Movable> org;
	
	
	public Herd() {
		super();
		this.org = new ArrayList<>();
	}
	public void addToHerd(Movable movable) {
		org.add(movable);
	}

	@Override
	public void move(int dx, int dy) {
		for (Movable movable : org) {
			movable.move(dx, dy);
		}
		
	}
	@Override
	public String toString() {
		String tempString="";
		for (Movable movable : org) {
			tempString+=movable+"\n";
		}
		return tempString;
	}
	

}
