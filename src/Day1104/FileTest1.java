package Day1104;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //将文本打印出来
        FileReader fr = new FileReader("yyy.txt");
        int c;
        while ((c = fr.read()) != -1) {
            System.out.print((char) c);
        }

        fr.close();

    }
}