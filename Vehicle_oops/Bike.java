package Vehicle_oops;

public class Bike extends Master {
	private String Type;

	public Bike(int model, int engine, String color, String type) {
		super(model, engine, color);
		Type = type;
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "Bike [Type=" + Type + ", toString()=" + super.toString() + "]";
	
	}
	
	void bikeout() {
		super.Masterout();
		System.out.println("Type = " + Type);
	}

}
