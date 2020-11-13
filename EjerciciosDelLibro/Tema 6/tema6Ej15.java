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
    String primeranota= " ";
    String ultimanota=" ";
    int i=0;
    int eligenota=0;
    String nota= " ";
    
    System.out.println(numerodenotas);
    
    for(i=1;i<=numerodenotas;i++){
      eligenota=(int)(Math.random()*7);
      
      switch(eligenota){
        case 0:
        nota=("do");
        break;
        
        case 1:
        nota=("RE");
        break;
        
        case 2:
        nota=("MI");
        break;
        
        case 3:
        nota=("FA");
        break;
        
        case 4:
        nota=("SOL");
        break;
        
        case 5:
        nota=("LA");
        break;
        
        case 6:
        nota=("SI");
        break;
        
        default:
        }
      
      if(i==1){
        primeranota=nota;
        }
      if(i==numerodenotas){
        nota=primeranota;
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

