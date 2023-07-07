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
   
public class referance {
    public static void main(String[] args){
    demo ob1=new demo();
    ob1.setij(30,40);
    demo sc1=new demo();
    sc1.setij(20, 70);
    ob1=sc1;
    ob1.add();
    sc1.add();
    
    
    
}
}