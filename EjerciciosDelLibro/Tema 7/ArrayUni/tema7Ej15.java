/*
 * tema7Ej15.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
     Ejercicio 15
    Un restaurante nos ha encargado una aplicación para colocar a los clientes en
    sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
    (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
    el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
    un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
    “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
    como máximo e intente de nuevo”. Para el grupo que llega, se busca
    siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
    busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
    dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
    las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
    nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
    pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
    programa se ilustra a continuación:
    * 
    * 
 ─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
│Mesa nº │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │ 10 │
├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
│Ocupación│ 3 │ 2 │ 0 │ 2 │ 4 │ 1 │ 0 │ 2 │ 1 │ 1 │
└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
¿Cuántos son? (Introduzca -1 para salir del programa): 2
Por favor, siéntense en la mesa número 3.
* 
* 
* 
┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
│Mesa nº │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │ 10 │
├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
│Ocupación│ 3 │ 2 │ 2 │ 2 │ 4 │ 1 │ 0 │ 2 │ 1 │ 1 │
└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
¿Cuántos son? (Introduzca -1 para salir del programa): 4
Por favor, siéntense en la mesa número 7.
* 
* 
* 
┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
│Mesa nº │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │ 10 │
├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
│Ocupación│ 3 │ 2 │ 2 │ 2 │ 4 │ 1 │ 4 │ 2 │ 1 │ 1 │
Arrays 125
└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
¿Cuántos son? (Introduzca -1 para salir del programa): 3
Tendrán que compartir mesa. Por favor, siéntense en la mesa número 6.
* 
* 
* 
┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
│Mesa nº │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │ 10 │
├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
│Ocupación│ 3 │ 2 │ 2 │ 2 │ 4 │ 4 │ 4 │ 2 │ 1 │ 1 │
└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
¿Cuántos son? (Introduzca -1 para salir del programa): 4
Lo siento, en estos momentos no queda sitio.
* 
* 
* 
┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
│Mesa nº │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │ 10 │
├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
│Ocupación│ 3 │ 2 │ 2 │ 2 │ 4 │ 4 │ 4 │ 2 │ 1 │ 1 │
└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
¿Cuántos son? (Introduzca -1 para salir del programa): -1
Gracias. Hasta pronto.

 */
public class tema7Ej15 {
	
	public static void main (String args[]) {
		
    int reserva=0;
    int[] ocupacion=new int[10];
    boolean vacio=true;
    boolean compartido=true;
    int mesaVacia=0;
    int mesaCompartida=0;
    for(int i=0;i<10;i++){
      ocupacion[i]=(int)(Math.random()*5);
      }
    
    do{
      
      System.out.print("mesa nº:  ");
      for(int i=1;i<=10;i++){
        System.out.printf("%3d",i);
        }
      System.out.println();
      System.out.print("ocupación:");
      for(int i=0;i<10;i++){
        System.out.printf("%3d",ocupacion[i]);
        }
      System.out.println();

      System.out.println("\ncuantos sois");
      reserva=Integer.parseInt(System.console().readLine());
      
      
      if(reserva>4){
        System.out.println("\nLo siento no admintimos grupos de "+reserva+"\n");
        }else{
          vacio=false;
          for(int i=0;i<10;i++){
            if(ocupacion[i]==0){
              vacio=true;
              mesaVacia=i;
              }
            }
          
          if(vacio){
            ocupacion[mesaVacia]=reserva;
            System.out.println("\nSientese en la mesa \n"+(mesaVacia+1)+"\n\n");
            }else{
              compartido=false;
              for(int i=0;i<10;i++){
                if(ocupacion[i]+reserva<=4){
                  compartido=true;
                  mesaCompartida=i;
                  }
                }
              if(compartido){
                ocupacion[mesaCompartida]=ocupacion[mesaCompartida]+reserva;
                System.out.println("\nComparta la mesa\n "+(mesaCompartida+1)+"\n\n");
                }else {
                  System.out.println("\nLo siento, en estos momentos no queda sitio.");
                  }
             }
          }

      }while(reserva!=-1);
	}
}

