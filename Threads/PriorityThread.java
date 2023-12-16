class PriorityThread extends Thread{
    public void run(){
        System.out.println("Priority of the Thread " + Thread.currentThread()+ " is: " + getPriority());
    }


    public static void main(String[] args) {
        PriorityThread pt = new PriorityThread();
        pt.setPriority(Thread.MAX_PRIORITY);
        pt.start();
    }
}