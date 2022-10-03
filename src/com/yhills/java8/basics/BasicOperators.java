package com.yhills.java8.basics;

public class BasicOperators {
	
   public static void main(String[] args) {
//  Assignment Operator
	
	int x = 89; // in this the assignment operator is the sign equals to (=).

//  unary operators it has 2 types (a). increment it's used to increase value by 1 or decrease value by 1. (b). shorthand is use to increase or decrease value that is more than 1.
	
	// suppose i want to increase x. x++ (post increment), x-- (post decrement), short hands are:x+=2. or x+=4
	
	int y = 90;
	y++ ;
	System.out.println(y);
	
	
	y-- ;
	System.out.println(y);
	
	int  num = 200;
	num = ++num - --num + --num + num-- -num++ -num++ + ++num +num++ ;
			System.out.println(num);
			
// shorthand oPerators
			x+=4; // it simply means x= x+4 = 89+4=93 
			x-=5; // it simply means x= x-5 =93-5= 88
          System.out.print(x);
          
          int z = 34;
          z *=10; // it means z=z multiply by 10 = 340
          System.out.println(z);
          
          int w =20;
          System.out.println(w++); // if it's written like this it would bring 20 as output beacuse it will first use the number before adding the increment.note this is not applicable to pre increment and decrement
          System.out.println(w); // it's after adding this that the output will be 21
          
          byte litresOfPetrol = Byte.MAX_VALUE;// byte maximum value = 127
          litresOfPetrol+=4;// so if this is added, it will reverse this to the negative side (minimum value -128) so by adding +4  it would be 127 which has reach the maximum value so it would be 127+4 = -125 
          System.out.println(litresOfPetrol);
          
          litresOfPetrol =Byte.MIN_VALUE;
          System.out.println(litresOfPetrol);//the minimum value of byte = -128
          
 //  comparison oPerator
          if(num != y) // any arguments put in IF must return a boolean value
          System.out.println(true);
       else
          System.out.println(false);
          
 //   Bitwise oPerators
          int example = 8;
          example = 32 >> 2; // Basically, its calculated by converting it to base two(binary) then adding 3 zeros nw back to base 10.  in this, the >> = 2 so it means 8/2 = 4 once. assuming it is 32 >> 2 it's 32/2*2 = 8 output is that and also this concept is called  right shift 
          System.out.println(example);
          
          example = 7 << 3;  // in this, the << = 2 also meaning 7 would be multiply by 2 in three times (7*2*2*2 = 56) its called left shift
          System.out.println(example);
          
          
 //    Java can store numbers in other format but will always print in decimal format
          
          int bin = 0b101001;
          System.out.println(bin);//BINARY IT'S MUST START WITH '0b'
          
          int oct = 0101701;
          System.out.println(oct);// octal it's must start with '0'
          
          
          int hex = 0x3789A;
          System.out.println(hex);
          
     }
}