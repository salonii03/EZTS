package Vehicle_oops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master vehicle = new Master(2010,999,"red");
		
		System.out.println(vehicle.toString());
		vehicle.Masterout();
		
		Bike b = new Bike(2010, 99,"blue","Sports");
		System.out.println(vehicle.toString());
		b.bikeout();
		
		Bus bus = new Bus(2020, 900, "green", 100);
		System.out.println(bus.toString());
		bus.busOut();
		
		Car car = new Car(2025, 1900, "grey", "Diesel");
		System.out.println(car.toString());
		car.carOut();
		

	}

}
