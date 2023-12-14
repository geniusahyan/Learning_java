import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    public String toString(){
        return "Roll No: " + rollNo + " Name: " + name;
    }

    public Student(){}
}

class ListInterface{
    static Student [] arr = new Student[7];
    static Student s;
    public static void main(String[] args) {
        // ArrayList <Student> tab1 = new ArrayList<Student>();
        LinkedList <Student> tab1 = new LinkedList<Student>();
        getData(arr);
        for(int i=0;i<arr.length;i++){
            tab1.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(tab1.get(i));
        }
        tab1.add(5,new Student(7,"some"));
        System.out.println(tab1);

        Iterator iter = tab1.iterator();
        System.out.println("Traversing with Iterator");

        while (iter.hasNext()){
            Student s = (Student) iter.next();
            System.out.println(s);
        }

        Student [] obj1 = new Student[5];
        Student [] obj2 = (Student []) tab1.toArray(obj1) ;

        if (obj1 == obj2) {
            System.out.println("both are same");
        }else{
            System.out.println("both are not same");
        }
        
        List<Student> subLi = tab1.subList(2, 5);
        ListIterator<Student> li = subLi.listIterator();
        System.out.println("Forward Tranversal of subList");
        
        while(li.hasNext()){
            Student s = li.next();
            System.out.println(s);
        }
        
        System.out.println("Backward Tranversal of subList");
        while(li.hasPrevious()){
            Student s = li.previous();
            if(s.rollNo == 4){
                li.remove();
            }
        }
        tab1.remove(3);
        System.out.println(subLi);
        

    }
    public static void getData(Student [] A){
        A[0] = new Student(1,"kena");
        A[1] = new Student(2,"gopi");
        A[2] = new Student(3,"suman");
        A[3] = new Student(4,"naman");
        A[4] = new Student(5,"something");
        A[5] = new Student(6,"unknown");
        A[6] = new Student(7,"another");
    }
}