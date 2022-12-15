package test1;
import java.util.Scanner;
public class pinverification {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pin = 62654;
		int count = 0;
		
		
		
		for(int i = 0; i<=3 ; i++)
			{
			   System.out.println("Welcome to state bank of india");
		       System.out.println("Enter Your Pin: ");
		       int enter_pin= scan.nextInt();
		
		  if(enter_pin == pin)
		{
			System.out.println("Pin Accepted,YOU HAVE NOW ACCESS TO YOUR ACCOUNT");
			break;
		}
		  else {
			  count++;
			  if(count>=3) {
				  System.out.println("Sorry Your Account is Locked");
			  }
			  System.out.println("YOU ENTERD INCORRECT PIN....PLEASE TRY AGAIN");
		  }
	        

	}
	}
}


