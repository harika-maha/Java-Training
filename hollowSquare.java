import java.util.Scanner;

public class hollowSquare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int size = input.nextInt();
        // for (int i = 1; i <= size; i++) {
        //     System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 2; i <= size - 1; i++) {
        //     System.out.print("*");
        //     for (int j = 2; j <= size - 1; j++) {
        //         System.out.print(" ");
        //     }
        //     System.out.print("*");
        //     System.out.println();
        // }
        // for (int i = 1; i <= size; i++) {
        //     System.out.print("*");
        // }


        for(int i=0; i<size; i++){
            System.out.print("*");
        }
        for(int i=1; i<size; i++){
            // System.out.print("*");
            for (int j = 2; j <= size - 1; j++) {
                        System.out.print(" ");
                    }

                    for(int j = size; j>3; j--){
                        System.out.print("*");
                    }
            System.out.println();
        }

        for(int i=0; i<size; i++){
            System.out.print("*");
        }

    }
}