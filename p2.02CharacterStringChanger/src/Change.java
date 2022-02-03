
public class Change {
	private char fromWhat;
	private char toWhat;
	
	public Change(char fromCharacter,char toCharacter){
		this.fromWhat = fromCharacter;
		this.toWhat = toCharacter;
	}
	public String change(String characterString) {
		return characterString.replace(fromWhat, toWhat);
	}
	
}
