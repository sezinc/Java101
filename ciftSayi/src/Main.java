/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,toplam=0,sayac=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        sayi=input.nextInt();

        for(int i=1;i<=sayi;i++) {
            if (i % 3 == 0 && i % 4 == 00 ) {
                toplam += i;
                sayac += 1;
               // System.out.print(i+",");
            }
        }
        int sonuc= (sayac==0) ? 0:toplam/sayac;

        System.out.println(sayi+"'a kadar olan 3 ve 4'e tam bölünen sayıların ortalaması:"+sonuc);


    }
}