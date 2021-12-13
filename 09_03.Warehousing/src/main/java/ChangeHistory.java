import java.util.ArrayList;

public class ChangeHistory  {
	private ArrayList<Double> products;
	public ChangeHistory() {
		products= new ArrayList<>();
	}
	public void add(double status) {
		products.add(status);
	}
	public void clear() {
		products.clear();
	}
	public double maxValue() {
		double temp=products.get(0);
		for (Double d : products) {
			if(d>temp) {
				temp=d;
			}
		}
		return temp;
	}
	public double minValue() {
		double temp=products.get(0);
		for (Double d : products) {
			if(d<temp) {
				temp=d;
			}
		}
		return temp;
	}
	public double average() {
		double tempPlus=0;
		double tempCount=0;
		for (Double d : products) {
			tempPlus+=d;
			tempCount++;
		}
		return tempPlus/tempCount;
	}
	public String toString() {
//		String str="";
//		for (Double d : products) {
//			str=d+", ";
//		}
//		return str;
		return products.toString();
	}
}
