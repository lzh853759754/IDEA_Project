package reflection;

import java.io.FileReader;
import java.util.Properties;

public class properties {
    public static void main(String[] args)throws Exception {
        Properties properties=new Properties();
        properties.load(new FileReader("tt.properties"));
    }
}
