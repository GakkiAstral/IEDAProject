package Day1023;

import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个1-100之间的整数：");
        int guess = (int)(Math.random() * 100) + 1;

        while (true) {
            int result = sc.nextInt();
            if(result > guess) {
                System.out.println("大了，请重新输入一个1-100的整数");
            } else if(result < guess) {
                System.out.println("小了，请重新输入一个1-100的整数");
            } else {
                System.out.println("输入正确，游戏结束！");
                break;
            }
        }
    }
}
