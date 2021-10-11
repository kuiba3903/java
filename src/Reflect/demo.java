package Reflect;

public class demo {
    //    获取Class类的对象
    public static void main(String[] args) throws ClassNotFoundException {
        //    使用类的class属性来获取该类对应的class对象
        Class<Student> c1 = Student.class;
//        输出:class Reflect.Student
        System.out.println(c1);

//        调用对象的getClass方法,返回该对象所属类的class对象
        Student s1 = new Student();
        Class<? extends Student> c2 = s1.getClass();
//        输出:class Reflect.Student
        System.out.println(c2);


//        使用class类中的静态方法forName(String className)获取class对象
        Class<?> c3 = Class.forName("Reflect.Student");
//        输出:class Reflect.Student
        System.out.println(c3);


    }


}
