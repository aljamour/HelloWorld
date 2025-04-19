package Uge11.ComparatorOpgaver.Opgave3;

public class Friend {
    private int id;
    private String name;
    private String phone;
    private String email;
    private transient String country;

    public Friend(int id, String name, String phone, String email, String country) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    private void generateId(){
        id = (int) (Math.random() * 8999 + 1000);
    }

    public String toString() {
        int count = 0;
        return "Ven " + count +
                "\nId: " + id +
                "\nTlf nr.: " + phone +
                "\nEmail: " + email +
                "\nLand: " + country + "\n";
    }
}