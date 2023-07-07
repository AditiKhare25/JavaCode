 package Salary;
import java.util.Scanner;

public class Elseif_Salary { 
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Double Salary,hra,da,total;
        System.out.println("enter the salary:");
        Salary=sc.nextDouble();
        
        if (Salary <= 10000)
            {
            hra=Salary*0.2;
            da=Salary*0.8;
            total=Salary+hra +da;
            System.out.println("Total salary of an employee is:"+total);
            }
            else if(Salary<=20000){
            hra=Salary*0.25;
            da=Salary*0.9;
            total=hra+da+Salary;
            System.out.println("Total salary of an employee is:"+total);
            }
            else {
                hra=Salary*0.3;
                da=Salary*0.95;
                total=Salary+hra+da;
                System.out.println("Total salary of an employee is:"+total);
                }
        
    }
    
}
