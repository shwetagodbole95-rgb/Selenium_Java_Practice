package Java_Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();//maintains insertion order, removes duplicates
        numbers.add(10);
        numbers.add(80);
        numbers.add(60);
        numbers.add(60);
        numbers.add(10);
        System.out.println(numbers);
    }
}
