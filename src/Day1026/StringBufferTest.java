package Day1026;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();

        sb1.append(true);
        System.out.println(sb1);

        StringBuffer sb2 = sb1.append("Innover");
        System.out.println(sb2);

        sb2.insert(3,100);
        System.out.println(sb2);
        sb2.append('%');
        System.out.println(sb2);

        sb2.delete(3,6);
        System.out.println(sb2);
        //sb2.reverse()可以实现StringBuffer的字符串反转功能
        System.out.println(sb2.reverse());
    }
}
