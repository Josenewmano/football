package football;

public class Goal {
  private String player;
  private int minute;
  private String team;

  Goal (String player, int minute, String team) {
    this.player = player;
    this.minute = minute;
    this.team = team;
  }

  public String getData() {
    return String.format("%d' %s [%s]\n", this.minute, this.player, this.team);
  }
}
