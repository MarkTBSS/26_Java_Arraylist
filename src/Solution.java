//import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String mockInput = "5\n" +
                            "5 41 77 74 22 44\n" +
                            "1 12\n" +
                            "4 37 34 36 52\n" +
                            "0\n" +
                            "3 20 22 33\n" +
                            "5\n" +
                            "1 3\n" +
                            "3 4\n" +
                            "3 1\n" +
                            "4 3\n" +
                            "5 5";
        Scanner scanner = new Scanner(mockInput);
        int row = scanner.nextInt();
        int[][] myMatrix = new int[row][];
        for (int j = 0; j < row; j++) {
            int size = scanner.nextInt();
            myMatrix[j] = new int[size];
            for (int i = 0; i < size; i++) {
                myMatrix[j][i] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(myMatrix[j]));
        }
        int times = scanner.nextInt();
        for (int k = 0; k < times; k++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try {
                int value = myMatrix[x - 1][y - 1];
                System.out.println(value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}
