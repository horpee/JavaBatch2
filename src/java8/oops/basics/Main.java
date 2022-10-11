package java8.oops.basics;

public class Main {

	public static void main(String[] args) {
		
		Mouse m1 = new Mouse();// keyword 'new' is used to create an object. NB: object can be stored using variable of its own.where m1 = variable, Mouse= custom variable/ type of m1. and new Mouse(); = is the object.
        
		m1.hasTails = true;
		m1.noOfEyes = 2;
		m1.noOfLegs = 4;
		m1.colour = "black";
		m1.spieces = "african rat";
		System.out.println(m1.hasTails);
		System.out.println(m1.noOfEyes);
		System.out.println(m1.noOfLegs);
		System.out.println(m1.colour);
		m1.eat();
		Mouse m2 = new Mouse();
		

		
		
	}

}
