/*
 * Ex26ahrf1Mejorado.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
 */


public class Ex26ahrf1Mejorado{
	
	public static void main (String args[]) {
    System.out.println("Este programa pinta un tablero de ajedrez:");
    System.out.println();
    int altura=1;
    
	 do{
    System.out.println("introduce la altura:");
    altura=Integer.parseInt(System.console().readLine());
    if(altura<=0||altura>20){
      System.out.print("Valor fuera de rango.  ");
      }
   }while(altura<=0||altura>20);
   
   
    int anchura=1;
   do{
    System.out.println("introduce la anchura:");
    anchura=Integer.parseInt(System.console().readLine());
    if(anchura<=0||anchura>20){
    System.out.print("Valor fuera de rango.  "); 
      }
  }while(anchura<=0||anchura>20);
  
    
    for(int i=0;i<altura;i++){
      for(int j=0;j<anchura;j++){
       if(i%2==0){
         if(j%2==0){
           System.out.print("█");
           }else{
             System.out.print("  ");
             }
         }else{
           if(!(j%2==0)){
             System.out.print("█");
             }else{
               System.out.print("  ");
               }
           
           }
        }
      System.out.println();
      }
    
	}
}
