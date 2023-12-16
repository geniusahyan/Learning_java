package Threads;

class SyncThread extends Thread{
    String s;
    Parenthesis p;
    public SyncThread(String s,Parenthesis p){
        this.s = s;
        this.p = p;
        start();
    }
    public void run(){
        p.display(s);
    }
    public static void main(String[] args) {
        Parenthesis p = new Parenthesis();
        SyncThread t1 = new SyncThread("java", p);
        SyncThread t2 = new SyncThread("oocp", p);
    }
}

class Parenthesis{
    synchronized void display(String s){
        System.out.println("\n");
        System.out.print("(" + s);
        try {
            Thread.sleep(500);
        } catch (Exception e) {}
        System.out.print(")");
    }
}