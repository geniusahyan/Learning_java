import java.util.*;
class SortedSet{
    public static void main(String[] args){

        TreeSet<Student> college = new TreeSet<Student>();
        Student s1 = new Student(12,"some");
        Student s2 = new Student(13,"none");
        Student s3 = new Student(14,"anot");
        Student s4 = new Student(15,"funn");

        college.add(s1);
        college.add(s2);
        college.add(s3);
        college.add(s4);

        System.out.println(college);

        /*
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

        TreeSet<Integer> header = (TreeSet<Integer>) ts1.headSet(45);
        System.out.println("Printing Header");
        System.out.println(header);
        TreeSet<Integer> trailer = (TreeSet<Integer>) ts1.tailSet(45);
        System.out.println("Printing trailer");
        System.out.println(trailer);
        System.out.println(ts1.first());
        System.out.println(ts1.last());
        */
        
    }
}

// class Student{
class Student implements Comparable {
    int rollNo;
    String name;

    public int compareTo(Object O){
        Student s = (Student) O;
        return this.rollNo - s.rollNo;
        // return name.compareTo(s.name) ;
    }

    public Student(int r, String n){
        this.rollNo = r;
        this.name = n;
    }
    public String toString(){
        return rollNo + "-->" + name + "\n";
    }
}

