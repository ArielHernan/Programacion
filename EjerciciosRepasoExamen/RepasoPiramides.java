/*
 * RepasoPiramides.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
[2,5 puntos] Implemente un programa que dibuje pirámides de una altura (medida desde el vértice a la base) que
oscile entre 1 y 10, y que vayan orientadas a voluntad del usuario (izquierda, derecha, arriba o abajo).
Además, el programa pedirá dos caracteres con los que pintar (alternándolos) dichas pirámides.
Ejemplos de ejecución (se incluyen varias orientaciones de una misma pirámide):

 */


public class RepasoPiramides {
	
	public static void main (String args[]) {
		
    System.out.println("Este programa pinta pirámides");
    System.out.println();
    char car1=' ';
    char car2=' ';
    int altura=0;
    String orientacion= " ";
    do{
      System.out.println("Introduce un número entre 1 y 10. Esa será tu altura");
      altura=Integer.parseInt(System.console().readLine());
      if(altura<1||altura>10){
        System.out.println("Error, repite");
        }
      
      }while(altura<1||altura>10);
      
      do{
      System.out.println("Introduce la orientación, solo vale arriba abajo izquierda derecha");
      orientacion=System.console().readLine();
      if(!(orientacion.equals("arriba")||orientacion.equals("abajo")||orientacion.equals("derecha")||orientacion.equals("izquierda"))){
        System.out.println("Te lo dije solo esas orientaciones");
        }
        
        }while(!(orientacion.equals("arriba")||orientacion.equals("abajo")||orientacion.equals("derecha")||orientacion.equals("izquierda")));
        
        
        System.out.println("Introduce el primer caracter");
        car1=System.console().readLine().charAt(0);
        System.out.println();
        
        System.out.println("Introduce el segundo caracter");
        car2=System.console().readLine().charAt(0);
        System.out.println();
        
        switch(orientacion){
          case "arriba":
          for(int i=0;i<altura;i++){
            for(int j=0;j<altura-i;j++){
              System.out.print(" ");
              }
            for(int k=0;k<i*2-1;k++){
              if(k%2==0){
                System.out.print(car1);
                }else{
                  System.out.print(car2);
                  }
              }
              System.out.println();
            }
            break;
         
          
          case "abajo":
          
          for(int i=0;i<altura;i++){
            for(int j=0;j<i;j++){
              System.out.print(" ");
              }
            for(int k=0;k<(altura-i-1)*2+1;k++){
              if(k%2==0){
                System.out.print(car1);
                }else{
                  System.out.print(car2);
                  }
              }
              System.out.println();
             }
             break;
             
          
          case "derecha":
          
          for(int i=0;i<altura;i++){
            
            for(int j=0;j<=i;j++){
              if(j%2==0){
                System.out.print(car1);
                }else{
                  System.out.print(car2);
                  }
              }
            System.out.println();
            }
            
          for(int i=altura;i>0;i--){
            for(int j=0;j<=i;j++){
              if (j%2==0){
                System.out.print(car1);
                }else{
                  System.out.print(car2);
                  }
              }
            System.out.println();
            }
            
            
            for(){
              
              }
            
             break;
         }
	}
}

