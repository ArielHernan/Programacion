/*
 * ejercicio7.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 7
Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados. 
 */


public class ejercicio7 {
	
	public static void main (String args[]) {
		int[] n= new int[20];
    int n1,n2;
    
    for(int i=0;i<20;i++){
      n[i]=(int)(Math.random()*21);
      }
    System.out.print("posición  ");
    for(int i=0;i<20;i++){
      System.out.printf("%3d",i);
        }
    System.out.println();
    System.out.print("array     ");
    for(int i=0;i<20;i++){
      System.out.printf("%3d",n[i]);
      }
      
      
    System.out.println("\n\nahora introduce el primer número, que será el que introduzcamos eln el array ");
    n1=Integer.parseInt(System.console().readLine());
    
    System.out.println("ahora introduce un segundo número, tiene que estar en el array y será el que cambiaremos por el primero ");
    n2=Integer.parseInt(System.console().readLine());
    
    System.out.println("Cambiaremos el segundo número por el primero y lo entrecomillamos para que veas donde está:");
    System.out.println();
    
     System.out.print("posición  ");
    for(int i=0;i<20;i++){
      System.out.printf("%3d",i);
        }
     System.out.println();
        
    System.out.print("array     ");
    for(int i=0;i<20;i++){
      if(n[i]==n2){
        System.out.print("\""+n1+"\"");
       
        }else{
          System.out.printf("%3d",n[i]);
          }
      }
    
    
	}
}

