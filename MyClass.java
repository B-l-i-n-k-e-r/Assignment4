public class MyClass {
    // Instance variable
    private int myNumber;

    // Constructor (non-static)
    public MyClass(int number) {
        this.myNumber = number;
    }

    // Static method 1
    public static void staticMethod1() {
        System.out.println("This is static method 1.");
    }

    // Static method 2
    public static void staticMethod2() {
        System.out.println("This is static method 2.");
    }

    // Non-static method
    public void displayNumber() {
        System.out.println("My number is: " + myNumber);
    }

    public static void main(String[] args) {
        // Create an instance of MyClass using the constructor
        MyClass myInstance = new MyClass(42);

        // Call static methods
        staticMethod1();
        staticMethod2();

        // Call the non-static method
        myInstance.displayNumber();
    }
}
