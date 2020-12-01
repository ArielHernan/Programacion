/*
 * tema7BiEj6.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 6
    Modifica el programa anterior de tal forma que no se repita ningún número en
    el array.

 */


public class tema7BiEj6 {
	
public static void main (String args[]) 
    throws InterruptedException{
      
    int[][] n=new int[6][10];
    
    int maximo=Integer.MIN_VALUE;
    int xMax=0;
    int yMax=0;
    
    int minimo=Integer.MAX_VALUE;
    int xMin=0;
    int yMin=0;
    
    boolean repetido=false;
    
    do{
      for(int i=0;i<4;i++){
        for(int j=0;j<5;j++){
          n[i][j]=(int)(Math.random()*1001);
          }
          System.out.println();
        if(n[i][j]==n[i][j]){
            repetido=true;

            }else{
              repetido=false;
              }
        }
      
      }while(repetido=true);
    
    System.out.print("       ");
    for(int j=0;j<10;j++){
      System.out.print(" "+j+"    ");
      }
    System.out.println();
    System.out.print("     ");
    for(int j=0;j<9;j++){
      System.out.print("-------");
      }
      
    System.out.println();
    

    
    for(int i=0;i<6;i++){
      System.out.print("  " + i + " │");
      for(int j=0;j<10;j++){
        
        System.out.printf("%5d ", n[i][j]);
        Thread.sleep(100);
        
        if(n[i][j]<minimo){
          
          minimo=n[i][j];
          xMin=i;
          yMin=j;
          
          }
        
        if(n[i][j]>maximo){
          
          maximo=n[i][j];
          xMax=i;
          yMax=j;
          
          }
        }
      System.out.println();
      }
    System.out.print("     ");
    for(int j=0;j<9;j++){
      System.out.print("-------");
      }
    System.out.println();
    System.out.println("El número mínimo es: "+ minimo+"\nEl número máximo es: "+maximo);
    System.out.println("El máximo está en la posición "+xMax+" " + yMax);
    System.out.println("El minimo está en la posición "+xMin+" " + yMin);

	}
}

