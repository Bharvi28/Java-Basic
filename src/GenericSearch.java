/*
Write a generic method searchElement that accepts a LinkedList<T> and an element T to search.
Return true if the element exists, otherwise false.
● Test with LinkedList<Integer> for roll numbers.
● Test with LinkedList<String> for names.
 */
import java.util.*;

public class GenericSearch {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        int searchRoll = 102;
        boolean foundRoll = searchElement(rollNumbers, searchRoll);

        System.out.println("Roll Number " + searchRoll + " found: " + foundRoll);

        LinkedList<String> names = new LinkedList<>();
        names.add("Rahul");
        names.add("Amit");
        names.add("Neha");

        String searchName = "Amit";
        boolean foundName = searchElement(names, searchName);

        System.out.println("Name \"" + searchName + "\" found: " + foundName);
    }
}
/*
Roll Number 102 found: true
Name "Amit" found: true

 */