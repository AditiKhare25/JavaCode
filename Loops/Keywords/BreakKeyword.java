
package loops;

import java.util.Scanner;

public class BreakKeyword {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=1;i<=5;i++){
            if(i==3){
                break; //used to stop the execution at that condition.
            }
            System.out.println(i);
        }
    }
}
