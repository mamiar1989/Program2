package Test1;

public class PremitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Primitive data type 
		
		//byte
		//short
		//int
		//long
		//float
		//double
		//char
		
		
		//Inside Primitive data type there are 2 groupes 
		
		//INTEGER TYPE: INT,BYTE,SHORT,;ONG
		//FLOATING POINT TYPE: DOUBLE AND FLOAT 
	
	
	//byte program  byte is a data type 
	// that can store whole numbers from -128 to 127 , you can use 
		// byte instead of int 
		// 
		byte a=100;
		
		System.out.println(a);
	
		
	//SHORT: is a data type can store whole numbers from -32768 to 32767
		
	// Short 
		short b=32000;
		System.out.println(b);
		
		
		
	// LONG: with Long You have to use  L at the end of the number you want to print 
	
long c =15000000000L;
System.out.println(c);


	//FLOAT

  // We normally use floating point type whenever we need a number with a decimal such as
    // 9.99 or 3.14
   // Float data type store fractional numbers from 3.4e-038 to 3.4e+038 
  // Note Float will end with F
    
     float d=5.75f;
     System.out.println(d);
     
     
     //Double//
     //ble data type can store fractional numbers from 1.7e-308 to 1.7e+308, 
     // please add "d" in the end 
	
        double e=19.99999d;
        System.out.println(e);
	
	     //Scentific Numbers
  //    float and double are used together 
      //e means multiply 
        
        
        float f1=35e3f;
        double d1=12E4d;
        
        System.out.println(f1);
        System.out.println(d1);
       
        
        
        
        //Char   data type used to store a single character 
        // the character must be surrounder by 
        // Single quote 
           
         char bb='A';
         System.out.println(bb);
         
         char ankur='A';
         System.out.println(ankur);
         
  // the non premitive are 
         //string 
         //boolean can be non premitive too because it hase a concept that says non 
         // classes 
         // Array
        
         
     /*    // 1) String ---->  the string data type is used to store a sequence of characters  -text.
              
            String name="Loving";
            System.out.println(name);
            */
            
	
	// BOOLEANS---> data type is declared with keyword----> true and false 

	boolean isJavaFun = true;
	boolean isJavaNotFun = false;
	
	System.out.println(isJavaFun);
	System.out.println(isJavaNotFun);
	
	//Interview points 
	
	
	//1) A Primitive type has always a value, but non primitive data type can be null 
	//    null means when you ask for something but the answer is 0 / or null
	
	// 2)A primitive type starts with lower case letter,  while non primitive type starts  with an upper case letter 
	
	// 3)the size of a primitive type depends on the data type but non primitive types are -----> String, Classes, Interface etc ...
	
	
	}

}
