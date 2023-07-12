package assignments_java;

public class Stringfunctions {
    public static void main(String[] args){
         String s;
         s="Hello World";
         //1.length function
         int l;
         l = s.length();
         System.out.println(l);
         
         //2.charAt function
         char ch;
         ch=s.charAt(4);
         System.out.println(ch);
         
         //3.toCharArray function
         char arr[];
        arr = s.toCharArray();
         for(int i=0;i<s.length();i++){
         System.out.println(arr[i]);
         }
         //4.equals function
         String s1="Aditi_khare";
         String s2="aditi_khare";
         
         if(s1.equals(s2)){
             System.out.println("Equals");
         }
         else{
             System.out.println("Not equals");
         }
         
         //5.equalIgnorecase function
         if(s1.equalsIgnoreCase(s2)){
             System.out.println("Equals");
         }
         else{
             System.out.println("Not equals");
         }
         
         //6.Startswith function
         String a="Hello";
         System.out.println(a.startsWith("H"));
         System.out.println(a.startsWith("ell"));
         System.out.println(a.startsWith("Hell"));
         System.out.println(a.startsWith("l"));
         
         //7.concate function
         String k=s1+s2;
         System.out.println(k);
         
         //8.replace function
         String s3=s.replace("Hello","hii" );
          System.out.println(s3);
         
         //9.touppercase function
         String h=s.toUpperCase();
          System.out.println(h);
         
         //10.tolowercase function
         String p=s.toLowerCase();
          System.out.println(p);
         
         //11.getBytes.
         String p1= "rutuja";
         byte arr1[] =p1.getBytes();
         for(byte b:arr1){
             System.out.println(b);
         }
         //12.Indexof
         String m="hello java";
         int x=m.indexOf('l');
         System.out.println(x);
         
         while(true){
             x=m.indexOf('l',x+1);
              System.out.println(x);
              
              if(x==-1){
                  break;
              }
         }
         //13.LastIndexof
         x=m.lastIndexOf('l');
          System.out.println(x);
          
          //14.trim
          String n="   Computer science ";
          String n1=n.trim();
          System.out.println(n1);
    }
    }

