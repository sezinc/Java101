public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("ahmet",10,120,100,100);
        Fighter f2=new Fighter("mehmet",20,85,85,50);

        Match match=new Match(f1,f2,85,100 );
        match.run();

        //System.out.println("Hello world!");
    }
}