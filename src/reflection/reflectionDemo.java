package reflection;

import junitTest.Person;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class reflectionDemo {

    public static void main(String[] args)throws Exception {
        String ClassName=null;
        String Method=null;
        Properties config=new Properties();
        ClassLoader classLoader=reflectionDemo.class.getClassLoader();
        // InputStream in=classLoader.getResourceAsStream("ClassConfig.properties");

        //config.load(in);
        //读取properties不一定要用classLoader.getresourceAsStream

        config.load(new FileReader("tt.properties"));
        ClassName=config.getProperty("Class");
        Method=config.getProperty("Method");

        Class test=Class.forName(ClassName);
        Object obj=test.newInstance();

        java.lang.reflect.Method method=test.getMethod(Method);
        method.invoke(obj);
    }
}
