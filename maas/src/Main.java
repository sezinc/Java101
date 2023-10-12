/*Adı : kemal
Maaşı : 2000.0
Çalışma Saati : 45
Başlangıç Yılı : 1985
Vergi : 60.0
Bonus : 150.0
Maaş Artışı : 300.0
Vergi ve Bonuslar ile birlikte maaş : 2090.0
Toplam Maaş : 2390.0
*/
public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee("kemal",2000.0,45,1985);
        System.out.println("Adı: "+emp1.name);
        System.out.println("Maaşı: "+emp1.salary);
        System.out.println("Çalışma Saati: "+emp1.workHours);
        System.out.println("Başlangıç Yılı: "+emp1.hireYear);
        emp1.tax();
        emp1.bonus();
        emp1.raiseSalary();
        emp1.taxBonus();
        emp1.toplam();
    }
}