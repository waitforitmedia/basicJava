package fHelloWorld;

import libs.Input; //Esta libreria lleva lo de los strings y sus reglas no que vimos?

public class Hello2 {

	public static void main(String args[])
	{
		System.out.println("Cual es tu nombre? ");//Este imprime texto
		String name = Input.get_string();//aqui declaro la variable string Name y con le input jalo info que me pongan con las reglas de la libreria que declaramos arriba
		System.out.println("hello, "+ name );//En la impreción de texto mas la variable name
	}
}