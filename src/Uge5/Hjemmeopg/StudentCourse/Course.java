package Uge5.Hjemmeopg.StudentCourse;

// klasse, der repræsenterer et kursus med studerende
public class Course {
    private Student[] students; // array til at gemme studerended i kurset
    private String courseName; // navn på kurset
    private int maxParticipants; // maksimalt antal studerende tilladt
    private int courseYear; // året kurset holdes
    private int studentCount; // holder styr på hvor mange studerende tilmeldt

    // constructor til at initialisere kursusdetaljer
    public Course (String courseName, int maxParticipants, int courseYear) {
        this.courseName = courseName;
        this.maxParticipants = maxParticipants;
        this.courseYear = courseYear;
        this.students = new Student[maxParticipants]; // Initialiserer array med maks kapacitet
        this.studentCount = 0; // Starter med nul tilmeldte studerende, da der til at starte med ingen tilmeldte er
    }

    // metode til at tilføje en studerende til kurset, hvis der er plads
    public void addStudent(Student student) {
        if (studentCount < maxParticipants){
            students[studentCount++] = student; // tilføjer studerende og øger tælleren
            System.out.println("\n" + student.getName() + " tilføjet til " + courseName); // ikke 'student.name' men 'student.getName()', fordi den er defineret i en anden klasse
        } else {
            System.out.println("\nKan ik tilføje " + student.getName() + " til " + courseName + ". Kurset er fyldt");
        }
    }

    // Metode til at fjerne en studerende fra kurset baseret på studentens ID
    public void removeStudent(int studentId){
        for (int i = 0; i < studentCount; i++){
            if (students[i].getStudentId() == studentId){
                System.out.println("\nElev med ID " + studentId + " fjernet fra " + courseName);
                for (int j = i; j < studentCount - 1; j++){
                    students[j] = students[j + 1]; // Flytter resterende studerende til venstre
                }
                students[--studentCount] = null; // sænker tælleren og fjerne sidset element
                return;
            }
        }
        System.out.println("Elev med ID " + studentId + " ikke fundet i " + courseName);
    }

    // Metode til at vise listen af studerende tilmeldt kurset
    public void showStudentlist() {
        System.out.println("\nElever i: " + courseName + ":");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]); // Udskriver hver studerende
        }
    }
}
