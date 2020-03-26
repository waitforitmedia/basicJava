package gNumericTypes;

import libs.Input;

public class Floats {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is ");
	    float x = Input.get_float();//El valor de la x es el que ingresa el usuario
	    
	    // prompt user for y
	    System.out.print("y is ");//imprime el valor de y para que el usuario ingrese info
	    float y = Input.get_float();
	    
	    // perform division for user
	    System.out.print(x + " divided by " + y + " is " + ( x / y) + "\n");// imprime los valores designados mas la suma de esos.
	}
}