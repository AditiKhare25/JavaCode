
package inheritance;
class a{
    int i;
    a(){
        i=10;
        System.out.println("constructor without args");
    }
    a(int x){
        i=x;
        System.out.println("constructor with args");
    }
}
class b extends a{
    int i ;
    b(){
        super();
        i=20;
        System.out.println("In b ");
    }
    void add(){
        System.out.println(i+super.i);
    }
}
public class Constructor {
    public static void main(String [] args){
        b ob=new b();
        ob.add();
    }
}
