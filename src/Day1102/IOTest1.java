package Day1102;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");
        //依次获取xxx.txt文件的abc三个字节，分别输出97、98、99，当获取不到后续字节内容时，输出-1,-1是文件的结束标志位，可以充当判断条件
        int x= fis.read();
        System.out.println(x);
        int y = fis.read();
        System.out.println(y);
        int z = fis.read();
        System.out.println(z);
        int a = fis.read();
        System.out.println(a);
        fis.close();


        //另外的一种循环写法
        FileInputStream fis1 = new FileInputStream("xxx.txt");
        int b;
        while ((b = fis1.read()) != -1) {
            System.out.println(b);
        }
        fis1.close();
        //输出结果是97、98、99，不输出-1
    }
}
