import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        System.out.println(maxAbsoluteVal(input));
    }

    /**
     * Returns the largest absolute value in the array of numbers.
     *
     * @param numbers the input array of String integer numbers
     * @return the maximum integer absolute value in the array
     */
    public static int maxAbsoluteVal(String[] numbers) {
        List<String> numbersList = Arrays.asList(numbers);
        return numbersList.stream().mapToInt(strNum -> Integer.parseInt(strNum)).map(num -> Math.abs(num)).max().getAsInt();
    }
}
//    Create a method called maxAbsoluteVal that takes a single parameter called numbers of type String[].
//    It should return an int that is the max absolute value in the input array.