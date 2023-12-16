package Lambda;

public class WNoParaLambda {
    public static void main(String[] args) {
        Sayable s = ()->{
            return "Hello Meow";
        };
        System.out.println(s.say());
    }
}

interface Sayable{
    public String say();
}