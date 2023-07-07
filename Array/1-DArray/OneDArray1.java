package array;

import java.util.Scanner;

public class OneDArray1 {
    public static void main(String[] args){
       int i;
       Scanner sc=new Scanner(System.in);
       int [] arr=new int[3];
       System.out.println("enter your array:");
       for(i=0;i<3;i++){
           arr[i]=sc.nextInt();
       }
       System.out.println("your array will be:");
       for(i=0;i<3;i++){
           System.out.println(""+arr[i]);
       }
       System.out.print("thank u..!");
}
               
}             
