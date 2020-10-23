package Day1023;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        //完成数组赋值
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        //完成数组遍历
        for (int j = 0; j < 10; j++) {
            System.out.println(arr[j]);
        }

        //通过调用函数得到数组里面的最大值
        int[] arr1 = {11, 22, 32, 45, 71, 23, 46, 78, 99};
        System.out.println("当前数组中的最大值是：" + arrayGetMax(arr1));

        //通过调用函数得到数组里面某个值的索引
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想在数组中查询的整数：");
        int x = sc.nextInt();

        int y = arrayGetIndex(arr1, x);
        if (y >= 0) {
            System.out.println("你查询的值在数组中的第" + y + "个");
        } else {
            System.out.println("你查询的值不在当前数组中");
        }
    }

    //可以得到数组中的最大值。
    public static int arrayGetMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //可以查找数组中的索引值,默认从-1开始
    public static int arrayGetIndex(int[] arr, int a) {
        int x = -1;

        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                x = i;
            }
        }
        return x;
    }
}
