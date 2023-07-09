
package pkginterface;
interface A1{
    void add(int x,int y);
    public abstract void sub(int a,int b);    
    
}
class demo implements A1{

    @Override
    public void add(int x, int y) {
     System.out.println(x+y);
    }

    @Override
    public void sub(int a, int b) {
         System.out.println(a-b);
    }
}
    public class Interface {
        public static void main(String[] args) {
        
            demo ob= new demo();
            ob.add(100, 200);
            ob.sub(90, 10);
            
            
            
    }
    
}
