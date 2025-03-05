package Uge4.KlasseOgObjekter;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public Person(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() { // get-metoder tager ikke imod nogle parametre
        return firstName;
    }

    public void setFirstName(String firstName) { // set-metoder tager imod den parameter som der skal ændres på i main-klassen
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }
}
