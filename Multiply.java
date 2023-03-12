import java.io.*;

public class Multiply{
	
	public static void main(String args[])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("\nEnter the first number : ");
		int first = Integer.parseInt(br.readLine());
		
		System.out.print("\nEnter the second number : ");
		int second = Integer.parseInt(br.readLine());
		
		int multiply=first*second;
		
		System.out.print("\nThe Product of "+first+" and "+second+" is : "+multiply);
		
	}
	
}