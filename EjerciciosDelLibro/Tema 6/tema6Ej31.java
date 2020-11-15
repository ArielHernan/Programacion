/*
 * tema6Ej31.java
 * 
 * Copyright 2020 Ariel Rojas <arielhernan.rojas.alu@iescampanillas.com>
 * 
    Ejercicio 31
    Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
    partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
    muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
    11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
    si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados
    suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
    da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
    entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
    ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
    pierde. Si sale otro número, tiene que seguir tirando.
 */


public class tema6Ej31 {
	
	public static void main (String args[]) {
    
    System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━┓");
    System.out.println("┃ ⚀ C ⚁ R ⚂ A ⚃ P ⚄ S ⚅ ┃");
    System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━┛");

		
    System.out.println("Cuanto dinero quieres apostar:  ");
    int apuesta=Integer.parseInt(System.console().readLine());
    int dado1=(int)(Math.random()*6+1);
    int dado2=(int)(Math.random()*6+1);
    int auxiliar=0;
    System.out.println("DAD0 1 : "+dado1);
    System.out.println("DAD0 2 : "+dado2);
    System.out.println();
    System.out.println("la suma de los dos dados es: "+(dado1+dado2));
    System.out.println();
    
    if(dado1+dado2==7||dado1+dado2==11){
      System.out.println("¡¡¡HAS GANADO "+(apuesta+apuesta)+ " EUROS");
      }else if(dado1+dado2==2||dado1+dado2==3||dado1+dado2==12){
        System.out.print("JA JA eres un looser, habia pocas probabilidades de perder a la primera");
        }else{
          auxiliar=dado1+dado2;
          System.out.println("Volvemos a tirar los dados, si sale "+ auxiliar+ " ganas. Si sale 7 pierdes.");
          dado1=(int)(Math.random()*6+1);
          dado2=(int)(Math.random()*6+1);
          System.out.println("DAD0 1 : "+dado1);
          System.out.println("DAD0 2 : "+dado2);
          if(dado1+dado2==auxiliar){
            System.out.println("Has sacado un " + auxiliar);
            }else if(dado1+dado2==7){
              System.out.println("Has sacado un 7 ");
              }else{
              System.out.println("La suma es : "+(dado1+dado2)+" repetimos hasta sacar un 7 o un " + auxiliar);
            }
          
          if(dado1+dado2==auxiliar){
            System.out.println("¡OLÉ QUE SUERTE!!SUMAN "+auxiliar+" HAS GANADO"+(apuesta+apuesta)+" EUROS, Parećia que perdías pero eres un campeón , sigue apostando verás que bien");
            }else if(dado1+dado2==7){
              System.out.println("JAJA, HAS PERDIDO!!!!");
              }else{
                do{
                  dado1=(int)(Math.random()*6+1);
                  dado2=(int)(Math.random()*6+1);
                  System.out.println("DAD0 1 : "+dado1);
                  System.out.println("DAD0 2 :"+dado2);
                  if(dado1+dado2==auxiliar){
                    System.out.println("SUMAN "+auxiliar+" ¡HAS GANADO!! "+(apuesta*2)+" €uros");
                    }else if(dado1+dado2==7){
                      System.out.println("¡HAS SACADO UN 7!!!. Lo siento, pierdes.");
                  }else{
                    System.out.println("La suma es : "+(dado2+dado1)+" en cuanto sumen 7 pierdes si suman "+ auxiliar+" ganas");
                  }
                  }while(dado1+dado2!=auxiliar&&dado1+dado2!=7);
                
                }
          
          }
    
	}
}

