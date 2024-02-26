package hrms;

import hrms.frontend.FrontEnd;

import java.util.HashSet;
import java.util.Set;

public class HRMSApplication {
    public static void main(String[] args) {
        Set<String> languages1=new HashSet<>();
        languages1.add("java");
        Set<String>languages2=new HashSet<>();
        languages2.add("python");
        languages2.add("c#");
        FrontEnd frontEnd=new FrontEnd();
        frontEnd.register("akshay","patil",28,languages1,2);
        frontEnd.register("srinath","s",26,languages2,1);
    }
}
