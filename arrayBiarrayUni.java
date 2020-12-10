/*
El programa va a menejar un array unidimensional
* Simulará que lo que esta gestionando es un array bi
* Pedirá al usuario numero de filas y columnas
* generara aleatoriamente los valores entre 1 y 100
* presentara la matriz bi y uni
 */


public class arrayBiarrayUni {
	
	public static void main (String args[]) {
		
    
    System.out.println("Se pide gestionar un bi y uni");
    System.out.println("introduce el número de filas");
    int filas=Integer.parseInt(System.console().readLine());
    
    System.out.println("introduce el número de columnas");
    int columnas=Integer.parseInt(System.console().readLine());
    int tamanio=filas*columnas;
    int[] uni=new int[tamanio];
    
    
    
    for(int i=0;i<tamanio;i++){
      uni[i]=(int)(Math.random()*100)+1;
      
      System.out.print(uni[i]+" ");
      }
    System.out.println();
    System.out.println();

    for(int i=0;i<filas;i++){
      for(int j=0;j<columnas;j++){
        System.out.print(uni[i*columnas+j]+ " ");
        }
        System.out.println();
      }
 
      }
	}


