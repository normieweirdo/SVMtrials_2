class Apple {
    void display() {
        System.out.println("Inside Apple display()");
    }
}

class Banana extends Apple {
    void display() {
        System.out.println("Inside Banana display()");
    }
}

class Cherry extends Apple {
    void display() {
        System.out.println("Inside Cherry display()");
    }
}

public class prog3 {
    public static void main(String[] args) {
        Apple a;

        a = new Apple();
        a.display();

        a = new Banana();
        a.display();

        a = new Cherry();
        a.display();
    }
}