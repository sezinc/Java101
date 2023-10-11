public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Sezin","Bilg","123456789");
        Teacher t2=new Teacher("Mehmet","Math","9999999");
        Teacher t3=new Teacher("Yusuf","TRH","99889999");

        Course bilgisayar=new Course("Bilgisayar","B101","Bilg",0.8,0.2);
        Course matematik=new Course("Matematik","M101","Math",0.9,0.1);
        Course tarih=new Course("Tarih","T101","TRH",0.6,0.4);

        bilgisayar.addTeacher(t1);
        matematik.addTeacher(t2);
        tarih.addTeacher(t3);

        Student s1=new Student("Ayşe","123","4",bilgisayar,tarih,matematik);
        s1.addBulkExamNote(60,90,60,90,60,60);
        s1.printNote();
        s1.isPass();
    }
}