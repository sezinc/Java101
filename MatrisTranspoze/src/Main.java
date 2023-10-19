import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] matrisim=new int[2][3];
        for(int i=0;i<matrisim.length;i++){
            for(int j=0;j<matrisim[i].length;j++){
                    matrisim[i][j]=(int)(Math.random() * 9);
            }
        }
    
        int r=matrisim.length;
        int c=matrisim[0].length;

        System.out.println("Matris: ");
        for(int row=0;row<matrisim.length;row++){
            for(int col=0;col<matrisim[row].length;col++ ){
                System.out.print(matrisim[row][col]+ " ");
            }
            System.out.println();
        }
        System.out.println("Transpoze : ");
        for(int row=0;row<c;row++){
            for(int col=0;col<r;col++ ){
                System.out.print(matrisim[col][row]+ " ");
            }
            System.out.println();
        }


    }
}