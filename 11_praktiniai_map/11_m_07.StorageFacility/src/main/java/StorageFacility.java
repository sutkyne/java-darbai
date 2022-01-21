import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class StorageFacility {

	private Map<String, ArrayList<String>> hMap;
//	private String unit;
//	private String item;
	public StorageFacility() {
		 hMap = new HashMap<>();
	}
public void add(String unit, String item) {
//	ArrayList<String> itemList = hMap.get(unit);
//	// if list does not exist create it
//	if (itemList == null) {
//		itemList = new ArrayList<String>();
//		itemList.add(item);
//		hMap.put(unit, itemList);
//	} else {
//		// add if item is not already in list
//		if (!itemList.contains(item))
//			itemList.add(item);
//	}
	 this.hMap.putIfAbsent(unit, new ArrayList<>());

     this.hMap.get(unit).add(item);
}
public ArrayList<String> contents(String storageUnit){
//	ArrayList<String> ist;
//	if (!(hMap.containsKey(storageUnit))) {
//
//		return ist = new ArrayList<String>();
//	}
//	return hMap.get(storageUnit);
	 ArrayList<String> emptyList = new ArrayList<>();

     return this.hMap.getOrDefault(storageUnit, emptyList);
}
public void remove(String unit, String item) {
	hMap.get(unit).remove(item);
		if(hMap.get(unit).isEmpty()) {
			hMap.remove(unit);
		}
	
}
public ArrayList<String> storageUnits(){
	ArrayList<String> ist= new ArrayList<String>();
	hMap.forEach((k,v)->{
		if(!(k.isEmpty())) {
			ist.add(k);
		}
	});
	return ist;
}
//@Override
//public int hashCode() {
//	return Objects.hash(item, unit);
//}
//@Override
//public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (!(obj instanceof StorageFacility))
//		return false;
//	StorageFacility other = (StorageFacility) obj;
//	return Objects.equals(item, other.item) && Objects.equals(unit, other.unit);
//}

}
