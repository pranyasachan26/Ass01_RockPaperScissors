import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        do {
            String playerA, playerB;

            // Get valid move for Player A
            playerA = getValidMove(input, "Player A");

            // Get valid move for Player B
            playerB = getValidMove(input, "Player B");

            // Display result
            displayWinner(playerA, playerB);

            // Ask to play again
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = input.nextLine().trim();

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
        input.close();
    }

    // Method to get valid move with error message
    public static String getValidMove(Scanner input, String playerName) {
        String move;
        while (true) {
            System.out.print(playerName + ", enter your move (R, P, or S): ");
            move = input.nextLine().trim();

            if (isValidMove(move)) {
                return move; // valid, exit loop
            } else {
                System.out.println("Invalid move! Please enter R, P, or S.");
            }
        }
    }

    // Check if move is valid
    public static boolean isValidMove(String move) {
        return move.equalsIgnoreCase("R") ||
                move.equalsIgnoreCase("P") ||
                move.equalsIgnoreCase("S");
    }

    // Determine and display winner
    public static void displayWinner(String a, String b) {
        a = a.toUpperCase();
        b = b.toUpperCase();

        if (a.equals(b)) {
            System.out.println(a + " vs " + b + " — It’s a tie!");
        } else if (a.equals("R") && b.equals("S")) {
            System.out.println("Rock breaks Scissors — Player A wins!");
        } else if (a.equals("S") && b.equals("P")) {
            System.out.println("Scissors cuts Paper — Player A wins!");
        } else if (a.equals("P") && b.equals("R")) {
            System.out.println("Paper covers Rock — Player A wins!");
        } else if (b.equals("R") && a.equals("S")) {
            System.out.println("Rock breaks Scissors — Player B wins!");
        } else if (b.equals("S") && a.equals("P")) {
            System.out.println("Scissors cuts Paper — Player B wins!");
        } else if (b.equals("P") && a.equals("R")) {
            System.out.println("Paper covers Rock — Player B wins!");
        }
    }
}
