package ifelse;

import java.util.Scanner;

public class Ifelse {

    public static void main(String[] args) {
        int side1;
        int side2;
        int side3;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter three sides of triangle:");
        side1=sc.nextInt();
        side2=sc.nextInt();
        side3=sc.nextInt();
        int c;
        c=side1+side2;
        if(c>side3){
            System.out.println("The triangle is valid!");
        }
        else{
            System.out.println("The triangle is not valid!");
        }
    }
    
}
