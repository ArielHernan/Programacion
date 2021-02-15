/*
 * tema8Ej36.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 
    Ejercicio 36
    Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
    lo que se especifica en los comentarios (puedes incluirla en tu propia biblioteca
    de rutinas):
    public static int[] filtraPrimos(int x[]) 
    // Devuelve un array con todos los
    // números primos que se encuentren
    // en otro array que se pasa como
    // parámetro.
    // Obviamente el tamaño del array
    // que se devuelve será menor o
    // igual al que se pasa como
    // parámetro.
    Utiliza esta función en un programa para comprobar que funcionan bien. Para
    que el ejercicio resulte más fácil, las repeticiones de primos se conservan; es
    decir, si en el array x el número 13 se repite 3 veces, en el array devuelto
    también estará repetido 3 veces. Si no existe ningún número primo en x, se
    devuelve un array con el número -1 como único elemento.
 */
public class tema8Ej36 {
	
	public static void main (String args[]) {
    
    int[] array=generaArrayInt(20,1,100);
    
    System.out.println("El array original es:");
    System.out.println();
    muestraArrayInt(array);
    System.out.println();
    System.out.println("El array sin los numero primos es :");
    System.out.println();
    muestraArrayInt(filtraPrimos(array));
    
  }

  
    

  public static boolean esPrimo (int x) {
    
    for(int i=2;i<x;i++){
      if((x%i)==0){
        return false;
       }
    }
  return true;
	}
  
  
  
  public static int[] generaArrayInt(int n, int min, int max) {
    
    int[] x= new int[n];
    
    for(int i=0;i<n;i++){
      x[i]=(int)(Math.random()*(max-min+1)+min);
    }
    return x;
	}
  
  
  
  
  public static void muestraArrayInt(int x[]){
    
    for(int n:x){
      System.out.printf("%4d",n);
    }
  }
  
  
  
  
  public static int[] filtraPrimos(int x[]){
    
    int[] sonPrimos=new int[x.length];
    int contador=0;
    
    for(int n:x){
      
      if(esPrimo(n)){
        contador++;
        sonPrimos[contador-1]=n;
      }
      
    }
    
    int[] resultado=new int [contador];
    
    for(int i=0;i<contador;i++){
      resultado[i]=sonPrimos[i];
      
    }
    return resultado;
  }
    
    
  }

