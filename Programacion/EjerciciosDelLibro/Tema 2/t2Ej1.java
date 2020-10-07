/*
 Ejercicio 1
Escribe un programa en el que se declaren las variables enteras x e y. 
Asígnales los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación.
 */
public class t2Ej1 {
  public static void main(String[] args) {
    System.out.println("EL valor asignado al primer número es : 144");
    System.out.println("EL valor asignado al segundo número es: 999");
    System.out.println("Presentamos operaciones sencilllas a continuación:\n");
    
    int x=144;
    int y=99;
    
    int suma= x+y;
    int resta= x-y;
    int multiplicacion= x*y;
    float division= (float) x / (float) y;
    
    System.out.println("La suma de los dos números es ; " + suma);
    System.out.println("La resta de los dos números es ; " + resta);
    System.out.println("La multiplicación de los dos números es ; " + multiplicacion);
    System.out.println("La división de los dos números es ; " + division);

  }
}
