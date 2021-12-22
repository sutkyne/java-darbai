
public abstract class Animal {
private String name;

public Animal(String name) {
	super();
	this.name = name;
}
public void sleep() {
	System.out.println(getName()+" sleeps");
}
public void eat() {
System.out.println(getName()+" eats");	
}
public String getName() {
	return name;
}

}
