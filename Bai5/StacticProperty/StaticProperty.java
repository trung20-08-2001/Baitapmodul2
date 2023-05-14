package Bai5;

public class StaticProperty {
    private String name;
    private String engine;
    private static int numberOfCars=0;
    public StaticProperty(String name,String engine){
        this.name=name;
        this.engine=engine;
        numberOfCars++;
    }
    public String getInformation(){
        return "Name: "+this.name+" Engine: "+this.engine+" Number: "+numberOfCars;
    }
    public void setInformation(String name,String engine){
        this.name=name;
        this.engine=engine;
    }
}
 class TestStaticProperty{
     public static void main(String[] args) {
         StaticProperty car1=new StaticProperty("Mazda 3","Skyactiv 3");
         StaticProperty car2=new StaticProperty("Mazda 6","Skyactiv 6");
         System.out.println(car1.getInformation());
         System.out.println(car2.getInformation());
     }
}