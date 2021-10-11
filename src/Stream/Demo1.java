package Stream;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
//        创建一个数组
        ArrayList<String> list = new ArrayList<>();
        list.add("张一鸣");
        list.add("张宝云");
        list.add("冯灿");
        list.add("张毅");
        list.add("李灿");
//        筛选姓张的人名
        ArrayList<String> a = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                a.add(s);
            }
        }
//        System.out.println(a);
//        筛选姓张的，三个字的人名
        ArrayList<String> arr = new ArrayList<>();
        for (String s : a) {
            if (s.length() == 3) {
                arr.add(s);
            }
        }
//        输出结果
        System.out.println(arr);
        System.out.println("------------");
//        使用Stream流操作
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
        Object[] sa = list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).toArray();
        for (Object x : sa) {
            System.out.println(x);
        }
    }
}
