import java.util.Collections;

public class App {
    static MagicSquare ms = new MagicSquare();

    public static void main(String[] args) throws Exception {
        // PART 5 :the sum that can be created with the greatest amount of combinations
        // is 66 with 1364 combinations.
        int arr[] = { 1, 14, 14, 4, 11, 7, 6, 9, 8, 10, 10, 5, 13, 2, 3, 15 };

        System.out.println("PART 1: " + ms.counter(ms.fourElementSum(ms.board)));
        System.out.println(
                "PART 2: " + "The sum 33 occurs " + ms.countall(ms.allSumsConstrained(arr, 0, 0)).get(33) + " times.");
        System.out.print("Part 3: ");
        for (int j = 0; j <= 132; j++) {
            System.out.println(
                    "The sum " + j + " occurs " + ms.countall(ms.allSumsConstrained(arr, 0,
                            0)).get(j)
                            + " times.");
        }
        System.out.println(
                "PART 4:the sum that can be created with the greatest amount of combinations is 66 with 1364 combinations.");

    }
}
