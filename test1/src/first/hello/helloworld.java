package first.hello;

import java.io.FileInputStream;
import java.io.IOException;

public class helloworld {
    public static void main(String[] args) throws IOException {
       FileInputStream fis = new FileInputStream("test1\\src\\f.txt");

       int len =fis.read();
        System.out.println(len);
        fis.close();
    }
}
