public class WQuickUnionUF extends QuickUnionUF{
    
    private int[] sz;
    
    public WQuickUnionUF(int N){
        super(N);
        sz = new int[N];
        for(int i = 0; i < N; i++){
            sz[i] = 1;
        }
    }

    @Override
    public void union(int p, int q){
        int i = super.root(p);
        int j = super.root(q);

        if(i == j) return;
        if(sz[i] < sz[j]){ 
            id[i] = j;
            sz[j] += sz[i];
        }
        else{ 
            id[i] = j;
            sz[i] += sz[j]; 
        }
    }
}
