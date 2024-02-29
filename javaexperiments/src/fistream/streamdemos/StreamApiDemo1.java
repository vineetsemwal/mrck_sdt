package fistream.streamdemos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *  collection of strings as input
 *  1) filter strings  and keep those which are starting from 'a'
 *  2) collection of integers--length of strings
 */
public class StreamApiDemo1 {
    public static void main(String[] args) {
        List<String>inputs=new ArrayList<>();
        inputs.add("ajay");
        inputs.add("akshay");
        inputs.add("divya");

        StreamApiDemo1 demo=new StreamApiDemo1();
        List<Integer>result1=demo.nonDeclarative(inputs);
        System.out.println("result1="+result1);
        List<Integer>result2=demo.declarative(inputs);
        System.out.println("result2="+result2);
    }

    List<Integer>declarative(Collection<String>inputs){
      List<Integer>result=  inputs.stream()
                .filter(str->str.charAt(0)=='a')
                .map(input->input.length())
                .toList();
        return result;
    }

    List<Integer>nonDeclarative(Collection<String>inputs){
        List<Integer>desired=new ArrayList<>();
        List<String>filtered=new ArrayList<>();
        for (String iterated:inputs){
            char ch=iterated.charAt(0);
            if(ch=='a'){
                filtered.add(iterated);
            }
        }
        for (String iterated:filtered){
            desired.add(iterated.length());
        }
        return desired;


    }

}
