package exceptions;

public class ExceptionEx1 {

    public static void main(String[] args) {
        ExceptionEx1 example = new ExceptionEx1();
        String input = "hello";
        example.printFirstChar(input);
        System.out.println("***bye");
    }

    void printFirstChar(String word) {
        System.out.println("before findFirstLetter call");
        try {
            char ch = findFirstLetter(word);
            System.out.println(ch);
        } catch (InvalidInput e) {
            System.out.println("Please give correct input," + e.getMessage());

        } catch (Exception e) {
            System.out.println("something went wrong, please try again");
        } finally {
            System.out.println("exiting from method printFirstChar");
        }
    }

    // object==null, object.
    public char findFirstLetter(String word) throws InvalidInput{
        if (word == null || word.isEmpty() || word.isBlank()) {
            // InvalidInput e=new InvalidInput("input is not valid");
            throw new InvalidInput("input is not valid");
        }
        char found = word.charAt(0);
        System.out.println("found char=" + found);
        return found;
    }
}
