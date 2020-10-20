/*
 * t4Ej15.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
 *  15. Escribe un programa que pinte una pirámide rellena con un carácter
*   introducido por teclado que podrá ser una letra, un número o un
*   símbolo como *, +, -, $, &, etc. El programa debe permitir al
*   usuario mediante un menú elegir si el vértice de la pirámide está
*   apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la
*   derecha.
 * 
 */
import java.util.Scanner;
public class t4Ej15 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    String carac= "";
    int opci=0;
    
    System.out.println("Este programa pinta pirámides");
    System.out.println("\nTienes la maravillosa opción de elgir de QUÉ caracter quieres rellenarla. Y....");
    System.out.println("\n...La maravillosa opción de elegir HACIA DÓNDE APUNTA EL VÉRTICE!!");
    System.out.println("\n¿No te parece alucinante?");
    System.out.println("\nVamos allá, introduce el caracter con el que quieres rellenar la pirámide:");
    
    carac=s.nextLine();
    
    System.out.println("\nSigamos la maravillosa configuración de nuestra pirámide.");
    System.out.println("\nElige hacia donde quieres que apunte tu pirámide:");
    System.out.println("\n1. con el vérice hacia arriba.");
    System.out.println("\n2. con el vérice hacia derecha.");
    System.out.println("\n3. con el vérice hacia abajo.");
    System.out.println("\n4. con el vérice hacia izqierda.");
    
    opci=s.nextInt();
    
    switch(opci){
      
      case 1:
        System.out.println("\n\nHas elegido rellenarla con " + carac + " y que apunte hacia arriba.\nAquí tienes tu MAGNÍFICA PIRÁMIDE:\n\n\t\t");
        System.out.println("\t\t  " +carac);
        System.out.println("\t\t " +carac+carac+carac);
        System.out.println("\t\t"+carac+carac+carac+carac+carac);
        break;
      
      case 2:
        System.out.println("\n\nHas elegido rellenarla con " + carac + " y que apunte hacia derecha.\nAquí tienes tu MAGNÍFICA PIRÁMIDE:\n\n");
        System.out.println("\t\t" + carac);
        System.out.println("\t\t" +carac+" "+ carac);
        System.out.println("\t\t" + carac+ " " + carac + " " + carac);
        System.out.println("\t\t" + carac+" "+ carac);
        System.out.println("\t\t" + carac);
        break;
      case 3:
        System.out.println("\n\nHas elegido rellenarla con " + carac + " y que apunte hacia abajo.\nAquí tienes tu MAGNÍFICA PIRÁMIDE:\n\n");
        System.out.println("\t\t" + carac+carac+carac+carac+carac);
        System.out.println("\t\t " +carac+carac+carac);
        System.out.println("\t\t  " +carac);
        break;
      case 4:        
        System.out.println("\n\nHas elegido rellenarla con " + carac + " y que apunte hacia Izquierda.\nAquí tienes tu MAGNÍFICA PIRÁMIDE:\n\n");
        System.out.println("\t\t    " + carac);
        System.out.println("\t\t  " + carac + " " + carac);
        System.out.println("\t\t" + carac + " " + carac + " " + carac);
        System.out.println("\t\t  " + carac + " " + carac);
        System.out.println("\t\t    " + carac);
        break;
                  }

    }

	}


