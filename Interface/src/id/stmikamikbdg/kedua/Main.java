/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.stmikamikbdg.kedua;

/**
 *
 * @author WINDOWS 7X4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi data = new Persegi();
        data.Keliling();
        data.Luas();
        
        Trapesium input = new Trapesium();
        input.Keliling();
        input.Luas();
        
        Lingkaran apa = new Lingkaran(1);
        apa.Keliling();
        apa.Luas();
        
        System.out.println(" Luas Lingakaran ="+Lingkaran.class());
        
        
    }
    
}
