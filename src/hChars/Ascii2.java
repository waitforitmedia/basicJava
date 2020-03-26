package hChars;

import libs.Input;

public class Ascii2 {

	public static void main(String[] args) {
		for (char c = 'A'; c <= 'Z'; c++)
	    {
			int actual = (int) c;
	        Input.print(c + " is " + actual + "\n" );//Imprime la letra i y luego el valor entero de la letra i que es un numero y le va sumando 1
	    }

	}

}
