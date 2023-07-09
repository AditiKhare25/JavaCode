
package pkginterface;
interface a1{
    void add(int x,int y);
}
interface b1{
    public abstract void sub(int x,int y);
}

class demo1 implements a1,b1{

    @Override
    public void add(int x, int y) {
        System.out.println(x+y);
    }
    

    @Override
    public void sub(int x, int y) {
       System.out.println(x-y);
    }
    
}
public class MultipleInterface {
    public static void main(String [] args){
        demo1 ob=new demo1();
        ob.add(500, 200);
        ob.sub(80, 10);
    }
}
