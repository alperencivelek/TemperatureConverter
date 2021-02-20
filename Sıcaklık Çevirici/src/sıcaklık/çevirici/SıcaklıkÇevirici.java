/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sıcaklık.çevirici;

import java.util.Scanner;

/**
 *
 * @author Alperen Civelek
 */
public class SıcaklıkÇevirici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sıcaklık biriminizi seçiniz: (C,F,K)");
        String birim=input.next();
        System.out.println("Sıcaklık değerini giriniz: ");
        double sicaklik=input.nextDouble();
        if (birim.equals("C")){
            System.out.println(sicaklik+" Celcius değeri şu Kelvin     değerine eşit: "+ (sicaklik+270.15));
            System.out.println(sicaklik+" Celcius değeri şu Fahrenheit değerine eşit: "+ (sicaklik*1.8+32));    
        }
        else if (birim.equals("F")){
            System.out.println(sicaklik+" Fahrenheit değeri şu Celcius değerine eşit: "+((sicaklik-32)/1.8));
            System.out.println(sicaklik+" Fahrenheit değeri şu Kelvin  değerine eşit: "+((sicaklik-32)/1.8+270.15));
        }
        else{
            System.out.println(sicaklik+" Kelvin değeri şu Celcius    değerine eşit: "+(sicaklik-270.15));
            System.out.println(sicaklik+" Kelvin değeri şu Fahrenheit değerine eşit: "+((sicaklik-270.15)*1.8+32));
        }
    }
    
}
