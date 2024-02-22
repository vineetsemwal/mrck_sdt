package stringdemo;

public class StringExp1 {
    public static void main(String[] args) {
        Integer i = 10;
        String word1 = "hi";
        String word2 = "hi";
        boolean isSame = word1 == word2;
        System.out.println("words same?" + isSame);
        String concatResult = word1.concat("deepika");
        System.out.println("word1=" + word1 + " concat result=" + concatResult);
        //stringbuilder,stringbuffer
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < 100; j++) {
            result.append(j);
        }

        System.out.println(result);


        // Request was not successful-badrequest-400
        String word3 = "hello-bangalore";

        String prefix = "he";
        boolean prefixFound = word3.startsWith(prefix);
        boolean endsWith = word3.endsWith("lo");
        System.out.println("prefix found=" + prefixFound);
        System.out.println("ends with=" + endsWith);
        String word4 = "Request was not successful-badrequest-400";
        System.out.println("original string=" + word4);
        int startIndex = word4.indexOf("-");
        String requestStatus = word4.substring(startIndex + 1);
        System.out.println("request status=" + requestStatus);

        String word6 = "hello-pune-bye";

        System.out.println("original string " + word6);
        String substringBetweenIndexes = word6.substring(4, 8);
        System.out.println("substring between indexes 4 and 8 is " + substringBetweenIndexes);

        String word7 = "goodmorningdm";
        boolean contains = word7.contains("dm");

        String replaced = word7.replace("dm", "cat");
        System.out.println("original=" + word7 + " replaced=" + replaced);
        String parts[]=word6.split("-");
        for (String part:parts){
            System.out.println("part="+part);
        }
        String word8="hello887634659bye";
        boolean match=word8.matches("\\w*\\dbye");
        System.out.println("match="+match);

        System.out.println("original string is "+word8);
        String parts2[]=word8.split("\\d+");
        for (String part:parts2){
            System.out.println("part="+part);
        }

        String word9="hello98764";
        //check if word is starting with one or more chars from a-z,
        // followed by one or more digits
        //
        boolean match3=word9.matches("[a-z]+\\d+");
        System.out.println("original string="+word9+"match for chars ="+match3);

        String s1=new String("divya");
        String s2=new String("divya");
        System.out.println("same?="+(s1==s2));

    }
}
