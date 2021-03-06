package garage;

public class Plane extends Vehicle {

	private int noOfWings;

	public Plane() {
		super();
	}

	public Plane(int weight, int topSpeed, int noOfWheels, int noOfWings) {
		super(weight, topSpeed, noOfWheels);
		this.noOfWings = noOfWings;
	}

	public int getNoOfWings() {
		return noOfWings;
	}

	public void setNoOfWings(int noOfWings) {
		this.noOfWings = noOfWings;
	}

	
	public float calcBill() {
		return noOfWings * 55;
	}

	@Override
	public String toString() {
		return "Plane [noOfWings=" + noOfWings + "," + super.toString() + "]";
	}

	
}