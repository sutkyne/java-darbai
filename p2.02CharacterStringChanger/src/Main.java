public class Main {
    public static void main(String[] args) {
    	String word = "ääliö älä lyö, ööliä läikkyy";
    	Change change1 = new Change('ä', 'a');
    	word = change1.change(word);
    	System.out.println(word);
    	Change Change2 = new Change('ö', 'o');
    	word = Change2.change(word);
    	System.out.println(word);
    	
    	Changer scandiesAway = new Changer();
    	scandiesAway.addChange(new Change('ä', 'a'));
    	scandiesAway.addChange(new Change('ö', 'o'));
    	System.out.println(scandiesAway.change("ääliö älä lyö, ööliä läikkyy"));
    }
}
