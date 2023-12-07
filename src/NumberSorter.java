import java.util.Stack;

/**
 * @author Aayush Manandhar
 */

public class NumberSorter {
    void sort(int[] numbers) {
        sort(numbers, true);
    }

    void sort(int[] numbers, boolean ascending) {
        Stack<Integer> srcStack = new Stack<>();
        Stack<Integer> destStack = new Stack<>();

        for (int number : numbers)
            srcStack.push(number);

        while (!srcStack.isEmpty()) {
            int temp = srcStack.pop();
            while (!destStack.isEmpty() && ((ascending && destStack.peek() > temp) || (!ascending && destStack.peek() < temp))) {
                srcStack.push(destStack.pop());
            }
            destStack.push(temp);
        }

        int index = 0;
        while (!destStack.isEmpty()) {
            numbers[index++] = destStack.pop();
        }
    }
}

class Drivers {
    public static void main(String[] args) {
        NumberSorter sorter = new NumberSorter();

        int[] array1 = {1, 9, 2, 3, 10, 8, 12, 1, 99, 2, 43, 68, 109, 0};
        sorter.sort(array1);
        printArray("Ascending Order: ", array1);

        int[] array2 = {1, 2, 3, 4};
        sorter.sort(array2, false);
        printArray("Descending Order: ", array2);

        int[] array3 = {4, 3, 2, 1};
        sorter.sort(array3, true);
        printArray("Ascending Order: ", array3);
    }

    private static void printArray(String label, int[] arr) {
        System.out.print(label);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
