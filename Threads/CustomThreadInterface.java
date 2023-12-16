package Threads;

class CustonThreadInterface implements Runnable{
    Thread t;
    public CustonThreadInterface(String name){
        this.t =new Thread(this,name);
        t.start();
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(t.getName() + ":" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        CustonThreadInterface t1 = new CustonThreadInterface("t1");
        CustonThreadInterface t2 = new CustonThreadInterface("t2");
        CustonThreadInterface t3 = new CustonThreadInterface("t3");

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