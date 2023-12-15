import java.io.RandomAccessFile;
import java.io.IOException;

class RandomAccess{
    public static void main(String[] args) {
        try{
            String filePath = args[0];
            RandomAccessFile rafile = new RandomAccessFile(filePath,"rw");

            byte [] data = new byte[(int) rafile.length()];
            rafile.read(data);

            System.out.println("The original content of file: "+ new String(data));
            
            // rafile.seek(0);
            // rafile.write("this is also ethign changed".getBytes());
            // rafile.write("this is sl nothing changed".getBytes());
            // rafile.seek(0);
            
            // data = new byte[(int) rafile.length()];
            // rafile.read(data);

            // System.out.println("The MOdified content of file: "+ new String(data));

            rafile.seek(rafile.length());
            rafile.write("this is also ethign changed".getBytes());
            rafile.write("this is sl nothing changed".getBytes());
            rafile.seek(0);
            
            data = new byte[(int) rafile.length()];
            rafile.read(data);

            System.out.println("The MOdified content of file: "+ new String(data));

        }catch(Exception e){
            System.out.println("An error occurred.");
        }
    }
}