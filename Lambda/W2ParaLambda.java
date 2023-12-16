package Lambda;

public class W2ParaLambda {
    public static void main(String[] args) {
        // Addable a1 = (a,b)->{
        //     return a+b;
        // };
        // System.out.println(a1.add(10,2));

        Addable a2 = (a,b)->(a+b);
        System.out.println(a2.add(8,2));
    }
}

interface Addable{
    int add(int a, int b);
}
