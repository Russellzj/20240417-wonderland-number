import java.util.*;
public class Main {
    public static void main(String[] args) {
        int startValue = 100_000;
        int endValue = 1_000_000_000/6;
        //int wonderNumber = 0;
        List<Integer> wonderNumbers = new ArrayList<>();
        boolean isWonder = true;
        for (int i = startValue; i <= endValue; i++) {
            isWonder = true;

            for (int j = 2; j < 7; j++) {
                int multi = i * j;
                List<Integer> currentValue = intToArray(i);
                List<Integer> multiArray = intToArray(multi);
                for (int x : currentValue) {
                    if (!multiArray.remove((Integer) x)) {
                        isWonder = false;
                        break;
                    }
                }
                if (!isWonder) {
                    break;
                }
            }

            if (isWonder) {
                wonderNumbers.add(i);
            }

        } System.out.println(wonderNumbers);

    }


    private static List<Integer> intToArray(int n) {
        String temp = Integer.toString(n);
        List<Integer> intArray = new ArrayList<Integer>();

        for (char c : temp.toCharArray()) {
            intArray.add(c - '0');
        }

        return intArray;
    }
}