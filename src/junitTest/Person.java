package junitTest;

public class Person {

    private int id;
    private String name;
    public String nickname;

    public Person(int id, String name, String nickname) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
    }

    public void eat(){
        System.out.println("this is eat method");
    }

    public String back(){
        return "hello back";
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
