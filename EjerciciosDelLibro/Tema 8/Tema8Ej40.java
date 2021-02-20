/*
 * Tema8Ej40.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 40
Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
lo que se especifica en los comentarios (puedes incluirla en tu propia biblioteca
de rutinas):
* 
public int[] filtraCon7(int x[]) // Devuelve un array con todos los números
* 
// que contienen el 7 (por ej. 7, 27, 782)
// que se encuentren en otro array que se
// pasa como parámetro. El tamaño del array
// que se devuelve será menor o igual al
// que se pasa como parámetro.
Utiliza esta función en un programa para comprobar que funcionan bien. Para
que el ejercicio resulte más fácil, las repeticiones de números que contienen
7 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en
el array devuelto también estará repetido 3 veces. Si no existe ningún número
que contiene 7 en el array x, se devuelve un array con el número -1 como único
elemento.
 * 
 */

import misFunciones.Matematicas;
import misArrays.ArrayUni;
import misArrays.ArrayBi;
public class Tema8Ej40 {

	public static void main (String args[]) {
    System.out.println("Este programa imprime los numeros que contienen un siete que estan en un array");
    System.out.println();

    int[] array=misArrays.ArrayUni.generaArrayInt(20,1,100);
		misArrays.ArrayUni.muestraArrayInt(array);
    System.out.println();
    misArrays.ArrayUni.muestraArrayInt(filtraCon7(array));
    
    
	}
  
  public static int[] filtraCon7(int x[]){
    
    int[] arrayCon7=new int[x.length];
    int contador=0;
    
    for(int num:x){
      if(tiene7(num)){
        arrayCon7[contador]=num;
        contador++;
      }
    }
    
    int[] resultado=new int[contador];
    
    for(int i=0;i<contador;i++){
      resultado[i]=arrayCon7[i];
    }
    return resultado;
  }
  
  
  public static boolean tiene7(int n){
    if(misFunciones.Matematicas.posicionDeDigito(n,7) != -1){
      return true;
    }
    return false;
  }
}

