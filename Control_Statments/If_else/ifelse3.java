
import java.util.Scanner;

public class ifelse3 {
    public static void main(String[] args){
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year:");
        year=sc.nextInt();
        
        if(year %4==0){
            System.out.println("This is the leap year");
        }
        else{
            System.out.println("This is not leap year");
        }
        
    }
    
}
