package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filter {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张少云");
        list.add("风清扬");
        list.add("封魔");
        list.add("刘一庚");
        list.add("张丹");
//        filter:用于对数据流进行过滤
        list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);
        System.out.println("--------");
        list.stream().filter((s -> s.length() == 2)).forEach(System.out::println);
        System.out.println("---------");
//    limit:返回前指定参数个数据
        list.stream().limit(4).forEach(System.out::println);
        System.out.println("---------");
//        skip:跳过前指定参数个数据，返回剩余的数据
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("---------");
//        concat:合并两个流为一个流, 静态方法：由类调用
        Stream.concat(list.stream().limit(5), list.stream().skip(3)).forEach(System.out::println);
        System.out.println("---------");
//        distinct:返回由不同数据组成的流(去重)
        Stream.concat(list.stream().limit(5), list.stream().skip(3)).distinct().forEach(System.out::println);
        System.out.println("---------");


        ArrayList<String> arr = new ArrayList<>();
        arr.add("abcde");
        arr.add("bcdp");
        arr.add("yzpxlhgf");
        arr.add("albxstfjk");
        arr.add("cdpax");
//        sorted():无参构造方法，自然排序
        arr.stream().sorted().forEach(System.out::println);
        System.out.println("---------");
//        Stream<T> sorted(Comparator<? super T> comparator);
//        带参构造，重写比较器
//        匿名内部类书写比较器
//        arr.stream().sorted(new Comparator<>(){
//            @Override
//            public int compare(String x, String y) {
//                if(x.length()>y.length()){
//                    return 1;
//                }else if(x.length()==y.length()){
//                    return x.compareTo(y);
//                }
//                return -1;
//            }
//        }).forEach(System.out::println);
//        System.out.println("---------");

//        lambda表达式书写比较器
        arr.stream().sorted((s1, s2) ->
                s1.length() == s2.length() ? s1.compareTo(s2) : s1.length() - s2.length())
                .forEach(System.out::println);


        ArrayList<String> String_int = new ArrayList<>();
        String_int.add("20");
        String_int.add("30");
        String_int.add("10");
        String_int.add("90");
        String_int.add("60");

//        map:将函数作用于流中的元素组成的流
//        lambda表达式
//        String_int.stream().map(s->Integer.parseInt(s)).forEach(System.out::println);
//        引用类方法
        String_int.stream().map(Integer::parseInt).forEach(System.out::println);
        System.out.println("---------");
//        mapToInt:返回InputStream,有一个sum方法
        int result = String_int.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(result);
        System.out.println("---------");

//        终结操作：forEach:遍历流中的元素,count:统计个数
        System.out.println(list.stream().count());
        System.out.println(String_int.stream().count());
        System.out.println("---------");

//        流的收集操作:toList,toSet,toMap
        Stream<String> stringStream = list.stream().filter(s -> s.length() == 3);
        List<String> collect = stringStream.collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("---------");
    }
}
