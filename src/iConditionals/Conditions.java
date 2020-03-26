package iConditionals;

import libs.Input;

public class Conditions {

	public static void main(String args[])
	{
		System.out.print("Dame un numero: ");// consición que me dice si un numero es positivo o negativo o 0
		
		int i = Input.get_int();
		if (i < 0)// es con esta opreción que la funcion lo sabe
		{
			System.out.print("negative\n");
		}
		else if (i > 0)
		{
			System.out.print("positive\n");
		}
		else
		{
			System.out.print("zero\n");
		}
	}
}
