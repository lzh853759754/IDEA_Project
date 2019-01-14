package holiday.annoTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class AnnoTest {

    public static void main(String[] args)throws Exception {

        Class  person = Class.forName("holiday.annoTest.Person");
        Person p=new Person("小明","18","10086");
        ArrayList<String> field=new ArrayList<>();

        ArrayList<String> methods=new ArrayList<>();
        Field[] fields=person.getDeclaredFields();
        Constructor constructor2=person.getConstructor(String.class,String.class,String.class);
        Constructor constructor1=person.getConstructor();





    }
}
