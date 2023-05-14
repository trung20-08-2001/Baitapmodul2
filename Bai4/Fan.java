package Bai4;

public class Fan {
    private final byte SLOW = 1;
    private final byte MEDIUM = 2;
    private final byte FAST = 3;
    private byte speed;
    private boolean status;
    private byte radius;
    private String color;
    private String name;

    public Fan(byte radius, String color, String name) {
        this.speed = SLOW;
        this.status = false;
        this.radius = radius;
        this.color = color;
        this.name = name;
    }

    public boolean turnOn() {
        if (!this.status) {
            return this.status = true;
        }
        return this.status = false;
    }

    public boolean turnOff() {
        return this.status = false;
    }

    public void getSpeed() {
        if (this.status) {
            System.out.println("Tốc độ của "+this.name+": "+ + this.speed);
        }
    }

    public byte speedUp() {
        if (this.status) {
            if (this.speed == SLOW) {
                this.speed = MEDIUM;
                System.out.println("Chuyền trạng thái MEDIUM");
            } else if (this.speed == MEDIUM) {
                this.speed = FAST;
                System.out.println("Chuyền trạng thái FAST");
            } else if (this.speed == FAST) {
                System.out.println("Đã có tốc độ cao nhất, không thể tăng thêm.");
            }
        }
        return this.speed;
    }

    public byte speedDown() {
        if (this.status) {
            if (this.speed == FAST) {
                this.speed = MEDIUM;
                System.out.println("Chuyền trạng thái MEDIUM");
            } else if (this.speed == MEDIUM) {
                this.speed = SLOW;
                System.out.println("Chuyền trạng thái SLOW");
            } else if (this.speed == SLOW) {
                System.out.println("Không còn giảm được nữa.");
            }
        }
        return this.speed;
    }

    public void displayInformation() {
        System.out.println("Thông tin của quạt: "+this.name);
        if (this.status) {
            System.out.print("Name: " + this.name + ". ");
            System.out.print("Bán kính: " + this.radius + ". ");
            System.out.print("Màu sắc: " + this.color + ". ");
            System.out.print("Tốc độ: " + this.speed + ". ");
            System.out.print("Trạng thái: " + this.status + ".\n");
        } else {
            System.out.print("Name: " + this.name + ". ");
            System.out.print("Quạt đạng tắt.\n");
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan((byte) 10, "Blue", "fan1");
        Fan fan2 = new Fan((byte) 5, "Yellow", "fan2");
        fan1.turnOn();
        fan1.getSpeed();
        fan1.speedUp();
        fan1.getSpeed();
        fan1.speedUp();
        fan1.speedUp();
        fan1.speedUp();
        fan1.getSpeed();
        fan1.displayInformation();
        fan1.speedUp();
        fan1.speedDown();
        fan1.getSpeed();
        fan1.displayInformation();
        fan2.displayInformation();
    }
}
