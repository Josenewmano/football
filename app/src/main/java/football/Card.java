package football;

public class Card {
  private String player;
  private int minute;
  private String colour;
  private String team;

  Card (String player, int minute, String colour, String team) {
    this.player = player;
    this.minute = minute;
    this.colour = colour;
    this.team = team;
  }

  public String getData() {
    return String.format("%d' %s [%s] (%s)\n", this.minute, this.player, this.team, this.colour);
  }

}

