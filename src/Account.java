
public class Account {

	private int totalPrice = 0;

	public int getTotalPrice() {
		return totalPrice;
	}

	public void addRedPlate() {
		totalPrice += 100;
	}

	public void addBluePlate() {
		totalPrice += 300;
	}

	public void addYellowPlate() {
		totalPrice += 450;
	}

}
