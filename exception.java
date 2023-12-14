/*
class MyException {
    int a[] = new int[5];

    public void set() {
        for (int i = 0; i < 5; i++) {
            a[i] = i * 2;
        }
    }

    public void show() {
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        MyException obj = new MyException();
        obj.set();
        obj.show();
        System.out.println("After calling print method");
        try {
            obj.show();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
} */

// Exception Handling in Java - Try Catch Finally Example
/*
class MainClass{
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block");
        }
    }
} 

import java.io.*;

class ExceptionHandle{
    void m1(int a) throws IOException{
        if (a < 0) {
            throw new IOException();
        }
        System.out.println("Valid Value a: "+a);
    }
    public static void main(String[] args) {
        ExceptionHandle ob = new ExceptionHandle();
        try {
            ob.m1(10);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
} */


class InvalidRollNo extends Exception {
    public String toString() {
        return ("Roll no should be of range 1 to 75");
    }
}
class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name){
        try {
            if (rollNo <= 0 || rollNo > 75) {
            throw new InvalidRollNo();
        }
        this.rollNo=rollNo;
        this.name=name;
        } catch (InvalidRollNo ire) {
            System.out.println("Roll no should be of range 1 to 75");
        }
    }
    public static void main(String[] args) {
        Student stu = new Student(23,"John Doe");
        System.out.println("Name : " +stu.name );
        System.out.println("Roll No : " +stu.rollNo );
    }
}  
