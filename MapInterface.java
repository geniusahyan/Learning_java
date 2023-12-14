import java.util.*;

class MapDemo{
    public static void main(String[] args){
        Student s1 = new Student(12,"some");
        Student s2 = new Student(13,"none");
        Student s3 = new Student(14,"anot");
        Student s4 = new Student(15,"funn");

        Map<Integer,Student> college = new HashMap<Integer,Student>();

        college.put(1,s1);
        college.put(2,s2);
        college.put(3,s3);
        college.put(4,s4);

        for(int i=1; i<college.size()+1; i++){
            // System.out.println(college.get(i));
            Student s;
            s = college.get(i+1);
            System.out.println(s);
        }
        System.out.println("All The kays are: "+ college.keySet());
        college.put(2, s3);
        System.out.println("All The values are: "+ college.values());
        Set<Map.Entry<Integer,Student>> entry_college = college.entrySet();

        Iterator<Map.Entry<Integer, Student>> iter = entry_college.iterator();

        while(iter.hasNext()){
            Map.Entry<Integer, Student> entry = iter.next();
            // Integer iKey = entry.getKey();
            // Student s = entry.getValue();
            // System.out.println(iKey + "--"+ s);

            System.out.println(entry);
        }
        System.out.println(college.isEmpty());
    }
}


class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    public Student(){}
    public String toString(){
        return rollNo + "->" + name + "\n";
    }
}
