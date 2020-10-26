package Day1026;

public class WrapClassTest {
    public static void main(String[] args) {
        //用包装类实现int类型往String类型的转化

        //方法1
        int i1 = 10;
        String s1 = i1 + "";
        String s2 = String.valueOf(s1);
        System.out.println(s2);

        //方法2
        Integer i2 = new Integer(i1);
        String s3 = i2.toString();
        System.out.println(s3);

        //用包装类实现String类型往int类型的转化
        String s4 = "200";
        int i5 = Integer.parseInt(s4);
        System.out.println(i5);


    }
}
