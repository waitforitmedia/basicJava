package src1.tareas;

import libs.Input;

public class Aguas {

	public static void main(String args[])
	{
		System.out.println("Cuantos munitos estuviste en la Ducha?");
		int Num = Input.get_int();
		System.out.println("Tu te gastaste "+ (Num * 12) + " litros de Agua");
	}
}