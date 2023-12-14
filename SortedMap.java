import java.util.*;


class SortedSet implements Comparable {
    public static void main(String[] args){
        SortedMap<Integer,String> sm = new TreeMap<>();
        Student s1 = new Student(12,"some");
        Student s2 = new Student(13,"none");
        Student s3 = new Student(14,"anot");
        Student s4 = new Student(15,"funn");

        // sm.put("some",1);
        // sm.put("nome",4);
        // sm.put("five",5);
        // sm.put("gone",3);
        // sm.put("funn",2);
        sm.put(s1,45);
        sm.put(s2,43);
        sm.put(s3,49);
        sm.put(s4,42);


        System.out.println(sm);
        // System.out.println("Tail Elements: "+ sm.tailMap("five"));
        // System.out.println("Head Elements: "+ sm.headMap("gone"));
    }
}