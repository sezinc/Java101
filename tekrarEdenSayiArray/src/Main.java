public class Main {
    static boolean isSame(int[] gecici,int deger){
      for(int i:gecici){
          if(i==deger){
              return true;
          }
      }
        return false;
    }
    public static void main(String[] args) {
        int[] dizi={3,7,3,10,2,7,3,13,2,9,10,21,13,33,9,1};
        int[] ayniSayilar=new int[dizi.length];
        int index=0;
        for(int i=0;i< dizi.length;i++){
            for(int j=0;j< dizi.length;j++){
                if(i!=j && dizi[i]==dizi[j]){
                    if(!isSame(ayniSayilar,dizi[i])) {
                        ayniSayilar[index] = dizi[i];
                        index++;
                    }
                }
            }
        }
        for(int item:ayniSayilar){
            if(item!=0 && item%2==0){
                System.out.println(item);
            }
        }
    }
}