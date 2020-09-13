public class QuickUnionUF extends UnionFind{
    
    public QuickUnionUF(int N){
        super(N);
    }

    protected int root(int i){
        while(i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
