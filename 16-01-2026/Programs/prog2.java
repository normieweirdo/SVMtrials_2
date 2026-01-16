import java.util.Scanner;
interface Motor {
    int capacity = 1500;
    void run();
    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Motor is running");
    }

    public void consume() {
        System.out.println("Motor is consuming power");
    }
}

class prog2 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        System.out.println("Capacity of the motor is " + Motor.capacity);
    }
}