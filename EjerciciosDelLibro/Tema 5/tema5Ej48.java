/*
 * tema5Ej48.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 48
    Realiza un programa que diga los dígitos que aparecen y los que no aparecen
    en un número entero introducido por teclado. El orden es el que se muestra en
    los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
    largos.
    Ejemplo 1:
    Introduzca un número entero: 67706
    Dígitos que aparecen en el número: 0 6 7
    Dígitos que no aparecen: 1 2 3 4 5 8 9
    Ejemplo 2:
    Introduzca un número entero: 555
    Dígitos que aparecen en el número: 5
    Dígitos que no aparecen: 1 2 3 4 6 7 8 9

 */


public class tema5Ej48 {
	
	public static void main (String args[]) {
		System.out.println("introduzca un numero");
    int n=Integer.parseInt(System.console().readLine());
    boolean igual;
    int aux;
    
    System.out.println("Digitos que aparecen en el número: ");
    
    for(int i=0;i<=9;i++){
      
      igual=false;
      aux=n;
      
      while(aux>0){
        if(aux%10==i){
          igual=true;
          }
        aux/=10;
        }
      if(igual=true){
        System.out.print(i + " ");
        }
      }
      
      
    System.out.println("Digitos que  NO aparecen en el número: ");
    
    for(int i=0;i<9;i++){
      
      igual=false;
      aux=n;
      
      while(aux>0){
        if(aux%10==i){
          igual=true;
          }
          aux/=10;
        }
      if(!igual){
        System.out.print(i + " ");
        }
    }
	}
}

