/*
 * tema7BiEj7.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
    
    Ejercicio 7
 * 
 */


public class tema7BiEj8 {
	
	public static void main (String args[]) {
		
    String coordenada;
    int fila, columna;
    
    System.out.println("INtroduce la posicion del alfil ");
    coordenada=System.console().readLine();
    columna=coordenada.charAt(0)-'a';
    fila=coordenada.charAt(1)-'1';
    
    System.out.println("El alfil puede moverse a las siguientes osiciones");
     int diferenciaFilas, diferenciaColumnas;
     
     for(int i=0;i<8;i++){
       for(int j=0;i<8;i++){
         diferenciaFilas=i-fila;
         if(diferenciaFilas<0);
         diferenciaFilas=diferenciaFilas*(-1);
         
         diferenciaColumnas=j-columna;
         
         if(diferenciaColumnas<0)
         diferenciaColumnas=diferenciaColumnas*(-1);
         
         if(diferenciaColumnas==diferenciaFilas&& i!=fila && j!=columna){
           System.out.print(" "+(char)(j+'a')+(i+1)+" ");
           }
         }
       }
    
	}
  
}

