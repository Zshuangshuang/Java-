
public class Sources {

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
        {
            //打印出资源信息
            return A+" "+B+" "+C;
        }
    }
}
