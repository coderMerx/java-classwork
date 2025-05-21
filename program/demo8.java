// Program to demonstrate Local Variables

class demo8 {
    public void showDetails() {
        // Local variables - declared inside a method
        String city = "Bangalore";
        float temperature = 36.5f;

        System.out.println("City: " + city);
        System.out.println("Temperature: " + temperature + "°C");
    }

    public static void main(String[] args) {
        demo8 obj = new demo8();
        obj.showDetails();
    }
}
