package loops;

import java.util.Scanner;

public class DoWhileLoop1 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        String choice;
        do{
            System.out.println("enter 2 numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            c=a+b;
            System.out.println("Addition is "+c);
            System.out.println("Do you want to continue? (yes or no)");
            choice= sc.next();
            System.out.println("enter 2 numbers");
        }while(choice.equals("yes"));
    }
}
