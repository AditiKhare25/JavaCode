package stringbuffer;

import static java.lang.System.out;


public class StringB {
    public static void main(String[] args) {
      
        StringBuffer sb= new StringBuffer("hello world");
        System.out.println(sb.length());
        
        //get capacity of stringbuffer
        System.out.println(sb.capacity());
        
          //setcharAt
       System.out.println(sb);
        sb.setCharAt(0, 'i');
       System.out.println(sb);
        
       //append : add data to the end of stringbuffer object 
       System.out.println(sb);
       sb.append("hii");
       sb.append(1.2f);
       System.out.println(sb);
       
       //delete
       sb.delete(1,7);
       System.out.println(sb);
       
       //reverse
       sb.reverse();
       System.out.println(sb);
       
       //convert sb to string
       String y=sb.toString();
       System.out.println(y);
       
     
    }
}