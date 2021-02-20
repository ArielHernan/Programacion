/*
 * tema8Ej46.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
 Ejercicio 46
Realiza un programa que pinte un valle tal como se muestra en los ejemplos. El
usuario debe introducir la altura de la figura. Podemos suponer que el usuario
introduce una altura mayor o igual a 3.
Ejemplo 1:
Introduzca la altura de la figura: 8


*             *
**           **
* *         * *
*  *       *  *
*   *     *   *
*    *   *    *
*     * *     *
***************
 */

import java.util.Scanner;
public class tema8Ej46 {
	public static void main (String args[]) {
			
    Scanner s=new Scanner(System.in);
    System.out.println("introduce la altura");
    int altura=s.nextInt();
    System.out.println("introduce el caracter");
    char simbolo=s.next().charAt(0);
    
    System.out.println(simbolo+linea(' ',(altura*2)-3)+simbolo);
    System.out.println(simbolo+simbolo+linea(' ',(altura*2)-5)+simbolo+simbolo);
    
    for(int i=1;i<=altura-3;i++){
      System.out.print(simbolo+linea(' ',(altura*2-4)-i)+simbolo);
    }
    System.out.println(linea(simbolo,altura-3));
    
	}
  
  
  public static String linea(char caracter, int repeticiones) {

    String resultado = "";

    for (int i = 0; i < repeticiones; i++) {
      resultado += caracter;
    }
    return resultado;
  }
}

