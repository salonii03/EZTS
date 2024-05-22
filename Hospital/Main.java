package Hospital;

public class Main {
	
	public static void main(String[]args) {
		
		Person person =new Person("Vijay", 42, "M");
		System.out.println(person.toString());
		person.personOut();
		
		Doctor doctor = new Doctor("Dr.Anandi", 38, "F", "Neurologists");
		System.out.println(doctor.toString());
		doctor.doctorOut();
		
		Patient patient = new Patient("Ishika", 50, "F", "diabetics", 111);
		System.out.println(patient.toString());
		patient.patientOut();
		
		Nurse nurse = new Nurse("Anjali", 30, "F", "Floor 5");
		System.out.println(nurse.toString());
		nurse.nurseOut();
				
	}

}
