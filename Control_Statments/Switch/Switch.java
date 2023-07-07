package pkgswitch;

import java.util.Scanner;

public class Switch {

    
    public static void main(String[] args) {
       int x;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter 1,2 or 3");
       x=sc.nextInt();
       switch(x){
           case 1:
            System.out.println("one");
            break;
            case 2:
                System.out.println("two");
                break;
            default :
                System.out.println("three");
    }
    }

    
    
}
