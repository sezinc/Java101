import java.util.Scanner;

/**
Pratik - Taksimetre Hesaplayan Program
Taksimetre Programı

Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.
**/


public class Main {
    public static void main(String[] args) {
        //Değerler
        int km;
        double perKM, totalsum;
        //Km bilgisini kullanıcıdan al
        Scanner input=new Scanner(System.in);
        System.out.print("Km değerini giriniz:");
        km=input.nextInt();

        totalsum = 10 + (km*2.20);
        totalsum = totalsum<20 ? 20 :totalsum;
        System.out.println("Tutar: "+totalsum);
    }
}