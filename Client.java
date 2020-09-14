public class Client {
    public static void main(String [] args){

        SuccesorWithDelete swd = new SuccesorWithDelete(6);
        swd.print();
        swd.remove(5);
        System.out.println(swd.succesor(6));

        QuickFindUF qf = new QuickFindUF(10);
        qf.print();
        qf.union(2, 3);
        qf.print();
        qf.union(3, 4);
        qf.print();

        WQuickUnionUF wqu = new WQuickUnionUF(10);
        System.out.println(wqu.find(1));
        wqu.union(1, 3);
        System.out.println(wqu.find(1));
        wqu.union(3, 5);
        System.out.println(wqu.find(1));
        System.out.println(wqu.find(3));
        wqu.union(5, 7);
        System.out.println(wqu.find(5));
        System.out.println(wqu.find(1));
        wqu.union(9, 1);
        System.out.println(wqu.find(1));
        
    }
}
