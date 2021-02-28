/*
 * Tema8Ej56.java
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
    Ejercicio 56
    Implementa una función con nombre corteza que sea capaz de extraer la capa
    exterior de un array bidimensional. Esta capa se extrae en forma de array de
    una dimensión. La extracción de números comienza en la esquina superior
    izquierda y continúa en el sentido de las agujas del reloj. Se debe entregar
    tanto el código de la función como el código de prueba que la usa. La cabecera
    de la función es la siguiente:
    public static int[] corteza(int[][] n)
    Por ejemplo, si el array bidimensional a es el que se muestra a continuación:
    
    45 92 14 20 25 78
    35 72 24 45 42 60
    32 42 64 23 41 39
    98 45 94 11 18 48
    * 
    El array unidimensional generado por corteza(a) sería el siguiente:
    45 92 14 20 25 78 60 39 48 18 11 94 45 98 32 35
 */
import misArrays.ArrayBi;
import misArrays.ArrayUni;
public class Tema8Ej56 {
	
	public static void main (String args[]) {
    System.out.println("Este programa le quita la ultima capa a un array y lo convierte en un uni, Este es el array:");
    System.out.println();
    int[][] array= misArrays.ArrayBi.generaArrayBiInt(4,4,1,100);
    misArrays.ArrayBi.presentaArrayBiInt(array);
    System.out.println();
    System.out.println("El array uni es:");
    misArrays.ArrayUni.muestraArrayInt(corteza(array));
	}
  
  
  public static int[] corteza(int[][] n){
    
    int fila=n.length;
    int columna=n[0].length;
    
    int[] resultado=new int[columna*2+fila*2-4];
    
    int posicion=0;
    
    //fila superior
    
    for(int i=0;i<columna-1;i++){
      resultado[posicion]=n[0][i];
      posicion++;
    }
    
    //columna derecha
    
    for(int i=0;i<columna-1;i++){
      resultado[posicion]=n[i][columna-1];
      posicion++;
    }
      
    //fila inferior
    
    for(int i=columna-1;i>0;i--){
      resultado[posicion]=n[fila-1][i];
      posicion++;
    }
    
    //columna izquierda
    for(int i=fila-1;i>0;i--){
      resultado[posicion]=n[i][0];
      posicion++;
    }
    
    return resultado;
      
    }
  }
  


