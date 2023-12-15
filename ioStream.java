import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
class Main {
    public static void main(String[] args) throws IOException {
        try{
            File f = new File("./some/image.png");
        
            FileInputStream input = new FileInputStream(f);
            byte b[] = new byte[(int)f.length()];
            int numBytes = input.read(b);
            System.out.println("Data from File Read Successfully...");
            
            FileOutputStream output = new FileOutputStream("./some/output.png");
            output.write(b);
            System.out.println("Data from File Written Successfully...");
        }catch(IOException e){
            System.out.println(e);
        }
    }
} */

class Main{
    public static void main(String[] args) throws IOException {
        FileReader fin;
        FileWriter fout;
        int c;

        if(args.length !=2){
            System.out.println("Please provide 2 file");
            return;
        }
        try{
            fin = new FileReader(args[0]);
            fout = new FileWriter(args[1]);

            do{
                c = fin.read();
                if(c != -1){
                    fout.write(c);
                }
            } while(c != -1);

            System.out.println("File copied successfully");
            fin.close();
            fout.close();

        }catch(IOException e){
            System.out.println(e);
        }
    }
}
