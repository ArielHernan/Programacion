/*
 * prueba.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>

 */

public class prueba {
	
	public static void main (String args[]) {
   System.out.println("Elige el caracter de relleno");
   int a=Integer.parseInt(System.console().readLine());
   int b=3;
    
    int[][] n=new int[a][a];
    
    for(int i=0;i<6;i++){
      for( int j=0;j<6;j++){
        if(i==4||j==3){
          n[i][j]=b;
          System.out.printf("%3d",n[i][j]);
        }else{
          n[i][j]=a;
          System.out.printf("%3d",n[i][j]);
        }
      }
      System.out.println();
    }
		
	}
}

