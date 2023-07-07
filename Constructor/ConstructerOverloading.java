package classes.objects;
class object{
    int i;
    int j;
    object(){
        i=80;
        j=40;
    }
    object(int x,int z){
        i=x;
        j=z;
    }
    object(int y){
        i=y;
    }
    void add(){
        System.out.println(i+j);
    }
    void display(){
        System.out.println(i);
    }
}
public class ConstructerOverloading {
    public static void main(String[] args){
    object ob1=new object();
    object ob2=new object(60,50);
   object ob3=new object(70);
   ob1.add();
   ob2.add();
   ob3.display();
}
}