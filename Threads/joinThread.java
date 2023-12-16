class JoinThread extends Thread{
    int ts;
    public JoinThread(int ts){
        this.ts=ts;
        start();
    }
    public void run() {
        try {
            for(int i=1;i<=5;i++){
                System.out.println(getName() + ":" + i);
                    Thread.sleep(500);
                
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
          }
    }
    public static void main(String[] args) {
        JoinThread t1 = new JoinThread(200);
        JoinThread t2 = new JoinThread(300);
        JoinThread t3 = new JoinThread(400);
        
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {}

        System.out.println("Main is exiting....");
        return;
    }
}