package testing;

import java.util.Scanner;

public class elseif_marks {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      Double m1,m2,m3,m4,m5,p;
      System.out.println("enter 5 subjects marks");
      m1=sc.nextDouble();
      m2=sc.nextDouble();
      m3=sc.nextDouble();
      m4=sc.nextDouble();
      m5=sc.nextDouble();
      p=(m1+m2+m3+m4+m5)/5;
      
if(p>=90){
    System.out.println("Grade A");
}
else if(p>=80){
    System.out.println("Grade B");
}
else if(p>=70){
    System.out.println("Grade C");
}
else if(p>=60){
    System.out.println("Grade D");
}
else if(p>=40){
    System.out.println("Grade E");
}
else{
    System.out.println("Grade F");
}
    }
}