import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-13
 * Time: 11:11
 **/
//创建一个类来保存数对，因为要使用优先队列，所以要实现comparable接口，重写compareTo方法
class Pair implements Comparable<Pair>{
    public int n1;
    public int n2;
    public int sum;

    public Pair(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.sum = n1+n2;
    }

  @Override
    public int compareTo(Pair o) {
        return this.sum - o.sum;
    }
}
public class TestHeap {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        //判断参数的合法性
        if (nums1.length == 0 || nums2.length == 0 || k <= 0){
            return result;
        }
        //将所有的数据都放到优先队列中去
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                queue.offer(new Pair(nums1[i],nums2[j]));
            }
        }
        //取出前k小个元素，把它放进结果集里面
        for (int i = 0; i < k && !queue.isEmpty(); i++) {
            Pair cur = queue.poll();
            List<Integer> tmp = new ArrayList<>();
            tmp.add(cur.n1);
            tmp.add(cur.n1);
            result.add(tmp);
        }
        return result;

    }
}
