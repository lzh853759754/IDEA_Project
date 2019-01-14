package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/*反射可以：返回类的字节码对象*/
public class reflectionTest {
    public static void main(String[] args) throws Exception{
        Class ss=Class.forName("reflection.Student");
        Class ss1=Student.class;



//        System.out.println(ss.getName());//获取字节码对象包+名
//        System.out.println(ss.getSimpleName());//获取字节码对象名
//
//        Field[] fields=ss.getFields();//获取所有public修饰的成员变量
//        Field field=ss.getField("id");
//        System.out.println(field);
//        Field[] fields=ss.getDeclaredFields();
//        for (int i = 0; i < fields.length; i++) {
//            System.out.println(fields[i]);
//        }                                 //遍历获取所有属性字段名

//        Constructor constructor[] =ss.getConstructors();
//        for (int i = 0; i < constructor.length; i++) {
//            System.out.println(constructor);
//        }
//        Constructor constructor=ss.getConstructor(int.class,String.class,Integer.class);
//        System.out.println(constructor);
//        Constructor[] constructors=ss.getDeclaredConstructors();
//        for (int i = 0; i < constructors.length; i++) {
//            System.out.println(constructors[i]);
//        }

//        Method method=ss.getMethod("eat");
//        System.out.println(method.getName());
//        Method[] methods=ss.getDeclaredMethods();
//        for (int i = 0; i < methods.length; i++) {
//            System.out.println(methods[i]);
//        }

//        Method method=ss.getMethod("eat");
//        System.out.println(method);

//        Field field=ss.getField("name");
            Student student=new Student();
////        field.set(student,"zhangsan");
////        System.out.println(field.get(student));
//        Field[] fields=ss.getDeclaredFields();
//        Field field=ss.getDeclaredField("age");
//        field.setAccessible(true);
//        field.set(student,29);
//        System.out.println(field.get(student));
//        System.out.println(student);


    }

}
