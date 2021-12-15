package sportFans;


import javafx.scene.image.ImageView;

public class NBALogo {
	String name;
	String coach;
	ImageView logo;
	
	public NBALogo (String name, String coach, ImageView logo) {
		this.name = name;
		this.coach = coach;
		this.logo = logo;
	}
	public ImageView getLogo() {
		return this.logo;
	}
	public String getCoach() {
		return this.coach;
	}
	public String getName() {
		return this.name;
	}
		
		
	}
