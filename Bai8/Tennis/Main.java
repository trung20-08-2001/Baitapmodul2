package Bai8.Tennis;

public class Main {
    public static void main(String[] args) {
        DisplayScore displayScore=new DisplayScore();
        Player player1=new Player("A",0);
        Player player2=new Player("B",0);
        for(int i=0;i<4;i++) {
            player1.checkScores(player1, player2, true);
            displayScore.getScore(player1, player2, player1.getScore(), player2.getScore());
            player2.checkScores(player1, player2, true);
            displayScore.getScore(player1, player2, player1.getScore(), player2.getScore());
        }
    }
}
