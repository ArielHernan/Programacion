/*
 * tema5Ej30.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
  Ejercicio 30
  Realiza una programa que calcule las horas transcurridas entre dos horas de
  dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
  El día de la semana se puede pedir como un número (del 1 al 7) o como una
  cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
  los datos correctamente y que el segundo día es posterior al primero.

 */


public class tema5Ej30 {
	
	public static void main (String args[]) {
    
    int n1 =8;
    int n2=8;
    String primerDia=" ";
    String segundoDia=" ";
    
    System.out.println("Elige como seleccionar los días de la semana;\nelige 1 si quieres contarlos de 1 a 7\nelige 0 si quieres introducir los datos como palabras de -lunes a domingo-");
    int seleccion=Integer.parseInt(System.console().readLine());
    
    if(seleccion>0&&seleccion<8){
		
    while(n1>7||n1<0 && n2>7||n2<0 || n1>n2){
    System.out.println("introduce el primer dia de la semana en número(de 1 a 7): ");
    n1=Integer.parseInt(System.console().readLine());
    
		System.out.println("introduce el segundo de la semana en número(de 1 a 7): ");
    n2=Integer.parseInt(System.console().readLine());
      }                       // fin de while
    }else{                   //fin del if principio de SU else
      System.out.println("elige el primer dia en palabras - de lunes a domingo- :");
      primerDia=System.console().readLine();

      while(primerDia.equals("lunes")||primerDia.equals("martes")||primerDia.equals("miercoles")||primerDia.equals("jueves")||primerDia.equals("viernes")||primerDia.equals("sabado")||primerDia.equals("domingo")){
            System.out.println("elige el segundo día en palabras - de lunes a domingo- escribe fin para terminar:");
            segundoDia=System.console().readLine();
            
             
      }                    
    }  
      
                           
    

	}
}

