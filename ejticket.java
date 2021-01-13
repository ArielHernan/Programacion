/*
 * ejticket.java
 * 
    Haz un programa que pida tres artículos y los memorice. Para cada artículo, pedirá:

    - nombre
    - precio por unidad
    - cantidad de unidades


    El programa debe memorizar esos datos de cada artículo. El progrma presentará en pantalla la información así:

    Artículo	Cantidad	Precio unidad	Subtotal
    -----------------------------------------------------------
    Articulo1	x		y		z
    Articulo2	a		b		c
    Articulo3	m		n		o
    -----------------------------------------------------------
    TOTAL						p

    sabiendo que los subtotales se calculan multiplicando cada cantidad de artículo por el precio por unidad, y que el TOTAL
    es la suma de todos los subtotales
 */
import java.util.Scanner;
public class ejticket {
	
	public static void main (String args[]) {
    
    Scanner s=new Scanner(System.in);
    double a=0.0;
    double b=0.0;
    double c= 0.0;
    
    String aa= "";
    String bb= "";
    String cc= "";
    
    int aaa=0;
    int bbb=0;
    int ccc=0;
    
    double total=0;
    double subt=0;
    
        
    System.out.println("Este programa  pide tres artículos y los memoriza\n");
    System.out.println("Para cada artículo, pedirá:nombre precio por unidad y cantidad de unidades\n");
    System.out.println("Se calculará el subtotal y el total\n\n");
    
    System.out.println("\nIntroduce el nombre de los tres artículos separados por espacios o enter\n");
    aa=s.next();
    bb=s.next();//articulo
    cc=s.next();
    
    System.out.println("\nIntroduce el precio de los tres artículos separados por espacios o enter\n");
    
    a=s.nextDouble();
    b=s.nextDouble();//precio
    c=s.nextDouble();
    
    System.out.println("\nIntroduce la cantidad de los tres artículos separados por espacios o enter\n");
    
    aaa= s.nextInt();
    bbb= s.nextInt();  //cantidad
    ccc= s.nextInt();
    
    total=(a+b+c);
    System.out.println(" ");
    System.out.println(" ");
    
    System.out.printf("\t%-10s%-10s%-10s%-10s","Artículo", "Cantidad", "Precio", "Subtot");
    System.out.print("\n\t-----------------------------------------------");
    System.out.printf("\n\t%-10s%-10d%-10.2f%-10.2f",aa,aaa,a,(aaa*a));
    System.out.printf("\n\t%-10s%-10d%-10.2f%-10.2f",bb,bbb,b,(bbb*b));
    System.out.printf("\n\t%-10s%-10d%-10.2f%-10.2f",cc,ccc,c,(ccc*c));
    System.out.print("\n\t-----------------------------------------------\n");
    
    System.out.println("\tTOTAL\t\t\t\t" + (((double)(aaa*a))+((double)(bbb*b))+((double)(ccc*c))));
    

    
    

    
    		
	}
}

