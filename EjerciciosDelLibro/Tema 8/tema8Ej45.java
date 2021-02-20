/*
 * tema8Ej45.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
Ejercicio 45
Realiza un programa que pinte un valle tal como se muestra en los ejemplos. El
usuario debe introducir la altura de la figura. Podemos suponer que el usuario
introduce una altura mayor o igual a 3.
Funciones 155
Ejemplo 1:
Introduzca la altura de la figura: 8
*             *
**           **
***         ***
****       ****
*****     *****
******   ******
******* *******
***************
 * 
 */
 import java.util.Scanner;
public class tema8Ej45 {
	
	public static void main (String args[]) {
    
		Scanner s=new Scanner(System.in);
    
    System.out.println("Introduce el simbolo:");
    char simbolo=s.next().charAt(0);
    
    System.out.println("Introduce la altura");
    int altura=s.nextInt();
    
    for(int i=1;i<altura;i++){
      System.out.print(linea(simbolo,i));
      System.out.print(linea(' ',(altura*2)-(i*2)-1));
      System.out.print(linea(simbolo,i));
      System.out.println();
    }
    System.out.println(linea('*', altura * 2 - 1));
	}

    public static String linea(char caracter, int repeticiones) {

    String resultado = "";

    for (int i = 0; i < repeticiones; i++) {
      resultado += caracter;
    }
    return resultado;
  }
}

