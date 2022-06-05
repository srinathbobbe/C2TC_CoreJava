
public class Srinath11 {
	int rollno;
	String name;
	void insertrecord(int r,String n) {
		rollno=r;
		name=n;
	}
	void displayInformation() {

System.out.println(rollno + " " + name);
	}
	

	public static void main(String[] args) {
		Srinath11 s1 = new Srinath11();

		Srinath11 s2 = new Srinath11();

		s1.insertrecord(111, "Karan");

		s2.insertrecord(222, "Aryan");

		s1.displayInformation();
		s2.displayInformation();

	}

}
