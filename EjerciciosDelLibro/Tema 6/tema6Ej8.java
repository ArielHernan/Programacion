/*
 * tema6Ej8.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 8
    Modifica el programa anterior para que la probabilidad de que salga un 1 sea
    de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
    2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 */


public class tema6Ej8 {
	
	public static void main (String args[]) {
		
    System.out.println("Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga  2 sea de 1/6.");
    
    int n=0;
    int contador1=0;
    int contadorx=0;
    int contador2=0;
    
    for(int a =0;a<100;a++){
      for(int i=0;i<15;i++){
        System.out.printf("%20d.  |",i);
      
        for(int j=0;j<3;j++){
            n=(int)(Math.random()*6);
            
            if(n==0||n==1||n==2){
              contador1++;
              }
            if(n==3||n==4){
              contadorx++;
              }
            if(n==5){
              contador2++;
              }
          switch(n){
            case 0:
            System.out.print("1  |");
            break;
            
            
            case 1:
            System.out.print("1  |");
            break;
           
            
            case 2:
            System.out.print("1  |");
            break;
          
            
            case 3:
            System.out.print(" X |");
            break;
            
            case 4:
            System.out.print(" X |");
            break;
            
            case 5:
            System.out.print("  2|");
            break;
            default:
          }
        }
        System.out.println();
      }
    }
 System.out.print(contador1);
 System.out.println();
 System.out.print(contadorx);
 System.out.println();
 System.out.print(contador2);
 System.out.println();
	}
}

