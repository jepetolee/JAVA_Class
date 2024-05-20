package May10th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileEncrypt {
    static byte[] key={10,20,30,40};
    static public void main(String[] args) throws Exception {

        FileInputStream is =  new FileInputStream("C:/Users/timet/PycharmProjects/JAVA_Class/May10th/text.txt");
        FileOutputStream os =  new FileOutputStream("encrypt.txt");

        byte[] data = new byte[1024];
        int read = is.read(data);
        int index = 0;
        while(read!=-1){
            for(int k=0;k<read;k++){
                data[k] ^= key[index%key.length];
                index++;
            }
            os.write(data,0,read);
            read = is.read(data);
        }
        os.flush();
        os.close();
        is.close();
    }
}
