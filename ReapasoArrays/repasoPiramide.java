/*
 * repasoPiramides.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>

 * 
 */


public class repasoPiramide {
	
	public static void main (String args[]) {
  
	int altura=Integer.parseInt(System.console().readLine());//=5
  int espacio=altura;
  int asterisco=1;
   
    for(int i=0;i<altura;i++ ){   //altura
      for(int j=0;j<espacio;j++){//espacios
        System.out.print("-");
      } 
      for(int j=0;j<asterisco;j++){//asteriscos
        System.out.print("*");
      }
        System.out.println();
        espacio--;
        asterisco+=2;
    }
                                          
	}                                         
}                                           

