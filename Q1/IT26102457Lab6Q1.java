import java.util.Scanner;
public class IT26102457Lab6Q1
{
	public static void main(String[]args)
	{
		
		double number;
		double square;
		double squareroot;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the number:");
		number=input.nextDouble();
		
		
		System.out.println(" ");
		square=number*number;
		squareroot=Math.sqrt(number);
		
		System.out.println("The square of "+number+" is :"+square);
		System.out.println("The square root of "+number+" is :"+squareroot);
		
		
		
	}
	
}