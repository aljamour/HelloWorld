package Uge5.LinkedInObjects;

public class Rectangle { // public betyder at hvilken som helst klasse can tilgå, bruge eller referere til feltet (feltet udgør de to variable private double width og length)
    private double length; // private betyder, at det kun er den gældende klasse, der kan tilgå, bruge og referere til feltet
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }

   public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }
}
