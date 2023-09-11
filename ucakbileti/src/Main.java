import java.util.Scanner;

/*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı
 yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş)
bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre
müşteriye aşağıdaki indirimleri uygulayın ;

    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
    yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya
    "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20
    indirim uygulanır.*/
public class Main {
    public static void main(String[] args) {

        double normalTutar,yasIndirimiOranı=0.0,gdIndirimOran=0.0;
        int mesafe,yas,yolculukTipi;

        Scanner input=new Scanner(System.in);

        System.out.print("Mesafe(KM):");
        mesafe=input.nextInt();

        System.out.print("Yaş:");
        yas=input.nextInt();

        System.out.print("Yolculuk Tipi(Tek:1, Gidiş-dönüş:2):");
        yolculukTipi=input.nextInt();

        if(mesafe>0 && yas>0 && (yolculukTipi==1 || yolculukTipi==2))
        {
            normalTutar=mesafe*0.10;
            if(yas<=12){
                yasIndirimiOranı = normalTutar * 0.50;   //  12 yaş altı %50 indirim
            } else if (yas<24 && yas>12) {
                yasIndirimiOranı=normalTutar* 0.10;     //   12-24 yaş arası %10 indirim
            } else if (yas>65) {
                yasIndirimiOranı=normalTutar* 0.30;     // 65 yaş üstü %30 indirim
            }
            normalTutar=normalTutar-yasIndirimiOranı;
            // Yolculuk Tipine Göre indirim
            if(yolculukTipi==2){
                gdIndirimOran=normalTutar*0.20;   // gidiş dönüş %20 indirim
                normalTutar=(normalTutar-gdIndirimOran)*2;
            }

            System.out.println("Bilet Tutarı:"+normalTutar);
        }else
        {
            System.out.println("Hatalı bilgi girdiniz!");
        }


    }
}