import java.util.HashMap;

public class VehicleRegistry {
	private HashMap<LicensePlate, String> owners = new HashMap<>();

	public boolean add(LicensePlate licensePlate, String owner) {
		if (owners.containsKey(licensePlate)) {
			return false;
		} else {
			owners.put(licensePlate, owner);
			return true;

		}

	}

	public String get(LicensePlate licensePlate) {
		return owners.get(licensePlate);
	}

	public boolean remove(LicensePlate licensePlate) {
		if (owners.containsKey(licensePlate)) {
			owners.remove(licensePlate);
			return true;

		}

		return false;
	}

	public void printLicensePlates() {
		owners.forEach((k, v) -> System.out.println(k));
	}

	public void printOwners() {
		HashMap<LicensePlate, String> ownersTemp = new HashMap<>();
		owners.forEach((k, v) -> {
			if (owners.containsValue(v) != ownersTemp.containsValue(v)) {
				System.out.println(v);
				ownersTemp.put(k, v);
			}
		});
	}
}
