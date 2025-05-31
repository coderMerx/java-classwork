class swap {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swap:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Swap logic (no redeclaration)
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Swap logic (no redeclaration again)
        int krsh = a;
        a = temp;
        b = krsh;

        System.out.println("After swap: to last");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
