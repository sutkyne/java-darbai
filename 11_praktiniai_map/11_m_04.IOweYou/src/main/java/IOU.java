import java.util.HashMap;

public class IOU {
	private HashMap<String, Double> hMap;
	public IOU() {
		hMap = new HashMap<>();
	}
	public void setSum(String toWhom, double amount) {
		hMap.put(toWhom, amount);
	}
	public double howMuchDoIOweTo(String toWhom) {
		return hMap.getOrDefault(toWhom, 0.0);
	}
	
	
	}

