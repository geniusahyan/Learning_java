package Lambda;

import java.util.function.Consumer;

class Student{
    private String name;
    public Student(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public static void main(String[] args) {
        Student s = new Student("some");
        Consumer<Student> updateName = (p)->p.setName("shreya");
        System.out.println(s.getName());
        updateName.accept(s);
        System.out.println(s.getName());
    }
}
