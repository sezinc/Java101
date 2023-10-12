public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    double tax,bonus,farkArti=0.0;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    void tax(){
//        Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
//        Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.

        if(this.salary>1000){
            tax=this.salary*0.03;
             System.out.println("Vergi: "+tax);
        }else {
            tax=0.0;
            System.out.println("Vergi Uygulanmıyor.");
        }
    }

    void bonus(){
        //Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı
        // her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
        if(this.workHours>40){
            bonus=(this.workHours-40)*30;
            System.out.println("Bonus: "+bonus);
        }else{
            bonus=0.0;
        }
    }
    void raiseSalary(){
        /*Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
        Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.*/
        int fark=2021-this.hireYear;
        if(fark<10){
            farkArti=(this.salary*0.05);
            System.out.println("Maaş artışı: "+ farkArti  );
        }else if(fark>9 && fark<20){
            farkArti=(this.salary*0.10);
            System.out.println("Maaş artışı: "+ farkArti  );
        }else if(fark>19){
            farkArti=(this.salary*0.15);
            System.out.println("Maaş artışı: "+ farkArti  );
        }
    }
    void taxBonus(){
        double d=this.salary+bonus-tax;
        String s=Double.toString(d);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :"+ s);
    }
    void toplam(){
        double d= this.salary +bonus+farkArti-tax;
        String s=Double.toString(d);
        System.out.println("Toplam Maaş: " + s);
    }

}
