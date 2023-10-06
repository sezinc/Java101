import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int girilenSayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        girilenSayi = input.nextInt();


        if (asalmi(girilenSayi, girilenSayi - 1) == 1) System.out.print(girilenSayi + " sayısı ASALDIR !");
        else System.out.print(girilenSayi + " sayısı ASAL değildir !");

    }

    static int asalmi(int sayi,int i) {
        if(sayi==1) return 0;
        if (i == 1) {
            return 1;
        } else {
            if (sayi % i == 0 )
                return 0;
            else return asalmi(sayi, i - 1);
        }

    }
}