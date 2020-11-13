/*
 * tema6Ej22.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
      Ejercicio 22
      Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
      aleatorio. La cabeza se representará con el carácter @ y se debe colocar
      exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
      el cuerpo irá serpenteando de la siguiente manera: se generará de forma
      aleatoria un valor entre tres posibles que hará que el siguiente carácter se
      coloque una posición a la izquierda del anterior, alineado con el anterior o una
      posición a la derecha del anterior. La longitud de la serpiente se pedirá por
      teclado y se supone que el usuario introducirá un dato correcto.
      Ejemplo:
      Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: 6
        @
        *
       *
        *
       *
        *
 */
public class tema6Ej22 {
	
	public static void main (String args[]) {
		int posicion=0;
    System.out.println("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza:");
    int longitud= Integer.parseInt(System.console().readLine());

    System.out.print("            @");
    System.out.println();
    for(int j=0;j<longitud;j++){

      posicion=(int)(Math.random()*3+1);
      
      switch(posicion){
        case 1:
        System.out.print("            *");
        break;
        
        case 2:
        System.out.print("            *");
        break;
        
        case 3:
        System.out.print("             *");
        break;
        }
        
      System.out.println();
    }
    
	}
}

