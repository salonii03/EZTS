package Vehicle_oops;

public class Bus extends Master {
	
private int passengers;

	public Bus(int model, int engine, String color, int passengers) {
		super(model, engine, color);
		this.passengers = passengers;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Bus [passengers=" + passengers + ", toString()=" + super.toString() + "]";
	}
	
	void busOut() {
		super.Masterout();
		System.out.println("passengers = " + passengers);
	}

}
