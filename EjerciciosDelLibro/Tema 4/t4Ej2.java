/*
 * t4Ej2.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
      Ejercicio 2
      Realiza un programa que pida una hora por teclado y que muestre luego buenos
      días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
      6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
      horas, los minutos no se deben introducir por teclado.
 */
import java.util.Scanner;
  public class t4Ej2 {
    
    public static void main (String args[]) {
      
      Scanner s = new Scanner(System.in);
      
      int horaIntroducida=0;
      
      System.out.println("\tEste programa te saluda");
      System.out.println("\tintroduce la hora sin minutos. formato 24 horas");
      
      horaIntroducida=s.nextInt();
      
      if(horaIntroducida>=6 && horaIntroducida<=12){
        
        System.out.println("Hola, buenos días");
          
        }
      if(horaIntroducida>=13 && horaIntroducida<=20){
        
        System.out.println("Hola, buenos tardes");
          
        }
      if((horaIntroducida >=21 && horaIntroducida<24) || (horaIntroducida>=0 && horaIntroducida<=5)){
        
        System.out.println("Hola, buenas noches");
          
        }
        
      if ((horaIntroducida >= 24) || (horaIntroducida < 0)) {
        
        System.out.println("La hora introducida no es correcta.");
      }
      
    }
  }

