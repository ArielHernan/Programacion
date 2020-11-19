/*
 * Ex26ahrf4.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
[2 puntos] Implemente un programa que "estire" números. El programa debe solicitar al usuario un número
entero positivo, que será el número que va a ser estirado. A continuación, debe solicitar al usuario otro número
entero positivo, que es "el estiramiento" que va a sufrir. Dicho número indicará las repeticiones que tendrá
lugar cada cifra del número original en el número "estirado". El resultado que genere el número no tiene por
qué almacenarse en ninguna variable entera ni entera larga; piense que se puede estirar muchísimo. Vea el
siguiente ejemplo:
[0,5 puntos] Mejore el programa anterior, de forma que si el número introducido es negativo, el programa avise al
usuario de este asunto y lo considere sin signo. En caso de que se introduzca el número cero, el programa
debe, de forma reiterada, volver a solicitar el número, hasta que introduzca un número que no sea cero, y
continúe con la petición del estiramiento. En el caso del estiramiento, debe tratarse de un entero positivo
distinto de cero, con lo que el programa solicitará reiteradamente el valor del estiramiento hasta que se cumpla
esta condición. Después, llevará a cabo el estiramiento en los términos del programa anterior. Vea el siguiente
ejemplo:
Intruduzca el número positivo a ser estirado: 12345
Intruduzca el estiramiento: 2
El número 12345 estirado por 2 es:
1122334455
Intruduzca el número positivo a ser estirado: 123056
Intruduzca el estiramiento: 3
El número 123056 estirado por 3 es:
111222333000555666
 */
public class Ex26ahrf4 {
	
	public static void main (String args[]) {
		System.out.println("Introduzca un número a estirar:");
    int n=Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca  el estiramiento:");
    int estira=Integer.parseInt(System.console().readLine());
    
    System.out.println("El número al reves es: " );
    int contador=0;
    int aux=n;
    int alreves=0;
    
    while(aux>0){
      alreves=(alreves*10)+(aux%10);
      contador++;
      aux/=10;
      }
      System.out.println(alreves);
      
    System.out.println("el número " + n +" estirado por "+ estira + " :");
     
     int digito=0;
      for(int i=0;i<contador;i++){
        digito=alreves%10;
        for(int j=0;j<estira;j++){
          System.out.print(digito);
          }
        alreves/=10;
      }
	}
}

