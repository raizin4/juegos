/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos;

import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 *
 * @author ALEX
 */
public class Carta {
    private String cartajugador = "";
    private boolean perdiste = false;
    private int count = 0;
    private String color = "";
     

    public ImageIcon obtenerCarta() {
        String url = "F:\\2017\\Naipes\\JUEGO COLORES\\";
        int cartamaquina;
        int palomaquina;
        String palo = "";
        cartamaquina = (int) (Math.random() * 13 + 1);
        palomaquina = (int) (Math.random() * 4 + 1);
        if (palomaquina == 1) {
            palo = "-C";
            color = "ROJO";
        }
        if (palomaquina == 2) {
            palo = "-E";
            color = "VERDE";
        }
        if (palomaquina == 3) {
            palo = "-T";
            color = "VERDE";          
        }
        if (palomaquina == 4) {
            palo = "-P";
            color = "ROJO";
        }
        ImageIcon icono = new ImageIcon(url + color +"\\"+ cartamaquina + palo + ".png");
        return icono;
    }

    public String obtenerColorMaquina() {
        return color;
    }

    public String obtenerColorJugador(String color) {
        cartajugador = color;
        return cartajugador;
    }

    public String jugada() {
        String ganador = "";
        if (color == cartajugador) {
            ganador = "SIGUE JUGANDO SALIO: " + color;
            count++;
        } else {
            ganador = "PERDISTE SALIO : " +color;
            perdiste = true;
        }
        return ganador;
    }

    public int obtenerPuntaje() {
        return count;
    }

    public String obtenerMensaje() {
        String puntos = "";
        if (perdiste == true) {
            if (count < 4) {
                puntos = "JUEGO MALO";
            }
            if (count >= 4 && count <= 10) {
                puntos = "JUEGO REGULAR";
            }
            if (count > 10) {
                puntos = "JUEGO BUENO";
            }
        }
        return puntos;
    }
    public int playAgain(){
        count=0;
        return count;
    }
  /*  public Carta(int n) {
        this.n = n;
    }

    Scanner sc = new Scanner(System.in);

    public void obtenerCartas() {
        while (!perdiste) {
            if (n == 1) {
                System.out.println("ESCOGISTE CARTA ROJA");
            } else {
                System.out.println("ESCOGISTE CARTA NEGRA");
            }
            m = (int) (Math.random() * 2 + 1);
            if (m == 1) {
                System.out.println("SALIO CARTA ROJA");
                //cartamaquina = "SALIO CARTA ROJA";
            } else {
                System.out.println("SALIO CARTA NEGRA");
                //cartamaquina = "SALIO CARTA NEGRA";
            }
            if (m == n) {
                count++;
                System.out.println("SIGUE JUGANDO");
                System.out.println("===============");
                System.out.println("");
                System.out.println("ELIGE COLOR ");
                System.out.println("1. ROJO         2.NEGRO");
                n = sc.nextInt();
                obtenerCartas();
                //resultado = "SIGUE JUGANDO";
            } else {
                
                    System.out.println("PERDISTE GG WP");
                    System.out.println("================");
                    //resultado = "PERDISTE GG WP";
                    perdiste = true;
                }
            }
            
            //return cartamaquina;
        }
    public void obtenerPuntaje(){
         if (count<4) {
             System.out.println("SACASTE "+count+" PUNTOS");
             System.out.println("TUVISTE UN MAL JUEGO");
        }if (count>=4 && count<=10) {
            System.out.println("SACASTE "+count+" PUNTOS");
            System.out.println("TUVISTE UN REGULAR JUEGO");
        }if (count>10) {
            System.out.println("SACASTE "+count+" PUNTOS");
            System.out.println("TUBISTE UN JUEGO BUENO");
        }
   
        }*/
}

    
    
    

