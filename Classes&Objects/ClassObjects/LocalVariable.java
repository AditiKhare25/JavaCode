package classes.objects;
class host{
    int i=100; //global variable
    
    void display(){
       int i=200; //local variable
       System.out.println(i);
    }
    }
public class LocalVariable {
    public static void main(String[] args){
        host ob1=new host();
        ob1.display();
    }    
}
