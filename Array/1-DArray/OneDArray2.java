package array;

import java.util.Scanner;

public class OneDArray2 {
    public static void main(String[] args){
        int i;
        Scanner sc=new Scanner (System.in);
        int arr[]=new int[5];
        System.out.println("enter array of 5 :");
        for(i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("your choice :");
        for(i=0;i<5;i++){
            if(arr[i]%2==0){
               System.out.println(""+arr[i]); 
            }
            
            
        }
    }
    
}
