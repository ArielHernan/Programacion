/*
 * tema6Ej11.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 11
    Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
    aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
    final aparecerá el número de suspensos, el número de suficientes, el número
    de bienes, etc.

 */


public class tema6Ej11 {
	
	public static void main (String args[]) {
    
    int nota=0;
    int sus=0;
    int suf=0;
    int bie=0;
    int not=0;
    int sob=0;
    int apr=0;
    
    for(int i=0;i<20;i++){
      nota=(int)(Math.random()*11);
      System.out.print(nota +" ");
      
      if(nota==0||nota==1||nota==2||nota==3||nota==4){
        System.out.println("Insuficiciente");
        sus++;
        }
    
      if(nota==5){
        System.out.println("suficiciente");
        suf++;
        }
      
      if(nota==6||nota==7){
        System.out.println("bien");
        bie++;
        }
      if(nota==8||nota==9){
        System.out.println("Notable");
        not++;
        }  
      
      if(nota==10){
      System.out.println("SObresaliente");
      sob++;
      }
      if(nota==5||nota==6||nota==7||nota==8||nota==9||nota==10){
        apr++;
        }
    }
    System.out.println("Hay " + suf +" suficientes, "+sus+" insuficientes, "+ bie+" bien, "+not+" notables, "+sob+" Sobresalientes");
    System.out.println("Hay " + apr + " aprobados en total, de "+(suf+sus+bie+not+sob)+ " alumnos");
	}
}

