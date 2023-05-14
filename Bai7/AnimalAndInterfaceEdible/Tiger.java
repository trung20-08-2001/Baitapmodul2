package Bai7.AnimalAndInterfaceEdible;

 public class Tiger extends Animal implements Edible {
     public Tiger() {
     }
     public Tiger(byte age, int weight) {
         super(age, weight);
     }

     @Override
     public String makeSound() {
         return "Hổ kêu: Graooooo";
     }

     @Override
     public String howToEat() {
         return "Thịt hổ không ăn được";
     }
 }
