
public class Sources {

    /** 三个字段分别表示A.B.C这三类资源 */
    public int A;
    public int B;
    public int C;

    public Sources() {
    }

    public Sources(int A,int B,int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    @Override
    public String toString() {
        return "Sources{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                '}';
    }
}
