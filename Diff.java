import java.io.*;

public class Diff{
	
	public static void main(String args[])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("\nEnter the first number : ");
		int first = Integer.parseInt(br.readLine());
		
		System.out.print("\nEnter the second number : ");
		int second = Integer.parseInt(br.readLine());
		
		int difference=first-second;
		
		System.out.print("\nThe Difference between "+first+" and "+second+" is : "+difference);
		
	}
	
}