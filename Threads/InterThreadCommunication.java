package Threads;

class InterThreadCommunication{
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        System.out.println("Press Ctrl+c to Stop");
        p.start();
        c.start();
    }
}
class Queue{
    int item;
    boolean busy = false;
    synchronized int get(){
        if (!busy){
            try {
                wait();
            } catch (Exception e) {}
        }
        System.out.println("Get: " + item);
        busy = false;
        notify();
        return item;
    }
    synchronized void put(int item){
        if (busy) {
            try {
                wait();
            } catch (Exception e) {}
        }
        this.item = item;
        busy = true;
        System.out.println("Put: " + item);
        notify();
    }
}

class Producer extends Thread{
    Queue q;
    public Producer(Queue q){
        this.q = q;
    }
    public void run(){
        int i = 0;
        // while (true) {
        //     q.put(i++);
        // }

        for(int k=0; k<10; k++){
            q.put(k);
        }
    }
}

class Consumer extends Thread{
    Queue q;
    public Consumer(Queue q){
        this.q = q;
    }
    public void run(){
        // while(true){
        //     q.get();
        // }

        for(int j=0; j<10; j++){
            q.get();
        }
    }
}