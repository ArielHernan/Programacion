/*
 * ejercicioClase.java
    
    Hacer un programa que capture 2 números enteros y presente los resultados de las siguientes operaciones:
    suma, resta, producto, cociente entero y división entera
 */
public class ejercicioClase {
	
	public static void main (String args[]) {
    
    
    int a=0;
    int b=0;
    
    System.out.println("Este programa hace operaciones matemáticas sencillas con los datos que metas");
    System.out.println("introduce el primer número");
    a = Integer.parseInt(System.console().readLine());
    System.out.println("introduice el primer número");
    b = Integer.parseInt(System.console().readLine());
    
    int suma= a+b;
    int resta= a-b;
    int mul= a*b;
    int div= a/b;
    int r = a%b;
    System.out.println("");

    
    System.out.println("La suma es: ");
    System.out.println(suma);

    System.out.println("La resta es: ");
    System.out.println(resta);
    
    System.out.println("La multiplicación es: ");
    System.out.println(mul);


    System.out.println("La división es: ");
    System.out.println(div);
    
    System.out.println("El resto es: ");
    System.out.println(r);





    
    
    

    
    

    
		
	}
}

