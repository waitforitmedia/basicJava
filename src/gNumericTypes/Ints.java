package gNumericTypes;

import libs.Input;

public class Ints {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is ");
	    int x = Input.get_int();
	    
	    // prompt user for y
	    System.out.print("y is ");
	    int y = Input.get_int();
	    //Por que se suman las variables? no van con ",".=???
	    // perform calculations for user
	    System.out.print(x + " plus " + y + " is " + (x + y) + "\n"); // Calcula la suma de los valores enteros
	    System.out.print(x + " minus " + y + " is " + (x - y) + "\n");//Calcula la resta de los valores enteros
	    System.out.print(x + " times " + y + " is " + (x * y) + "\n");//Calcula cuantas veces es un valor y otro en enteros.
	    System.out.print(x + " divided by " + y + " is " + (x / y) + "\n");//Calcula la divición de estos enteros.
	    System.out.print("The reminder of " + x + " over "+ y + " is " + (x % y) + "\n");//El resto de los enteros 
	}
}


