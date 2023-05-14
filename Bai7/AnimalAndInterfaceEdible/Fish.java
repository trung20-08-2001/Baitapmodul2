package Bai7.AnimalAndInterfaceEdible;

public class Fish extends Animal implements Edible {
    public Fish() {
    }
    public Fish(byte age, int weight) {
        super(age, weight);
    }

    @Override
    public String makeSound() {
        return "Cá No Sound.";
    }

    @Override
    public String howToEat() {
        return "Rán lên để ăn";
    }
}
