package Uge5.Hjemmeopg.StudentCourse;

public class Main {
    public static void main(String[] args) {
        // opretter elever
        Student student1 = new Student("Jesper", 1, 22);
        Student student2 = new Student("Bent", 2, 22);
        Student student3 = new Student("Lars", 3, 20);

        // opretter kurser
        Course prog = new Course("Programmering", 1, 2025);
        Course syst = new Course("Systemudvikling", 2, 2025);
        Course itfo = new Course("IT- og forretningsforståelse", 3, 2025);

        // tilføjer elever til kurser
        prog.addStudent(student1);
        prog.addStudent(student2); // slår fejl, da maks antal er sat til 1
        prog.addStudent(student3); // slår fejl

        syst.addStudent(student1);
        syst.addStudent(student2);
        syst.addStudent(student3); // slår fejl da maks antal er sat til 2

        itfo.addStudent(student1);
        itfo.addStudent(student2);
        itfo.addStudent(student3);

        // display elever i hvert kursus
        prog.showStudentlist();
        syst.showStudentlist();
        itfo.showStudentlist();
    }
}