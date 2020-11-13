/*
 * pruebasRandomjava
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 

 */


public class pruebasRandom {
	
	public static void main (String args[]) {
    int n=1;
    int contador0=0;
    int contador1=0;
    int contador2=0;
    int contador3=0;
    int contador4=0;
    int contador5=0;
    int contador6=0;
    int contador7=0;
    int contador8=0;
    int contador9=0;
    for(int i=0;i<100000;i++){
      n=((int)(Math.random()*7)+50);
      if(n==2){
        contador2 ++;
        }
      if(n==4){
        contador4++;
        }
      if(n==1){
        contador1++;
        }
      if(n==3){
        contador3++;
        }
      if(n==5){
        contador5++;
        }
      if(n==6){
        contador6++;
        }
      if(n==7){
        contador7++;
        }
      if(n==8){
        contador8++;
        }
      if(n==9){
        contador9++;
        }
      if(n==0){
        contador0++;
        }
        System.out.println(n);
      }
      System.out.println(n);
      System.out.println("Numero de 0 : "+" - "+contador0+" - ");
      System.out.println("Numero de 1 : "+" - "+contador1+" - ");
      System.out.println("Numero de 2 : "+" - "+contador2+" - ");
      System.out.println("Numero de 3 : "+" - "+contador3+" - ");
      System.out.println("Numero de 4 : "+" - "+contador4+" - ");
      System.out.println("Numero de 5 : "+" - "+contador5+" - ");
      System.out.println("Numero de 6 : "+" - "+contador6+" - ");
      System.out.println("Numero de 7 : "+" - "+contador7+" - ");
      System.out.println("Numero de 8 : "+" - "+contador8+" - ");
      System.out.println("Numero de 9 : "+" - "+contador9+" - ");
		
	}
}

