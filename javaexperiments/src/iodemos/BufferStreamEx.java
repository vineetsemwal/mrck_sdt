package iodemos;

import java.io.*;

public class BufferStreamEx {

    public static void main(String[] args) {
        BufferStreamEx demo = new BufferStreamEx();
        demo.runDemo();
    }

    public void runDemo() {
        try (
                InputStream inputStream = new BufferedInputStream(new FileInputStream("C:/Users/vineets/Documents/ioexp/mysql_v1.docx"));
                OutputStream outputStream = new BufferedOutputStream(new FileOutputStream ("C:/Users/vineets/Documents/ioexp/mysql_out.docx"));
        ) {
            byte buffer[]=new byte[1024];
            int totalBytesRead=0;
            int bytesRead=0;
            while ((bytesRead=inputStream.read())>0) {
               totalBytesRead=totalBytesRead+bytesRead;
               outputStream.write(buffer,0,bytesRead);
            }
            System.out.println("total bytes written="+totalBytesRead);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
