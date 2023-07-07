//take a number from user and print its table.
package loops;

import java.util.Scanner;

public class ForLoop1 {
    public static void main(String [] args){
        int i,n,b;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter number: ");
        n=sc.nextInt();
        for(i=1;i<=10;i++){
            b=n*i;
            System.out.println(b);
        }
    }
}
