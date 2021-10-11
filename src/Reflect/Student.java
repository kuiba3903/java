package Reflect;

public class Student {
    private String name;
    private int age;
    public String address;

    public Student() {
    }

    private Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void show() {
        System.out.println("私有方法:hello world!");
    }

    public void show1() {
        System.out.println("公共方法:hello world!");
    }

    private int show2(int x) {
        System.out.println("私有方法,你的输入是" + x);
        return x;
    }

    public String show3(String s) {
        System.out.println("公共方法,你的输入是" + s);
        return s;
    }

    private Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
