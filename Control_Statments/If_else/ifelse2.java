
import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args){
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number:");
        n=sc.nextInt();
        
        if(n%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
        
   }
    
}
