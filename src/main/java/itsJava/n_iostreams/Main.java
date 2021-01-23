package itsJava.n_iostreams;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/application.properties"));
        System.out.println("properties.getProperty(\"filePath\") = " + properties.getProperty("filePath"));

        Path testFilePath = Paths.get(properties.getProperty("filePath"));
        System.out.println("testFilePath.getFileName() = " + testFilePath.getFileName());
        System.out.println("testFilePath.getParent() = " + testFilePath.getParent());
        System.out.println("testFilePath.getRoot() = " + testFilePath.getRoot());
        System.out.println("testFilePath.startsWith(C:/Users/d.piskarev) = " + testFilePath.startsWith("C:/Users/d.piskarev"));

        User defaultUser = new User("admin", "verysafepassword");
        System.out.println("defaultUser.toString() = " + defaultUser.toString());

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(properties.getProperty("defaultUserPath")));
        objectOutputStream.writeObject(defaultUser);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(properties.getProperty("defaultUserPath")));
        User loadedDefaultUser = (User) objectInputStream.readObject();
        System.out.println("loadedDefaultUser.toString() = " + loadedDefaultUser.toString());

        File file_1 = new File("src/main/resources/file_1.txt");
        File file_2 = new File("src/main/resources/file_2.txt");

        try (PrintWriter printWriter = new PrintWriter(file_1)) {
            printWriter.println("File 1\nNew line\nAnother line");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (PrintWriter printWriter = new PrintWriter(file_2)) {
            printWriter.println("File 2\nLine 1\nLine 2");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        File temp = new File("src/main/resources/temp.txt");
        swapFileContents(file_1.getPath(), temp.getPath());
        swapFileContents(file_2.getPath(), file_1.getPath());
        swapFileContents(temp.getPath(), file_2.getPath());
    }

    public static void swapFileContents(String src, String target) {
        try {
            String temp;
            BufferedReader br = new BufferedReader(new FileReader(src));
            BufferedWriter bw = new BufferedWriter(new FileWriter(target));
            while ((temp = br.readLine()) != null) {
                bw.write(temp);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
