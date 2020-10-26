package Day1026;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = "AJDFSABIF14$#@asasfq";
        System.out.println("请输入需要统计内容的字符串：");
        String s= sc.nextLine();
        int big = 0;
        int small = 0;
        int num = 0;
        int other = 0;

        for (int i = 0;i<s.length();i++) {
            char c = s.charAt(i);

            if (c >= 'A'&&c <='Z') {
                big++;
            } else if (c >= 'a' &&c <= 'z') {
                small++;
            } else if (c >= '0' && c <= '9') {
                num++;
            } else {
                other++;
            }
        }

        System.out.println("您输入的字符串中，大写字母的个数是：" + big);
        System.out.println("您输入的字符串中，小写字母的个数是：" + small);
        System.out.println("您输入的字符串中，数字的个数是：" + num);
        System.out.println("您输入的字符串中，其他符号的个数是：" + other);
    }
}
