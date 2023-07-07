
package classes.objects;
class Demo{
    int i;
    Demo(int i){
        this.i=i; //i=10
    }
    void show(){
        System.out.println(i);
    }
}
public class ThisKeyword {
    public static void main(String [] args){
        Demo ob1=new Demo(10);
        ob1.show();
    }
    
}
