package calculator;

public class Calculator {

    int memory;

    private void log(String methodName, Object arg, String msg) {
        System.out.println(methodName + "-" + "arg =" + arg + "-" + msg);
    }

    public int add(int num) {
        log("add", num, "begin add");
        int result = add(num, 0, 0);
        log("add", memory, "end add");
        return result;
    }

    public int add(int num1, int num2, int num3) {
        int result = memory + num1 + num2 + num3;
        memory = result;
        return result;
    }

    public int add(int num1, int num2) {
        int result = add(num1, num2, 0);
        return result;
    }

    public void clear() {
        memory = 0;
    }


}
