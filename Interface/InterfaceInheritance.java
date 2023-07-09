package pkginterface;

interface a2 {
    void add(int x, int y);
}

interface b2 extends a2 {
    public abstract void sub(int x, int y);
}

class demo2 implements b2 {

    @Override
    public void sub(int x, int y) {
        System.out.println(x - y);
    }

    @Override
    public void add(int x, int y) {
        System.out.println(x + y);
    }

}

public class InterfaceInheritance {

    public static void main(String[] args) {
        demo2 ob = new demo2();
        ob.add(100, 20);
        ob.sub(50, 21);
    }

}
