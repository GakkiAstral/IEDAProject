package Day1102;

public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            int x = div(10, 0);
            System.out.println(x);

        } catch (ArithmeticException a) {
            System.out.println("计算时出错，除数为0");
        }
        //计算时出错，除数为0
        int a = 10;
        int b = 2;
        int[] arr = {11, 22, 33, 44, 55};

        try {
            System.out.println(a / b);
            System.out.println(arr[10]);
            arr = null;
            System.out.println(arr);
        } catch (ArithmeticException c) {
            System.out.println("计算时出错，除数为0");
        } catch (ArrayIndexOutOfBoundsException d) {
            System.out.println("数据索引越界");
        } catch (NullPointerException e) {
            System.out.println("数据为NULL异常");
        } catch (Exception f) {
            System.out.println("程序存在异常，请检查");
        }
        //5
        //数据索引越界
    }

    public static int div(int d1, int d2) {
        return d1 / d2;
    }
}

