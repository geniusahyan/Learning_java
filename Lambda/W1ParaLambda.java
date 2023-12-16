package Lambda;

public class W1ParaLambda {
    public static void main(String[] args) {
        Sayable s = (name)->{
            return "Hello "+ name;
        };
        System.out.println(s.say("Tom"));

        // omit parameter paranthesis
        Sayable s2 = name ->{
            return "Hello "+ name;
        };
        System.out.println(s2.say("some"));
    }
}

interface Sayable{
    public String say(String name);
}
