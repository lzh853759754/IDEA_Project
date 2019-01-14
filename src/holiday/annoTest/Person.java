package holiday.annoTest;

public class Person {
    private String name;
    private String age;
    public String id;

    public Person(String name, String age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String sum(String str1,String str2,String str3){
        return str1+"+"+str2+"+"+str3;

    }
}
