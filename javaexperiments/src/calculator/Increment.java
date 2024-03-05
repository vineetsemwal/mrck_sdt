package calculator;

public class Increment {
    int i;

    public static void main(String[] args) {
        Increment demo = new Increment();
        int result = demo.run();
        System.out.println("result=" + result);
    }

    int run() {
        i = i + 100;
        return i;
    }
}
