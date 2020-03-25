package gNumericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) { 
		float f = Input.get_float();//Se declara la variable float como input
		
		float f2 = Input.get_float();//Entran negativos y con decimales.
		
		Input.print("f/f2 = " + (f/f2)); //Puedo dividir varios numeros con decimales entre la variuable 1 y la 2
	}
}