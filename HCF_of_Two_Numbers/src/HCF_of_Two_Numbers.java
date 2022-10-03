
public class HCF_of_Two_Numbers {

	public static void main(String[] args) {
		
		int num1 = 60, num2 = 36;	// Declaring and initializing two numbers
		int dividend ;
		int divisor ;		
		
		if(num1>num2) {
			dividend = num1; // Store the Largest number into dividend
			divisor = num2;	 // and smallest number into divisor
		}
		else {
			dividend = num2;
			divisor = num1;
		}

		int reminder = dividend%divisor; // finding the reminder
		while(reminder != 0) {			 //  Staring of while loop
			dividend = divisor;			 // applying the formula of Euclid's Division Algorithm
			divisor = reminder;
			reminder = dividend%divisor;
			
		}
		System.out.println("HCF of ("+ num1+","+num2+") : "+divisor );	// Displaying the HCF of two numbers

	}

}
