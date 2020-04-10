package src2.tareas;

import libs.Input;

public class InicialesFacil {
	
	public static void main(String[] args) {
		
		Input.print("Cual es tu nombre completo? (Primer nombre, Apellidos):");
		String nombre = Input.get_string();
		String[] nombreSeparado = nombre.split(" ");
		int numeroNombres = nombreSeparado.length;
		for(int i = 0; i < numeroNombres; i++) {
			System.out.print(nombreSeparado[i].charAt(0));
		}
		
		//System.out.println("El nombre es: " + primerNombre + " y su apellido es: " + apellidoPaterno + apellidoMaterno);
	}
}
