
public class TestInvItem {

	public static void main(String[] args) {
		InvoiceItem inv= new InvoiceItem("1", "Bananas", 69, 1.99);
		System.out.println(inv.getTotal());
		System.out.println(inv);

	}

}
