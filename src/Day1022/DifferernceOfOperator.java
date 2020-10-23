package Day1022;

public class DifferernceOfOperator {
    public static void main(String[] args) {
        /*
        *观察逻辑运算符&&和&之间的区别，其他同理
        */
        int a1 = 10;
        int a2 = 15;

        int b1 = 3;
        int b2 = 5;

        boolean c1 = (a1++ > 15) & ++a2 < 3;
        System.out.println(c1); //false
        System.out.println(a1); //11
        System.out.println(a2); //16
        //左边有错的情况下，逻辑运算符&右边的表达式是继续执行的。
        boolean c2 = (b1 == 2) && b2++ > 4;
        System.out.println(c2); //false
        System.out.println(b1); //3
        System.out.println(b2); //5
        //左边有错的情况下，逻辑运算符&&右边的表达式是不执行的。
    }
}
