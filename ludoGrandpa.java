import java.util.Scanner;
import java.util.Arrays;

public class ludoGrandpa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the input array from the user
        System.out.print("Enter the array of cash and play cash: ");
        String[] inputArray = input.nextLine().split(" ");

        // Remove the play cash from the array
        String[] originalCashArray = new String[inputArray.length];
        int index = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (!inputArray[i].startsWith("-")) {
                originalCashArray[index] = inputArray[i];
                index++;
            }
        }
      //   originalCashArray = Arrays.copyOf(originalCashArray, index);

        // Print the original cash array
        System.out.println("The original cash array is:");
        System.out.println(Arrays.toString(originalCashArray));
    }
}
