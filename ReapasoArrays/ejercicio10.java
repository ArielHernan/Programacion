/*
 * ejercicio10.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
    Ejercicio 10
    Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
    y que los almacene en un array. El programa debe ser capaz de pasar todos
    los números pares a las primeras posiciones del array (del 0 en adelante) y
    todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
    necesario.
 */


public class ejercicio10 {
	
	public static void main (String args[]) {
		
    int[] n=new int[20];
    int[] auxpares=new int[20];
    int[] auximpares=new int[20];
    int contpar=0;
    int contimpar=0;
    
    for(int i=0;i<20;i++){
      n[i]=(int)(Math.random()*101);
      }
      
    for(int i=0;i<20;i++){
      if(n[i]%2==0){
        auxpares[contpar]=n[i];
        contpar++;
        }else{
          auximpares[contimpar]=n[i];
          contimpar++;
          }
      }
    System.out.println("El array original\n");
      
    for(int i=0;i<20;i++){
      System.out.print(n[i]+" ");
      }
      
    System.out.println();
    System.out.println("\nel array ordenado: \n");
      
    for(int i=0;i<contpar;i++){
      System.out.print(auxpares[i]+" ");
      }
    
    for(int i=0;i<contimpar;i++){
      System.out.print(auximpares[i]+" ");
      }
      
    
    
	}
}

