package football;

import java.util.ArrayList;

public class League {
  private ArrayList<Match> listOfMatches = new ArrayList<Match>();

  public String getResultsForWeek(int week) {
    String resultsList = String.format("The results for Week %d:\n", week);
    for (Match match : listOfMatches) {
      if(match.getWeek() == week) {
        resultsList = resultsList.concat(match.getScore());
      }
    }
    return resultsList;
  }

  public String getMatchStats(int week, String homeTeam, String awayTeam) {
    for (Match match : listOfMatches) {
      if(match.getWeek() == week && match.getHomeTeam() == homeTeam && match.getAwayTeam() == awayTeam) {
        return match.getStats();
      }
    }
    return "We have no record of that match";
  }

  void addMatch(Match match) {
    listOfMatches.add(match);
  }
}
