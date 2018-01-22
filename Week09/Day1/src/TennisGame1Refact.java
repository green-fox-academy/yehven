
public class TennisGame1Refact implements TennisGame {

  private int actualPointsOfPlayer1 = 0;
  private int actualPointsOfPlayer2 = 0;
  private String player1Name;
  private String player2Name;
  private String score = "";
  private int differenceBetweenPlayersScores = actualPointsOfPlayer1 - actualPointsOfPlayer2;

  public TennisGame1Refact(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public int wonPoint(String playerName) {
    if (playerName == "player1") {
      return actualPointsOfPlayer1 += 1;
    } else {
      return actualPointsOfPlayer2 += 1;
    }
  }

  public String getScore() {
    if (differenceBetweenPlayersScores == 0) {
      actualScoreIsEqual(actualPointsOfPlayer1);
    } else if (actualPointsOfPlayer1 >= 4 || actualPointsOfPlayer2 >= 4) {
      actualScoreIsAboveForty(differenceBetweenPlayersScores);
    } else {
      score = actualNonEqualScoreBelowForty(actualPointsOfPlayer1) + " - " + actualNonEqualScoreBelowForty(actualPointsOfPlayer2);
    }
    return score;
  }


  private void actualScoreIsEqual(int actualPointsOfPlayer1) {
    switch (actualPointsOfPlayer1) {
      case 0:
        score = "Love-All";
      case 1:
        score = "Fifteen-All";
      case 2:
        score = "Thirty-All";
      case 3:
        score = "Forty-All";
      default:
        score = "Deuce";
    }
  }

  private void actualScoreIsAboveForty(int differenceBeetweenPlayersScores) {
    if (differenceBeetweenPlayersScores == 1) {
      score = "Advantage player1";
    } else if (differenceBeetweenPlayersScores == -1) {
      score = "Advantage player2";
    } else if (differenceBeetweenPlayersScores == 2) {
      score = "Win for player1";
    } else {
      score = "Win for player2";
    }
  }

  private String actualNonEqualScoreBelowForty(int actualPointsOfAnyPlayer) {
    switch (actualPointsOfAnyPlayer) {
      case 0:
        score += "Love";
      case 1:
        score += "Fifteen";
      case 2:
        score += "Thirty";
      case 3:
        score += "Forty";
    } return score;
  }
}

