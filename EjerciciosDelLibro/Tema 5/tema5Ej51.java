/*
 * tema5Ej51.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
Ejercicio 51
El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
(todos los que encuentre). Realiza un programa que muestre un número antes
y después de haber sido comido por el gusano. Si el animalito no se ha comido
ningún dígito, el programa debe indicarlo.
Ejemplo 1:
Introduzca un número entero (mayor que cero): 51803458
Después de haber sido comido por el gusano numérico se queda en 51345
Ejemplo 2:
Introduzca un número entero (mayor que cero): 29614
El gusano numérico no se ha comido ningún dígito.

 * 
 */


public class tema5Ej51 {
	
	public static void main (String args[]) {
    
    System.out.println("este gusano se come los números con forma de rosquilla");
    
    System.out.println("Introduzca un número entero (mayor que cero)");
    int n=Integer.parseInt(System.console().readLine());
    int aux=n;
    int aux2;
    int contador=0;
    int comprobado=0;
    int volteado=0;
    int nfinal=0;
    while(aux>0){
      contador++;
      aux/=10;
      }

      
    for(int i =0;i<contador;i++){
      comprobado=n%10;
      System.out.println(comprobado);
      if(!(comprobado==8||comprobado==0)){
        volteado=(volteado*10)+(n%10);
        }
      n/=10;
      }
      
    System.out.println(volteado);
    aux2=volteado;
    
    while(aux2>0){
      nfinal=(nfinal*10)+(aux2%10);
      aux2/=10;
      }
    System.out.println(nfinal);

		
	}
}

