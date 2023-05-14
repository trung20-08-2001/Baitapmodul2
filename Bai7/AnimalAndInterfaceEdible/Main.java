package Bai7.AnimalAndInterfaceEdible;

public class Main {

    public static void main(String[] args) {
        Animal[] animal={new Tiger(),new Chicken(),new Fish()};
        for(Animal a :animal){
            System.out.println(a.makeSound());
            if(a instanceof Chicken){
                Chicken chicken=(Chicken)a;
                System.out.println(chicken.howToEat());
            }else if(a instanceof Tiger){
                Tiger tiger=(Tiger)a ;
                System.out.println(tiger.howToEat());
            }else{
                Fish fish=(Fish)a ;
                System.out.println(fish.howToEat());
            }
        }
        Fruit[] fruits={new Apple(),new Orange()};
        for(Fruit f:fruits){
            System.out.println(f.howToEat());
        }
    }
}
