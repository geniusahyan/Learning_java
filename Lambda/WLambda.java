package Lambda;
public class WLambda {
    public static void main(String[] args) {
        int width = 20;
        //with lambda expression
        // Drawable obj = () -> System.out.println("Drawing: "+ width);
        // obj.draw();

          Drawable obj = ()->{
            System.out.println("Drawing: "+ width);
        };
        obj.draw();
    }
}

@FunctionalInterface
interface Drawable{
    public void draw();
}