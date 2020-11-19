/*
 * tema7Ej7.java
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


public class tema7Ej7 {
	
	public static void main (String args[]) {
		
    int[] n= new int[100];
    int valor1=0;
    int valor2=0;
    
    for(int i=0;i<100;i++){
      n[i]=(int)(Math.random()*21);
      System.out.print(n[i]+" ");
      }
      
    System.out.println("\n\nElija un número de la lista anterior:");
    valor1=Integer.parseInt(System.console().readLine());
    System.out.println("\nAhora elja el número que será cambiado por el anterikor");
    valor2=Integer.parseInt(System.console().readLine());
    
    for(int i=0;i<100;i++){
      if(n[i]==valor1){
        n[i]=valor2;
        System.out.print("\""+n[i]+"\"" + " ");
        }else{
          System.out.print(n[i]+" ");
          }
      
      }
    
	}
}

