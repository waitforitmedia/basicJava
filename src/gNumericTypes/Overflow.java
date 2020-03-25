package gNumericTypes;

public class Overflow {

	public static void main(String args[])
	{
		int n = 1;
	    for (int i = 0; i < 64; i++)// es un for para sumarle el doble de su valor 64 veces
	    {
	    	System.out.print("n: " + n + "\n");//Imprime la n: y de ahi el valor que va en la "n" mas un salto de linea
	        n = n * 2;// es la acción
	    }
	}
}