package Day1104;

import java.io.*;
import java.util.ArrayList;

public class FileTest3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("yyy.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("revyyy.txt"));

        ArrayList<String> list = new ArrayList<>();

        String line;
        while((line = br.readLine()) != null) {
            list.add(line);
        }

        for (int i = list.size()-1;i >= 0;i--) {
            bw.write(list.get(i));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
