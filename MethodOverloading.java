public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading.printValue(10);
        MethodOverloading.printValue(3.14);
        MethodOverloading.printValue("Hello!");
    }
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }
}