class DaemonThread{
    public void run(){
        try {
            System.out.println("In run method: "+ Thread.currentThread());
            
            while(true){
                try {
                    Thread.sleep(500);
                } catch (Exception e) {}
                System.out.println("In run.. woke up again..");
            }

        }finally{
            System.out.println("Leaving run method");
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting main thread");
        /* Create an instance of the daemon thread */
        DaemonThread dt = new DaemonThread();
        dt.setDaemon(try);
        dt.start();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {}
        System.out.println(" time up Exiting from main thread");
    }
}