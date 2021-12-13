
public class ProductWarehouseWithHistory extends ProductWarehouse {
	private ChangeHistory ch;

	public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
		super(productName, capacity);
		this.ch = new ChangeHistory();

		ch.add(initialBalance);
		super.addToWarehouse(initialBalance);
	}

	@Override
	public void addToWarehouse(double amount) {
		// TODO Auto-generated method stub
		super.addToWarehouse(amount);
		ch.add(super.getBalance());
	}

	@Override
	public double takeFromWarehouse(double amount) {
		// TODO Auto-generated method stub
		double amt = super.takeFromWarehouse(amount);
		ch.add(super.getBalance());
		return amt;

	}
	public void printAnalysis() {
		System.out.println("Product:"+super.getName()+
				"\n History:"+history()+
				"\n Largest amount of product:"+ch.maxValue()+
				"\n Smallest amount of product:"+ch.minValue()+
				"\n Average: "+ch.average());
	}

	public String history() {
		return ch.toString();
	}

	@Override
	public String toString() {
		return ch.toString();
	}

}
