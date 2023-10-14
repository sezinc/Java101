//Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
public class Main {
    public static void main(String[] args) {
        double [] dizi={1,2,3,4,5};
        double toplam=0;
        for(int i = 0; i<dizi.length;i++)
        {
            toplam += (1/dizi[i]);
        }
        System.out.println(dizi.length/toplam);
    }
}