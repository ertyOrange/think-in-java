package multithreading;

public class Mythread8 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("���߳�ֹͣǰ��ʱ��");
            JoinTest.printTime();
            Thread.sleep(2000);
            System.out.println("���߳�ֹͣ������ʱ��");
            JoinTest.printTime();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
