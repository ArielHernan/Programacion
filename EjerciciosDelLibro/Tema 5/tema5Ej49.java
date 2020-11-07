/*
 * tema5Ej49.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
      Ejercicio 49
      Realiza un programa que calcule el máximo, el mínimo y la media de una serie
      de números enteros positivos introducidos por teclado. El programa terminará
      cuando el usuario introduzca un número primo. Este último número no se
      tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
      números ha introducido el usuario (sin contar el primo que sirve para salir).
      Ejemplo:
      Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número p\
      rimo:
      6
      8
      15
      12
      23
      Ha introducido 4 números no primos.
      Máximo: 15
      Mínimo: 6
      Media: 10.25

 */


public class tema5Ej49 {
	
	public static void main (String args[]) {
    int num;
    int max=0;
    int min=1000000;
    boolean esprimo;
    int suma=0;
    int contador=0;
		do{
      System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");
      num= Integer.parseInt(System.console().readLine());

      esprimo=true;
      
      for(int i=2;i<num;i++){
        
        if((num%i)==0){
          esprimo=false;
          }
        }
      
      if(!(esprimo)){
        
        suma=suma+num;
        contador++;
        
        if(num>max){
          max=num;
          }
        if (num<min){
          min=num;
          }
        }
        
        
      }while(!(esprimo));
      
      System.out.println();

      System.out.println("El número mas pequeño es: "+min);
      System.out.println("El número mas grande es: "+max);
      System.out.println("El suma es: "+suma);
      System.out.println("Has introducido: "+contador+" números.");
      System.out.println("La media es: "+(suma/contador));

      
  }
}

