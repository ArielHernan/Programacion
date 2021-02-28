/*
 * tema8Ej39.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 39
    Crea una función con la siguiente cabecera:
    public String convierteEnPalabras(int n)
    Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en una cadena de caracteres. Por ejemplo, el 470213
    convertido a palabras sería:
    cuatro, siete, cero, dos, uno, tres
    Utiliza esta función en un programa para comprobar que funciona bien. Desde
    la función no se debe mostrar nada por pantalla, solo se debe usar print desde
    el programa principal. Fíjate que hay una coma detrás de cada palabra salvo al
    final.
 */

import static misFunciones.Matematicas.digitoN;
import static misFunciones.Matematicas.digitos;
import misArrays.ArrayUni;
import misArrays.ArrayBi;

public class Tema8Ej39 {
	
	public static void main (String args[]) {
		System.out.println("Introduce un número y de diré el número en palabras:");
    int numero=Integer.parseInt(System.console().readLine());
    System.out.println(numero);

      System.out.println(convierteEnPalabras(numero));
    
	}
  
  public static String convierteEnPalabras(int n){
    
    String[] palabrasNumero={" cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
    String resultado="";
    int i;
    for( i=0;i<digitos(n)-1;i++){
      resultado=resultado+palabrasNumero[digitoN(n,i)]+",";
    }
    resultado=resultado+palabrasNumero[digitoN(n,i)];
    return resultado;
  }
}

