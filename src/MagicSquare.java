import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MagicSquare {
    public ArrayList<Integer> board = new ArrayList<>(
            Arrays.asList(1, 14, 14, 4, 11, 7, 6, 9, 8, 10, 10, 5, 13, 2, 3, 15));

    public ArrayList<ArrayList<Integer>> fourElementSum(ArrayList<Integer> board) {

        ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            for (int j = i + 1; j < 14; j++) {
                for (int k = j + 1; k < 15; k++) {
                    for (int l = k + 1; l < 16; l++) {
                        int sum = board.get(i) + board.get(j) + board.get(k) + board.get(l);
                        if (sum == 33) {
                            ArrayList<Integer> correctFourElements = new ArrayList<>();
                            Collections.addAll(correctFourElements, board.get(i), board.get(j), board.get(k),
                                    board.get(l));
                            finalList.add(correctFourElements);
                        }

                    }
                }
            }
        }
        return finalList;
    }

    public int counter(ArrayList<ArrayList<Integer>> list) {
        return list.size();
    }

    public ArrayList<Integer> allSumsConstrained(int[] list, int offset, int sum) {
        ArrayList<Integer> allsums = new ArrayList<>(list.length - offset);
        for (int i = offset; i < list.length; i++) {
            int total = sum + list[i];
            allsums.add(total);
            allsums.addAll(allSumsConstrained(list, i + 1, total));
        }
        return allsums;
    }

    public ArrayList<Integer> countall(ArrayList<Integer> list) {
        ArrayList<Integer> finalList = new ArrayList<>();
        int counter = 0;
        for (int j = 0; j <= 132; j++) {

            for (int i : list) {

                if (i == j) {
                    counter++;

                }

            }

            finalList.add(counter);
            counter = 0;
        }
        finalList.set(0, 1);
        return finalList;
    }
}
