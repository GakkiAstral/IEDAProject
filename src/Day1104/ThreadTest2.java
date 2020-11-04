package Day1104;

public class ThreadTest2 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();
        for (int j = 0;j<1000;j++) {
            System.out.println("bb");
        }
    }


}


class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0;i<1000;i++) {
            System.out.println("aaa");
        }
    }
}