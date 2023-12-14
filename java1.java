
            /* ======================Abstract Class======================= */
/*
import java.util.Scanner;
abstract class Animal{
    abstract public void makeSound();
}

abstract class PetAnimal extends Animal{
    public void getType(){
        System.out.println("This is a PetAnimal");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bow ... Bow");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow ... Meow");
    }
}

class AbstractD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("select 1 for Dog and 2 for Cat");
        int choice = sc.nextInt();

        PetAnimal a;
        if (choice ==1) {
            a = new Dog();
        }else{
            a = new Cat();
        }

        a.makeSound();
    }
} 

// abstract final class FinalClass{
class FinalClass{
    public FinalClass(){
        System.out.println("Finalclass Instantiated");
    }
    final void f(){
        System.out.println("F() called...");
    }
}

class AbstractFinal{
    public static void main(String[] args) {
        FinalClass obj =new FinalClass();
        obj.f();
    }
}


abstract class Base{
    abstract public void f();
    final public void g(){
        System.out.println("G Called....");
    }
    public void h(){
        System.out.println("H From Base is Called....");
    }
}

class Derived extends Base{
    public void f(){
        System.out.println("F Called...");
    }
    public void h(){
        System.out.println("H From Derived is Called....");
    }
}

class AbstractFinal{
    public static void main(String [] args){
        Derived obj = new Derived();
        obj.f();
        obj.g();
        obj.h();
    }
}

final abstract class Base{
    abstract public void f();
    final public void g(){
        System.out.println("G Called....");
    }
    public void h(){
        System.out.println("H From Base is Called....");
    }
}

// class Derived extends Base{
//     public void f(){
//         System.out.println("F Called...");
//     }
//     public void h(){
//         System.out.println("H From Derived is Called....");
//     }
// }

class AbstractFinal{
    public static void main(String [] args){
        // Derived obj = new Derived();
        // obj.f();
        // obj.g();
        // obj.h();
    }
}

interface I{
    int no=10;
    void f();
}
interface J{
    int no1=10;
    void g();
}


class Base{
    int no2;
    void h(){
        // no = no + 1;
        System.out.println("H called.." + no2);
    }
}
class Demo extends Base implements I , J{
    public void f(){
        // no = no + 1;
        System.out.println("F called.." + no);
    }

    public void g(){
        // no = no + 1;
        System.out.println("G called.." + no1);
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.f();
        obj.g();
    }
}
    */

    /* ======================Interface======================= */
/*
interface I{
    default void f(){
        System.out.println("f() called...");
    }
}

class Demo implements I{
    public void f(){
        System.out.println("f() called... From Demo");
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.f();
    }
} */
/*
import java.util.Scanner;

class Vehicle{
    int noSeats;
    String fuel;
    int speed;

    public Vehicle(int noSeats, String fuel, int speed){
        this.noSeats = noSeats;
        this.fuel = fuel;
        this.speed = speed;
    }
    public String toString(){
        return "No of Seats: " + noSeats + " Fuel: " + fuel + " Speed: " + speed;
    }
}

interface FlyingObject{
    int maxheight = 20000;
}

class Airplane extends Vehicle implements FlyingObject{
    int takeoffSpeed;
    public Airplane(int noSeats, String fuel, int speed , int takeoffSpeed){
        super(noSeats, fuel, speed);
        this.takeoffSpeed = takeoffSpeed;
    }

    public String toString(){
        return "No of Seats: " + noSeats + " Fuel: " + fuel + " Speed: " + speed + " Takeoff Speed: " + takeoffSpeed;
    }
}

class Bus extends Vehicle {
    String type;
    public Bus(int noSeats, String fuel, int speed, String type){
        super(noSeats, fuel, speed);
        this.type = type;
    }
    public String toString(){
        return "No of Seats: " + noSeats + " Fuel: " + fuel + " Speed: " + speed + " Type: " + type;
    }
}

class InterfaceD{
    public static void main(String[] args) {
        Vehicle v [] = new Vehicle[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5;i++){
            System.out.println("Enter 1 to create Bus and 2 to create Airplane");
            int choice = sc.nextInt();
        if (choice ==1){
                v[i] = new Bus(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
        }else{
                v[i] = new Airplane(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());
            }
}
    

        for (int i=0; i<5;i++){
            System.out.println(v[i]);
        }
    }
} */

             /* ======================Package======================= */
/*
import java.util.Scanner;
class BuiltInPackage{
    public static void main(String[] args) {
        System.out.println("Please Enter Your Name:");
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String my_name = sc.next() ;
        System.out.println("Hello "+ my_name);
    }
} 

package mypack;

class UserdefinedPackage{
    public static void main(String[] args) {
        System.out.println("Hello from package mypack");
    }
}

import static java.lang.System.*;
class StaticImport{
    public static void main(String[] args) {
        out.println("Hello from package mypack");
    }
}
*/

