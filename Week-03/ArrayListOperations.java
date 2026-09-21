// Demonstrating common operations on Java ArrayList:
// Adding, accessing, updating, removing, searching, and iterating elements

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {
    public static void main(String[] args) {
        // 1. Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // 2. Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15); // Add at index 1
        System.out.println("ArrayList after additions: " + list);

        // 3. Access elements (get)
        int firstElement = list.get(0);
        System.out.println("Element at index 0: " + firstElement);

        // 4. Update elements (set)
        list.set(2, 25);
        System.out.println("After updating index 2: " + list);

        // 5. Remove elements
        list.remove(Integer.valueOf(10)); // Remove by object
        list.remove(0);                  // Remove by index
        System.out.println("After removals: " + list);

        // 6. Check size and contains
        System.out.println("List size: " + list.size());
        System.out.println("Contains 30? " + list.contains(30));

        // 7. Sort the list
        list.add(5);
        list.add(45);
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // 8. Iterate over list
        System.out.print("Iterating elements: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

// Time Complexity: O(1) for get/set, O(N) for add/remove at index, O(N log N) for sort
// Space Complexity: O(N) where N is number of elements
