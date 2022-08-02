package football;

import java.util.ArrayList;

public class Match {
  private int week;
  private int homeGoals;
  private int awayGoals;
  private String homeTeam;
  private String awayTeam;
  private ArrayList<Goal> goals;
  private ArrayList<Card> cards;
  private String[][] lineUps = new String[2][18];

  Match (int week, String[] teams, String[][] lineUps) {
    this.week = week;
    this.homeTeam = teams[0];
    this.awayTeam = teams[1];
    this.lineUps = lineUps;
    this.goals = new ArrayList<Goal>();
    this.homeGoals = 0;
    this.awayGoals = 0;
    this.cards = new ArrayList<Card>();
  }

  public int getWeek() {
    return this.week;
  }

  public String getHomeTeam() {
    return this.homeTeam;
  }

  public String getAwayTeam() {
    return this.awayTeam;
  }

  public String getScore() {
    return String.format("%s %d : %d %s\n", this.homeTeam, this.homeGoals, this.awayGoals, this.awayTeam);
  }

  public String getStats() {
    return String.format("The statistics for the match between %s and %s in Week %d:\n\n%s\n%s\n%s\n%s\n", this.homeTeam, this.awayTeam, this.week, getScore(), getGoalInfo(), getCardInfo(), getLineUpInfo());
  }

  private String getGoalInfo() {
    String goalInfo = "Goals:\n";
    for(Goal goal : this.goals) {
      goalInfo = goalInfo.concat(goal.getData());
    }
    return goalInfo;
  }
  
  private String getCardInfo() {
    String cardInfo = "Cards:\n";
    for(Card card : this.cards) {
      cardInfo = cardInfo.concat(card.getData());
    }
    return cardInfo;
  }

  private String getLineUpInfo() {
    return String.format("%s\n%s\n\n%s\n%s", this.homeTeam, getStartingAndSubs(this.lineUps[0]), this.awayTeam, getStartingAndSubs(this.lineUps[1]));
  }

  private String getStartingAndSubs(String[] squad) {
    String squadInfo = "";
    for(int i = 0; i < squad.length; i++) {
      squadInfo = squadInfo.concat(squad[i] + "\n");
      if(i == 10) {
        squadInfo = squadInfo.concat("Subs:\n");
      }
    }
    return squadInfo;
  }

  void addGoal(Goal goal) {
    this.goals.add(goal);
    if(goal.getData().contains(this.homeTeam)) {
      this.homeGoals ++;
    } else {
      this.awayGoals ++;
    }
  }

  void addCard(Card card) {
    this.cards.add(card);
  }

}
