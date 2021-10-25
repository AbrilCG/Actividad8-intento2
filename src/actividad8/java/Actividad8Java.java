/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad8.java;
/**
 *@author LyrisseC
 */
public class Actividad8Java {
    public static void main(String[] args) {
        Deck mazo = new Deck();
        Card card = new Card();
        
        System.out.println("Deck de Cartas para Iniciar: " + mazo.getSize());

        mazo.getDeck().forEach((elemento) -> {
            System.out.print(elemento + " / ");
        });
        System.out.println("\n");
        mazo.suflle();
        System.out.println("\n");
        mazo.head();
        System.out.println("\n");
        mazo.pick();
        System.out.println("\n");
        mazo.hand();
    }
    
}
