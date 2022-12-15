package test1;
import java.util.Scanner;
public class FSNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int firstnum,secondnum;
		int sum_even= 0;;
		int even = 0;
		int odd = 0;
		int sum_odd= 0;
		int count = 0;
		
		System.out.println("Enter first Integer: ");
		firstnum=scan.nextInt();
		
		System.out.println("Enter second Integer must be larger than first integer: ");
		secondnum=scan.nextInt();
		
		if(firstnum<secondnum) {
			for(int  i = firstnum; i<=secondnum;i++)
			{
				if(firstnum%2==0)
				{
					System.out.println(firstnum+"is even");
					sum_even = sum_even + firstnum;
				}
				else
				{
					System.out.println(firstnum+"is odd");
					sum_odd = sum_odd + firstnum;
				}
				firstnum++;
			}
			System.out.println("sum of all even number is : "+sum_even);
			System.out.println("sum of all odd number is : "+sum_odd);
			
			
		}
   }
}
