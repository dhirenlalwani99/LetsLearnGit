import java.io.*;

public class Sum{
	
	public static void main(String args[])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("\nEnter the first number : ");
		int first = Integer.parseInt(br.readLine());
		
		System.out.print("\nEnter the second number : ");
		int second = Integer.parseInt(br.readLine());
		
		int sum=first+second;
		
		System.out.print("\nSum of "+first+" and "+second+" is : "+sum);
		
	}
	
}