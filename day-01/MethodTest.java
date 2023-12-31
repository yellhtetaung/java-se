public class MethodTest {
    public static void main(String[] args) {
        sayHello();

        MethodTest obj = new MethodTest();
        obj.showAddResult(10, 50);

        int result = add(10, 10);
        System.out.println(result);

        OtherMethod.showMessage("Using Other Methods.");
    }

    void showAddResult(int a, int b) {
        System.out.println(a + b);
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static int add(int a, int b) {
        return a + b;
    }
}