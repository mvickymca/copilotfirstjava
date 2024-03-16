import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CopilotTest {

    public static void main(String[] args) {
        System.out.println("Hello, Copilot!");
        System.out.println(addTwoNumbers(2, 3));
        findDuplicateElements(new Integer[]{1,2,2, 3, 4, 5, 6, 7, 8, 9, 1});
    }

    private static int addTwoNumbers(int i, int i1) {
        return i + i1;
    }

    //Write a static method to identify the duplicate elements in an array it should call in main method
    public static <T> void findDuplicateElements(T[] arr) {
        Set<T> uniqueElements = new HashSet<>();
        System.out.println("Duplicate element : ");
        for (T element : arr) {
            if (!uniqueElements.add(element)) {
                System.out.print(" " + element);
            }
        }


    }
}
