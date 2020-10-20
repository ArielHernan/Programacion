/*
 * tema5Ej7.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
 7. Realiza el control de acceso a una caja fuerte. La combinación
  * será un número de 4 cifras. El programa nos pedirá la combinación
  * para abrirla. Si no acertamos, se nos mostrará el mensaje
  * “Lo siento, esa no es la combinación” y si acertamos se nos dirá
  * “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
  * oportunidades para abrir la caja fuerte.

 * 
 */

import java.util.Scanner;
public class tema5Ej7 {
	
	public static void main (String args[]) {
		Scanner s=new Scanner(System.in);
    
    int n=0;
    int contador=0;
    
    System.out.println("Intenta abrir la caja fuerte, tienes 4 intentos");
    
    do{
    System.out.println("Introduce el número: ");
     n=s.nextInt();
     int clave=1478;
    
     if(n==clave){
       
       System.out.println("felicidades, has acertado , biieeennn!!!!");
       }else{
       System.out.println("nada, tienes un intento mas");
         }
      contador=contador+1;
      }while((contador<5)||(n!clave));
;      
	
}
}
