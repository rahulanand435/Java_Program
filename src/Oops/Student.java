package Oops;

import org.w3c.dom.ls.LSOutput;

public class Student {
    int rollno;
    String name;
    float marks;
    void grade(){
        if (marks > 90.0f){
            System.out.println(name + " you are a really gud student");
        }
    }
    public Student(int rollno,String name,Float marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
    static Student kunal = new Student(1,"kunal",9.34f);

    public static void main(String[] args) {
        System.out.println(kunal.marks);
        kunal.grade();
    }
}
