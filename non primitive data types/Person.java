// A simple class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Interface example
interface Animal {
    void sound();
}

// Class implementing interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog says: Woof!");
    }
}

// Enum example
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        // String
        String message = "Hello, Java!";
        System.out.println("String: " + message);

        // Array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Class and Object
        Person p1 = new Person("Alice", 25);
        p1.displayInfo();

        // Interface
        Animal myDog = new Dog();
        myDog.sound();

        // Enum
        Day today = Day.FRIDAY;
        System.out.println("Enum value: " + today);

        // Wrapper Classes
        Integer intObj = Integer.valueOf(100);
        Double doubleObj = Double.valueOf(55.5);
        Boolean boolObj = Boolean.TRUE;

        System.out.println("Wrapper Integer: " + intObj);
        System.out.println("Wrapper Double: " + doubleObj);
        System.out.println("Wrapper Boolean: " + boolObj);
    }
}
