import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        /******** 5 Numbers *********/
        /*
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
        */

        /********* Car Dealer *********/
        HashMap<String, String> dealer = new HashMap<String, String>();
        
        /****** Add model/makes to HashMap ******/
        // Honda
        dealer.put("Civic", "Honda");
        dealer.put("Accord", "Honda");
        dealer.put("CR-V", "Honda");

        // Nissan
        dealer.put("Rogue", "Nissan");
        dealer.put("Altima", "Nissan");
        dealer.put("Pathfinder", "Nissan");

        // Hyundai
        dealer.put("Sonata", "Hyundai");
        dealer.put("Tucson", "Hyundai");
        dealer.put("Elantra", "Hyundai");

        // Chevy
        dealer.put("Camaro", "Chevy");
        dealer.put("Corvette", "Chevy");
        dealer.put("Malibu", "Chevy");

        // Ford
        dealer.put("Mustang", "Ford");
        dealer.put("Explorer", "Ford");
        dealer.put("F-150", "Ford");
        /* ******************* */

        System.out.println("What model car are you looking for?");

        boolean notAvailable = true;

        // Loop until you find a model that is available
        while (notAvailable) {
            String model = input.nextLine();

            for (String modelName : dealer.keySet()) {  
                if (modelName.equals(model)) {
                    System.out.format("Oh, you're looking for a %s? Our %s selection is right over here...\n", modelName, dealer.get(model));
                    notAvailable = false;
                }
            }
            if (notAvailable) {
                System.out.println("Sorry, we do not have that model of car.\nMake sure to capitalize the name.\nWhat other models are you interested in?");
            }
        }

        input.close();
    }
}