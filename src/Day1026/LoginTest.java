package Day1026;

import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String username = sc.nextLine();
            System.out.println("请输入密码:");
            String password = sc.nextLine();

            if ("admin".equals(username) && "000000".equals(password)) {
                System.out.println("欢迎" + username + "登录");
                break;
            } else {
                if (i == 2) {
                    System.out.println("您的错误次数已达上限，无法继续输入");
                    break;
                }
                System.out.println("录入错误，您还有" + (2 - i) + "次登录机会");
            }

        }
    }
}
