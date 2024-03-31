import java.util.Scanner;

public class FenwickTreeExample {
    private int[] bit;
    private int n;

    public FenwickTreeExample(int size) {
        n = size;
        bit = new int[n + 1];
    }

    public void update(int index, int delta) {
        // Fenwick Tree is 1-indexed
        index++;
        while (index <= n) {
            bit[index] += delta;
            index += index & -index;
        }
    }

    public int query(int index) {
        // Fenwick Tree is 1-indexed
        index++;
        int result = 0;
        while (index > 0) {
            result += bit[index];
            index -= index & -index;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array length from user
        System.out.print("Enter the length of the array: ");
        int size = scanner.nextInt();

        // Create FenwickTree instance
        FenwickTreeExample fenwickTree = new FenwickTreeExample(size);

        // Get array elements from user
        System.out.println("Enter the elements of the array:");
        for (int i = 1; i <= size; i++) {
            System.out.print("Element at index " + i + ": ");
            int element = scanner.nextInt();
            fenwickTree.update(i, element);
        }

        // Get range for queries from user
        System.out.print("Enter the range for queries (start index and end index separated by space): ");
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();

        // Query prefix sum within the specified range
        int prefixSumInRange = fenwickTree.query(endIndex) - fenwickTree.query(startIndex - 1);

        // Display result
        System.out.println("Prefix sum within the specified range: " + prefixSumInRange);

        // Close scanner
        scanner.close();
    }
}

