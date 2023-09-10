import java.util.Scanner;

/*
Girilen ay ve gün bilgisinin hangi burçta olduğunu söyleyen program.
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart*/
public class Main {
    public static void main(String[] args) {
        int ay,gun;
        String burc="";
        boolean isError=false;

        Scanner input=new Scanner(System.in);
        System.out.print("Doğduğunuz gün: ");
        gun=input.nextInt();

        System.out.print("Doğduğunuz ay: ");
        ay=input.nextInt();

        if(ay>0 && ay<=12){
            if (ay ==1){                                  //Ocak
                if(gun>0 && gun<=31){
                    if(gun<22){
                        burc="Oğlak";
                    }else{
                        burc="Kova";
                    }
                }else {
                    isError=true;
                }

            } else if (ay ==2) {                         //Şubat
                if(gun>0 && gun<=29){
                    if(gun<20){
                        burc="Kova";
                    }else{
                        burc="Balık";
                    }
                }else {
                    isError=true;
                }
            } else if (ay==3) {                          //Mart

                if(gun>0 && gun<=31){
                    if(gun<21){
                        burc="Balık";
                    }else{
                        burc="Koç";
                    }
                }else {
                    isError=true;
                }
            } else if (ay==4) {                         //Nisan

                if(gun>0 && gun<=30){
                    if(gun<21){
                        burc="Koç";
                    }else{
                        burc="Boğa";
                    }
                }else {
                    isError=true;
                }
            } else if (ay==5) {                         //Mayıs

                if(gun>0 && gun<=31){
                    if(gun<22){
                        burc="Boğa";
                    }else{
                        burc="İkizler";
                    }
                }else {
                    isError=true;
                }
            } else if (ay==6) {                         //Haziran

                if(gun>0 && gun<=30){
                    if(gun<23){
                        burc="İkizler";
                    }else{
                        burc="Yengeç";
                    }
                }else {
                    isError=true;
                }
            } else if (ay==7) {                         //Temmuz

                if(gun>0 && gun<=31){
                    if(gun<23){
                        burc="Yengeç";
                    }else{
                        burc="Aslan";
                    }
                }else {
                    isError=true;
                }
            } else if (ay==8) {                         //Ağustos

                if(gun>0 && gun<=31){
                    if(gun<23){
                        burc="Aslan";
                    }else{
                        burc="Başak";
                    }
                }else {
                    isError=true;
                }
            } else if (ay==9) {                         //Eylül

                if(gun>0 && gun<=30){
                    if(gun<23){
                        burc="Başak";
                    }else{
                        burc="Terazi";
                    }
                }else {
                    isError=true;
                }
            } else if (ay==10) {                        //Ekim

                if(gun>0 && gun<=31){
                    if(gun<23){
                        burc="Terazi";
                    }else{
                        burc="Akrep";
                    }
                }else {
                    isError=true;
                }
            } else if (ay==11) {                        //Kasım

                if(gun>0 && gun<=30){
                    if(gun<22){
                        burc="Akrep";
                    }else{
                        burc="Yay";
                    }
                }else {
                    isError=true;
                }
            }else {                                     //Aralık

                if(gun>0 && gun<=31){
                    if(gun<22){
                        burc="Yay";
                    }else{
                        burc="Oğlak";
                    }
                }else {
                    isError=true;
                }
            }
        } else {
            isError=true;
        }

        if(isError){
            System.out.println("Yanlış giriş yaptınız! ");
        }else {
            System.out.println("Burcunuz= " + burc);
        }
    }
}