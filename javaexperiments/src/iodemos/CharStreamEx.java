package iodemos;

import java.io.*;

public class CharStreamEx {

    public static void main(String[] args) {
        CharStreamEx demo = new CharStreamEx();
        demo.runDemo();
    }

    public void runDemo() {
        try (
                Reader reader = new FileReader("C:/Users/vineets/Documents/ioexp/in.txt");
                Writer writer = new FileWriter("C:/Users/vineets/Documents/ioexp/out.txt");
        ) {
            int aLetterCount=0;
            int readChar;
            int count = 0;
            while ((readChar = reader.read()) > 0) {
                char ch=(char)readChar;
                if(ch=='a'){
                    aLetterCount++;
                }
                writer.write(readChar);
                count++;
            }
            writer.flush();
            System.out.println("chars written=" + count);
            System.out.println("As written="+aLetterCount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
