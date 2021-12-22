
public class Organism implements Movable{
private int x;
private int y;


	public Organism(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}


	@Override
	public void move(int dx, int dy) {
		this.x+=dx;
		this.y+=dy;
		
	}


	@Override
	public String toString() {
		return "x: " + x + "; y: " + y;
	}

}
