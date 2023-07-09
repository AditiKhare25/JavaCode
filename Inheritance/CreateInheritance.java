package inheritance;//done 
class A{
    int i=1;
    void show(){
        System.out.println("In class A:");
        System.out.println(i+i);
    }
}
 class B extends A {
     void display(){
         System.out.println("In class B:");
     }
 }
public class CreateInheritance {

    public static void main(String[] args) {
        B ob=new B();
        ob.show();
        ob.display();
       
    }
    
}
