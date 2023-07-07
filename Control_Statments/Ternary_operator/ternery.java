package pkgswitch;
import java.util.Scanner;
    public class ternery {
        public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int a,b,max;
        System.out.println("enter two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        max=a>b?a:b;  //ternery operator
        System.out.println("max value is : " +max);
    
}
}
