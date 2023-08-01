import java.util.Scanner;

/**
 Manav Kasa Programı

 Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram
 değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

 Meyveler ve KG Fiyatları

 Armut : 2,14 TL
 Elma : 3,67 TL
 Domates : 1,11 TL
 Muz: 0,95 TL
 Patlıcan : 5,00 TL
 * */

public class Main {
    public static void main(String[] args) {
        //Sebze Meyve fiyatları tanımlaması
        double armut = 2.14, elma = 3.67, domates=1.11, muz=0.95, patlican=5.00,toplam;
        int armutkg,elmakg,domateskg,muzkg,patlicankg;

        Scanner input=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        armutkg=input.nextInt();

        System.out.print( "Elma Kaç Kilo ? :");
        elmakg=input.nextInt();

        System.out.print("Domates Kaç Kilo ? :");
        domateskg=input.nextInt();

        System.out.print( "Muz Kaç Kilo ? :");
        muzkg=input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicankg=input.nextInt();

        toplam=(armutkg*armut)+(elmakg*elma)+(domateskg*domates)+(muzkg*muz)+(patlicankg*patlican);
        System.out.println( "Toplam Tutar : "+ toplam +" TL");

    }
}