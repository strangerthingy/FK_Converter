package test;
import java.util.Scanner;  // Import the Scanner class

public class JK_Converter {
		static float Fahrenheit_to_Kelvin( float F )
		{
		    return 273.5f + ((F - 32.0f) * (5.0f/9.0f));
		}
	  public static void main (String args[])  
	    { float Fahrenheit, Celsius;  
	    	System.out.print("Input Fahrenheit: ");
	          Scanner myObj = new Scanner(System.in);
	          Fahrenheit = myObj.nextFloat();
	          Celsius  = ((Fahrenheit-32)*5)/9;  
	          float F = 100;
	          System.out.print("Temperature in Kelvin ( K ) = "
	                          + (Math.round(Fahrenheit_to_Kelvin( F )
	                                              *1000.0)/1000.0)) ;
	    }
	  
}  

