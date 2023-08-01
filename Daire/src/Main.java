import java.util.Scanner;

/**
 * Dairenin Alanını ve Çevresini Hesaplayan Program

 * Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

 * Alan Formülü : π * r * r;
 *
 * Çevre Formülü : 2 * π * r;
 * Ödev
 *
 * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
 *
 * 𝜋 sayısını = 3.14 alınız.
 *
 * Formül : (𝜋 * (r*r) * 𝛼) / 360*/

public class Main {
    public static void main(String[] args) {
        double pi=3.14,alan,cevre,r,merkezAci,merkezAciDilimi;
        int R;

        Scanner input = new Scanner(System.in);

        System.out.print("Çap değerini giriniz:");
        R=input.nextInt();

        System.out.print("Merkez açı değerini giriniz:");
        merkezAci=input.nextInt();

        r=R/2;
        alan=pi*R*R;
        cevre=2*pi*R;
        merkezAciDilimi = (pi*r*r*merkezAci)/360;     // (𝜋 * (r*r) * 𝛼) / 360
        System.out.println("Alan:" + alan);
        System.out.println("Çevre: " + cevre );
        System.out.println("Açı diliminin alanı:"+merkezAciDilimi);
    }
}