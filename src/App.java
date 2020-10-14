import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> inputNumbers = new ArrayList<Integer>();

        boolean check = true;

        while (check) {
            System.out.println("Please enter 5 numbers (separated by a space):");
            String fiveNumStr = input.nextLine();
            String[] fiveNumStrArr = fiveNumStr.split(" ");
            for (int i = 0; i < fiveNumStrArr.length; i++) {
                Integer currInt = Integer.parseInt(fiveNumStrArr[i]);
                inputNumbers.add(currInt);
            }
            if (fiveNumStrArr.length > 5 || fiveNumStrArr.length < 5) {
                System.out.println("You did not enter 5 numbers.");
                inputNumbers.clear();
            } else {
                check = false;
            }
        }

        int firstElement = inputNumbers.get(0);

        int numSum = firstElement;
        int numProduct = firstElement;

        int highestNum = firstElement;
        int lowestNum = firstElement;

        int currNum;

        for (int i = 1; i < inputNumbers.size(); i++) {
            currNum = inputNumbers.get(i);
            numSum = numSum + currNum;
            numProduct = numProduct * currNum;
            if (highestNum < currNum) {
                highestNum = currNum;
            }
            if (lowestNum > currNum) {
                lowestNum = currNum;
            }
        }

        System.out.println("Sum: " + numSum);
        System.out.println("Product: " + numProduct);
        System.out.println("Highest Number: " + highestNum);
        System.out.println("Lowest Number: " + lowestNum);

        input.close();
    }
}
