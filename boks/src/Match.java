public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;

    }
    void run(){
        if(isCheck()){
            //İlk başlayan oyuncuya karar ver


                while (this.f1.health > 0 && this.f2.health > 0) {
                    int sayi= (int) Math.round(yaziTura());
                    System.out.println("======Yeni Round==========="+sayi);

                    //Kurada 1 çıktıysa 1.oyuncu başlasın
                    if(sayi==1) {
                        this.f2.health = this.f1.hit(this.f2);
                        if (isWin()) {
                            break;
                        }
                        this.f1.health = this.f2.hit(this.f1);
                        if (isWin()) {
                            break;
                        }
                    }else{
                        this.f1.health = this.f2.hit(this.f1);
                        if (isWin()) {
                            break;
                        }
                        this.f2.health = this.f1.hit(this.f2);
                        if (isWin()) {
                            break;
                        }
                    }
                    System.out.println(this.f1.name + " sağlık: " + this.f1.health);
                    System.out.println(this.f2.name + " sağlık: " + this.f2.health);

                }


        }else{
             System.out.println("Sporcuların sikletleri uyuşmuyor.");
        }
    }
    boolean isCheck(){
        return(this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight) ;
    }
    boolean isWin(){
        if(this.f1.health==0){
            System.out.println("Kazanan: "+this.f2.name);
            return true;
        }
        if(this.f2.health==0){
            System.out.println("Kazanan: "+this.f1.name);
            return true;
        }
        return false;
    }
    double yaziTura(){
        double randomNo=Math.random() * 1;
        return randomNo;
    }
}
