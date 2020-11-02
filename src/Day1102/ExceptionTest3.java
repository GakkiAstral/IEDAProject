package Day1102;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ExceptionTest3 {
    public static void main(String[] args) {
        //将一个整数化为2进制后输出，三种异常抛出形式
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");

        while (true) {
            String line = sc.nextLine();
            try {
                int num = Integer.parseInt(line);
                System.out.println(Integer.toBinaryString(num));
                break;
            }

            catch (Exception e) {
                try {
                    new BigInteger(line);
                    System.out.println("录入错误,您录入的是一个过大的整数,请重新输入一个整数:");
                } catch (Exception e2) {
                    try {
                        new BigDecimal(line);
                        System.out.println("录入错误,您录入的是一个小数,请重新输入一个整数:");
                    } catch (Exception e3) {
                        System.out.println("录入错误,您录入的是一个非法字符,请重新输入一个整数:");
                    }
                }
            }
        }
    }
}
