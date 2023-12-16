package Lambda;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierLambda {
    public static void main(String[] args) {
        Supplier supplier = ()-> new Random().nextInt(50);
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
