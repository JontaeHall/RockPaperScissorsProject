import java.util.Random;

// Backend
public class RockPaperScissor {
    public static final String[] computerChoices = {"Rock", "Paper", "Scissor"};

    // use to store the computer's choice so the value can be retrieved and displayed on the frontend
    private String computerChoice;

    public String getComputerChoice() {
        return computerChoice;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    // store the scores to be retrieved and displayed on the frontend
    private int computerScore, playerScore;
    // use to generate a random number to randomly choose an option for the computer
    private Random random;

    // constructor to initialize random
    public RockPaperScissor() {
        random = new Random();
    }

    // call this method to begin playing rock paper scissor
    // playerChoice is the choice made by the player
    // this method returns the result of the game
    public String playRockPaperScissor(String playerChoice) {
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        // will contain the returning message indicating the result of the game
        String result;

        // evaluate the winner
        //computer chose rock
        if (computerChoice.equals("Rock")) {
            if (playerChoice.equals("Paper")) {
                result = "Player Wins!";
                playerScore++;
            } else if (playerChoice.equals("Scissors")) {
                result = "Computer Wins!";
                computerScore++;
            } else {
                result = "Draw!";
            }
            // computer chose paper
        } else if (computerChoice.equals("Paper")) {
            if (playerChoice.equals("Scissors")) {
                result = "Player Wins!";
                playerScore++;
            } else if (playerChoice.equals("Rock")) {
                result = "Computer Wins!";
                computerScore++;
            } else {
                result = "Draw!";
            }
        } else {
            // computer chose scissors

            if (playerChoice.equals("Rock")) {
                result = "Player Wins!";
                playerScore++;
            } else if (playerChoice.equals("Paper")) {
                result = "Computer Wins!";
                computerScore++;
            } else {
                result = "Draw!";
            }
        }
        return result;
    }
}