package sportFans;

public class NFLTeam {
  String Name;
  String Coach;
  public NFLTeam (String Name, String Coach) {
	  this.Name = Name;
	  this.Coach = Coach;
  }
  public String getName() {
	  return this.Name;
  }
  public String getCoach() {
	  return this.Coach;
  }
}
