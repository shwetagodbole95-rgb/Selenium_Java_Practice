package Java_Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();//maintains order, duplicates allowed, accessed using index

        names.add("Rahul");
        names.add("Priya");
        names.add("Amit");
        names.add("Sneha");
        names.add("Neha");

        /*System.out.println(names);
        //names.remove(1);
        names.addFirst("Nidhi");
        System.out.println(names);
        names.addLast("Saurabh");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Nidhi"));
        //names.clear();//it will delete all values
        System.out.println(names.contains(names.isEmpty()));
        System.out.println(names.set(1, "Sushant"));
        System.out.println(names);

        for (int i=0;i<names.size();i++)//for loop
        {
            System.out.println(names.get(i));
        }
        for(String name : names)//for each loop
        {
            System.out.println(name);
        }*/

        Iterator<String> itr = names.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        //Iterator is useful when traversing a collection and when you need to
        // remove elements safely during iteration using iterator.remove().


    }
}
