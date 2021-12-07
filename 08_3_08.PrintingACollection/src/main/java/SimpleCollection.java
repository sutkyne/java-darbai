
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
public String printList(ArrayList<String> elements) {
	for (String s : elements) {
		return s;
	}
	return "";
}
	@Override
	public String toString() {
		if(elements.isEmpty()) {
			return "The collection "+name+" is empty.";
		}
		String temp="";
		if(elements.size()<2) {
			for (String string : elements) {
			 temp+=string;
			}
			return "The collection "+ name+" has "+elements.size()+" element:\n"+temp;
			
		} else {
			for (String string : elements) {
				 temp+=string+"\n";
				}
			return "The collection "+ name+" has "+elements.size()+" elements:\n"+temp;
		}
		
	}
    
}
