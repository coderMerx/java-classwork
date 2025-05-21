// Program to demonstrate Global (Instance) Variables

class demo7 {
    // Global (instance) variables
    int age = 25;
    String name = "John";

    public void display() {
        // These variables can be accessed from any method in the class
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        demo7 obj = new demo7();
        obj.display();
    }
}
