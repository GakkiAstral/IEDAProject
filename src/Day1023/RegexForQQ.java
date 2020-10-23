package Day1023;

public class RegexForQQ {
    public static void main(String[] args) {
        boolean b1 = checkQQ("345123678");
        boolean b2 = checkQQ("852481695");
        boolean b3 = checkQQ("012345689");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    }

    public static boolean checkQQ(String qq) {
        boolean flag = true;

        if(qq.length() >= 5 && qq.length() <= 12) {
            if(!qq.startsWith("0")) {
                char[] arr = qq.toCharArray();
                for (int i = 0;i<qq.length();i++) {
                    char ch = arr[i];
                    if (!(ch >= '0' && ch <= '9')) {
                        flag = false;
                        break;
                    }
                }
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }
        return flag;
    }
}
