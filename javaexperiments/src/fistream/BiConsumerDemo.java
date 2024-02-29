package fistream;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        IConcatPrint print1=(msg,num)-> {
            for (int i=0;i<num;i++){
                System.out.print(msg);
            }
        };

        print1.concat("hi",3);

        System.out.println("\npredefined biconsumer");
        BiConsumer<String,Integer>print2=(msg,num)-> {
            for (int i=0;i<num;i++){
                System.out.print(msg);
            }
        };

        print2.accept("hello",4);

    }
}
