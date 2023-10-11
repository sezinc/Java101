public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stNo;
    String classes;
    double average;
    boolean isPass;
    Student(String name,String stNo,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stNo=stNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0.0;
        this.isPass=false;
    }
    void  addBulkExamNote(int note1,int sozluNote1,int note2,int sozluNote2,int note3,int sozluNote3){
        if(note1>=0 && note1<=100 && sozluNote1>=0 && sozluNote1<=100){
            this.c1.note=note1;
            this.c1.sozluNote=sozluNote1;
        }
        if(note2>=0 && note2<=100 && sozluNote2>=0 && sozluNote2<=100){
            this.c2.note=note2;
            this.c2.sozluNote=sozluNote2;
        }
        if(note3>=0 && note3<=100 && sozluNote3>=0 && sozluNote3<=100){
            this.c3.note=note3;
            this.c3.sozluNote=sozluNote3;
        }
    }
    void isPass(){
        double n1Ort=(this.c1.note*this.c1.noteEff)+(this.c1.sozluNote*this.c1.sozluNoteEff);
        double n2Ort=(this.c2.note*this.c2.noteEff)+(this.c2.sozluNote*this.c2.sozluNoteEff);
        double n3Ort=(this.c3.note*this.c3.noteEff)+(this.c3.sozluNote*this.c3.sozluNoteEff);
        //System.out.println(n1Ort+" ,"+n2Ort+" ,"+n3Ort);
        this.average=(n1Ort+n2Ort+n3Ort)/3.0;
        System.out.println("Ortalamanız:\t: "+this.average);
        if(this.average>=55){
            System.out.println("Sınıfı başarılı bir şekilde geçmiştir.");
            isPass=true;
        }else {
            System.out.println("Sınıfta kaldı!");
            isPass=false;

        }
    }
    void printNote(){
        System.out.println(this.c1.name+" Notu\t\t\t: "+this.c1.note);
        System.out.println(this.c1.name+" Sözlü Notu\t: "+this.c1.sozluNote);
        System.out.println(this.c2.name+" Notu\t\t\t\t: "+this.c2.note);
        System.out.println(this.c2.name+" Sözlü Notu\t\t: "+this.c2.sozluNote);
        System.out.println(this.c3.name+" Notu\t\t\t: "+this.c3.note);
        System.out.println(this.c3.name+" Sözlü Notu\t: "+this.c3.sozluNote);


    }

}
