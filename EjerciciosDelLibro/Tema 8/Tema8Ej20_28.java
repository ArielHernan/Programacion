
import misArrays.ArrayUni;
import java.util.Scanner;
/**
 * 
 * tema8FunEj20_28.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
     Ejercicios 20-28
    Crea una biblioteca de funciones para arrays (de una dimensión) de números
    enteros que contenga las siguientes funciones:
    1. generaArrayInt: Genera un array de tamaño n con números aleatorios
    cuyo intervalo (mínimo y máximo) se indica como parámetro.
    2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
    3. maximoArrayInt: Devuelve el máximo del array que se pasa como
    parámetro.
    4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
    5. estaEnArrayInt: Dice si un número está o no dentro de un array.
    6. posicionEnArray: Busca un número en un array y devuelve la posición
    (el índice) en la que se encuentra.
    7. volteaArrayInt: Le da la vuelta a un array.
    8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un
    array.
    9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de
    un array.
 * 
 */
public class Tema8Ej20_28 {
	
	public static void main (String args[]) {
    Scanner s=new Scanner(System.in);
    
    int[] array= misArrays.ArrayUni.generaArrayInt(15,100,200);
    
    System.out.println("El Array generado aleatoriamente es:");
    misArrays.ArrayUni.muestraArrayInt(array);
    System.out.println();
    System.out.println();
    
    System.out.println("El número mínimo del array es:"+misArrays.ArrayUni.minimoArrayInt(array));
    System.out.println();
    System.out.println();
        
    System.out.println("El número maximo del array es:"+misArrays.ArrayUni.maximoArrayInt(array));
    System.out.println();
    System.out.println();
    
    System.out.println("Introduce un número y te dire si esta en el array:");
    int n=Integer.parseInt(System.console().readLine());
    if(misArrays.ArrayUni.estaEnArrayInt(array,n)){
      System.out.println("En numero "+n+" esta en el array");
    }else{
      System.out.println("En numero "+n+" No esta en el array");
    }
    System.out.println();
    System.out.println();
    
    System.out.println("Introduce un número y te dire la posicion en el  array:");
    n=Integer.parseInt(System.console().readLine());
    System.out.println("El número "+n+" está en la posicion: "+misArrays.ArrayUni.posicionEnArray(array,n));
    System.out.println();
    System.out.println();
    
    System.out.println("El array generado antes:");
    misArrays.ArrayUni.muestraArrayInt(array);
    System.out.println();
    System.out.println("dado la vuelta es: ");
    misArrays.ArrayUni.muestraArrayInt(misArrays.ArrayUni.volteaArrayInt(array));
    System.out.println();
    System.out.println();
    System.out.println();
    
    System.out.println("Rota a la derecha n posiciones en un array,");
    System.out.println("Dime cuantas posiciones quieres rotar:");
    int num=s.nextInt();
    System.out.println("El array rotado a la deecha es::");
    misArrays.ArrayUni.muestraArrayInt(misArrays.ArrayUni.rotaDerechaArrayInt(array,num));
    System.out.println();
    System.out.println();
    
    System.out.println("Rota a la izquierda n posiciones en un array,");
    System.out.println("Dime cuantas posiciones quieres rotar:");
    num=s.nextInt();
    System.out.println("El array rotado a la izquierda es::");
    misArrays.ArrayUni.muestraArrayInt(misArrays.ArrayUni.rotaIzquierdaArrayInt(array,num));
    System.out.println();
    System.out.println();
    
    
    

    
    
    
    
    
    
    
    
    
	}
}

