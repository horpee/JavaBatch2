package java8.oops.basics;

public class Employee {

	String name;
	long empId;
	int attendance;
	String companyName;
	
	int checkIn() {
 	int  attendance =0;
	System.out.println("Checked In" + System.currentTimeMillis());
	attendance++;
	this.attendance++;
	return 1;
	}
}
