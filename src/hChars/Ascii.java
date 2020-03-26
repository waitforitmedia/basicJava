package hChars;

import libs.Input;

public class Ascii {

	public static void main(String[] args) {
	    for (int i = 65; i < 65 + 26; i++)//Empieza a 65 y es menor que la suma de 65+26 y de ahi le suma 1 
	    {//Dudas?
	    	
	    	char letraActual = (char)i;
	    	Input.print(letraActual + " is " + i + "\n");
	    }

	}

}
