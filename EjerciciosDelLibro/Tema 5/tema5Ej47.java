/*
 * tema5Ej47.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
Ejercicio 47
Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
encargado realizar un programa que pinte un 8 por pantalla usando la letra
M. Se pide al usuario la altura, que debe ser un número entero impar mayor
o igual que 5. Si el número introducido no es correcto, el programa deberá
mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
La anchura de la figura siempre será de 6 caracteres.
 */


public class tema5Ej47 {
	
	public static void main (String args[]) {
		
    System.out.println("Introduce la altura: ");
      int altura=Integer.parseInt(System.console().readLine());

      int capas=altura;
    
      
      for(int i =0;i<8;i++){
        System.out.print("9");
        }
        System.out.println();
      for(int i=0;i<(capas/2)-1;i++){
        System.out.print("8");
        for(int j=0;j<6;j++){
          System.out.print(" ");
          }
        System.out.print("8");
        System.out.println();
        }
            for(int i =0;i<8;i++){
        System.out.print("9");
        }
        System.out.println();
        
        
        
        
      for(int i=0;i<(capas/2)-1;i++){
        System.out.print("8");
        for(int j=0;j<6;j++){
          System.out.print(" ");
          }
        System.out.print("8");
        System.out.println();
        }
        for(int i =0;i<8;i++){
        System.out.print("9");
        }

	}
}
