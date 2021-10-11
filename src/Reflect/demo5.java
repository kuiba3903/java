package Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class demo5 {
    //    反射可以越过泛型检查
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>();
//        list.add("110"); 无法添加字符串

//        利用反射给整型列表添加字符串
        Class<? extends ArrayList> c = list.getClass();
//        add的参数是Object对象,不受Integer限制
        Method add = c.getMethod("add", Object.class);
        add.invoke(list, "hell0");
        add.invoke(list, "world");
//        输出：[hell0, world]
        System.out.println(list);

    }
}
