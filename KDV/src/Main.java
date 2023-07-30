import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kdvOranı=0.18,kdvOranı2=0.08;
        double paraTutari;

        Scanner inptFiyat=new Scanner(System.in);
        System.out.println("Para Tutarı Giriniz: ");
        paraTutari= inptFiyat.nextDouble();

        System.out.println("KDV'siz tutar=" + paraTutari);
        System.out.println(paraTutari <1000 ? ("KDV'li tutar=" +paraTutari*(kdvOranı+1) ):("KDV'li tutar=" +paraTutari*(1+kdvOranı2)));
        //System.out.println("KDV = %"+kdvOranı*100 );
    }
}