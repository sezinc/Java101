import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n1,n2,islemKod;
        Scanner input=new Scanner(System.in);

        System.out.println("İlk Sayı=");
        n1=input.nextInt();

        System.out.println("İkinci Sayı=");
        n2=input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        islemKod=input.nextInt();

        switch (islemKod) {
            case 1:
                System.out.println("Toplam = "+ (n1 +n2));
                break;
            case 2:
                System.out.println("Çıkar = " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma = "+ (n1*n2));
                break;
            case 4:
                System.out.println("Bölme = " + (n2 !=0 ? (n1/n2) : "Sayı 0\'a bölünemez"));
                break;
            default:
                System.out.println("Yanlış rakam girdiniz!");

        }

    }
}