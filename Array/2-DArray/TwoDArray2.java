package array;

import java.util.Scanner;

public class TwoDArray2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j;
        int [][]arr1=new int[3][3];
        int [][]arr2=new int[3][3];
        int [][]arr3=new int[3][3];
        
        System.out.println("Enter first matrix :");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter second matrix:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                arr3[i][j]=arr1[i][j]+ arr2[i][j];
               System.out.print("  "+arr3[i][j]);
            }
        System.out.println();
    }

    }
}


   