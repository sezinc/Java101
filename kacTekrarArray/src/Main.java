import java.util.Arrays;

public class Main {
    static int[] dizi={10, 20, 20, 10, 10, 20, 5, 20};
    static boolean isSame(int[] gecici,int deger){
        for(int i:gecici){
            if(i==deger){
                return true;
            }
        }
        return false;
    }
    static int countEquals(int deger){
        int sayac=0;
        for(int i:dizi){
            if(i==deger){
               sayac++;
            }
        }
        return sayac;
    }
    public static void main(String[] args) {
        System.out.println("Dizi : " + Arrays.toString(dizi));
        int[] dizi2 = new int[dizi.length];
        Arrays.fill(dizi2, -1);

        System.out.println("Tekrar Sayıları");

        for (int i = 0; i < dizi.length; i++) {
            if (!isSame(dizi2, dizi[i])) {//eğer dizi 'nin i. değeri dizi2 içinde yoksa yani önceden tekraları sayıldıysa
                System.out.println(dizi[i] + " sayısı " + countEquals(dizi[i]) + " kere tekrar edildi. ");
                if (countEquals(dizi[i]) > 0) {
                    dizi2[i] = dizi[i];//eğer saydıysan bir kere dizi2 ye eklen
                }
            }
        }

    }
}