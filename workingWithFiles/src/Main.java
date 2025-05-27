import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        createFile();

    }


    public static void createFile() {

        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu");
            } else {
                System.out.println("Dosya zaten mevcut");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\javademos\\files\\students.txt");
        if(file.exists()){
            System.out.println("Dosya adı:"+file.getName());
            System.out.println("Dosya yolu:"+file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi:"+file.canWrite());
            System.out.println("Dosya okunabilir mi:"+file.canRead());
            System.out.println("Dosya boyutu(byte):"+file.length());
        }

    }

    public static void readFile(){
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNext()){
                String line=reader.nextLine();
            System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void writerFile(){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\javademos\\files\\students.txt"));
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("Dosya yazıldı");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

