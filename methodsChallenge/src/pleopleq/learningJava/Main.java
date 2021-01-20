package pleopleq.learningJava;

public class Main {

    public static void main(String[] args) {
        int felixScore = calculateHighScorePosition(1500);
	    displayHighScorePosition("Felix", felixScore);

        int argelScore = calculateHighScorePosition(900);
        displayHighScorePosition("Argel", argelScore);

        int anduchoScore = calculateHighScorePosition(400);
        displayHighScorePosition("Anducho", anduchoScore);

        int puentesScore = calculateHighScorePosition(50);
        displayHighScorePosition("Puentes", puentesScore);
    }

    public static void displayHighScorePosition(String playerName, int scorePosition) {
        System.out.println(playerName + " managed to get into position " + scorePosition);
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if(playerScore >= 500) {
            return 2;
        } else if(playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
