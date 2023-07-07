
package classes.objects;
class demo{
    int i; //instance variable
    static int j; //static variable
    demo(){
        i++;
        j++;
    }
    void show(){
       System.out.println(i);
       System.out.println(j);
    }
}
public class VariableTypes {
    public static void main(String [] args){
        demo ob1=new demo();
        demo ob2=new demo();
        demo ob3=new demo();
        
        ob1.show();
        ob2.show();
        ob3.show();
    }
}
