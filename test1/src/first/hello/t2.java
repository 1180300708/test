package P1;

import java.io.FileInputStream;
import java.io.IOException;

public class t2 {
    public static void main(String[] args) throws IOException {
        isLegalMagicSquare("test1\\src\\f.txt");
    }

    public static void isLegalMagicSquare(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        //int len =fis.read();
        //System.out.println(len);
        fis.close();
    }

}
