package array;

import java.util.Scanner;

public class OneDArray3 {
    public static void main(String[] args){
        int i,sum;
        sum=0;
        Scanner sc=new Scanner (System.in);
        int arr[]=new int[5];
        System.out.println("enter array of 5 :");
        for(i=0;i<5;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Addition is : "+sum);
        
        }
    }
    

