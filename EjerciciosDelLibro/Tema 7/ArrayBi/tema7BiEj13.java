/*
 * tema7BiEj13.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 
    Ejercicio 13
    Realiza un programa que calcule la estatura media, mínima y máxima en
    centímetros de personas de diferentes países. El array que contiene los
    nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
    “Australia”}. Los datos sobre las estaturas se deben simular mediante un
    array de 4 filas por 10 columnas con números aleatorios generados al azar entre
    140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
    los países se deben mostrar utilizando el array de países (no se pueden escribir
    directamente).
 
 */


public class tema7BiEj13 {
	
	public static void main (String args[]) {
		
    String[] pais={"España","Rusia","japón","Australia"};
    int[][] estaturas=new int[4][10];
    int estmin=210;
    int estmax=140;
    int suma=0;
    
    for(int i=0;i<4;i++){
      for(int j=0;j<10;j++){
        estaturas[i][j]=(int)(Math.random()*(210-140+1))+140;
        System.out.printf("%4d",estaturas[i][j]);
        }
      System.out.println();
      }
      
      for(int i=0;i<4;i++){
        
        System.out.printf("%9s",pais[i]);
        
        
        
        }
	}
}

