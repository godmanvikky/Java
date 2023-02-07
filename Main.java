import java.util.Arrays;
import java.util.ArrayList;
public class Main {
    static int count=0;
    int cc=0;
    public Main(){
        count++;
        this.cc++;
    }
    public static void main(String args[]){
        Main m = new Main();
        Main m1 =new Main();
        Main m2 = new Main();
        Employees e1= new Employees();
        e1.setAge(23);
        e1.setName("Vikky");
        Employees e2= new Employees();
        e2.setName("Vaishnav");
        e2.setAge(25);
        Employees e3= new Employees();
        e3.setAge(29);
        e3.setName("Sankar");
        Employees[] arrayOfEmployee={e1, e2, e3};
        int[] arr=new int[3];
        int index=0;
        while(index<arrayOfEmployee.length){
            System.out.println(arrayOfEmployee[index].getName());
            System.out.println(arrayOfEmployee[index].getAge());
            index++;
        }
        Object obj[] = {"123",1,e1};
        System.out.println(Arrays.toString(obj));
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(123);
        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        obj.
        System.out.println(random.contains(5.0f));
    }
}
class Employees{
    private String name;
    private static int numberOfEmployees=0;
    private int age;
    public Employees(){
        super();
        numberOfEmployees++;
    }
    public void setAge(int age){
        if(age>20) {
            this.age = age;
        }
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge() {
        return this.age;
    }
    public String getName(){
        return this.name;
    }
}
