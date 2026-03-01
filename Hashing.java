import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String args[]){
        // creating
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);   // duplicate, will be ignored

        //size
        System.out.println("size of set is: " + set.size());
        System.out.println(set);

        //Search -contains
        if(set.contains(1)){
            System.out.println("set contains 1");

        }
        if(!set.contains(6)){
            System.out.println("does not contains ");
        }

        //Iterator
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //remove
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("doesnot contain 1 - deleted  ");
        }
    }
}