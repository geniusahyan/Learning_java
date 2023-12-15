import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.Serializable;

class Main{
    public static void main(String[] args) {

        try{
            Student s;
            FileInputStream fis = new FileInputStream(args[0]);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while(fis.available() > 0){
                s = (Student)ois.readObject();
                System.out.println(s);
            }
        }catch(Exception e){
            System.out.println("Error in deserialization: " + e.getMessage());
        }

        /*
        try {
            FileOutputStream fos = new FileOutputStream(args[0]);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Student s[] = new Student[5];
            s[0] = new Student(12, "some");
            s[1] = new Student(13, "nome");
            s[2] = new Student(14, "kaun");
            s[3] = new Student(15, "john");
            s[4] = new Student(16, "chor");

            for(int i=0; i<5;i++){
                oos.writeObject(s[i]);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        */
    }
}

class Student implements Serializable{
    int rollNo;
    String name;

    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString(){
        return "Roll No: "+rollNo+" Name: "+name;
    }
}