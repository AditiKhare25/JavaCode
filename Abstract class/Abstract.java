package pkgabstract;

abstract class A2 {
    void Show() {
        System.out.println("in A");
    }

    abstract void add(int x, int y);
    abstract void sub(int x, int y);
}
class B2 extends A2 {
    
    @Override
    void add(int x, int y) {
        System.out.println(x+y);
    }
    @Override
    void sub(int x, int y) {
      System.out.println(x-y);   
    }
}
    public class Abstract {

        public static void main(String[] args) {
             B2 ob=new B2();
             ob.add(2,5);
             ob.sub(8,5);
        }

    }
