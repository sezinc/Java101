import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int select;
        Scanner input =new Scanner(System.in);

        System.out.println("1.Toplama \n"+
                "2.Çıkarma \n"+
                "3.Çarpma \n"+
                "4.Bölme \n"+
                "5.Üslü Sayı \n"+
                "6.Faktöriyel\n"+
                "7.Mod \n"+
                "8.Dikdörtgen alan ve çevre hesabı\n"+
                "0.Çık\n");
        do{
            System.out.print("Seçiminiz: ");
            select=input.nextInt();
            switch (select){
                case 1:
                    topla();
                    break;
                case 2:
                    cikar();
                    break;
                case 3:
                    carp();
                    break;
                case 4:
                    bol();
                    break;
                case 5:
                    us();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikdortgen();
                    break;
                case 0:
                    System.out.println("Çıkış");
                    break;
                default:
                    System.out.println("Yanlış bir tuşa bastınız.");
            }

        }while(select!=0);
    }
    static void topla() {
        Scanner input =new Scanner(System.in);
        int sayi1, sayi2;
        System.out.print("1.sayı:");
        sayi1 = input.nextInt();
        System.out.print("2.sayı:");
        sayi2 = input.nextInt();
        System.out.println("Toplam: " + (sayi1 + sayi2));
    }
    static void cikar() {
        Scanner input =new Scanner(System.in);
        int sayi1, sayi2;
        System.out.print("Büyük sayı:");
        sayi1 = input.nextInt();
        System.out.print("Küçük sayı:");
        sayi2 = input.nextInt();
        System.out.println("Fark: " + (sayi1 - sayi2));
    }

    static void carp() {
        Scanner input =new Scanner(System.in);
        int sayi1, sayi2;
        System.out.print("1.sayı:");
        sayi1 = input.nextInt();
        System.out.print("2.sayı:");
        sayi2 = input.nextInt();
        System.out.println("Çarpım: " + (sayi1 * sayi2));
    }

    static void bol() {
        Scanner input =new Scanner(System.in);
        double sayi1, sayi2;
        System.out.print("Bölünen sayı:");
        sayi1 = input.nextDouble();
        System.out.print("Bölen sayı:");
        sayi2 = input.nextDouble();
        if(sayi2==0)
            System.out.println("Bir sayı 0 sayısına bölünemez.");
        else
            System.out.println("Bölüm: " + (sayi1 / sayi2));
    }

    static void us() {
        Scanner input = new Scanner(System.in);
        double sayi1, sayi2;
        System.out.print("Sayı:");
        sayi1 = input.nextDouble();
        System.out.print("Üs:");
        sayi2 = input.nextDouble();
        System.out.println(sayi1 + "'in " + sayi2 + ".kuvveti: " + (Math.pow(sayi1, sayi2)));
    }
    static void faktoriyel() {
        Scanner input =new Scanner(System.in);
        int sayi1, sayi2;
        System.out.print("Sayı:");
        sayi1 = input.nextInt();
        int fak=1;
        for(int i=sayi1;i>0;i--)
        {
            fak*=i;
        }
        System.out.println(sayi1+"'in Faktöriyeli : " + fak);
    }
    static void mod() {
        Scanner input =new Scanner(System.in);
        int sayi1, sayi2;
        System.out.print("Mod alıncak sayı:");
        sayi1 = input.nextInt();
        System.out.print("bölünecek sayı:");
        sayi2 = input.nextInt();
        System.out.println("Mod : " + (sayi1%sayi2));
    }
    static void dikdortgen() {
        Scanner input =new Scanner(System.in);
        int sayi1, sayi2;
        System.out.print("Uzun kenar:");
        sayi1 = input.nextInt();
        System.out.print("Kısa kenar:");
        sayi2 = input.nextInt();
        System.out.println("Alan: " + (sayi1 * sayi2));
        System.out.println("Çevre: " + (2*(sayi1 + sayi2)) );
    }
}