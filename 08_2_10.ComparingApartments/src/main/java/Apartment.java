
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared) {
    	if (this.squares>compared.squares) {
    		return true;
    	} else {
    		return false;
    	}
    }
    public int priceDifference(Apartment compared) {
    	int firstAptTotlPrice = this.princePerSquare*this.squares;
    	int secondAptTotlPrice = compared.princePerSquare*compared.squares;
    	if (firstAptTotlPrice-secondAptTotlPrice<0) {
    		return (firstAptTotlPrice-secondAptTotlPrice)*-1;
    	} else {
    		return firstAptTotlPrice-secondAptTotlPrice;
    	}
    		}
    public boolean moreExpensiveThan(Apartment compared) {
    	int firstAptTotlPrice = this.princePerSquare*this.squares;
    	int secondAptTotlPrice = compared.princePerSquare*compared.squares;
    	if (firstAptTotlPrice>secondAptTotlPrice) {
    		return true;
    	} else {
    		return false;
    	}
    		}
}
