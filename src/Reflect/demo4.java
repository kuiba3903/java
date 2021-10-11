package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class demo4 {
    //    获取成员方法
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c1 = Class.forName("Reflect.Student");
//public 方法[] getMethods()throws SecurityException
// 返回一个包含方法对象的数组， 方法对象反映由该Class对象表示的类或接口的所有公共方法，包括由类或接口声明的对象，以及从超类和超级接口继承的类。
        Method[] ms = c1.getMethods();
        for (Method m : ms) {
            System.out.println(m);
        }
        System.out.println("---------------");
//        输出:包括私有方法
        Method[] dms = c1.getDeclaredMethods();
        for (Method dm : dms) {
            System.out.println(dm);
        }
        System.out.println("---------------");

        Method show1 = c1.getMethod("show1");
        Method show3 = c1.getMethod("show3", String.class);

//        无参构造创建对象
        Constructor<?> con = c1.getConstructor();
        Object obj = con.newInstance();

        show1.invoke(obj);
        Object s = show3.invoke(obj, "公共方法传入参数");
        System.out.println(s);
        System.out.println("---------------");

        Method show = c1.getDeclaredMethod("show");
        Method show2 = c1.getDeclaredMethod("show2", int.class);

        show.setAccessible(true);
        show.invoke(obj);
        show2.setAccessible(true);
        Object show2_int = show2.invoke(obj, 100);
        System.out.println(show2_int);
        System.out.println("---------------");
    }
}
