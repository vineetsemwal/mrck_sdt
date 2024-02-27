package iodemos;

import java.io.*;

public class BufferReaderWriterEx {

    public static void main(String[] args) {
        BufferReaderWriterEx demo = new BufferReaderWriterEx();
        demo.runDemo();
    }

    public void runDemo() {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("C:/Users/vineets/Documents/ioexp/in.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter ("C:/Users/vineets/Documents/ioexp/out.txt"));
        ) {
            int linesCount=0;
            String readLine="";
            while ((readLine=reader.readLine())!=null){
                linesCount++;
                writer.write(linesCount+")"+readLine);
                writer.newLine();
            }
            writer.flush();
            System.out.println("lines written="+linesCount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
