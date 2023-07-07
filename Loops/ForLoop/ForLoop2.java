//take a number from user and print its factorial
package loops;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String [] args){
        int i,n,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        for (i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial is: "+fact);
    }
}
