import java.util.TreeSet;

public class Treeset {

    public static void main(String []args){
        TreeSet  t=new TreeSet<>();//create empty TreeSet with default initial capacity is 16 & load factor .75%
        t.add(40);
        t.add(10);
        t.add(30);
        t.add(20);
        System.out.println(t);

        TreeSet  t1=new TreeSet<>();
        t1.add("osama");
        t1.add("osama");//duplicacy not allowed
        t1.add("aarifa");
        //t1.add(10);//CCE because its homogenous
        t1.add("rafu");
        //t1.add(null);  null pointer exceptions
        System.out.println(t1);
    }
}
