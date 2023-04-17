package dasturlash.uz;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String nickName;

    public Student(String name, String surname, int age, String nickName) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
