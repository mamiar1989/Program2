package Test2;
import java.util.Scanner;
public class Seprateline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	 // System.out.println("Hello\nAnkur ");
	
	Scanner Boy = new Scanner(System.in);
	System.out.print( "Enter your First name");
	String Fname=Boy.next();
	System.out.println("Enter your last name");
	String Lname=Boy.next();	
	
	System.out.println();
	System.out.println("Hello\n"+ Fname + " "+ Lname);
	
	
	
	}

}
