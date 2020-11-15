package compare;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-15
 * Time: 18:37
 **/

class Card implements Comparable<Card>{
    public String suit;//花色
    public String rank;//点数

    public Card( String rank,String suit) {
        this.suit = suit;
        this.rank = rank;
    }


    @Override
    //重写equals需要考虑4个条件
    public boolean equals(Object obj) {
        //1、传入的对象是否为null
       if (obj == null){
           return false;
       }
       //2、传过来的对象和当前对象是否相等
        if (this == obj){
            return true;
        }
        //3、判断当前对象是不是Card类型
        if (!(obj instanceof Card)){
            return false;
        }
        //4、进行真正的比较
        Card tmp = (Card)obj;
        return this.rank.equals(tmp.rank) && this.suit.equals(tmp.suit);
    }

    @Override
    public int compareTo(Card o) {
        if (o == null){
            return 1;
        }
        int rank1 = this.getValue(rank);
        int rank2 = o.getValue(rank);

        return rank1-rank2;
    }
    private int getValue(String s){
        int value = 0;
        if ("J".equals(rank)){
            value = 11;
        }else if ("Q".equals(rank)){
            value = 12;
        }else if ("K".equals(rank)){
            value = 13;
        }else if ("A".equals(rank)){
            value = 14;
        }else {
            value = Integer.parseInt(rank);
        }
        return value;
    }
}
public class TestDemo {

    public static void main(String[] args) {
        Card p = new Card("3","♠");
        Card q = new Card("A","♠");
        Card r = p;
      /*  System.out.println(p == q);//false
        System.out.println(r == p);//true
        System.out.println("========================");
        System.out.println(q.equals(p));
        System.out.println(p.equals(r));*/
        System.out.println(p.compareTo(q));
        System.out.println(p.compareTo(r));
    }
}
