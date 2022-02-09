package PaketasNesReikia;

public class Main {

	public static void main(String[] args) {
		DbEngage dbe = new DbEngage();
		//dbe.instertsNewWorker();
		//dbe.selectSpecificdataFromDarbuotojai();
		dbe.ConvertLastNamesToUpperCase();
		dbe.selectAllDataFromDarbuotojai();
	}

}
