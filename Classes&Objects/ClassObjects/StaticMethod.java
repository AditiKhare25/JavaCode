
package test;
class demo1{
    int i;
    static int j;
    demo1(){
        i++;
        j++;
    }
    static void disp(){
       System.out.println("hello");
    }
    static void show(){
       System.out.println(j);
       disp();
    }
}
public class StaticMethod {
    public static void main(String [] args){
        demo1 ob1=new demo1();
        demo1 ob2=new demo1();
        demo1 ob3=new demo1();
        demo1.show();
    }
}
