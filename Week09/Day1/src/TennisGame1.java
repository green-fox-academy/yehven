
public class TennisGame1 implements TennisGame {

  private int actualPointsOfPlayer1 = 0;
  private int actualPointsOfPlayer2 = 0;
  private String player1Name;
  private String player2Name;

  public TennisGame1(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public int wonPointByPlayer1(){
    return actualPointsOfPlayer1 += 1;
  }

  public int wonPointByPlayer2(){
    return actualPointsOfPlayer2 += 1;
  }

  public String getScore() {
    String score = "";
    int tempScore=0;
    if (actualPointsOfPlayer1 == actualPointsOfPlayer2)//egynelő állás
    {
      switch (actualPointsOfPlayer1)
      {
        case 0:
          score = "Love-All";
          break;
        case 1:
          score = "Fifteen-All";
          break;
        case 2:
          score = "Thirty-All";
          break;
        case 3:
          score = "Forty-All";
          break;
        default:
          score = "Deuce";
          break;

      }
    }
    else if (actualPointsOfPlayer1 >=4 || actualPointsOfPlayer2 >=4)//40+
    {
      int minusResult = actualPointsOfPlayer1 - actualPointsOfPlayer2;
      if (minusResult==1) score ="Advantage player1";
      else if (minusResult ==-1) score ="Advantage player2";
      else if (minusResult>=2) score = "Win for player1";
      else score ="Win for player2";
    }
    else
    {
      for (int i=1; i<3; i++)//nem egyenlő állás 40 alatt
      {
        if (i==1) tempScore = actualPointsOfPlayer1;
        else { score+="-"; tempScore = actualPointsOfPlayer2;}
        switch(tempScore)
        {
          case 0:
            score+="Love";
            break;
          case 1:
            score+="Fifteen";
            break;
          case 2:
            score+="Thirty";
            break;
          case 3:
            score+="Forty";
            break;
        }
      }
    }
    return score;
  }
}