package inheritance;//done
class ab{
   
        int i;
        ab(){
        i=10;
        System.out.println("In class ab: ");
        }
}
class ba extends ab{
    
        int j;
        ba(){
        j=25;
        System.out.println("In class ba: ");
    }
        void add(){
        System.out.println(i+j);
    }
}

public class AddVariable {
    public static void main(String[] args ){
    ba object =new ba();
    object.add();
}
}
