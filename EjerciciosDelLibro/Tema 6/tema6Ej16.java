/*
 * tema6Ej16.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 
    Ejercicio 16
    Realiza un simulador de máquina tragaperras simplificada que cumpla los
    siguientes requisitos:
    a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
    figuras posibles: corazón, diamante, herradura, campana y limón.
    b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
    perdido”.
    c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
    ha recuperado su moneda”.
    d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
    10 monedas”.
    * 
    Ejemplo 1:
    diamante diamante limón
    Bien, ha recuperado su moneda
    * 
    Ejemplo 2:
    herradura campana diamante
    Lo siento, ha perdido
    * 
    Ejemplo 3:
    corazón corazón corazón
    Enhorabuena, ha ganado 10 monedas
 */


public class tema6Ej16 {
	
	public static void main (String args[]) {
		
    String figura= " ";
    int tirada= 0;
    int i=0; 
    String figura1=" ";
    String figura2=" ";
    String figura3=" ";
    int recuperado=0;
    int ganado=0;
    int perdido= 0;
    
    
    for(int j=0;j<100;j++){
      for(i=1;i<=3;i++){
        
        tirada=(int)(Math.random()*5+1);
        
        switch(tirada){
          case 1:
          figura= "corazon";
          break;
          
          case 2:
          figura= "diamant";
          break;
          
          case 3:
          figura= "herradura";
          break;
          
          case 4:
          figura= "limon";
          break;
          
          case 5:
          figura= "campana";
          break;
          
          default:
          }
          
        if(i==1){
          figura1=figura;
          }else if(i==2){
            figura2=figura;
            }else{
              figura3=figura;
              }

      System.out.print(figura + " ");


      }

    System.out.println();
    System.out.println();

      if((figura1!=figura2)&&(figura2!=figura3)&&(figura1!=figura3)){
      System.out.println("Estás muy cerca del premio gordo, tira de nuevo, echa ese euro ahí");
      perdido+=1;
      }else if((figura1==figura2)&&(figura2==figura3)){
        System.out.println("¡GANASTE!!!! Ahora estás cerca de doblar tu dinero. JUEGA DOBLE O NADA. Estás en racha.");
        ganado+=10;
        perdido+=1;
        }else{
          System.out.println("Te sigues recuperando. ¡¡ERES INVENCIBLE!!!");
          recuperado+=1;
          perdido+=1;
          }
    System.out.println();
    } 
    
    System.out.println();
    
    System.out.println("Has perdido                      "+perdido+" euros");
    System.out.println("Has recuperado                   "+recuperado+" euros");
    System.out.println("Has ganado el premio especial    " +(ganado)+" euros");
    System.out.println("Has ganado en total =            " +(ganado+recuperado)+" euros");
    System.out.println("la banca gana "+(perdido-(ganado+recuperado)));

  }
}


