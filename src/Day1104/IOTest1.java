package Day1104;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IOTest1 {
    public static void main(String[] args) throws IOException {
        //将手动输入的文本内容，放到项目中的text.txt文件夹，文本内容以quit作为结束标志。
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("text.txt");
        //有输出流了，就不用声明一个输入流了。
        System.out.println("请输入数据：");

        while (true) {
            String line = sc.nextLine();
            if ("quit".equals(line)) {
                break;
            }

            fos.write(line.getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }
}
