package loops;

import java.util.Scanner;

public class ContinueKeyword {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=1;i<=5;i++){
            if(i==3){
                continue;  // used to skip that condition and execute rest of the program.
            }
            System.out.println(i);
        }
    }
}
