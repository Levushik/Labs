import java.io.*;

public class Main {
    public static void main(String[] args){
        try(FileInputStream f = new FileInputStream("input.txt");
            FileOutputStream o = new FileOutputStream("output.txt")) {
            byte[] buffer = new byte[f.available()];
            f.read(buffer,0, buffer.length);
            o.write(buffer, 0, buffer.length);
        } catch (Exception e) {
            System.out.println("jh");
            throw new RuntimeException(e);

        }
    }
}