package test_Justas_Nominaitis;

import philatelist.Philatelist;
import philatelist.PhilatelistBaseTest;

public class Test extends PhilatelistBaseTest {

	@Override
	protected Philatelist getPhilatelist() {
		// TODO Auto-generated method stub
		return new Myphilatelist();
	}

}
