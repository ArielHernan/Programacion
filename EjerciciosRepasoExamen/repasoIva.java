/*
 * repasoIva.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
[2,5 puntos] Genera el precio (bien desglosado) de un pedido a un almacén en función de las siguientes
condiciones:
- Se pregunta el precio del artículo, el número de unidades y el código de descuento.
- El precio inicial del pedido se calcula multiplicando el precio unitario por la cantidad.
- El código 685 hace que se resten 15 euros.
- El código 778 aplica un 5% de descuento a las 20 primeras unidades.
- El código 219 hace que las primeras 5 unidades salgan gratis (válido solo si se piden más de 5 unidades).
- Al final se suma el 21% de IVA.
Cualquier código diferente a los anteriormente mencionados no tiene ningún efecto sobre el precio.
* 
* 
Ejemplo 1:
Introduzca el precio del artículo (en Euros): 35,50
Indique el número de unidades: 7
Indique el código de descuento: 685
A continuación, se le muestra el precio desglosado del pedido:
-----------------------------------------------
Precio del artículo: 35,50 €
Precio con descuento: 233,50 €
IVA (21%): 49,04 €
-----------------------------------------------
PRECIO FINAL: 282,54 €
* 
* 
Ejemplo 2:
Introduzca el precio del artículo (en Euros): 35,50
Número de unidades: 7
Precio total unidades: 248,50 €
Descuento aplicado: Código 685: 15,00 €
Indique el número de unidades: 8
Indique el código de descuento: 238
A continuación, se le muestra el precio desglosado del pedido:
-----------------------------------------------
Precio del artículo: 35,50 €
Número de unidades: 8
Precio total unidades: 284,00 €
Descuento aplicado: Código no válido 0,00 €
Precio con descuento: 284,00 €
IVA (21%): 59,64 €
-----------------------------------------------
PRECIO FINAL: 343,64 €
* 
* 
Ejemplo 3:
Introduzca el precio del artículo (en Euros): 35,50
Indique el número de unidades: 8
Indique el código de descuento: 219
A continuación, se le muestra el precio desglosado del pedido:
-----------------------------------------------
Precio del artículo: 35,50 €
Número de unidades: 8
Precio total unidades: 284,00 €
Descuento aplicado: Código 219: 177,50 €
Precio con descuento: 106,50 €
IVA (21%): 22,37 €
-----------------------------------------------
PRECIO FINAL: 128,87 €
 */

import java.util.Scanner;
public class repasoIva {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce el precio del artículo");
    double precio=s.nextDouble();
    
    System.out.println("Introduce el numero  de unidades");
    double unidades=s.nextInt();
    
    System.out.println("Introduce el codigo  de descuento");
    int codigo=s.nextInt();
    
    
    double precioTotal=unidades*precio;
    double descuento=0;
    switch(codigo){
      
      case 685:
      descuento=(precio-15.0);
      break;
      case 778:
      if(unidades>=20){
      descuento=precio-(precio*0.05);
        }
      break;
      case 219:
      if(unidades>5){
        descuento=precio*5;
        }
        break;
        default:
      }

      double precioConDescuento=precioTotal-descuento;
      double Iva=(precioConDescuento*0.21);
      
      System.out.printf("%10s%10.2f\n","precio del artículo: ", precio);
      System.out.printf("%10s%10.2f\n","Número de unidades : ",unidades);
      System.out.println("Precio total de unidades : " + precioTotal);
      System.out.println("Descuento aplicado : " +" ccódigo :"+ codigo+" : "+descuento);
      System.out.println("Precio con descuento : " + (precioTotal-descuento));
      System.out.println("IVA (21%) : " + Iva);
      System.out.println("Precio Final: " + (precioConDescuento+ Iva));
	}
}

