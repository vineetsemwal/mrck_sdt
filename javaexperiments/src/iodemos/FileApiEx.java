package iodemos;

import java.io.File;

public class FileApiEx {
    public static void main(String[] args) {
        File dir = new File("C:/Users/vineets/garbage");
        System.out.println("dir exists=" + dir.exists());
        System.out.println(dir.getName() + " is file=" + dir.isFile() + " is dir=" + dir.isDirectory());
        System.out.println("path=" + dir.getAbsolutePath());
        System.out.println("listing all files in directory");
        File[] files = dir.listFiles();
        for (File iteratedFile : files) {
            System.out.println(iteratedFile.getName() + " is file=" + iteratedFile.isFile() + " is dir=" + iteratedFile.isDirectory());
            System.out.println("path=" + iteratedFile.getAbsolutePath());

        }

    }
}
