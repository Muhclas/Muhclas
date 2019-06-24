/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rekru;

import java.util.Scanner;

/**
 *
 * @author Muditra
 */
public class Rekru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Scanner inpu= new Scanner(System.in);
        System.out.println("Muhclas Adi Putra");
        System.out.println("E1E1 17 046");
        System.out.println("Masukan Perkalian : ");
       // System.out.println("Masukan Perkalian : ");
        int pilih=input.nextInt();
       // int pili=inpu.nextInt();
        perkalian(pilih,1);
    }
    static int perkalian(int a, int b) {
        int jml=b*a;
       if (b==11){
           return a;
       }else{   
         System.out.println(b+" X "+a +" = "+ jml) ;
         perkalian(a,b+1);
         return 0;
       }
        
    }
 
    }
 
