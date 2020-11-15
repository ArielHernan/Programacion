/*
 * tema6Ej29.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
     * 
    Ejercicio 29
    Realiza un programa que muestre la previsión del tiempo para mañana en
    Málaga. Las temperaturas máxima y mínima se deben generar de forma
    aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
    últimas décadas para cada estación. La probabilidad de que esté soleado
    o nublado en cada estación se proporciona a continuación. Obviamente, la
    temperatura mínima deberá ser menor o igual que la temperatura máxima.
    
            
                                    PRIMAVERA       VERANO        OTOÑO       INVIERNO
 MINIMA ABSOLUTA                    15                25            20            0
 MAXIMA ABSOLUTA                    30                45            30            25
 POSIBIL SOLEADO-NUBLADO            60%-40%          80-20%       40%-60%        20%-80%

    Ejemplo:
    1. Primavera
    2. Verano
    3. Otoño
    4. Invierno
    Seleccione la estación del año (1-4): 4
    Previsión del tiempo para mañana
--------------------------------
Temperatura mínima: 10ºC
Temperatura máxima: 16ºC
Nublado
 */


public class tema6Ej29 {
	public static void main (String args[]) {
    
    System.out.print("1. Primavera");
    System.out.println();
    
    System.out.print("2. verano");
    System.out.println();

    System.out.print("3. otoño");
    System.out.println();

    System.out.print("4. invierno");
    System.out.println();
    System.out.println();

    System.out.println("Seleccione la estación del año (1-4) :");
    
    int eleccion=Integer.parseInt(System.console().readLine());
    String estacion=" ";
    int tmin=0;
    int tmax=0;
    int aux;
    
    switch(eleccion){
      case 1:
      estacion="Primavera";
      tmin=(int)(Math.random()*16)+15;
      tmax=(int)(Math.random()*16)+15;
    
      break;
      
      case 2:
      estacion="verano";
      tmin=(int)(Math.random()*21)+25;
      tmax=(int)(Math.random()*21)+25;
    
      break;
      
      case 3:
      estacion="otoño";
      tmin=(int)(Math.random()*11)+20;
      tmax=(int)(Math.random()*11)+20;

      break;
      
      case 4:
      estacion="Invierno";
      tmin=(int)(Math.random()*26);
      tmax=(int)(Math.random()*26);
      break;
      
      default:
      }
      
    if(tmin>tmax){
      aux=tmin;
      tmin=tmax;
      tmax=aux;
    }
    System.out.println("\nPrevisión del tiempo para mañana: \n--------------------------------\n");
    System.out.println("temperatura mínima : "+tmin);
    System.out.println("temperatura máxima: "+tmax);

          
    
    

		
	}
}

