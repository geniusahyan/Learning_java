import java.io.*;
class FileSys{
    public static void main(String[] args){
        File myFile = new File("./README.md");
        System.out.println("File name: "+ myFile.getName());
        System.out.println("Path name: "+ myFile.getPath());
        System.out.println("parent name: "+ myFile.getParent());
        System.out.println("File length: "+ myFile.length());
        System.out.println("File Modified: "+ myFile.lastModified());
        System.out.println("File Executable: "+ myFile.canExecute());
        System.out.println("File hascode: "+ myFile.hashCode());
        // System.out.println("File hascode: "+ myFile.compareTo(myFile));
        
        File f = new File("./someee.java");
        try{
            if (f.createNewFile()) {
                System.out.println("File is created");
            }else{
                System.out.println("File is not created");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}