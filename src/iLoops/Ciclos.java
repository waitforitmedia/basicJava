package iLoops;

import libs.Input;

public class Ciclos {

	public static void main(String[] args) {
		//imprimir numeros del 0 al 10 (0  1  2  3  4  5  6  7  8  9  10)
		
		//imprimir la cuenta regresiva de un cohete,  cuando llegue a cero, diga 'despegar'
		

	System.out.println("Cuantas repeticiones quieres? ");
		int numeroRepeticiones = Input.get_int();
		for(int i = 0; i < numeroRepeticiones; i++) {
			hagoAlgo();
		}
	}

	private static void hagoAlgo() {
		int numero  = 0;// contador
		while(numero <= 10) {// condición
			Input.print(numero);
			Input.print("  ");
			numero += 1; // actualización del contador
		}
		Input.print("\n");
		numero=10;//Contador que inicia en 10
		while (numero >= 0) {//condición
			if(numero == 0) {//Condión dos adentro del ciclo while
				Input.print("despegar");
				
			}
			else {
				Input.print(numero);
				Input.print("  ");
				
			}
			numero -= 1;// Actualización del contador
		}

		Input.print("\n");
	}


}
