import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int[] list = {56, 34, 1, 8, 101, -2, -33};
//
//        int maxList=list[0];
//        int minList=list[0];
//
//        for(int i:list){
//            if(i<minList)
//            {
//                minList=i;
//            }
//            if(i>maxList){
//                maxList=i;
//            }
//        }

//        System.out.println("Minimum: "+minList);
//        System.out.println("Maksimum: "+maxList);

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int sayi,max=list[0],min=list[0];// baslangic = enYakinSayilar[0], bitis = enYakinSayilar[enYakinSayilar.length - 1];
        for(int i:list){
            if(i<min)
            {
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        Scanner input = new Scanner(System.in);
        sayi = input.nextInt();

        System.out.println("Sayı: " + sayi);
        int index = Arrays.binarySearch(list, sayi);//dizinin içindeyse

            if (index >= 0) {
                if (sayi == min) {
                    System.out.println("Girilen sayıdan küçük en yakın sayı : " + list[index]);
                } else {
                    System.out.println("Girilen sayıdan küçük en yakın sayı : " + list[index - 1]);
                }
                if (sayi == max) {
                    System.out.println("Girilen sayıdan büyük en yakın sayı : " + list[index]);
                } else {
                    System.out.println("Girilen sayıdan büyük en yakın sayı : " + list[index + 1]);
                }

            }else {//dizi içinden bir sayı değilse
                if (sayi >= min && sayi <= max) { //Sayı dizinin max-min değerleri içinde varsa;

                    for (int i : list) {
                        if (sayi >= i) {
                            min = i;
                        }
                    }
                    int indexim = Arrays.binarySearch(list, min);
                    //min=list[indexim-1];
                    max = list[indexim + 1];

                    // System.out.println("Girilen Sayı: " + sayi);
                    System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
                    System.out.println("Girilen sayıdan büyük en yakın sayı :" + max);


                } else {
                    if (sayi < min) {
                        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
                    }
                    if (sayi > max) {
                        System.out.println("Girilen sayıdan büyük en yakın sayı :" + max);
                    }
                }

            }


    }
}