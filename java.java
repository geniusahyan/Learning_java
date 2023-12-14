// import java.util.ArrayList;

// import java.lang.Math;

/* ---------------Array-------------- */
/* class My_first_java{
    public static void main(String[] args) {
        int num[][] = new int[3][];
        for (int i =0 ; i< num.length; i++)
             num[i] = new int[5];
        for (int i = 0 ; i<num.length; i++)
            for(int j =0; j<num[i].length; j++)
            num[i][j] = i*j;
        for (int i = 0 ; i<num.length; i++)
            for(int j =0; j<num[i].length; j++)
                System.out.print(num[i][j]+" ");
    }
}


class CopyDemo {
    public static void main(String[] args) {
        char [] copyFrom = {'j', 'a', 'v', 'a', ' ' , 'i', 's', ' ', 'f', 'u',  'n'};
        char [] copyTo = new char[3];
        System.arraycopy(copyFrom , 5, copyTo, 0 , 3);
        System.out.println(copyTo);
    }
}
    */

                          /* ---------------Methods-------------- */


/* class PrimeCheck {
public static void main(String[] args) {
    int num = 12;
    boolean flag = true;
    // check prime or not 
    for (int i = 2 ; i<num; i++)
        if (num % i == 0){
            flag = false ;
            break;
        }
            
    if (flag == true)
    System.out.println(num + " is a prime number");
    else 
    System.out.println(num + " is not a prime number");
 }
}

class PrimeCheckFun {
    public static boolean isPrime(int n){
        boolean flag = true;
        for (int i = 2 ; i< (int)n/2; i++)
            if (n%i == 0) {
                flag = false;
                break;
            }
        return flag ;
    }
    public static void main(String[] args) {
        int num = 121;
        if (isPrime(num)) {
            System.out.println(num + " is prime");
        } else{
            System.out.println(num + " is not prime");
        }
    }
}


class FunctionCallDemo {
    public static void f() {
        System.out.println("inside F... Before calling g()");
        g();
        System.out.println("inside F... After calling g()");
    }
    public static void g() {
        System.out.println("inside G... Before calling h()");
        h();
        System.out.println("inside G... After calling h()");
    }
    public static void h() {
        System.out.println("inside H...");
    }
    public static void main(String[] args) {
        System.out.println("inside Main... Before calling f()");
        f();
        System.out.println("inside Main... After calling f()");
    }
}

class circle {
    public static double circle(int a){
        return Math.PI*a*a;
    }
    public static void main(String[] args) {
        System.out.println(circle(5));
    }
}

class rectange {
    public static int rect(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        System.out.println(rect(5 , 6));
        System.out.println(rect(6 , 7));
    }
}


class FunctionOverLoading {
    static float area(int r){
        return 22/7 * r * r; 
    }
    static float area(int l , int w){
        return l * w ; 
    }
    static float area(int a, int b , int c){
        float s = (a + b + c)/2.0f;
        return (float) Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
    public static void main(String [] args){


        System.out.println("The area of Circle is " + area( 5));
        System.out.println("The area of Rectange is " + area( 6, 7));
        System.out.println("The area of Triangle is " + area( 8 , 9 , 3));
    }
}

class Recursive{
    static int count = 0;
    public static void main(String[] args) {
        p();
    }

    static void p(){
        count++;
        if (count <= 10) {
            System.out.println("hello " + count);
            p();
        }
    }
}

class fact {
    static int factorial(int n){
        if (n==1){
            return 1;
        }
        else{
            return(n* factorial(n-1));
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is " + factorial(5));
    }
}



class fact {
    static int factorial(int n){
        int ans = 1;
        for (int i = 1 ; i<=n ; i++){
            ans *= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Factorial offfff 5 is " + factorial(5));
    }
}
        */




               /* ------------------------Class & Object---------------------- */

/* 
 
class Student{
    int rollNo;
    String name;
    float marks;

    void setName(String nm){
        name = nm;
    }
    
    String getName(){
        return name;
    }


    void setRollNo(int rn){
        rollNo = rn;
    }
    int getRollNo(){
        return rollNo;
    }

    void setMarks(float m){
        marks = m;
    }
    float getMarks(){
        return marks;
    }

    String getGrade(){
        if(marks < 300){
            return "Fail" ;
        }else{
            return "pass";
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
        s.setName("some");
        s.setRollNo(12);
        s.setMarks(458);
        s1.setName("something");
        System.out.println( "Name is  " + s.getName());
        System.out.println( "RollNo is  " + s.getRollNo());
        System.out.println( "Marks is  " + s.getMarks());
        System.out.println( "Grade is  " + s.getGrade());
        System.out.println(" ");
        System.out.println(s1.getName());
    }
}
*/

                /* ---------------Private class------------------ */
/* 

class AccessModifier{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Ritesh");
        // s.setRollNo(122);
        s.setRollNo(132);

        System.out.println("name of s is :" + s.getName());
        System.out.println("rollNo of s is :" + s.getRollNo());
    }
}


class Student {
    private int rollNo;
    private String name;

    public int getRollNo(){
        return rollNo;
    }

    public String getName(){
        return name;
    }

    public void setRollNo(int r){
        rollNo = r;
    }
    
    public void setName(String a){
        name = a;
    }
}
*/


                /* ---------------Array of Object------------------ */
/* 
 
class Array{
    public static void main(String[] args) {
        Employee e[];
        e = new Employee[5];
        for (int i = 0; i<5; i++){
            e[i] = new Employee();
            e[i].setEmployee(i+1, 1000*(i+1));
        }

        // for (int i=0; i<5; i++){
        //     e[i].getEmployee();
        // }

        e[3].getSalary();
    }
}

class Employee{
    private int empId;
    private float salary;

    public void setEmployee(int id , float s){
        empId = id;
        salary = s;
    }

    public void getEmployee(){
        System.out.println("Employee id " + empId + " salary "+ salary);
    }
    public void getSalary(){
        System.out.println("salary " + salary);
    }
}
*/

            /* ===================Constructor===================== */
/* 
 
class Constructor{
    public static void main(String[] args) {
        Student s = new Student();
        s.displayStudent();
    }
}

class Student{
    private int rollNo;
    private float marks;

    public void displayStudent(){
        System.out.println("RollNo "+ rollNo + " Marks " + marks);
    }
}
*/


                /* ===================This===================== */
/* 
class ThisDemo{
    public static void main(String[] args) {
        Demo s = new Demo(10);
        s.print();
    }
}

class Demo{
    int i;
    Demo(int i){
        this.i=10;
    }
    void print(){
        System.out.println(i);
    }
}
*/


                /* ===================Static===================== */
/*
 class Student{
     int rollNo;
     static int passingMarks;
     float marks;
     
     public void set(int rollNo, float marks){
        this.marks = marks;
        this.rollNo = rollNo;
    }
    public void displayStudent(){
        System.out.println("RollNo "+ rollNo + " Marks " + marks);
    }
    public static void setPassingMarks(int m){
            passingMarks = m;
    }

}

class StaticDemo{
    public static void main(String[] args) {
        Student.setPassingMarks(300);
        Student s = new Student();
        s.set(12,455);
        s.displayStudent();
    }
}
*/

                /* ===================Initializer Bloack===================== */
/*
class InitializerBlock{
    private int i=0;
    public InitializerBlock(){
        i++;
        System.out.println("Inside constructor "+i);
    }

    {
        i++;
        System.out.println("Initializer Block 1 "+ i);
    }
    {
        i++;
        System.out.println("Initializer Block 2 "+ i);
    }

    public static void main(String[] args) {
        System.out.println("Main Started");
        InitializerBlock obj = new InitializerBlock();
        System.out.println("Main Min Way");
        InitializerBlock obj1 = new InitializerBlock();
        System.out.println("Main Completed");
    }
}

*/
            /* ===================Static Initializer Bloack===================== */
/*
 class StaticInitializer{
    private int i=0;
    public StaticInitializer(){
        i++;
        System.out.println("Inside constructor "+i);
    }

    {
        i++;
        System.out.println("Initializer Block 1 "+ i);
    }
    {
        i++;
        System.out.println("Initializer Block 2 "+ i);
    }
    static {
        System.out.println("Static Initializer Block 1");
    }

        public static void main(String[] args) {
        System.out.println("Main Started");
        StaticInitializer obj = new StaticInitializer();
        System.out.println("Main Min Way");
        StaticInitializer obj1 = new StaticInitializer();
        System.out.println("Main Completed");
    }

}
*/

            /* ===================Wrapper===================== */
            /* -------------autoboxing------------- */
            /* 
            class Wrapper{
    public static void main(String[] args) {
        int i = 25;
        // Integer obj_i = Integer.valueOf(i);
        Integer obj_i = i;
        System.out.println(obj_i);
    }
}
*/
            /* -------------unboxing------------- */
/* 
class Wrapper{
    public static void main(String[] args) {
        Integer obj_i = new Integer(1) ;
        int i = obj_i.intValue();
        System.out.println(i);
    }
}

class Wrapper2{
    public static void main(String[] args) {
        Integer obj_i = 5 ;
        Float obj_f = 5.78f;
        Character obj_Character = 'R';

        System.out.println(obj_i.intValue());
        System.out.println(obj_i.toString());
        System.out.println(obj_f.floatValue());
        System.out.println(obj_Character.charValue());
        // check typeof obj_i 
        System.out.println(obj_i.getClass());
        System.out.println(obj_f.getClass());
        System.out.println(obj_Character.getClass());

    }
}

class Wrapeer{
    public static void main(String[] args) {
        Integer obj_i = 1001;
        String obj_s = obj_i.toString();
        System.out.println("Object Has "+ obj_s.length());
    }
}


class Wrapper{
public static void main(String[] args) {
    ArrayList <Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(12);
    myNumbers.add(15);
    myNumbers.add(17);
 
    for (int ele:myNumbers){
    System.out.println(ele);
    }
  }
}
*/

                /*====================Inheritance======================*/
/*
class Inheritance{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        FullTimeEmployee ft1 = new FullTimeEmployee();
        e1.setEmployee("101", "sarth");
        ft1.setFullTimeEmployee("101", "parth", 100000);

        e1.getEmployee();
        ft1.getFullTimeEmployee();
    }
}


class Employee{
    private String empId;
    private String empName;

    public void setEmployee(String empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }

    public void getEmployee(){
        System.out.println("Employee Id: "+ empId);
        System.out.println("Employee Name: "+ this.empName);
    }
}

class FullTimeEmployee extends Employee{
    private double salary;
    public void setFullTimeEmployee(String empId, String empName, double salary){
        setEmployee(empId, empName);
        this.salary = salary;
    }

    public void getFullTimeEmployee(){
        getEmployee();
        System.out.println("Employee Salary: "+ salary);
    }
}
*/

/* 
class Inheritance{
    public static void main(String[] args) {
        Person p1 = new Person();
        Employee e1 = new Employee();
        FullTimeEmployee ft1 = new FullTimeEmployee();
        PartTimeEmployee pt1 = new PartTimeEmployee();

        p1.setPerson("Some" , "Patna");
        e1.setEmployee("Bhavin", "Ahmedabad", "101", "Finance");
        ft1.setFullTimeEmployee("Ayush", "Delhi", "102", "IT", 1223);
        pt1.setPartTimeEmployee("Amit", "Delhi", "103", "HR", 223 , 12 );

        System.out.println("Persion .......");
        p1.getPerson();
        System.out.println("Employee.......");
        e1.getEmployee();
        System.out.println("FullTimeEmp.......");
        ft1.getFullTimeEmployee();
        System.out.println("PartTimeEmp.......");
        pt1.getPartTimeEmployee();
    }
}
*/

            /* ----------------single Inheritance------------------ */
/*
class Person{
    protected String name;
    protected String address;

    public void setPerson(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void getPerson(){
        System.out.println("Name: "+ name);
        System.out.println("Address: "+ address);
    }
}

class Employee extends Person{
    protected String empId;
    protected String department;

    public void setEmployee(String name, String address, String empId, String department){
        // this.name = name;  -- for protected
        // this.address  = address;
        setPerson(name, address);
        this.empId = empId;
        this.department = department;
    }

    public void getEmployee(){
        getPerson();
        System.out.println("Emp Id: "+ empId);
        System.out.println("Emp Department: "+ department);
    }
}
*/

          /* ----------------Multilevel Inheritance------------------ */
/* 
class FullTimeEmployee extends Employee{
    protected double salary;
    public void setFullTimeEmployee(String name, String address, String empid, String department , double salary){
        setEmployee(name, address, empid, department);
        this.salary = salary;
    }

    public void getFullTimeEmployee(){
        getEmployee();
        System.out.println("Salary: "+ salary);
    }
}
*/
          /* ----------------hierarchical Inheritance------------------ */
/*
class PartTimeEmployee extends Employee {
    protected double perHour;
    int Hour;

    public void setPartTimeEmployee(String name, String address, String empid, String department, double perHour, int Hour){
        setEmployee(name, address, empid, department);
        this.perHour = perHour;
        this.Hour = Hour;
    }
    public void getPartTimeEmployee(){
        getEmployee();
        System.out.println("PerHour: "+ perHour);
        System.out.println("Hour: "+ Hour);
        System.out.println("Total: "+ Hour * perHour);
    }
}
*/

            /* ========================Super()======================== */
/*
class Super{
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.printIJ();
    }
}

class Base{
    protected int i;
    Base(){
        i = 10;
    }
    void printI(){
        System.out.println(i);
    }
}
class Derived extends Base{
    private int j;
    Derived(){
        // super.i=20;
        super();
        j=30;
    }
    public void printIJ(){
        super.printI();
        System.out.println(j);
    }
}
 */

             /* ======================Constructor in Inheritance======================= */
/*
class ConstructorCall{
    public static void main(String[] args) {
        Derived obj = new Derived(10,20);
        obj.printIJ();
    }
}

class Base{
    protected int i;

    // public Base(){
    //     System.out.println("Base Constructor Called");
    //     i=20;
    // }

    public Base(int i){
        System.out.println("Base Parameterized Called");
        this.i = 15;
    }

    public void printI(){
        System.out.println(i);
    }
}

class Derived extends Base{
    int j;
    public Derived(int i, int j){
        super(i);
        System.out.println("Derived Constructor Called");
        this.j = 30;
    }
    public void printIJ(){
        System.out.println("I : " + i);
        System.out.println("J : " + j);
    }
} 

class Constructor{
    public static void main(String[] args) {
        C cObj = new C(10);
    }
}

class A{
    public A(int i){
        i = 10;
        System.out.println("A Constructor Called");
    }
}

class B extends A{
    public B(int j){
        super(10);
        j = 10;
        System.out.println("B Constructor Called");
    }
}

class C extends B{
    public C(int k){
        super(10);
        k = 10;
        System.out.println("C Constructor Called");
    }
}
*/

             /* ======================Method Overriding======================= */
/*
class Base{
    protected void print(){
        System.out.println("Hello From Base");
    }
}

class Derived extends Base{
    protected void print(){
        System.out.println("Hello From Derived");
    }
}

class Overriding{
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        b.print();;
        d.print();;
    }
} 
class Base{
    protected void print(){
        System.out.println("Hello From Base");
    }
}

class Derived extends Base{
    protected void print(){
        System.out.println("Hello From Derived");
    }
}

class Overriding{
    public static void main(String[] args) {
        Base b = new Derived();
        b.print();
    }
} 

import java.util.Scanner;
class MethodOverriding{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to create Batsman and 2 to create Bowler");
        int choice = sc.nextInt();

        Cricketer c;
        if(choice == 1){
            c = new Batsman("India", "Rohit sharma", 4,2);
        }else{
            c= new Bowler("India", "Irfan pathan",4,10);
        }
        c.print();
    }
}
class Cricketer{
    String countryName;
    String playerName;

    public Cricketer(String countryName, String playerName){
        this.countryName = countryName;
        this.playerName = playerName;
    }

    public void print(){
        System.out.println("Country name: " + countryName);
        System.out.println("player name: " + playerName);
    }
}

class Batsman extends Cricketer{
    int no50;
    int no100;

    public Batsman(String countryName, String playerName, int no50, int no100){
        super(countryName, playerName);
        this.no50 = no50;
        this.no100 = no100;
    }

    public void print(){
        super.print();
        System.out.println("No of 50s : " + no50);
        System.out.println("No of 100s : " + no100);
    }
}

class Bowler extends Cricketer{
    int wickets;
    int runsGiven;

    public Bowler(String countryName, String playerName, int wickets, int runsGiven){
        super(countryName, playerName);
        this.wickets = wickets;
        this.runsGiven = runsGiven;
    }
    public void print(){
        super.print();
        System.out.println("No of Wickets :" + wickets);
        System.out.println("No of runsGiven :" + runsGiven);
    }
}
*/

            /* ======================Final Keyword======================= */
/*
class Final{
    public static void main(String[] args) {
        // Base b1 = new Base(12,23);
        // b1.print();
        Derived d1 = new Derived();
        d1.print();
    }
}

class Base{
    protected final int f_i;
    protected int j;

    {
        f_i = 10;
        j = 20;
    }

    Base(int f_i, int j){
        System.out.println("Base Created");
        this.f_i = f_i;
        this.j = j * 10;
    }
    Base(){
        System.out.println("Base Created");
    }

    public void print(){
        System.out.println("f_i: "+ f_i + " and j: " + j );
    }
    final public void print(){
        System.out.println("Hello from Base");
    }
}

class Derived extends Base {
    Derived(){
        System.out.println("Derived Created");
    }
    public void print(){
        System.out.println("Hello from Derived");
    }
}
*/


            /* ======================Object Class======================= */
/*
class Rectangle{
    int length;
    int width;

    public void set(int l, int w){
        length = l;
        width = w;
    }

    public void print(){
        System.out.println("Length: "+ length);
        System.out.println("Width: "+ width);
    }

    public String toString(){
        String msg;
        msg = "Length: "+ length + " Width "+ width;
        return msg;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.set(12,23);
        // r.print();
        System.out.println(r);
        System.out.println(r.toString());
    }
} 

class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString(){
        return "RollNo: "+ rollNo + " Name "+ name;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "some");
        System.out.println(s1);
        String hash_s1 =String.valueOf(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(Integer.toHexString(s1.hashCode()));
    }
}

class Name{
    String firstname;
    public Name(String fnm){
        firstname = fnm;
    }

    public void setName(String fnm){
        firstname = fnm;
    }

    public String toString(){
        return firstname;
    }
}

class Student implements Cloneable{
    int rollNo;
    Name studName;
    public Student(int rollNo, String fnm){
        this.rollNo = rollNo;
        this.studName = new Name(fnm);
    }
    public void setStudName(String fnm){
        this.studName.setName(fnm);
    }
    public Object clone() throws CloneNotSupportedException{
        Student temp = (Student) super.clone();
        return temp;
    }
    public static void main(String[] args) {
        try{
            Student s1 = new Student(1, "some");
            Student s2 = (Student) s1.clone();
            System.out.println(s1);
            System.out.println(s2);

            s2.rollNo = 102;
            s2.setStudName("Stavan");
        }
        catch(CloneNotSupportedException er){
            System.out.println(er);
        }
    }
}

class GetClass{
    public static void main(String[] args) {
        GetClass obj = new GetClass();
        String className = obj.getClass().getSuperclass().getName();
        System.out.println(className.getClass().getName());
    }
}

class FinalizeD{
    protected void finalize(){
        System.out.println("Finalize Method is Called");
    }
    public FinalizeD(){
        System.out.println("Finalize is Created");
    }
    public static void main(String[] args) {
        FinalizeD obj = new FinalizeD();
        obj = null;
        System.gc();
        System.out.println("main exiting");
    }
}
*/
