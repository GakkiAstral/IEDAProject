package Day1022;

public class OperatorFlag {
    public static void main(String[] args) {
        /*
         * 测试一下自增自减操作符
         */
        int x = 5;
        int y = x++ + ++x;
        System.out.println("x++ + ++x = " + y);
        //输出结果是：x++ + ++x = 12
    }
}
