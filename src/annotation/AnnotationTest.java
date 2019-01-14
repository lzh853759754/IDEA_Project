package annotation;

public class AnnotationTest {
    public static void main(String[] args) {

        Compute("hell","dasda");
    }


    @MyAnnotation()
    public static void Compute(String str1,String str2){
        System.out.println(str1+str2);
    }
}
