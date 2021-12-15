package sportFans;

import javafx.scene.image.ImageView;

public class NFLLogo {
    String Name;
    String Coach;
    ImageView NFLLogo;
    
 public NFLLogo (String Name, String Coach, ImageView NFLLogo) {
	 this.Name = Name;
	 this.Coach = Coach;
	 this.NFLLogo = NFLLogo;
 }
  public String getName() {
	  return this.Name;
  }
  public String getCoach() {
	  return this.Coach;
  }
  public ImageView getNFLLogo() {
	  return this.NFLLogo;
  }
  
}
