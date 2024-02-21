package stringdemo;

public class StringExp1 {
    public static void main(String[] args) {
        Integer i=10;
        String word1="hi";
        String word2="hi";
        boolean isSame=word1==word2;
        System.out.println("words same?"+isSame);
        String concatResult=word1.concat("deepika");
        System.out.println("word1="+word1+" concat result="+concatResult);

        //stringbuilder,stringbuffer
        StringBuilder result=new StringBuilder();
         for (int j=0;j<100;j++){
            result.append(j);
        }

        System.out.println(result);
    }
}
