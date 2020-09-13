public class Client {
    public static void main(String [] args){
        QuickFindUF qf = new QuickFindUF(10);
        //qf.print();
        //qf.union(2, 3);
        //qf.print();
        //qf.union(3, 4);
        //qf.print();

        WQuickUnionUF wqu = new WQuickUnionUF(10);
        wqu.print();
        wqu.union(5, 6);
        wqu.print();
        wqu.union(8, 9);
        wqu.print();
        wqu.union(7, 8);
        wqu.print();
        wqu.union(5, 7);
        wqu.print();
    }
}
