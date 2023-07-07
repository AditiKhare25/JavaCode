package classes.objects;

import java.util.Scanner;

class Account{
    int id;
    String name;
    int balance;
    Scanner sc=new Scanner(System.in);

    void createAccount(){
    System.out.println ("enter id:");
    id=sc.nextInt();
    System.out.println("enter name:");
    name=sc.next();
    System.out.println("enter balance:");
    balance=sc.nextInt();
}
    void deposite(){
    System.out.println("enter amount to be deposited:");
    int amount=sc.nextInt();
    balance=balance+amount;
}
    void withdraw(){
    System.out.println("enter amount to be withdrawn::");
    int amount=sc.nextInt();
    balance=balance-amount;
}
    void print(){
        System.out.println("***********************");
        System.out.println("id of customer :"+id);
        System.out.println("Name of customer :"+name);
        System.out.println("balance in account :"+balance);
        System.out.println("***********************");
    }
}
public class AccountClassObject {
    public static void main(String [] args){
        Account c1=new Account();
        c1.createAccount();
        Account c2=new Account();
        c2.createAccount();
        
        c1.deposite();
        c1.withdraw();
        c1.print();
        c2.withdraw();
        c2.deposite();
        c2.print();
        
        
    }
}
    

