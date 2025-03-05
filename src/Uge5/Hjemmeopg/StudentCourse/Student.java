package Uge5.Hjemmeopg.StudentCourse;

// klasse, der repræsenterer en studerende
public class Student {
    private String name;
    private int studentId;
    private int age;

    // Konstruktør til at initialisere studentens detaljer
    public Student(String name, int studentId, int age){
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    // Getter-metode til at hente studentens navn
    public String getName(){
        return name;
    }

    // Getter-metode til at hente studentens ID
    public int getAge(){
        return age;
    }

    // Metode til at beregne og returnere studentens alder baseret på det aktuelle år
    public int getStudentId(){
        return studentId;
    }

    // Metode til at beregne og returnere studentens alder baseret på det aktuelle år
    @Override
    public String toString() {
        return "Elev: ID = " + studentId + ", Navn = '" + name + "'";
    }
}