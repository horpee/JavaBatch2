package java8.oops.basics;

public class Mouse {
	
	
	int noOfLegs = 4; // in java integers has a default value of '0'
	int noOfEyes = 2;
	boolean hasTails =true; // in java boolean has a default value of 'false' 
	String colour; // it has default value of 'null'
	String spieces; // it has default value  of "null"

	
	
	void eat() {
		System.out.println(spieces + "is eating");
	}
	
	void sleep () {
		System.out.println(spieces + "is sleeping");
	}
	
}
