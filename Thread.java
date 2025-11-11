
class MyThread extends Thread {
    String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " : " + i);
            try {
                Thread.sleep(500); // pause for 0.5 sec
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        t1.start(); // starts new thread
        t2.start(); // runs parallel with t1
    }
}