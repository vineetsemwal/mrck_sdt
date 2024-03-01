package optionaldemo;

import java.util.Optional;

public class OptionalEx1 {
    public static void main(String[] args) {
        Optional<String>optional=Optional.of("hello");
        //
        if(optional.isPresent()){
           String value =optional.get();
            System.out.println("value is "+value);
            return;
        }
        System.out.println("optional does not contain value");
    }
}
