/*
 * tema5Ej3.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
 * * 3. Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 */
public class tema5Ej3 {
	
	public static void main (String args[]) {
    
    int i=0;
    do{
      if(i%5==0){
      System.out.printf("%10s%5d%20s","el numero ",i,"Es multiplo de 5\n");
      }
      i+=1;
    }while(i<=100);
		
	}
}

