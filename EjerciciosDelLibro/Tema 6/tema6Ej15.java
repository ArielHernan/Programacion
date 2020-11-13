/*
 * tema6Ej15.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 15
Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
con dos barras.
d) La última nota de la melodía debe coincidir con la primera.
Ejemplo 1:
do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
Ejemplo 2:
la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
 */


public class tema6Ej15 {
	
	public static void main (String args[]) {
		
    int numerodenotas= 4 * (int)(Math.random()*7+1);
    String primeranota;
    String ultimonumero;
    int i=0;
    int nota=0;
    
    for(i=0;i<numerodenotas;i++){
      nota=(int)(Math.random()*7+1);
      
      switch(nota){
        case 1:
        System.out.print("DO");
        break;
        
        case 2:
        System.out.print("RE");
        break;
        
        case 3:
        System.out.print("MI");
        break;
        
        case 4:
        System.out.print("FA");
        break;
        
        case 5:
        System.out.print("SOL");
        break;
        
        case 6:
        System.out.print("LA");
        break;
        
        case 7:
        System.out.print("SI");
        break;
        }
      
      if(i==1){
        primeranota=nota;
        }
      if(i==numerodenotas){
        ultimanota=primeranota;
        }
      System.out.print(nota + " ");
      
      if(i==numerodenotas){
        System.out.print("||");
        }else if(i%4==0){
        System.out.print("| ");
          }
    }
    
	}
}

