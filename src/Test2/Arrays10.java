package Test2;

public class Arrays10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// loop inside the loop 
		
		
int [] [] myNumbers = {{1,2,3,4},{5,6,7,8,9}}; // 
	for (int i=0;i < myNumbers.length;i++)
	{
	for	(int j=0; j< myNumbers[i].length;j++)// we used i in the second line in order to combine 
	{
		System.out.println(myNumbers[i][j]);
	}	
		
	}
	}
}
