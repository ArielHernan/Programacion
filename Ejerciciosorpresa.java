/*
 * Ejerciciosorpresa.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
Ejerciciosorpresa
 * 
 */
public class Ejerciciosorpresa {
	
	public static void main (String args[]) {
		
    int[] array1=new int[5];
    int[] array2=new int[8];
    int[] array3=new int[13];
    
    System.out.println("introduce 5 números");
    for(int i =0;i<5;i++){
      array1[i]=Integer.parseInt(System.console().readLine());
      }
    System.out.println("introduce 8 números");
    for(int i =0;i<8;i++){
      array2[i]=Integer.parseInt(System.console().readLine());
      }
    for(int i=0;i<5;i++){
      array3[i]=array1[i];
      }
    for(int i=0;i<8;i++){
      array3[i+5]=array2[i];
      }
    System.out.println();
    for(int i=0;i<13;i++){
      System.out.print(array3[i]+" ");
      }
	}
}

