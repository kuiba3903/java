package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class demo2 {
    //    获取构造方法
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
//        获取对象
        Class<?> c1 = Class.forName("Reflect.Student");
//      public Constructor<T> getConstructor(Class<?>... parameterTypes)
//                    throws NoSuchMethodException,SecurityException
//      返回一个Constructor对象，该对象反映由此Class对象表示的类的指定公共构造函数。
        Constructor<?>[] cons = c1.getConstructors();
//        输出:public 构造方法;private 构造方法无法访问
        for (Constructor con : cons) {
            System.out.println(con);
        }
        System.out.println("---------------");
//        public Constructor<?>[] getDeclaredConstructors()throws SecurityException
//        返回一个Constructor对象的数组，反映由该Class对象表示的类声明的所有构造函数。
        Constructor<?>[] declaredcons = c1.getDeclaredConstructors();
//        输出:public 构造方法 以及 private 构造方法
        for (Constructor dcon : declaredcons) {
            System.out.println(dcon);
        }
        System.out.println("---------------");

//        反射生成Student类对象
//        Constructor<?> con = c1.getConstructor();
//        Object obj = c1.newInstance();//分开写,显示newInstance已弃用;
        Object obj = c1.getConstructor().newInstance();
        System.out.println(obj);


//        getConstructor传入的参数是构造函数的参数类型的class类型
        Object obj2 = c1.getConstructor(String.class, int.class).newInstance("风清扬", 33);
        System.out.println(obj2);


//        暴力反射,使用private构造方法生成实例对象
        Constructor<?> dcon = c1.getDeclaredConstructor(String.class);
        dcon.setAccessible(true);
        Object obj4 = dcon.newInstance("张一鸣");
        System.out.println(obj4);

    }
}
