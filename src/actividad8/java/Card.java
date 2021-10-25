/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad8.java;

/**
 *@author LyrisseC
 */
public class Card {
    public String palo;
    public String color;
    public String valor;
    
    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    Card() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @return
     */
    @Override
    public String toString(){
        return "Palo: " + palo + " | " + "Color: " + color +
                " | " + "Valor: " + valor;
    }
}
