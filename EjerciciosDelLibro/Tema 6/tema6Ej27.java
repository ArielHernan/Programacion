/*
 * tema6Ej26.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 
    Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
    jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
    introduce una opción incorrecta, el programa deberá mostrar un mensaje de
    error.
    Ejemplo 1:
    Turno del jugador (introduzca piedra, papel o tijera): papel
    Turno del ordenador: papel
    Empate
    Ejemplo 2:
    Turno del jugador (introduzca piedra, papel o tijera): papel
    Turno del ordenador: tijera
    Gana el ordenador
    Ejemplo 3:
    Turno del jugador (introduzca piedra, papel o tijera): piedra
    Turno del ordenador: tijera
    Gana el jugador
 */


public class tema6Ej27 {
	
	public static void main (String args[]) {
    
    String jugador= " ";
    String ordenador= " ";
    int tirada=0;
    int ganamaquina=0;
    int ganaHumano=0;
   do{ 
    System.out.println("El juego de piedra papel o tijera, juega contra el ordenador: ");
    System.out.println("Para dejar de jugar escribe:  salir ");
    System.out.println("Elija:  piedra, papel o tijera");
    jugador=System.console().readLine();
    System.out.println();
    if(jugador.equals("salir")){
      break;
      }
    
    tirada=(int)(Math.random()*3);
    
    switch(tirada){
      case 0:
      ordenador="piedra";
      break;
      
      case 1:
      ordenador="papel";
      break;
      
      case 2:
      ordenador="tijera";
      break;
      default:
      }
		System.out.println("el jugador ha elegido : "+ jugador+"\nel ordenador ha elegido: "+ordenador+"\n");
    
    if(jugador==ordenador){
      System.out.println("El resultado ha sido empate");
      }else{
        int ganador=2;
        
        switch(jugador){
          case "piedra":
          if(ordenador.equals("tijera")){
            ganador=1;
            }
          
          case "papel":
          if(ordenador.equals("piedra")){
            
            ganador=1;
            }
          case "tijera":
          if(ordenador.equals("papel")){
            ganador=1;
            }
          default:
          }
          
          if(ganador==1){
            
            System.out.println("\n**!!HAS GANADO A LA MAQUINA!!!**\n");
            ganaHumano+=1;
            }else{
              System.out.println("\nHUMANO, PIERDES\n");
              ganamaquina+=1;
              }
        
        }
    System.out.println("humano llevas ganadas: "+ganaHumano+"partidas");
    System.out.println();
    System.out.println("maquina llevas ganadas: "+ganamaquina+"partidas");
    
    System.out.println();
      }while(!(jugador.equals("salir")));
	}
}

