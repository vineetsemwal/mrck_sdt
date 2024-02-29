package fistream;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        IGreet greeter1 = () -> "hello";
        IGreet greeter2 = () -> {
            String msg = "hi";
            return msg;
        };
        String msg1 = greeter1.greet();
        String msg2 = greeter2.greet();
        System.out.println("msg1=" + msg1);
        System.out.println("msg2=" + msg2);

        Supplier<Product>supplier=()->new Product();
        Product product=supplier.get();
        System.out.println("product ="+product.getId()+"-"+product.getName());
    }
}
