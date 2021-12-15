
public class CD implements Packable {
	private String artist;
	private String nameCd;
	private int pubYear;
	private double weightCd;

	public CD(String artist, String nameCd, int pubYear) {
		super();
		this.artist = artist;
		this.nameCd = nameCd;
		this.pubYear = pubYear;
		this.weightCd = 0.1;
	}

	@Override
	public double weight() {
		// TODO Auto-generated method stub
		return this.weightCd;
	}

	@Override
	public String toString() {
		return artist + ": " + nameCd + " (" + pubYear + ")";
	}

}
