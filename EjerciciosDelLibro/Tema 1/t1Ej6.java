/*
Ejercicio 6
Escribe un programa que pinte por pantalla una pirámide rellena a base de
asteriscos. La base de la pirámide debe estar formada por 9 asteriscos.
 */

public class t1Ej6 {
	
	public static void main (String args[]) {
    System.out.printf("%9s %1s"," ","*");
    System.out.println("");
    System.out.printf("%7s %4s"," ","***");
    System.out.println("");
    System.out.printf("%5s %7s","", "*****");
    System.out.println("");
    System.out.printf("%3s %10s","", "*******");
    System.out.println("");
    System.out.printf("%1s %13s","", "*********");
	}
}

