import java.util.Scanner;

/*Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

case   0  Maymun

case   1  Horoz

case   2  Köpek

case   3  Domuz

case   4  Fare

case   5  Öküz

case   6  Kaplan

case   7  Tavşan

case   8  Ejderha

case   9  Yılan

case   10  At

case   11  Koyun*/
public class Main {
    public static void main(String[] args) {
        //Tanımlar
        int dogumYili,zodyakOran;
        String zodyak;
        //Kullanıcı Girişi
        Scanner input=new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        dogumYili=input.nextInt();
        //Hesaplama
        zodyakOran=(int) (dogumYili % 12);
        //System.out.println(zodyakOran);

        switch (zodyakOran){
           
            case  0:
                zodyak = "Maymun";
                break;

            case 1:
                zodyak = "Horoz";
                break;
            case   2:
                zodyak = "Köpek";
                break;

            case   3:
                zodyak = "Domuz";
                break;

            case   4:
                zodyak = "Fare";
                break;

            case   5:
                zodyak = "Öküz";
                break;

            case   6:
                zodyak = "Kaplan";
                break;

            case   7:
                zodyak = "Tavşan";
                break;

            case   8:
                zodyak = "Ejderha";
                break;

            case   9:
                zodyak = "Yılan";
                break;

            case   10:
                zodyak = "At";
                break;

            case   11:
                zodyak = "Koyun";
                break;
            default:
                zodyak="boş";
        }
        System.out.println("Çin Zodyağı Burcunuz: "+zodyak);
    }
}