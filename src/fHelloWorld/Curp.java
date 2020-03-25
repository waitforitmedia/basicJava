package fHelloWorld;

import libs.Input;

public class Curp {//(Nombre,ApellitoPaterno,ApellidoMaterno,Sexo,FechaDeNac,EstadoDeNac)

	public static void main(String args[])
	{
		System.out.println("Cual es tu primer nombre? ");
		String name = Input.get_string();
		System.out.println("Cual es tu apellido paterno? ");
		String apellido = Input.get_string();
		System.out.println("Cual es tu apellido materno? ");
		String apellidoM = Input.get_string();
		System.out.println("Cual es tu Genero? ");
		String sexo = Input.get_string();
		System.out.println("Cual es tu año de nacimiento? ");
		String nacimientoAño = Input.get_string();
		System.out.println("Cual es tu mes de nacimiento? ");
		String nacimientoMes = Input.get_string();
		System.out.println("Cual es tu día de nacimiento? ");
		String nacimientoDia = Input.get_string();
		System.out.println("Cual es tu estado de nacimiento? ");
		String estado = Input.get_string();
		obtenerCurp(name,apellido,apellidoM,sexo,nacimientoAño,nacimientoMes,nacimientoDia,estado);
		
		System.out.println("Tu CURP es: "+ name + apellido +  apellidoM + sexo + nacimientoAño + nacimientoDia);
	}

private static void obtenerCurp(String name, String apellido, String apellidoM, String sexo, String nacimientoAño,
		String nacimientoMes, String nacimientoDia, String estado) {
	// TODO Auto-generated method stub
	
}
}