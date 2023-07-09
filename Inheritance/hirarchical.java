package inheritance;

class student {

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

class mark extends student {

    private int m1;
    private int m2;

    public int getM1() {
        return m1;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }
}

class result1 extends mark {

    void CalcAvg() {
        float Avg= (getM1() + getM2()) / 2;
        System.out.println("avarage is:"+Avg);
    }
}
class person1{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Student extends person1{
    private int  StudId;

    public int getStudId() {
        return StudId;
    }

    public void setStudId(int StudId) {
        this.StudId = StudId;
    }
}
class clgstudent extends Student{
    private int year;
    private String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class hirarchical {

    public static void main(String[] args) {
        result1 ob = new result1();
        ob.setId(1);
        ob.setName("aditi");
        ob.setM1(100);
        ob.setM2(90);

        System.out.println(ob.getId());
        System.out.println(ob.getName());
        System.out.println(ob.getM1());
        System.out.println(ob.getM2());
        ob.CalcAvg();
    }
}
