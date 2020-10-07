/*
 * ejercicioPrueba.java
 * 
Haz una bandera
 */


class ejercicioPrueba {
  //Reset
  public static final String reset = "\u001B[0m";
  //letras
  public static final String letraNegra = "\u001B[30m";
  public static final String letraRoja = "\u001B[31m";
  public static final String letraVerde = "\u001B[32m";
  public static final String letraAmarilla = "\u001B[33m";
  public static final String letraAzul = "\u001B[34m";
  public static final String letraMorada = "\u001B[35m";
  public static final String letraCyan = "\u001B[36m";
  public static final String letraBlanca = "\u001B[37m";
  //fondo
  public static final String fondoNegro = "\u001B[40m";
  public static final String fondoRojo = "\u001B[41m";
  public static final String fondoVerde = "\u001B[42m";
  public static final String fondoAmarillo = "\u001B[43m";
  public static final String fondoAzul = "\u001B[44m";
  public static final String fondoMorado = "\u001B[45m";
  public static final String fondoCian = "\u001B[46m";
  public static final String fondoBlanco = "\u001B[47m";


  public static void main(String[] args) {
    System.out.printf(fondoVerde + "%40s"," ");
    System.out.println(reset);//reseteo color
    System.out.printf(fondoAmarillo + "%40s"," ");
    System.out.println(reset);//reseteo color
    System.out.printf(fondoMorado + "%40s"," ");
    System.out.println(reset);//reseteo color
    
    System.out.println("FIN");
  }
}
