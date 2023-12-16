package Threads;

// package Threads;
class CustomThread extends Thread{
    public CustomThread(String name){
        super(name);
    }
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(getName() + ":" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        CustomThread t1 = new CustomThread("t1");
        CustomThread t2 = new CustomThread("t2");
        CustomThread t3 = new CustomThread("t3");
        t1.start();
        t2.start();
        t3.start();
        for (int j = 0; j <=10; j++) {
            System.out.println("Main Thread: " + j);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}