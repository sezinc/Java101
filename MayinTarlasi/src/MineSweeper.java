import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    MineSweeper(int rowNumber, int colNumber){
        rowNumber=this.rowNumber;
        colNumber=this.colNumber;
    }
    void run(){
        System.out.println("Mayın Tarlası oyununa Hoşgeldiniz!");
        String[][] dizi= Main.mayinTarlam();
        String[][] oyunDizi= new String[dizi.length][];//dizi.clone();

        String mayin = "*";
        String cizgi = "-";
        for (int i = 0; i < dizi.length; i++) {
            oyunDizi[i]=new String[dizi[i].length];
            //kopyalama gerekmiyor
          //  System.arraycopy(dizi[i], 0, oyunDizi[i], 0, dizi[i].length);
        }
        for (int i = 0; i < oyunDizi.length; i++) {
            for (int j = 0; j < oyunDizi[i].length; j++) {
              oyunDizi[i][j]=cizgi;
            }
        }

       // Oyun alanı ilk gösterim
     //  System.out.println("Oyun alanı ilk gösterim");
        for (int i = 0; i < oyunDizi.length; i++) {
            for (int j = 0; j < oyunDizi[i].length; j++) {
                System.out.print(oyunDizi[i][j] + "    ");
            }
            System.out.println();
        }


      // System.out.println(oyunDizi.length+","+oyunDizi[0].length);
        boolean devam=true;
        while (devam) {
            int rowS, colS;
            Scanner inputS = new Scanner(System.in);
            System.out.println("Satır Giriniz:");
            rowS = inputS.nextInt();
            System.out.println("Sütun Giriniz:");
            colS = inputS.nextInt();


            if (rowS >= oyunDizi.length || rowS < 0 || colS >= oyunDizi[0].length || colS < 0) {
                System.out.println("Geçersiz Koordinat!");
                continue;

            }else{

                if ((dizi[rowS][colS]).equals(mayin)) {
                    System.out.println("Game Over!");
                    break;
                } else {
                    int say=0;
                    //eğer seçilene komşu mayın varsa
                    if((colS-1>=0))
                        if((dizi[rowS][colS-1])==mayin) say++;//sol
                    if((colS+1)<dizi[rowS].length)
                        if( (dizi[rowS][colS+1])==mayin) say++;//sağ
                    if((rowS-1)>=0)
                        if((dizi[rowS-1][colS]) ==mayin ) say++;//üst
                    if((rowS+1)<dizi.length)
                        if((dizi[rowS+1][colS])==mayin) say++;//alt

                    if((rowS-1)>=0 && (colS-1)>=0 )
                        if((dizi[rowS-1][colS-1])==mayin) say++;//sol üst
                    if((rowS-1)>=0 && (colS+1)<dizi[rowS].length)
                        if( (dizi[rowS-1][colS+1])==mayin) say++;//sağ üst
                    if((rowS+1)<dizi.length && (colS-1)>=0 )
                        if((dizi[rowS+1][colS-1]) ==mayin) say++;//sol alt
                    if((rowS+1)<dizi.length && (colS+1)<dizi[rowS].length)
                        if((dizi[rowS+1][colS+1])==mayin) say++;//sağ alt


                    oyunDizi[rowS][colS] = String.valueOf(say);
                    dizi[rowS][colS]=String.valueOf(say);
//                    for (int i = 0; i < dizi.length; i++) {
//                        for (int j = 0; j < dizi[i].length; j++) {
//                            System.out.print(dizi[i][j] + "    ");
//                        }
//                        System.out.println();
//                    }
                    for (int i = 0; i < oyunDizi.length; i++) {
                        for (int j = 0; j < oyunDizi[i].length; j++) {
                            System.out.print(oyunDizi[i][j] + "    ");
                        }
                        System.out.println();
                    }
                    int sayac=0;
                    for (int i = 0; i < dizi.length; i++) {
                        for (int j = 0; j < dizi[i].length; j++) {
                            if(dizi[i][j]==cizgi ){
                                sayac++;
                            }
                        }
                    }
                 //   System.out.println("sayac"+sayac);
                    if(sayac==0){
                        System.out.println("Kazandın");
                        devam=false;
                    }


                }
            }

        }//while

    }

}
