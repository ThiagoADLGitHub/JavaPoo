/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package play;

/**
 *
 * @author thiag
 */
public class Caneta {
    //declaração de atributos
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;
    //fim Atributos
    //Metudos
    void status(){
        System.out.print("cor da caneta é:"+this.cor +" ");
    }
    void rabiscar(){
        if(this.tampada==true){
            System.out.println("Não posso rabiscar");
        }else{
            System.out.print("estou rabiscando");
        }
    }
    void tampar(){
        this.tampada= true;
    }
    void destampar(){
        this.tampada= false;
    }
    
    
}
