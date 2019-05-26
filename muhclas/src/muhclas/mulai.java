/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package muhclas;

/**
 *
 * @author acer
 */
public class mulai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        buah saya = new buah();
        saya.panen();
        saya.jual();
        saya.pesan();
        
        System.out.println("\nJumlah apel   : "+saya.apel);
        System.out.println("Jumlah pisang : "+saya.pisang);
        System.out.println("Jumlah kelapa   : "+saya.kelapa);
    }
    
}
