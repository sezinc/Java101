import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi,sayac=0;
        int gecici;
        double x,x1;
        int y,y1,temp1,temp2,basamak,basSayiTop=0;

        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        sayi=input.nextInt();

        gecici=sayi;
        do {
            sayi = sayi / 10;
            sayac++;
        } while (sayi > 0);

        for(int i=1;i<=sayac;i++)
        {
            x= Math.pow(10, i-1);
            y=(int)Math.round(x);

            x1= Math.pow(10, i);
            y1=(int)Math.round(x1);

            temp1=gecici % y;
            temp2=gecici % y1;

            basamak= (temp2-temp1)/y;
            basSayiTop=basSayiTop+basamak;

            // System.out.println("y:"+y+"y1:"+y1+"temp1:"+temp1+"temp2:"+temp2+i+".basamak:"+basamak);
        }

        System.out.println("Basamak sayısı: "+sayac );
        System.out.print("Sayı basamakları toplamı: "+basSayiTop);

    }
}
/*
        Basamak sayısını bul
        do{
            sayi=sayi/10;
            sayac++;
        }while(sayi>0);
        System.out.println("Basamak sayısı: "+sayac );

       */