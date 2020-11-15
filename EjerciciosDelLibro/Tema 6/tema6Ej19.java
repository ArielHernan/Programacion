/*
 * tema6Ej19.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 19
    Escribe un programa que muestre 50 números enteros aleatorios comprendidos
    entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
    el máximo de los pares el mínimo de los impares y la media de todos los
    números generados.
 */
public class tema6Ej19 {
	
	public static void main (String args[]) {
		
    int n=0;
    int maximopares=0;
    int minimoimpares=200;
    int par=0;
    int impar=0;
    int suma=0;
    
    for(int i=0;i<50;i++){
      n=(int)(Math.random()*301)-100;
      System.out.print(n+" ");
      suma=suma+n;
      if(n%2==0){
        par=n;
        }else{
          impar=n;
          }
      if(par>maximopares){
        maximopares=par;
        }
      if(impar<minimoimpares){
        minimoimpares=impar;
        }
      }
      System.out.println();
      System.out.println("El máximo de los pares es :          "+maximopares);
      System.out.println("El minimo de los impares es :        "+minimoimpares);
      System.out.println("El media de todos los números es :   "+suma/50);
      System.out.println("La suma de todos los números es :    "+maximopares);
      
	}
}

