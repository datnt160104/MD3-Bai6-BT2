package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Poin2D p2=new Poin2D();
        Poin3D p3 =new Poin3D();
        System.out.println(p2);
        System.out.println(p3);
        p2=new Poin2D(2,3);
        p3 =new Poin3D(1,2,3);
        System.out.println(p2);
        System.out.println(p3);
    }
}
