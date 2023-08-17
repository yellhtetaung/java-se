public class LocalVariableTest {
    String message = "Global Variable";

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void doSomething() {
        String message = "Do Something";
        System.out.println(this.message);
    }

    public static void main(String[] args) {
        LocalVariableTest obj = new LocalVariableTest();
        obj.doSomething();
    }
}