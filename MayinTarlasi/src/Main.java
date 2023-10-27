import java.util.Scanner;

public class Main {
    public static String[][] mayinTarlam(){
        int row, col;
        Scanner input = new Scanner(System.in);
        System.out.println("Oyun oluşturmak için ");
        System.out.println("Satır Giriniz:");
        row = input.nextInt();
        System.out.println("Sütun Giriniz:");
        col = input.nextInt();
        //System.out.println(row+","+col);
        String[][] dizi = new String[row][col];

        String cizgi = "-";
        String mayin = "*";
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = cizgi;
            }
        }
        int uzunluk = row * col;
        int mayinSayisi = uzunluk / 4;

        for (int a = 0; a < mayinSayisi; a++) {
            int rowMayin = (int) (Math.random() * row);
            ;//int[] rowMayin=new int[mayinSayisi];
            int colMayin = (int) (Math.random() * col);
            ;//int[] colMayin=new int[mayinSayisi];
            dizi[rowMayin][colMayin] = mayin;//(int) (Math.random()*row);
            //System.out.println(rowMayin+" "+colMayin);
        }
        // MAyın tarlası
//        System.out.println("MAyın tarlası "+dizi.length);
//        for (int i = 0; i < dizi.length; i++) {
//            for (int j = 0; j < dizi[i].length; j++) {
//                System.out.print(dizi[i][j] + "    ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < dizi.length; i++) {
//            for (int j = 0; j < dizi[i].length; j++) {
//                System.out.print(dizi[i][j] + "    ");
//            }
       //    System.out.println("tarla tanımlandı");
//        }
        return dizi;
    }

    public static void main(String[] args) {



       MineSweeper mine=new MineSweeper(0,0);
       mine.run();
    }
}