package Day1104;

public class ThreadTest1 {
    public static void main(String[] args) {
        //输出结果有aaa和bb，是随机输出的，没有规律
        MyThread mt = new MyThread();
        mt.start();

        for (int i = 0;i<1000;i++) {
            System.out.println("bb");
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 1;i<1000;i++) {
            System.out.println("aaa");
        }
    }
}