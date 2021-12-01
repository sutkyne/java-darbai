
public class MainProgram {

	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);

		PaymentCard paulCard = new PaymentCard(20);
		PaymentCard mattsCard = new PaymentCard(30);
		paulCard.eatHeartily();
		mattsCard.eatAffordably();
		System.out.println("Paul: "+paulCard);
		System.out.println("Matt: "+mattsCard);
		paulCard.addMoney(20);
		mattsCard.eatHeartily();
		System.out.println("Paul: "+paulCard);
		System.out.println("Matt: "+mattsCard);
		paulCard.eatAffordably();
		paulCard.eatAffordably();
		mattsCard.addMoney(50);
		System.out.println("Paul: "+paulCard);
		System.out.println("Matt: "+mattsCard);
		

//		card.eatAffordably();
//		System.out.println(card);
//		card.eatHeartily();
//		card.eatAffordably();
//		System.out.println(card);
		
//		card.addMoney(-15);
//		System.out.println(card);
//		card.addMoney(10);
//		System.out.println(card);
//		card.addMoney(-200);
//		System.out.println(card);
		

	}
}
