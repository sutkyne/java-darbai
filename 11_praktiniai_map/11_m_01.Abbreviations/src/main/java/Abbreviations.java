import java.util.HashMap;

public class Abbreviations {
private HashMap <String, String> hshMap;
	public Abbreviations() {
		hshMap= new HashMap <String, String>();
	}
	public void addAbbreviation(String abbreviation, String explanation) {
		hshMap.put(abbreviation, explanation);
	}
	public boolean hasAbbreviation(String abbreviation) {
		return hshMap.containsKey(abbreviation);
	}
	public String findExplanationFor(String abbreviation) {
		return hshMap.get(abbreviation);
	}
}
