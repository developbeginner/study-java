package developbeginner.adapter.practiece.answer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("file.txt");
            fileIO.setValue("width", "1024");
            fileIO.setValue("height", "512");
            fileIO.setValue("depth", "32");
            fileIO.writeToFile("newFile.txt");
            System.out.println("newFile.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
