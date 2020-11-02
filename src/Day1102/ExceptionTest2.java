package Day1102;

public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            /// by zero
            System.out.println(e.toString());
            //java.lang.ArithmeticException: / by zero
            System.out.println(e);
            //java.lang.ArithmeticException: / by zero,等同于同toString方法
            /*
            e.printStackTrace();
            打印异常类名,异常信息,异常出现的位置,jvm默认就用这个方式处理异常
            */
            System.out.println(1);
        }
    }
}
