public class CounterTest {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.countUp();

        Counter c2 = new Counter();
        c2.countUp();

        System.out.println("C1 Count is " + c1.count);
        System.out.println("C2 Count is " + c2.count);
    }
}

class Counter {
    static int count;

    public void countUp() {
        count++;
    }
}