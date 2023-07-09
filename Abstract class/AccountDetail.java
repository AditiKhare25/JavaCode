package pkgabstract;
abstract class Account{
    void getcustinfo(){
        System.out.println("get customer information");
    }
    abstract void calculateInterest();
}
class saving extends Account{

    @Override
    void calculateInterest() {
        System.out.println("calculate interest of saving");
        
    } 
}
class loan extends Account{

    @Override
    void calculateInterest() {
    System.out.println("calculate interest of loan");
    }
    
}
public class AccountDetail {
    public static void main(String[] args ){
        
        saving ob1=new saving();
        ob1.getcustinfo();
        ob1.calculateInterest();
        
        loan ob2=new loan();
        ob2.getcustinfo();
        ob2.calculateInterest();
    }
    
}
