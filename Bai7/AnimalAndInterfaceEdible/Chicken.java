package Bai7.AnimalAndInterfaceEdible;

 public class Chicken extends Animal implements Edible {
    public Chicken() {
    }
     public Chicken(byte age, int weight) {
         super(age, weight);
     }

     @Override
     public String howToEat() {
         return "Chiên, luộc,... để ăn";
     }

     @Override
     public String makeSound() {
         return "Gà kêu: Cục tác";
     }
 }
