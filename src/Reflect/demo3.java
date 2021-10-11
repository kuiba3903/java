package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class demo3 {
    //    获取成员对象
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> c1 = Class.forName("Reflect.Student");
//       public Field[] getFields()throws SecurityException
//       返回一个包含Field对象的数组， Field对象反映由该Class对象表示的类或接口的所有可访问的公共字段。
        Field[] fs = c1.getFields();
//        输出:public 成员变量
        for (Field f : fs) {
            System.out.println(f);
        }
        System.out.println("---------------");
        Field[] dfs = c1.getDeclaredFields();
//        输出:public以及private 成员变量
        for (Field df : dfs) {
            System.out.println(df);
        }
        System.out.println("---------------");
//        获取成员变量
        Field address = c1.getField("address");
        Field name = c1.getDeclaredField("name");
        Field age = c1.getDeclaredField("age");
        Constructor<?> con = c1.getConstructor();
//        暴力使用，取消访问检查
        name.setAccessible(true);
        age.setAccessible(true);
//        创建实例对象
        Object obj = con.newInstance();
        name.set(obj, "张无忌");
        age.set(obj, 99);
//        给obj对象的address变量设置值
        address.set(obj, "昆仑山");
        System.out.println(obj);
        System.out.println("---------------");


    }
}
