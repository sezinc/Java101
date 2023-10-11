public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNote;
    double noteEff;
    double sozluNoteEff;

    Course(String name,String code,String prefix,double noteEff,double sozluNoteEff){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.sozluNote=0;
        this.noteEff=noteEff;
        this.sozluNoteEff=sozluNoteEff;

    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            //printTeacherInfo();
        }else {
            System.out.println("uyuşmuyor");
        }
    }
    void printTeacherInfo(){
        this.teacher.print();
    }
}

