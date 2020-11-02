package Day1102;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest1 {
    public static void main(String[] args) throws IOException {
        File file =new File("E:\\IDEA源码\\IO流文件\\1102");
        System.out.println(file.exists());
        //true
        File file1 = new File("yyy.txt");
        //会在项目的默认路径下生产文件
        System.out.println(file1.exists());
        //false
        file1.createNewFile();
        //对file1文件yyy.txt在相对路径下创建
        System.out.println(file1.exists());
        //true

        File file2 = new File("E:\\IDEA源码\\IO流文件\\1102\\zzz.txt");
        System.out.println(file2.createNewFile());
        //对file2文件zzz.txt在绝对路径下创建
        //true

        file1.delete();
        //对file1文件yyy.txt在相对路径下删除
        System.out.println(file1.exists());
        //false

        System.out.println(file2.exists());
        //true
        System.out.println(file2.canRead());
        file2.setReadable(false);
        System.out.println(file2.canRead());
        //true,Windows系统下设置不可读失败
        System.out.println(file2.canWrite());
        //false，Windows系统下默认是不可写的
        file2.setWritable(true);
        System.out.println(file2.canWrite());
        ////true，Windows系统下,可以将可写状态变更到true


        System.out.println(file2.lastModified());
        //获取文件的最后一次修改时间的毫秒值1604283170583

        Date d = new Date(file2.lastModified());
        System.out.println(d);
        //Mon Nov 02 10:12:50 CST 2020,需要修改一下Date的格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH：mm：ss");
        System.out.println(sdf.format(d));
        //2020年11月02日 10：12：50

        System.out.println(file2.getAbsolutePath());
        //E:\IDEA源码\IO流文件\1102\zzz.txt
    }
}
