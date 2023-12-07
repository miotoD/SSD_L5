// Stats.java file
import java.util.Arrays;
 class Stats {
    int[] numbers; // declaring an array "number" of type int
    int count;   //declaring a variable "count" of type int

    public void addValue(int value) {
        numbers[count] = value;
        count++;
    }
    public int getCount() {
        return numbers.length;
    }
    public int getA() {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
        }
        return max;
    }
    public int getB() {int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        return min;
    }
    public int getTotal() {
        int total = 0;
// total all values within the array
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        } return total;
    }
    public double get() {
        int x = 0;
        for (int i = 0; i < numbers.length; i++) {
            x += numbers[i];
        }
        double y = x/(double)numbers.length;
        return y;
    }
    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
    public Stats(int capacity) {
        numbers = new int[capacity];
    }
 }



public class Lab3 {
    public static void main(String[] args) {
        Stats s = new Stats(10);
        s.addValue(2);
        s.addValue(4);
        s.getCount();
    }
}
