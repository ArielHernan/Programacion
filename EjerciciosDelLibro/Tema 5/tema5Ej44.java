/*
 * tema5Ej44.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
    Ejercicio 44
    Escribe un programa que sea capaz de insertar un dígito dentro de un número
    indicando la posición. El nuevo dígito se colocará en la posición indicada y el
    resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
    izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
    correctamente los datos. Se recomienda usar long en lugar de int ya que el
    primero admite números más largos.
    * 
    * Haz que se detenga el programa al introducir un 0
    Ejemplo:
    Por favor, introduzca un número entero positivo: 406783
    Introduzca la posición donde quiere insertar: 3
    Introduzca el dígito que quiere insertar: 5
    El número resultante es 4056783
     
     Por favor, introduzca un número entero positivo: 0
     Has pulasdo 0.Se cierra el programa. Gracias por haber participado"
 */
 
public class tema5Ej44{
 
	
	public static void main (String args[]) {
		System.out.println("Programa de  elegir podicion para poner un numero dentro de otre");
    
  int n;
    
	do{	System.out.println("Introduce un numero. Para salir del programa pulsa 0");
    n= Integer.parseInt(System.console().readLine());
    if(n==0){
      break;
      }
    System.out.println("Introduce un digito");
    long digito= Long.parseLong(System.console().readLine());
    
    System.out.println("Introduce una posicion");
    long posicion= Integer.parseInt(System.console().readLine());
    
    long aux=n;
    long girado=0;
    long factor=1;
    
    while(aux>0){
      girado=(girado*10)+(aux%10);
      aux=aux/10;
      }
    
    System.out.println("numero girado: "+girado);
    for(int i=1;i<posicion;i++){
      factor*=10;
      }
    System.out.println("factor: "+factor);
    System.out.println();
    
    long izquierda=girado/factor;
    izquierda=izquierda*10+digito;
    
    long derecha=girado%factor;
    
    long numerotermminado=izquierda*factor+derecha;
    long giradofinal=0;
    while(numerotermminado>0){
      giradofinal=(giradofinal*10)+(numerotermminado%10);
      numerotermminado/=10;
      }
    
    System.out.println("El númeo resultante es: " + giradofinal);
  }while(!(n==0));   
  
  System.out.println("Has pulasdo 0.Se cierra el programa. Gracias por haber participado");        
	}
}

