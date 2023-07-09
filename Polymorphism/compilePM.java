package polymorphism;
class demo{
    void add(int x,int y){
        System.out.println("int add function called..");
        System.out.println(x+y);
    }
    void add(float x,float y){
        System.out.println("float add is called..");
        System.out.println(x+y);
    }  //method overloading is a compile time polymorphism.
}
public class compilePM {
    public static void main(String [] args){
    demo obj=new demo();
    obj.add(1,7);
    obj.add(2.3f,7.9f);
    }
}
