package Day1022;

import java.util.Scanner;

public class SumDays {

    public static void main(String[] args) {
        /*
        *手动输入某一个日期，然后得到当天是当前年份的第多少天。
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int x = sc.nextInt();
        System.out.println("请输入一个月份");
        int y = sc.nextInt();
        System.out.println("请输入一个天数");
        int z = sc.nextInt();

        //先计算上本天
        int count = 1;

        //依次累加上之前的天数
        if (y == 1) {
            count += 0;
        } else if (y == 2) {
            count += 31;
        } else if (y == 3) {
            count += 31 + 28;
        } else if (y == 4) {
            count += 31 + 28 + 31;
        } else if (y == 5) {
            count += 31 + 28 + 31 + 30;
        } else if (y == 6) {
            count += 31 + 28 + 31 + 30 + 31;
        } else if (y == 7) {
            count += 31 + 28 + 31 + 30 + 31 + 30;
        } else if (y == 8) {
            count += 31 + 28 + 31 + 30 + 31 + 30 + 31;
        } else if (y == 9) {
            count += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
        } else if (y == 10) {
            count += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
        } else if (y == 11) {
            count += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
        } else {
            count += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
        }

        //当前月份的天数
        count += z;

        //判断输入年份是否为闰年
        if ((x % 4 == 0) && (x % 100 != 0) && (x % 400 == 0)) {
            count++;
        }

        System.out.println("你所输入的日期是：" + x + "年" + y + "月" + z + "号");
        System.out.println("该天是当年的第" + count + "天（包含今天）");

        /*输出结果是：
     请输入一个年份
        2020
     请输入一个月份
        8
     请输入一个天数
        15
        你所输入的日期是：2020年8月15号
        该天是当年的第228天[包含今天]
        */
    }
}
