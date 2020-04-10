package src2.tareas;

import libs.Input;

public class SegundosDificil {
	public static void main(String[] args) {
		
		Input.print("¿Cual es la durancion del video en segundos?");
		int segundos = Input.get_int();
		int m = (segundos/60);
		int s = (segundos%60);
		String min = m + "";
		String seg = s + "";
		if(min.length() == 1) {
			min = "0" + min;
		}
		
		if(seg.length() == 1) {
			seg = "0" + seg;
		}
		System.out.println("La duración es de: " + min + ":" + seg);
	}
}