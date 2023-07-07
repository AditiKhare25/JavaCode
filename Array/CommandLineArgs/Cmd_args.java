package array;
public class Cmd_args {
    public static void main(String[] args){
        if(args.length==2){
            System.out.println(args[0]);
            System.out.println(args[1]);
        }
        else{
            System.out.println("please enter two values");
        }
    }
}
