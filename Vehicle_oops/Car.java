package Vehicle_oops;

public class Car extends Master {
	private String fuelType;

	public Car(int model, int engine, String color, String fuelType) {
		super(model, engine,  color);
		this.fuelType = fuelType;
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "Car [fuelType=" + fuelType + ", toString()=" + super.toString() + "]";
	}
	
	void carOut() {
		super.Masterout();
		System.out.println("Fuel Type = " + fuelType);
	}

}
