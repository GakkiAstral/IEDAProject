package Day1102;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("zzz.txt");

        fos.write(97);
        fos.write(98);
        fos.write(99);

        fos.close();
        //往zzz.txt的文件夹中写入abc

        FileOutputStream fos1 = new FileOutputStream("zzz.txt",true);
        fos1.write(97);
        fos1.write(98);
        fos1.write(99);

        fos1.close();
        //添加true参数，可以往zzz.txt文件夹中再写入abc
        //需要注意的是：FileOutputStream在创建对象的时候是如果没有这个文件会创建出来，如果有这个文件,就会将文件内容清空
        //所以，每次执行程序，都只会有两个abc存在
    }
}
