/*
 * t4Ej8.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 
     Amplía el programa anterior para que diga la nota del boletín
     (insuficiente, suficiente, bien, notable o sobresaliente).
 */
import java.util.Scanner;
public class t4Ej8 {
	
	public static void main (String args[]) {
		
      Scanner s = new Scanner(System.in);
      
      Double n1;
      Double n2;
      Double n3;
      Double m;
      
      System.out.println("Este programa calcula la media de tres notas: ");
      System.out.println("Introduce las tre notas separadas por un espacio o ENTER");
      
      n1=s.nextDouble();
      n2=s.nextDouble();
      n3=s.nextDouble();
      
      m=((n1+n2+n3)/3);
      System.out.printf("La media es: %.1f\n",m);
      
      if(m<5){
      System.out.println("Por lo que tienes un INSUFICIENTE");
        }
      if(m>=5&&m<6){
      System.out.println("Por lo que tienes un SUFICIENTE");
        }
      if(m>=6&&m<=7){
      System.out.println("Por lo que tienes un BIEN");
        }
      if(m>7&&m<=8){
      System.out.println("Por lo que tienes un NOTABLE");
        }
      if(m>8&&m<=10){
        }
      
	}
}

