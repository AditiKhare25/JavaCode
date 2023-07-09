package inheritance;//done
class C{
    int i;
    C(){
        i=10;
        System.out.println("in class A ");
    }
    void show(){
        System.out.println("in class B ");
   
    }
}
class  D extends C{
    int i;
    D(){
        i=20;
        System.out.println("In class B:");
    }
    void display (){
        System.out.println("In function show of B:");
    }
    void add(){
        System.out.println(i+super.i);
        show();
    }
}
public class superK {
    public static void main(String args[]){
        D ob=new D();
        ob.add();
        ob.display();
    }
    
}
