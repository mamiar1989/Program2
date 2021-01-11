package Test2;
import java.util.Scanner;
public class Get_User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Input the first number");
		int num1 = input.nextInt();
	     System.out.println("input the second number");
	     int num2 = input.nextInt();
	      int sum= num1+num2;
	      System.out.println();
	    	System.out.println("sum:"+sum);	 
		
	}

}
