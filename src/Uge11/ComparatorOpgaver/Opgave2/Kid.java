package Uge11.ComparatorOpgaver.Opgave2;

public class Kid {
    private String name;
    private int heightInCm;

    public Kid (String name, int heightInCm){
        this.name = name;
        this.heightInCm = heightInCm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHeightInCm(){
        return heightInCm;
    }

    public void setHeightInCm(int heightInCm){
        this.heightInCm = heightInCm;
    }

    public String toString(){
        return "\nBarn: " + name + "\nHøjde: " + heightInCm;
    }
}
