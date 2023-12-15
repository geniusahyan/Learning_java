import java.io.*;
/*
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
} */
import java.util.*;


/*
class FileListing{
    public static void main(String[] args) {
        String dirName = args[0];
        File dir = new File(dirName);

        if (!dir.isDirectory()) {
            System.out.println(dir + " is not a directory");
            return;
        }

        // for (String f:dir.list()){
        //     System.out.println(f);
        // }

        File [] files = dir.listFiles();
        Date fileDate = new Date();

        for (File a_File:files){
            fileDate.setTime(a_File.lastModified());
            String content = a_File.isDirectory()?"<DIR>": " " + a_File.length();
            System.out.println(fileDate + "\t" + content + "\t" + a_File.getName());
        }
    }
} */

/*
class FileListing{
    public static void main(String[] args) {
        Date osm = new Date();
        System.out.println(osm);
    }
} */

class FileListing{
    public static void main(String[] args) {
        FilenameFilter only = new FilterExt("java");
        File myDir = new File("./");

        if (myDir.isDirectory()) {
            File[] files = myDir.listFiles(only);
            for (File a_File:files){
                System.out.println(a_File.getName());
            }
            System.out.println("Total: "+ files.length);
        }else{
            System.out.println(myDir + " is not a Directory");
        }
    }
}

class FilterExt implements FilenameFilter{
    String ext;
    public FilterExt(String ext){
        this.ext = ext;
    }
    public boolean accept(File dir, String name){
        return name.endsWith(ext);
    }
}