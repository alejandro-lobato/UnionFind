public abstract class UnionFind {
    
    protected int[] id;
    
    public UnionFind(int N){
        id = new int[N];
        for(int i = 0; i < N; i++)
            id[i] = i;
    }

    public void print(){
        for(int i = 0; i < id.length; i++)
            System.out.print(id[i] + " ");
        System.out.println();
    }

}
