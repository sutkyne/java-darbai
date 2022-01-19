package test_Justas_Nominaitis;

import java.util.ArrayList;
import java.util.List;

import philatelist.Philatelist;
import philatelist.PostStamp;

public class Myphilatelist implements Philatelist {
	private List<PostStamp> pst = new ArrayList<>();

	@Override
	public void addToCollection(PostStamp postStamp) {
		if (postStamp == null || postStamp.getName() == "" || postStamp.getName() == null) {
			throw new IllegalArgumentException();
		}
		if (!(pst.contains(postStamp))) {
			pst.add(postStamp);

		}

	}

	@Override
	public double getAveragePostStampPrice() {
		// TODO Auto-generated method stub
		return pst.stream().mapToDouble(v -> v.getMarketPrice()).average().orElse(0);
	}

	@Override
	public int getNumberOfPostStampsInCollection() {

		return pst.size();
	}

	@Override
	public PostStamp getTheMostExpensivePostStamByMarketValue() {
		// TODO Auto-generated method stub
		double max = pst.stream().mapToDouble(v -> v.getMarketPrice()).max().orElse(0.0);
		PostStamp pstmp = pst.get(0);
		for (PostStamp postStamp : pst) {
			if (postStamp.getMarketPrice() == max) {
				pstmp = postStamp;
			}
		}

		return pstmp;
		// oneline
		// return Collections.max(pst, Comparator.comparing(PostStamp::getMarketPrice));
	}

}
