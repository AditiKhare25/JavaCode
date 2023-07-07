package classes.objects;
class test{
    int i;
    int j;
    test(){// default constructor.
        i=20;
        j=30;  
    }
    test(int x,int y){   //constructor with args.
        i=x;
        j=y;
    }
    void add(){
        System.out.println(i+j);
    }
    }
public class ConstructorTypes {
    public static void main(String[] args){
        test obj1=new test();
        test obj2=new test(50,20);
        System.out.println("constructor without arguments called..!");
        obj1.add();
        System.out.println("constructor with arguments called..!");
        obj2.add();
    }
    
}
