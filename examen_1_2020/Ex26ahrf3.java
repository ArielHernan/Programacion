/*
 * Ex26ahrf3.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
 * 
[2,5 puntos] Implemente un programa que genere el "desglose del IVA" para una serie de productos adquiridos
en una tienda. El programa ha de solicitar, de manera reiterada, los siguientes datos para cada producto que
se adquiera:
nombre artículo
cantidad
precio por unidad (IVA incluido)
tipo de IVA (a elegir entre 4%, 10%, 21%)
El programa finalizará de pedir datos cuando se le ponga como nombre del artículo el valor "fin". En ese
momento, debe realizar un desglose indicando el precio total de la compra y las bases imponibles
correspondientes a cada tramo de IVA, así como la cuantía del IVA por cada tramo. Observe cómo el
programa ha de solicitar los datos al usuario ("recuerda" el nombre del artículo sobre el que le está pidiendo
información; se señala en el ejemplo en colorines1
). Vea el siguiente ejemplo:
1 No debe implementar el "coloreo" de los artículos; sólo se colorean en este enunciado para su mejor apreciación.
FACTURA TIENDA
==============
Introduzca nombre del artículo ('fin' para salir): Articulo1
Precio por unidad para Articulo1 (IVA incluido): 1.04
Cantidad de unidades de Articulo1: 1
Tipo de IVA aplicado a Articulo1 (4,10,21): 4
Introduzca nombre del artículo ('fin' para salir): Articulo2
Precio por unidad para Articulo2 (IVA incluido): 1.10
Cantidad de unidades de Articulo2: 2
Tipo de IVA aplicado a Articulo2 (4,10,21): 10
Introduzca nombre del artículo ('fin' para salir): Articulo3
Precio por unidad para Articulo3 (IVA incluido): 1.21
Cantidad de unidades de Articulo3: 3
Tipo de IVA aplicado a Articulo3 (4,10,21): 21
Introduzca nombre del artículo ('fin' para salir): Articulo4
Precio por unidad para Articulo4 (IVA incluido): 1.04
Cantidad de unidades de Articulo4: 4
Tipo de IVA aplicado a Articulo4 (4,10,21): 4
Introduzca nombre del artículo ('fin' para salir): fin
TOTAL: 11.03
------------------------------------------
Base imponible 4%: 5.00 IVA: 0.20
Base imponible 10%: 2.00 IVA: 0.20
Base imponible 21%: 3.00 IVA: 0.63
 */


public class Ex26ahrf3 {
	
	public static void main (String args[]) {
		
	}
}

