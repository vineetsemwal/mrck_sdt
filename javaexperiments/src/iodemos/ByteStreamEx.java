package iodemos;

import java.io.*;
import java.util.Scanner;

public class ByteStreamEx {

    public static void main(String[] args) {
        ByteStreamEx demo = new ByteStreamEx();
        demo.runDemo();
    }

    public void runDemo() {

        try (
                InputStream inputStream = new FileInputStream("C:/Users/vineets/Documents/ioexp/in.txt");
                OutputStream outputStream = new FileOutputStream("C:/Users/vineets/Documents/ioexp/out.txt");
        ) {

            int readByte;
            int count = 0;
            while ((readByte = inputStream.read()) > 0) {
                outputStream.write(readByte);
                count++;
            }
            outputStream.flush();
            System.out.println("bytes written=" + count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
