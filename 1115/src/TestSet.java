import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-15
 * Time: 19:24
 **/
public class TestSet {

    public static void main(String[] args) {
        //1、实例化set
        Set<String> set = new HashSet<>();
        //2、插入元素
        set.add("hello");
        set.add("java");
        //3、判断某个值是否存在
        System.out.println(set.contains("java"));
        /*//4、删除
        System.out.println(set.remove("java"));*/
        /*for (String s:set) {
            System.out.print(s+"  ");
        }*/
        System.out.println(set);
        //迭代器的泛型参数类型要与实际泛型参数类型一致
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

    }
}
