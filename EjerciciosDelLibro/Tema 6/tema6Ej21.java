/*
 * tema6Ej21.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
      Ejercicio 21
      Realiza un programa que genere una secuencia de cinco monedas de curso
      legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
      5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
      posiciones posibles son cara y cruz.
      Ejemplo:
      2 céntimos - cara
      20 céntimos - cruz
      50 céntimos - cruz
      1 euro - cruz
      2 euros - cara
 */


public class tema6Ej21 {
	
	public static void main (String args[]) {
		
      int tiradamoneda=0;
      int tiradacaraocruz=0;
      String moneda=" ";
      String caraocruz=" ";
      
      for(int i=0;i<5;i++){
        
        tiradamoneda=(int)(Math.random()*8);
        tiradacaraocruz=(int)(Math.random()*2);
        
         switch(tiradamoneda){
           case 0:
           moneda="1 centimo  ";
           break;
           
           case 1:
           moneda="2 centimos ";
           break;
           
           case 2:
           moneda="5 centimos ";
           break;
           
           case 3:
           moneda="10 centimos";
           break;
           
           case 4:
           moneda="20 centimos";
           break;
           
           case 5:
           moneda="50 centimos";
           break;
           
           case 6:
           moneda="1 euro     ";
           break;
           
           case 7:
           moneda="2 euros    ";
           break;
           
           default:
           }
           
         switch(tiradacaraocruz){
           case 0:
           caraocruz="cara";
           break;
           
           case 1:
           caraocruz="cruz";
           break;
           
           default:
           
           }
       System.out.println(moneda+" - "+caraocruz);
      }
    }
	}


