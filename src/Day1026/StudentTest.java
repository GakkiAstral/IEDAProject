package Day1026;

public class StudentTest {
    public static void main(String[] args) {
        Student[] s1 = new Student[5];
        //给对象数组完成赋值
        for (int i = 0;i<s1.length;i++) {
            s1[i] = new Student("张三",i+18,"男",i);
        }
        //重写toString()方法，将对象数组打印。
        for (int i = 0;i<s1.length;i++) {
            System.out.println(s1[i].toString());
        }
    }
}
