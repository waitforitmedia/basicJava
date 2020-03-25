package gNumericTypes;

import libs.Input; //que significado tiene el libs?

public class Adder {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is: ");
	    int x = Input.get_int(); //Se declara una variable que tiene un valor imput que el usuario va a agregar
	    
	    // prompt user for y
	    System.out.print("y is: ");
	    int y = Input.get_int();
	    
	    // calculate sum for user
	    System.out.println("sum is " + (x + y) + "\n");   //Es una opreción
	}
}