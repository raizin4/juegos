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
public class BlackJack {

    private int player1 = 0;
    private int player2 = 0;
    private int paloA;
    private int paloB;
    private String palo = "";
    private String color = "";
    private int bj = 21;
    private int count1 = 0;
    private int count2 = 0;
    private String url = "F:\\2017\\Naipes\\BLACK JACK\\";
    private String vencedor = "";
    private String ganador = "";
    private String iguales="";

    public ImageIcon obtenerIconoReverse() {
        ImageIcon icono = new ImageIcon(url + "REVERSE.png");
        return icono;
    }
    

    public ImageIcon obtenerCartaA() {
        player1 = (int) (Math.random() * 11 + 1);
        count1 = count1 + player1;
        paloA = (int) (Math.random() * 4 + 1);
        while (paloA == paloB) {
            paloA = (int) (Math.random() * 4 + 1);
        }
        if (paloA == 1) {
            palo = "-C";
            color = "CORAZONES\\";
        }
        if (paloA == 2) {
            palo = "-E";
            color = "ESPADAS\\";
        }
        if (paloA == 3) {
            palo = "-T";
            color = "TREBOL\\";
        }
        if (paloA == 4) {
            palo = "-P";
            color = "PICAS\\";
        }
        ImageIcon icon = new ImageIcon(url + color + player1 + palo + ".png");
        return icon;
    }

    public int mostrarsumaA() {
        return count1;
    }

    public int mostrarsumaB() {
        return count2;
    }

    public ImageIcon obtenerCartaB() {
        player2 = (int) (Math.random() * 11 + 1);
        count2 = count2 + player2;
        paloB = (int) (Math.random() * 4 + 1);
        while (paloA == paloB) {
            paloB = (int) (Math.random() * 4 + 1);
        }
        if (paloB == 1) {
            palo = "-C";
            color = "CORAZONES\\";
        }
        if (paloB == 2) {
            palo = "-E";
            color = "ESPADAS\\";
        }
        if (paloB == 3) {
            palo = "-T";
            color = "TREBOL\\";
        }
        if (paloB == 4) {
            palo = "-P";
            color = "PICAS\\";
        }
        ImageIcon icon = new ImageIcon(url + color + player2 + palo + ".png");
        return icon;
    }

    public String calcularJugada() {
        if (count1 > count2 && count1 < bj) {
            vencedor = "A";
        } else {
            vencedor = "B";
        }
        return vencedor;
    }

    public String ganador() {
        if (count1 == 21) {
            ganador = "A";
        }
        if (count2 == 21) {
            ganador = "B";
        }
        return ganador;
    }
   
    public void reiniciar() {
        player1 = 0;
        player2 = 0;
        count1 = 0;
        count2 = 0;

    }

}
