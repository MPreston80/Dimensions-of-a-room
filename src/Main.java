import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        String userContinue = "";
        boolean keepGoing = true;

        while(keepGoing) {

            System.out.println("Please enter the length of the room:");
            float roomLength = scan1.nextFloat();

            System.out.println("Please enter the width of the room:");
            float roomWidth = scan1.nextFloat();

            float roomArea = roomLength * roomWidth;
            float roomPerim = (roomLength * 2) + (roomWidth * 2);

            System.out.println("The area of the room is: " + roomArea);
            System.out.println("The perimeter of the room is: " + roomPerim);

            System.out.println("Continue? (y/n)");
            userContinue = scan1.next();
            if ((userContinue.charAt(0) == 'n') || (userContinue.charAt(0) == 'N')) {
                keepGoing = false;
            }
            else if ((userContinue.charAt(0) != 'y') && (userContinue.charAt(0) != 'Y')){
                System.out.print("Invalid entry!");
                keepGoing = false;
            }
        }

     return;
    }
}
