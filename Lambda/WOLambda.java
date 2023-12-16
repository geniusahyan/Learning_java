package Lambda;

public class WOLambda {
    public static void main(String[] args) {
        // ImplDrawable obj = new ImplDrawable();
        // obj.width = 10;
        // obj.draw();

        int width =15;
        Drawable obj = new Drawable() {
            public void draw(){
                System.out.println("Drawing: "+ width);
            }
        };
        obj.draw();
    }
}

interface Drawable{
    public void draw();
}
/*
class ImplDrawable implements Drawable{
    int width;
    public void draw(){
        System.out.println("Drawing: "+ width);
    }
} */


