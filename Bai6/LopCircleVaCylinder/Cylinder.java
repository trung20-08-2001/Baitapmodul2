package Bai6.LopCircleVaCylinder;

public class Cylinder extends Circle{
    private double height=1;
    public Cylinder(){
    }
    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, boolean filled, double height) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String getAreaSurrounding(){
        return "Area Surrounding of Cylinder: "+this.height*2*this.getRadius()*Math.PI;
    }
    public String getAreaTotal(){
        return "Area Total of Cylinder: "+(this.height*2*this.getRadius()*Math.PI+2*2*Math.PI*getRadius());
    }
    public String getVolume(){
        return "Volume of Cylinder: "+Math.PI*getRadius()*getRadius()*this.height;
    }
    public String toString(){
        return "Cylinder width height "+this.height+", which is a subclass of"+super.toString();
    }
}
