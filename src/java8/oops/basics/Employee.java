package java8.oops.basics;

public class Employee {

	String name;
	long empId;
	int attendance;
	String companyName;
	
	int checkIn() {
    //int  attendance =0;
	System.out.println("Checked In" + System.currentTimeMillis());// the scope of logging in
	attendance++;
	this.attendance++; 
	return 10;
	}
	
	
	void checkMails() {
		System.out.println("Checked mails");
	}
	
	void checkTeams() {
		System.out.println("TEAMS checked for meeting");
	}

}
