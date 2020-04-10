package src1.tareas;

import libs.Input;

public class VideoConvert {

	public static void main(String[] args) {
		
		Input.print("Cual es la durancion del video, (mm:ss):");
		String s = Input.get_string();
		String[] tiempo = s.split(":");
		int min = Integer.parseInt(tiempo[0]);
		int seg = Integer.parseInt(tiempo[1]);
		System.out.println("El numero total de seguntos es de: " + (min*60 + seg) + " segundos.");
	}
}