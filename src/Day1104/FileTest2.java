package Day1104;

import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) throws IOException {
        //往yyy.txt文件里面写入文本内容，但是会重新写源文件
        FileWriter fw = new FileWriter("yyy.txt");
        fw.write("我是闪电！");
        fw.write("\r\n");
        fw.write("我是暴风！");

        fw.close();
    }
}
