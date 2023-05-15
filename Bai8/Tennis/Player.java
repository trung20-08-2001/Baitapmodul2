package Bai8.Tennis;

public class Player {
    private String name;
    private int score;
    private boolean isPlayerHitBall;

    public Player() {
    }

    public Player(String name,int score) {
        this.name = name;
        this.score=score;
    }

    public void checkScores(Player player1,Player player2,boolean isPlayerHitBall) {
        setPlayerHitBall(isPlayerHitBall);
        if(player1.isPlayerHitBall){
            int currentScoreOfPlay1=player1.getScore();
            player1.setScore(currentScoreOfPlay1+1);
        }else{
            int currentScoreOfPlay2=player2.getScore();
            player2.setScore(currentScoreOfPlay2+1);
        }
        if(player2.isPlayerHitBall){
            int currentScoreOfPlay2=player2.getScore();
            player2.setScore(currentScoreOfPlay2+1);
        }else{
            int currentScoreOfPlay1=player1.getScore();
            player1.setScore(currentScoreOfPlay1+1);
        }

    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isPlayerHitBall() {
        return isPlayerHitBall;
    }

    public void setPlayerHitBall(boolean playerHitBall) {
        isPlayerHitBall = playerHitBall;
    }
}
