public class SuccesorWithDelete {
    
    private int[] S;

    public SuccesorWithDelete(int n){
        S = new int[n];
        for(int i = 0; i < n; i++) S[i] = i;
    }

    public void remove(int x){
        S[x] = -1;
    }

    public int succesor(int x){
        if(x + 1 < S.length) return S[x + 1];
        return x;
    }

    public void print(){
        for(int i = 0; i < S.length; i++) System.out.print(S[i] + " ");
        System.out.println();
    }
}
