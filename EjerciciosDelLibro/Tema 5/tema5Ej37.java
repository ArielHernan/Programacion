/*
 * tema5Ej37.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 37
    Realiza un conversor del sistema decimal al sistema de “palotes”.
    Ejemplo:
    Por favor, introduzca un número entero positivo: 47021
    El 47021 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de palotes.

 */


public class tema5Ej37 {
	
	public static void main (String args[]) {
		
    System.out.println("Este programa convierte al sistema palotes");
      
    
    int num=0;
    int girado=0;
    int contador=0;
    
    while(num<1){
    System.out.println("Introduce un número entero");
    num=Integer.parseInt(System.console().readLine());
      }
    int aux=num;
    
    //giramos el número
    
    while(aux>0){
      girado=(girado*10)+(aux%10);
      aux/=10;
      contador++;
      }
    
    //ahora, con el número dado vuelta, vamos a ir decapando e imprimiendo ese número en palotes con 2 bucle for
    //primero declaro la variable que va a guardar la cifra en cada decapado 
    
    int guardaCifra=0;
    
    //ahora construyo el bucle que va a dar tantas vuelas como cifras haya, el contador lo sabe 
    for(int i=0;i<contador;i++){
      
      //en cada vuelta guardaCifra tiene el valor de el ultimo numero de girado que es el primero de num      
      guardaCifra=girado%10;
      girado=girado/10;
      
      //Y ahora por fin, con este bucle pinto tantos palotes como el valor de la cifra sea.
      
      for(int j=0;j<guardaCifra;j++){
        System.out.print("|");
        }
          if(i<contador-1){
            System.out.print("-");
            }
      }
	}
}

