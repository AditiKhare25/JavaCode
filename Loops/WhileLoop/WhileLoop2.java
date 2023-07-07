//print all even numbers from 1 to n
package loops;

import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String [] args){
        int i,n;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number:");
        n=sc.nextInt();
        i=1;
        while(i<=n){
          if(i%2==0){
               System.out.println(i); 
          }    i++;
        }    
    }
}
