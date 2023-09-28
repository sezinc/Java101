import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int elemanSayisi;
        Scanner input=new Scanner(System.in);
        System.out.print("Eleman sayısı:");
        elemanSayisi=input.nextInt();
        int sayi1=0,sayi2=1,topla;
        System.out.print(sayi1+" "+sayi2);

        for(int i =2;i<=elemanSayisi;i++) {
            topla = sayi1 + sayi2;
            System.out.print(" "+topla);
            sayi1 = sayi2;
            sayi2 = topla;
        }
            System.out.println();
        }

    }
