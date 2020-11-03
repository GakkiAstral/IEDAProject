package Day1103;

import java.io.*;

public class BufferIOTest1 {
    public static void main(String[] args) throws IOException {
        //先在项目中添加头像.jpg文件，关联上输入流。再关联copy.jpg的输出流，完成文件复制。
        FileInputStream fis = new FileInputStream("头像.jpg");
        FileOutputStream fos = new FileOutputStream("copy.jpg");

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        bis.close();
        bos.close();
        //关闭后面的流时，前面的流也会跟着关
    }
}
