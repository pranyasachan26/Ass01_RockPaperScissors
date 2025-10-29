import java.util.Scanner;

class RockPaperScissors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        do {
            String playerA, playerB;

            // Get valid move for Player A
            do {
                System.out.print("Player A, enter your move (R, P, or S): ");
                playerA = input.nextLine().trim();
            } while (!isValidMove(playerA));

            // Get valid move for Player B
            do {
                System.out.print("Player B, enter your move (R, P, or S): ");
                playerB = input.nextLine().trim();
            } while (!isValidMove(playerB));

            // Display result
            displayWinner(playerA, playerB);

            // Ask to play again
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = input.nextLine().trim();

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
        input.close();
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
