package abc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ABC {
    public static void main(String[] args) {
        if (args.length > 0 && args[0].equals("C1")) {
            System.out.println("Running ABC application.\nTesting new lines in logs.\nThis is another line. Params:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            try {
                FileInputStream fis = new FileInputStream("file.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
