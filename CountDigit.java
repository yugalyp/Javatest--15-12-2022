package test1;
import java.util.Scanner;
public class CountDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int digit;
		int count = 0;
		System.out.println("Enter Number: ");
		digit = scan.nextInt();
		if(digit>0)
		{
			while(digit>0) {
				digit=digit/10;
				count++;
			
			}
			
		}
		else {
			System.out.println("Invalid Input");
		}
		    System.out.println("There Are " + count +" Digits in the number");
		

	}

}
