/*
* Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
*  eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile
* aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
* "Şifre oluşturulamadı, lütfen başka şifre giriniz."
* sorun yoksa
* "Şifre oluşturuldu" yazan programı yazınız.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String adi,asilSifre="java123",girilenSifre,sifirOnay,yeniSifre;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adı = ");
        adi = input.nextLine();

        System.out.println("Şifre = ");
        girilenSifre = input.nextLine();

        if(adi.equals("patika") && girilenSifre.equals(asilSifre)){
            System.out.println("Giriş Yaptınız!");
        }else {
            System.out.println("Giriş yapamadınız!!!!\nŞifreyi sıfırlamak istiyor musunuz?E/H:");
            sifirOnay=input.nextLine();
            if(sifirOnay.equals("E") || sifirOnay.equals("e")){
                  System.out.println("Yeni şifre= ");
                  yeniSifre=input.nextLine();
                if(yeniSifre.equals(girilenSifre) || yeniSifre.equals(asilSifre)){
                    //Yeni şifre, hatalı girdiğiniz şifre ve unuttuğunuz şifre ile aynı olmamalı
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.!");
                }else{
                    System.out.println("Şifre Oluşturuldu");
                    asilSifre=yeniSifre;
                }

            } else {
                System.out.println("Çıkış yapılıyor");

            }
        }
    }
}