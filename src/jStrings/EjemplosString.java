package jStrings;

import libs.Input;

public class EjemplosString {

	public static void main(String[] args) {
		String s = "Mi herramienta favorita es Selenium";
		Input.print("La frase " + s + " tiene " + s.length() + " caracteres.\n");// de donde saca que son 35?

		int numeroCaracteres = s.length();
		for(int i = 0; i < numeroCaracteres; i++) {
			Input.print("El caracter numero " + i +" de la frase " + s + " es " + s.charAt(i) + "\n");// i vale 35?
		}


		Input.print("La frase '" + s + "' contiene 'Selenium'? " + s.contains("Selenium") + "\n");
		Input.print("La frase '" + s + "' comienza con 'Selenium'? " + s.startsWith("Selenium") + "\n");
		Input.print("La frase '" + s + "' comienza con 'Selenium'? " + s.endsWith("Selenium") + "\n");

		String b = "08:30:45";// donde utiliza esto ?
		String[] horario = b.split(":");
		Input.print(b.split(":"));
		String nombreCompleto = "Carlos Saul Gomez";
		String[] nombres = nombreCompleto.split(" ");
		String c = "   Hola    ";
		Input.print(c + "\n");
		Input.print(c.trim() + "\n");// este cuale e sla fu ncion ? el trim?

		Input.print("Input your name: ");
		String nombre = Input.get_string();
		Input.print(nombre + "\n");
		String name = "Pedro Perez";
		System.out.println(name.length());
		System.out.println(name.contains("Pedro"));
		System.out.println(name.startsWith("Pedro"));
		System.out.println(name.endsWith("Perez"));
		System.out.println(name.split(" "));
	}
}
