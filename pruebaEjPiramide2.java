/*
 * pruebaEjPiramide2.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 

 */


import java.util.Scanner;
public class pruebaEjPiramide2 {
	
	public static void main (String args[]) {
    
    Scanner s= new Scanner(System.in);
    int altura=0;
    int espacio=0;

    System.out.println("Este programa pinta  pirámides con números correlativos");
    System.out.println("introduce la altura:");
    
    altura=s.nextInt();
    espacio=altura-1;
    
    for(int i=1;i<=(altura-1);i++){  
      for(int j=1;j<=espacio;j++){
        System.out.print(" ");
        }
      for(int k=1;k<=((i*2)-1);k++){
        if(k>=10){
        System.out.print((k-10) + " ");
      }else{
        System.out.print(k + " ");
        }
      }
      System.out.println("");
      espacio--;
    } 


 /****************************************************************************************/     
      System.out.println();
      System.out.println();
      
      espacio=altura-1;
    for(int i=1;i<=altura;i++){  
      for(int j=1;j<=espacio;j++){
        System.out.print(" ");
        }
      for(int k=1;k<=((i*2)-1);k++){
        if(k>=10){
        System.out.print(k-10);
      }else{
        System.out.print(k);
        }
      }
      System.out.println("");
      espacio--;
    }  
  /****************************************************************************************/     
      System.out.println();
      System.out.println();
      
      espacio=altura-1;

      for(int i=1;i<=altura;i++){         
        for(int j=1;j<=espacio;j++){
        System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
        System.out.print(" "+k);
        }
        System.out.println("");
        espacio--;     
      }

  }
}
