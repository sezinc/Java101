public class Main {
    public static void main(String[] args) {
        String[][] harfDizi=new String[6][4];
        for(int i=0;i<harfDizi.length;i++){
            for (int j=0;j<harfDizi[i].length;j++){
                if(i==0 || i==2 || i==5 ){
                    harfDizi[i][j]=" * ";
                } else if (j==0 || j==3) {
                    harfDizi[i][j]=" *     ";
                    
                }else {
                    harfDizi[i][j]=" ";
                }
            }
        }
        for(String[] row:harfDizi){
            for(String col:row ){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}