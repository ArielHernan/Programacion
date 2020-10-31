/*
 * tema5Ej20.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 20
Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 * 
 */


public class tema5Ej20 {
	
	public static void main (String args[]) {
		
    System.out.println("Este programa pinta pirámides");
    
    System.out.println("Introduce la atura:");
    int a=Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el simbolo:");
    String c=System.console().readLine();
    
    int espacio= (a-1)+10;
    int contador=0;  
    
    for(int i=0;i<a;i++){                           //imprime las capas
      for(int j=0;j<espacio;j++){                   //imprime los espacios
        System.out.print(" ");
        }
      if(contador<=1){
      for(int k=0;k<((i*2)-1);k++){                 //imprime los caracteres
        System.out.print(c);
        }
      }else{
        System.out.print(c);                        //imprime caracter
        for(int j=0;j<(contador*2)-3;j++){         //imprime los espacios dentro piramide
          System.out.print(" ");
          }
        System.out.print(c);                       //imprime caracter
        } 
        
      System.out.println();
      espacio--;
      contador++;
    
      }
      for(int i=0;i<9;i++){
        System.out.print(" ");
        }
      for(int i=0;i<(a*2)-1;i++){
        
        System.out.print("*");
        }
    
	}
}

