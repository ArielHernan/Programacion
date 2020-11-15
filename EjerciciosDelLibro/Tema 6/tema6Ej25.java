/*
 * tema6Ej25.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 25
    Escribe un programa que muestre por pantalla 100 números enteros separados
    por un espacio. Los números deben estar generados de forma aleatoria en
    un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
    almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
 */


public class tema6Ej25 {
	
	public static void main (String args[]) {
		
    int n=0;
    
    
    for(int i=0;i<100;i++){
      n=(int)(Math.random()*191)+10;
      boolean esprimo=true;
      
      for(int j=2;j<n;j++){
        if(n%j==0){
          esprimo=false;
          }
        }
      if(esprimo){
        System.out.print(" ##"+n+"## ");
        }else if(n%5==0){
          System.out.print(" [["+n+"]] ");
          }else{
            System.out.print(" "+n+" ");
            }
      }
	}
}

