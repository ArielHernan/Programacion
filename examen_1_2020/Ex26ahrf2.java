/*
 * Ex26ahrf2.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
    [2,5 puntos] Implemente un programa que solicite al usuario un número entero largo y positivo. Dicho programa
    obtendrá dos enteros largos a partir de él, y los presentará por pantalla. Uno de ellos contendrá los dígitos
    pares en el mismo orden en el que aparecen en el número de partida, y el otro contendrá los dígitos impares
    en orden inverso al que aparecen en el número de partida. Vea los siguientes ejemplos:

 */

public class Ex26ahrf2 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    // Le da la vueta al número y calcula la longitud
    long numero = numeroIntroducido;
    long volteado = 0;
    int digito;

    int longitud = 0;
    if (numero == 0) {
      longitud = 1;
    }
    while (numero > 0) {
    volteado = (volteado * 10) + (numero % 10);
    numero /= 10;
    longitud++;
    }
    System.out.print("Dígitos pares: ");

    for (int i = 0; i < longitud; i++) {
    digito = (int)(volteado % 10);
    if ((digito % 2) == 0) {
      System.out.print(digito + " ");
    }
    volteado /= 10;
    }
    System.out.println();

    long numero2 = numeroIntroducido;
    long volteado2 = 0;
    int digito2;

    int longitud2 = 0;
    if (numero2 == 0) {
      longitud2 = 1;
    }
    numero2=numeroIntroducido;

    System.out.print("Dígitos Impares: ");

    for (int i = 0; i < longitud; i++) {
    digito2 = (int)(numero2 % 10);
    if (!((digito2 % 2) == 0)) {
      System.out.print(digito2 + " ");
    }

    numero2 /= 10;
    }
    
	}
}

