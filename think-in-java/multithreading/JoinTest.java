package multithreading;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        Mythread8 ss = new Mythread8();
        Thread thread = new Thread(ss, "���߳�");
        thread.start();
        System.out.println(Thread.currentThread().getName());
        thread.join();
        System.out.println("�������");
    }

    public static void printTime() {
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=format.format(date);
        System.out.println(time);
    }
}	