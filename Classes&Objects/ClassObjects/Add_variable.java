package classes.objects;

class demo{
    int i;
    int j;
    void setij(int x,int y){
        i=x;
        j=y;
    }
    void add(){
        System.out.println(i+j);
    }
}
public class Add_variable{
    public static void main(String[] args){
        demo ob1=new demo();
        ob1.setij(10,20);
        demo ob2=new demo();
        ob2.setij(30,40);
        ob1.add();
        ob2.add();
    }
}