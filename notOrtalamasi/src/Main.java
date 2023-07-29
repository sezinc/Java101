import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler tanımlanıyor
        int mat,fizik,kimya,turkce,tarih,muzik;

        //Scanner sınıfı tanımlanıyor
        Scanner inptNot=new Scanner(System.in);

        //Kullanıcıdan not bilgileri alınıyor
        System.out.print("Matematik notunuz: ");
        mat= inptNot.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik= inptNot.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya= inptNot.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce= inptNot.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih= inptNot.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik= inptNot.nextInt();

        int toplam=mat+fizik+kimya+turkce+tarih+muzik;
        double ortalama = toplam/6.0;

        System.out.println("Ortalamanız: " + ortalama);
        System.out.println(ortalama>60 ? "Sınıfı Geçti" :"Sınıfta Kaldı");

    }
}