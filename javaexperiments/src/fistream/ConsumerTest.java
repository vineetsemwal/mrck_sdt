package fistream;


import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        IPrint print1=new IPrint() {
            @Override
            public void print(String msg) {
                System.out.println("msg is "+msg);
            }

        };
        print1.print("hello");


        IPrint print2=(msg)-> System.out.println("greeting is "+msg);

        IPrint print3=(msg)->{
            System.out.println("Today msg is "+msg);
        };

        print2.print("bye");

        print3.print("hi");

        Consumer<String>print4=(msg)-> System.out.println("greeting is "+msg);
        print4.accept("before lunch");


    }
}
