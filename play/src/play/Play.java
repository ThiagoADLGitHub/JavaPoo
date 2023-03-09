/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package play;

/**
 *
 * @author thiag
 */
public class Play {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Primeiro objeto
        Caneta c1 = new Caneta();
        c1.cor="Azul";
        c1.ponta=1.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        //Segundo objeto
        Caneta c2 = new Caneta();
        c2.destampar();
        c2.rabiscar();
    }
    
}
