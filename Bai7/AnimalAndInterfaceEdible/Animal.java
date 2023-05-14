package Bai7.AnimalAndInterfaceEdible;

abstract public class Animal {
    private byte age=1;
    private int weight=1;
   protected Animal(){

    }
    protected Animal(byte age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    abstract public String makeSound();

}
