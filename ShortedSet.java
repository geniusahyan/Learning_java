import java.util.*;

class Student{
    int rollNo;
    String name;

    public Student(int r, String n){
        this.rollNo = r;
        this.name = n;
    }
    public String toString(){
        return rollNo + "-->" + name + "\n";
    }
}

class SortedSet{
    public static void main(String[] args){
        TreeSet<Integer> ts1 = new TreeSet<Integer>();
        ts1.add(40);
        ts1.add(60);
        ts1.add(20);
        ts1.add(70);
        ts1.add(10);
        
        System.out.println(ts1);
        ts1.add(30);
        System.out.println("After "+ts1);
        ts1.add(50);
        System.out.println("After "+ts1);
        
    }
}