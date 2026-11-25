package Java_Collections;

import java.util.HashMap;

public class HashMapDemo
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> students = new HashMap<>();

        students.put("Rahul", 90);
        students.put("Priya", 85);
        students.put("Amit", 95);

        System.out.println(students);
        System.out.println(students.get("Rahul"));
        System.out.println(students.containsKey("Priya"));
        students.put("Amit", 100);
        System.out.println(students);
        System.out.println(students.keySet());
        /*Duplicate keys are not allowed in a Map.
        Duplicate values are allowed.
        If you insert an existing key again, its old value gets replaced.
        */
    }
}
