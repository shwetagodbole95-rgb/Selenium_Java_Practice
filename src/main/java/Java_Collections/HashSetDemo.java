package Java_Collections;

import java.util.HashSet;

public class HashSetDemo
{
    /*public static void main(String[] args)
    {
        HashSet<String> names = new HashSet<>();//set allows unique values, no duplicates allowed, no guranteed order

        names.add("Rahul");
        names.add("Rahul");
        names.add("Amit");
        names.add("Rahul");

        System.out.println(names);
        System.out.println(names.size());
    }*/
    public static void main(String[] args)
    {
        HashSet<Integer> numbers = new HashSet<>();//no guranteed order
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);
    }

}

