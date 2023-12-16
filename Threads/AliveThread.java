package Threads;

class AliveThread extends Thread{
    public AliveThread(){
        start();
    }
    public void run() {
        try {
            System.out.println(getName() + " Says ... Hello");
            Thread.sleep(500);
            System.out.println("I am still alive!");
        } catch (Exception e) {}
    }
    public static void main(String[] args) {
        AliveThread t1 = new AliveThread();
        AliveThread t2 = new AliveThread();
        AliveThread t3 = new AliveThread();
        System.out.println(t1.getName() + " Alive " + t1.isAlive());
        System.out.println(t2.getName() + " Alive " + t2.isAlive());
        System.out.println(t3.getName() + " Alive " + t3.isAlive());
        System.out.println("Main sleeping for 2000 ms");
        
        try {
            Thread.sleep(2000);
            System.out.println(t1.getName() + " Alive " + t1.isAlive());
            System.out.println(t2.getName() + " Alive " + t2.isAlive());
            System.out.println(t3.getName() + " Alive " + t3.isAlive());
        } catch (Exception e) {}
    }
}