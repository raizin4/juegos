/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;
import juegos.Dado;

/**
 *
 * @author ALEX
 */
public class TestDado {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero del ganador : ");
        n=sc.nextInt();
        while(n<1 || n>6){
            System.out.println("numero incorrecto");
            System.out.println("ingrese nuevo numero : ");
            n=sc.nextInt();
        }
        
        Dado d= new Dado(n);
        
        d.obtenerJugada();
        d.obtenerGanador();
    }
}
