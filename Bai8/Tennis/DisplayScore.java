package Bai8.Tennis;

public class DisplayScore {

    public DisplayScore() {
    }

    public void getScore(Player player1,Player player2,int m_score1, int m_score2) {
        String score = "";
        int tempScore = 0;
        if (m_score1 == m_score2) {
            switch (m_score1) {
                case 0:
                    System.out.println("Love-All");
                    break;
                case 1:
                    System.out.println("Fifteen-All");
                    break;
                case 2:
                    System.out.println("Thirty-All");
                    break;
                case 3:
                    System.out.println("Forty-All");
                    break;
                default:
                    break;

            }
        } else if (m_score1 == 4 || m_score2 == 4) {
            int minusResult = m_score1 - m_score2;
            if (minusResult == 1) System.out.println("Advantage "+player1.getName());
            if (minusResult == -1) System.out.println("Advantage "+player2.getName());
            if (minusResult == 2) {
                System.out.println( "Win for "+player1.getName());
                System.exit(0);
            }
            if (minusResult == -2) {
                System.out.println("Win for "+player2.getName());
                System.exit(0);
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = m_score1;
                else {
                    score += "-";
                    tempScore = m_score2;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
            System.out.println(score);
        }

    }
}
