import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matematik, fizik, turkce, kimya,muzik;
        byte matdahil=1,fizDahil=1,trDahil=1,kmDahil=1,mzDahil=1;
        double ortalama;

        System.out.println("Ders notlarınızı giriniz!");
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik:");
        matematik = input.nextInt();
        if(matematik<0 || matematik>100){
            matematik=0;
            matdahil=0;
        }

        System.out.print("Fizik:");
        fizik = input.nextInt();
        if(fizik<0 || fizik>100){
            fizik=0;
            fizDahil=0;
        }

        System.out.print("Türkçe:");
        turkce = input.nextInt();
        if(turkce<0 || turkce>100){
            turkce=0;
            trDahil=0;
        }

        System.out.print("Kimya:");
        kimya = input.nextInt();
        if(kimya<0 || kimya>100){
            kimya=0;
            kmDahil=0;
        }

        System.out.print("Müzik:");
        muzik = input.nextInt();
        if(muzik<0 || muzik>100){
            muzik=0;
            mzDahil=0;
        }
        ortalama = (matematik+fizik+turkce+kimya+muzik)/(matdahil+fizDahil+trDahil+kmDahil+mzDahil);

        System.out.println("Ortalamanız:"+ortalama);
        if(ortalama<=55){
            System.out.println("Kaldınız");
        }else {
            System.out.println("Geçtiniz");
        }
    }
}