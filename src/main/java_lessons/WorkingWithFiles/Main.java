package WorkingWithFiles;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createFile();
        getFileInfo();
        readFile();
        writeFile();
    }

    public static void createFile() {
        File file = new File("src/files/students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo() {
        File file = new File("src/files/students.txt");
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getPath());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File can write: " + file.canWrite());
            System.out.println("File can read: " + file.canRead());
            System.out.println("File size: " + file.length() + " bytes");
            System.out.println("File last modified: " + file.lastModified());
        }
    }

    public static void readFile(){
        File file = new File("src/files/students.txt");
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/files/students.txt", true));
            bufferedWriter.newLine();
            bufferedWriter.write("Ahmet");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
