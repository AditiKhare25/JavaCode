
package encapsulation;
class student{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Encapsulation {

    public static void main(String[] args) {
       student st=new student();
       st.setId(100);
       st.setName("abc");
       int x;
       x=st.getId();
       String n=st.getName();
       System.out.println("id: "+x);
       System.out.println("Name: "+n);
       
    }
    
}
