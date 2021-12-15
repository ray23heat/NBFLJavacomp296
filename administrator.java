package administrator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class administrator extends Application{
	double width = 300;
	double height = 300;
	Connection connect = null;
	Statement statement = null;
	public void start(Stage primaryStage) {	
		try {
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/nbfl", "root", "");
			statement = connect.createStatement();
			
		}catch (Exception e) {
			e.printStackTrace();
			
	}	
		BorderPane pane  = new BorderPane();
		HBox paneForLabelTextField = new HBox(10);
		HBox paneForLabelTextField2 = new HBox(10);
		VBox paneForlbTextField = new VBox(10);
		Scene scene1 = new Scene(pane);
		
	
	    
		//scene2//
		BorderPane borderPane = new BorderPane();
		VBox paneForMessage = new VBox(10);
		VBox paneForNBALogo = new VBox(10);
		VBox paneForNFLLogo = new VBox(10);
		HBox paneForLeague = new HBox(10);
		Scene scene2 = new Scene(borderPane);
	
		//sceneNBALeague//
		BorderPane bpNBALeague = new BorderPane();
		VBox paneForNBATeamHC = new VBox(10);
		VBox paneForNBAScheduleGames = new VBox(10);
		VBox paneForNBAStandings = new VBox(10);
		HBox paneForNBALeague = new HBox(10);
		ScrollPane scrollBarNBATHC = new ScrollPane();
		Scene sceneNBA = new Scene(bpNBALeague);
		
		//SceneNBAScheduleGames//
		BorderPane bpNBAGames = new BorderPane();
		HBox paneForNBARB = new HBox();
		VBox paneForNBASG = new VBox(10);
		VBox paneForNBASG2 = new VBox(10);
		VBox paneForNBASG3 = new VBox(10);
		VBox paneForNBASG4 = new VBox(10);
		VBox paneForNBASG5 = new VBox(10);
		VBox paneForNBASG6 = new VBox(10);
		VBox paneForNBASG7 = new VBox(10);
		VBox paneForNBASG8 = new VBox(10);
		VBox paneForNBASG9 = new VBox(10);
		VBox paneForNBASchedule = new VBox(10);
		VBox paneForNBASchedule2 = new VBox(10);
		VBox paneForNBASchedule3 = new VBox(10);
		VBox paneForNBASchedule4 = new VBox(10);
		VBox paneForNBASchedule5 = new VBox(10);
		VBox paneForNBASchedule6 = new VBox(10);
		VBox paneForNBASchedule7 = new VBox(10);
		VBox paneForNBASchedule8 = new VBox(10);
		VBox paneForNBASchedule9 = new VBox(10);
		HBox paneForNBAGames = new HBox(10);
		HBox paneForNBASButton = new HBox(10);
		ScrollPane spNBASchedule = new ScrollPane();
		Scene sceneNBASG = new Scene(bpNBAGames);
		
		//NBAStandings// 
		BorderPane NBAStandings = new BorderPane();
		VBox paneForNBAECStandings = new VBox(10);
		VBox paneForNBAECStandings2 = new VBox(10);
		VBox paneForNBAECStandings3 = new VBox(10);
		VBox paneForNBAECStandings4 = new VBox(10);
		VBox paneForNBAECStandings5 = new VBox(10);
		VBox paneForNBAECStandings6 = new VBox(10);
		VBox paneForNBAECStandings7 = new VBox(10);
		VBox paneForNBAECStandings8 = new VBox(10);
		VBox paneForNBAECStandings9 = new VBox(10);
		VBox paneForNBAECS = new VBox(10);
		VBox paneForNBAECS2 = new VBox(10);
		VBox paneForNBAECS3 = new VBox(10);
		VBox paneForNBAECS4 = new VBox(10);
		VBox paneForNBAECS5 = new VBox(10);
		VBox paneForNBAECS6 = new VBox(10);
		VBox paneForNBAECS7 = new VBox(10);
		VBox paneForNBAECS8 = new VBox(10);
		VBox paneForNBAECS9 = new VBox(10);
		VBox paneForNBAEC = new VBox(10);
		HBox paneForNBAEClogo = new HBox(10);
		HBox paneForNBAEasternConference = new HBox(10);
		VBox paneForNBAWCStandings = new VBox(10);
		VBox paneForNBAWCStandings2 = new VBox(10);
		VBox paneForNBAWCStandings3 = new VBox(10);
		VBox paneForNBAWCStandings4 = new VBox(10);
		VBox paneForNBAWCStandings5 = new VBox(10);
		VBox paneForNBAWCStandings6 = new VBox(10);
		VBox paneForNBAWCStandings7 = new VBox(10);
		VBox paneForNBAWCStandings8 = new VBox(10);
		VBox paneForNBAWCStandings9 = new VBox(10);
		VBox paneForNBAWCS = new VBox(10);
		VBox paneForNBAWCS2 = new VBox(10);
		VBox paneForNBAWCS3 = new VBox(10);
		VBox paneForNBAWCS4 = new VBox(10);
		VBox paneForNBAWCS5 = new VBox(10);
		VBox paneForNBAWCS6 = new VBox(10);
		VBox paneForNBAWCS7 = new VBox(10);
		VBox paneForNBAWCS8 = new VBox(10);
		VBox paneForNBAWCS9 = new VBox(10);
		HBox paneForNBAWesternConference = new HBox(10);
		VBox paneForNBAWC = new VBox(10);
		HBox paneForNBAWCLogo = new HBox(10);
		VBox paneForNBAWCS1 = new VBox(10);		
		HBox paneForNBASButton1 = new HBox(10);
		ScrollPane spNBAStandings = new ScrollPane();
	    Scene sceneNBAStandings = new Scene(NBAStandings);
	  
	    
	   // NFLLeague//
		BorderPane bpNFLLeague = new BorderPane();
		VBox paneForNFLTHC = new VBox(10);
		VBox paneForNFLSchedule = new VBox(10);
		VBox paneForNFLStandings = new VBox(10);
		HBox paneForNFLLeague = new HBox(10);
		ScrollPane spNFLTeam = new ScrollPane();
		Scene NFLLeague = new Scene(bpNFLLeague);
		
		//NFLSchedule//
		BorderPane bpNFLSchedule = new BorderPane();
		VBox paneForNFLgames = new VBox(10);
		VBox paneForNFLgames2 = new VBox(10);
		VBox paneForNFLgames3 = new VBox(10);
		VBox paneForNFLgames4 = new VBox(10);
		VBox paneForNFLgames5 = new VBox(10);
		VBox paneForNFLgames6 = new VBox(10);
		VBox paneForNFLgames7 = new VBox(10);
		VBox paneForNFLgames8 = new VBox(10);
		VBox paneForNFLgames9 = new VBox(10);
		VBox paneForNFLSG = new VBox(10);
		VBox paneForNFLSG2 = new VBox(10);
		VBox paneForNFLSG3 = new VBox(10);
		VBox paneForNFLSG4 = new VBox(10);
		VBox paneForNFLSG5 = new VBox(10);
		VBox paneForNFLSG6 = new VBox(10);
		VBox paneForNFLSG7 = new VBox(10);
		VBox paneForNFLSG8 = new VBox(10); 
		VBox paneForNFLSG9 = new VBox(10);
		HBox paneForNFLSG1 = new HBox(10);
		HBox paneForNFLSButton2 = new HBox(10);
		ScrollPane spNFLSchedule = new ScrollPane();
		Scene sceneNFLSG = new Scene(bpNFLSchedule);
		
		//NFLStandings//
		BorderPane bpNFLStandings = new BorderPane();
		VBox paneForNFLNFC = new VBox(10);
		VBox paneForNFLNFC2 = new VBox(10);
		VBox paneForNFLNFC3 = new VBox(10);
		VBox paneForNFLNFC4 = new VBox(10);
		VBox paneForNFLNFC5 = new VBox(10);
		VBox paneForNFLNFC6 = new VBox(10);
		VBox paneForNFLNFC7 = new VBox(10);
		VBox paneForNFLNFC8 = new VBox(10);
		VBox paneForNFLNFC9 = new VBox(10);
		VBox paneForNFLNFC10 = new VBox(10);
		VBox paneForNFLNFCS = new VBox(10);
		VBox paneForNFLNFCS2 = new VBox(10);
		VBox paneForNFLNFCS3 = new VBox(10);
		VBox paneForNFLNFCS4 = new VBox(10);
		VBox paneForNFLNFCS5 = new VBox(10);
		VBox paneForNFLNFCS6 = new VBox(10);
		VBox paneForNFLNFCS7 = new VBox(10);
		VBox paneForNFLNFCS8 = new VBox(10);
		VBox paneForNFLNFCS9 = new VBox(10);
		VBox paneForNFLNFCS10 = new VBox(10);
		HBox paneForNFLNFCStandings = new HBox(10);
		VBox paneForNFLNFCS1 = new VBox(10);
		HBox paneForNFLNFCLogo = new HBox(10);
		VBox paneForNFLAFC = new VBox(10);
		VBox paneForNFLAFC2 = new VBox(10);
		VBox paneForNFLAFC3 = new VBox(10);
		VBox paneForNFLAFC4 = new VBox(10);
		VBox paneForNFLAFC5 = new VBox(10);
		VBox paneForNFLAFC6 = new VBox(10);
		VBox paneForNFLAFC7 = new VBox(10);
		VBox paneForNFLAFC8 = new VBox(10);
		VBox paneForNFLAFC9 = new VBox(10);
		VBox paneForNFLAFC10 = new VBox(10);
		VBox paneForNFLAFCS = new VBox(10);
		VBox paneForNFLAFCS2 = new VBox(10);
		VBox paneForNFLAFCS3 = new VBox(10);
		VBox paneForNFLAFCS4 = new VBox(10);
		VBox paneForNFLAFCS5 = new VBox(10);
		VBox paneForNFLAFCS6 = new VBox(10);
		VBox paneForNFLAFCS7 = new VBox(10);
		VBox paneForNFLAFCS8 = new VBox(10);
		VBox paneForNFLAFCS9 = new VBox(10);
		VBox paneForNFLAFCS10 = new VBox(10);
		HBox paneForNFLAFCS1 = new HBox(10);
		VBox paneForNFLAFCStandings = new VBox(10);
		HBox paneForNFLAFCLogo = new HBox(10);
		VBox paneForNFLS = new VBox(10);
		HBox paneForNFLSButton3 = new HBox(10);
		ScrollPane spNFLStandings = new ScrollPane();
		Scene sceneNFLStandings = new Scene(bpNFLStandings);
		
	     
		//SceneLogout//
		BorderPane bpLogout = new BorderPane();
		Scene sceneLogout = new Scene(bpLogout);
	
		  Image imageNBATeam1 = new Image("hawkslogo1.jpg");
	        ImageView imageViewNBATeam1 = new ImageView(imageNBATeam1);
	        imageViewNBATeam1.setFitHeight(30);
	        imageViewNBATeam1.setFitWidth(30);
	        Image imageNBATeam2 = new Image("celticslogo2.jpg");
	        ImageView imageViewNBATeam2 = new ImageView(imageNBATeam2);
	        imageViewNBATeam2.setFitHeight(30);
	        imageViewNBATeam2.setFitWidth(30);  
	        Image imageNBATeam3 = new Image("netslogo3.jpg");
	        ImageView imageViewNBATeam3 = new ImageView(imageNBATeam3);
	        imageViewNBATeam3.setFitHeight(30);
	        imageViewNBATeam3.setFitWidth(30);
	        Image imageNBATeam4 = new Image("hornetslogo4.jpg");
	        ImageView imageViewNBATeam4 = new ImageView(imageNBATeam4);
	        imageViewNBATeam4.setFitHeight(30);
	        imageViewNBATeam4.setFitWidth(30);
	        Image imageNBATeam5 = new Image("bullslogo5.jpg");
	        ImageView imageViewNBATeam5 = new ImageView(imageNBATeam5);
	        imageViewNBATeam5.setFitHeight(30);
	        imageViewNBATeam5.setFitWidth(30);
	        Image imageNBATeam6 = new Image("cavslogo6.jpg");
	        ImageView imageViewNBATeam6 = new ImageView(imageNBATeam6);
	        imageViewNBATeam6.setFitHeight(30);
	        imageViewNBATeam6.setFitWidth(30);
	        Image imageNBATeam7 = new Image("mavslogo7.jpg");
	        ImageView imageViewNBATeam7 = new ImageView(imageNBATeam7);
	        imageViewNBATeam7.setFitHeight(30);
	        imageViewNBATeam7.setFitWidth(30);
	        Image imageNBATeam8 = new Image("nuggetslogo8.png");
	        ImageView imageViewNBATeam8 = new ImageView(imageNBATeam8);
	        imageViewNBATeam8.setFitHeight(30);
	        imageViewNBATeam8.setFitWidth(30);
	        Image imageNBATeam9 = new Image("pistonslogo9.png");
	        ImageView imageViewNBATeam9 = new ImageView(imageNBATeam9);
	        imageViewNBATeam9.setFitHeight(30);
	        imageViewNBATeam9.setFitWidth(30);
	        Image imageNBATeam10 = new Image("warriorslogo10.png");
	        ImageView imageViewNBATeam10 = new ImageView(imageNBATeam10);
	        imageViewNBATeam10.setFitHeight(30);
	        imageViewNBATeam10.setFitWidth(30);
	        Image imageNBATeam11 = new Image("rocketslogo11.jpg");
	        ImageView imageViewNBATeam11 = new ImageView(imageNBATeam11);
	        imageViewNBATeam11.setFitHeight(30);
	        imageViewNBATeam11.setFitWidth(30);
	        Image imageNBATeam12 = new Image("pacerslogo12.jpg");
	        ImageView imageViewNBATeam12 = new ImageView(imageNBATeam12);
	        imageViewNBATeam12.setFitHeight(30);
	        imageViewNBATeam12.setFitWidth(30);
	        Image imageNBATeam13 = new Image("clipperslogo13.png");
	        ImageView imageViewNBATeam13 = new ImageView(imageNBATeam13);
	        imageViewNBATeam13.setFitHeight(30);
	        imageViewNBATeam13.setFitWidth(30);
	        Image imageNBATeam14 = new Image("Lakerslogo14.png");
	        ImageView imageViewNBATeam14 = new ImageView(imageNBATeam14);
	        imageViewNBATeam14.setFitHeight(30);
	        imageViewNBATeam14.setFitWidth(30);
	        Image imageNBATeam15 = new Image("grizzlieslogo15.png");
	        ImageView imageViewNBATeam15 = new ImageView(imageNBATeam15);
	        imageViewNBATeam15.setFitHeight(30);
	        imageViewNBATeam15.setFitWidth(30);
	        Image imageNBATeam16 = new Image("heatlogo16.jpg");
	        ImageView imageViewNBATeam16 = new ImageView(imageNBATeam16);
	        imageViewNBATeam16.setFitHeight(30);
	        imageViewNBATeam16.setFitWidth(30);
	        Image imageNBATeam17 = new Image("buckslogo17.jpg");
	        ImageView imageViewNBATeam17 = new ImageView(imageNBATeam17);
	        imageViewNBATeam17.setFitHeight(30);
	        imageViewNBATeam17.setFitWidth(30);
	        Image imageNBATeam18 = new Image("timberwolveslogo18.jpg");
	        ImageView imageViewNBATeam18 = new ImageView(imageNBATeam18);
	        imageViewNBATeam18.setFitHeight(30);
	        imageViewNBATeam18.setFitWidth(30);
	        Image imageNBATeam19 = new Image("pelicanslogo19.jpg");
	        ImageView imageViewNBATeam19 = new ImageView(imageNBATeam19);
	        imageViewNBATeam19.setFitHeight(30);
	        imageViewNBATeam19.setFitWidth(30);
	        Image imageNBATeam20 = new Image("knickslogo20.jpg");
	        ImageView imageViewNBATeam20 = new ImageView(imageNBATeam20);
	        imageViewNBATeam20.setFitHeight(30);
	        imageViewNBATeam20.setFitWidth(30);
	        Image imageNBATeam21 = new Image("okclogo21.jpg");
	        ImageView imageViewNBATeam21 = new ImageView(imageNBATeam21);
	        imageViewNBATeam21.setFitHeight(30);
	        imageViewNBATeam21.setFitWidth(30);
	        Image imageNBATeam22 = new Image("magiclogo22.jpg");
	        ImageView imageViewNBATeam22 = new ImageView(imageNBATeam22);
	        imageViewNBATeam22.setFitHeight(30);
	        imageViewNBATeam22.setFitWidth(30);
	        Image imageNBATeam23 = new Image("76erslogo23.jpg");
	        ImageView imageViewNBATeam23 = new ImageView(imageNBATeam23);
	        imageViewNBATeam23.setFitHeight(30);
	        imageViewNBATeam23.setFitWidth(30);
	        Image imageNBATeam24 = new Image("sunslogo24.png");
	        ImageView imageViewNBATeam24 = new ImageView(imageNBATeam24);
	        imageViewNBATeam24.setFitHeight(30);
	        imageViewNBATeam24.setFitWidth(30);
	        Image imageNBATeam25 = new Image("blazerslogo25.jpg");
	        ImageView imageViewNBATeam25 = new ImageView(imageNBATeam25);
	        imageViewNBATeam25.setFitHeight(30);
	        imageViewNBATeam25.setFitWidth(30);
	        Image imageNBATeam26 = new Image("kingslogo26.png");
	        ImageView imageViewNBATeam26 = new ImageView(imageNBATeam26);
	        imageViewNBATeam26.setFitHeight(30);
	        imageViewNBATeam26.setFitWidth(30);
	        Image imageNBATeam27 = new Image("spurslogo27.jpg");
	        ImageView imageViewNBATeam27 = new ImageView(imageNBATeam27);
	        imageViewNBATeam27.setFitHeight(30);
	        imageViewNBATeam27.setFitWidth(30);
	        Image imageNBATeam28 = new Image("raptorslogo28.jpg");
	        ImageView imageViewNBATeam28 = new ImageView(imageNBATeam28);
	        imageViewNBATeam28.setFitHeight(30);
	        imageViewNBATeam28.setFitWidth(30);
	        Image imageNBATeam29 = new Image("jazzlogo29.png");
	        ImageView imageViewNBATeam29 = new ImageView(imageNBATeam29);
	        imageViewNBATeam29.setFitHeight(30);
	        imageViewNBATeam29.setFitWidth(30);
	        Image imageNBATeam30 = new Image("wizardslogo30.png");
	        ImageView imageViewNBATeam30 = new ImageView(imageNBATeam30);
	        imageViewNBATeam30.setFitHeight(30);
	        imageViewNBATeam30.setFitWidth(30);
	        
			ArrayList<NBATeam> NBA30Teams = new ArrayList<NBATeam>();
			
			ArrayList<NBALogo> NBA30Logos = new ArrayList<NBALogo>();
			NBA30Logos.add ( new NBALogo("Atlanta Hawks","Nate McMillan", imageViewNBATeam1));
			NBA30Logos.add(new NBALogo("Boston Celtics", "Ime Udoka", imageViewNBATeam2));
			NBA30Logos.add ( new NBALogo("Brooklyn Nets", "Steve Nash", imageViewNBATeam3));
			NBA30Logos.add(new NBALogo("Charlotte Hornets", "James Borrego", imageViewNBATeam4));
			NBA30Logos.add ( new NBALogo("Chicago Bulls", "Billy Donovan", imageViewNBATeam5));
			NBA30Logos.add(new NBALogo("Cleveland Cavaliers", "JB Bickerstaff", imageViewNBATeam6));
			NBA30Logos.add ( new NBALogo("Dallas Mavericks", "Jason Kidd", imageViewNBATeam7));
			NBA30Logos.add(new NBALogo("Denver Nuggets", "Michael Malone", imageViewNBATeam8));
			NBA30Logos.add ( new NBALogo("Detroit Pistons", "Dwane Casey", imageViewNBATeam9));
			NBA30Logos.add(new NBALogo("Golden State Warriors", "Steve Kerr", imageViewNBATeam10));
			NBA30Logos.add ( new NBALogo("Houston Rockets", "Stephen Silas", imageViewNBATeam11));
			NBA30Logos.add(new NBALogo("Indiana Pacers", "Rick Carlisle", imageViewNBATeam12));
			NBA30Logos.add ( new NBALogo("Los Angeles Clippers", "Tyronn Lue", imageViewNBATeam13));
			NBA30Logos.add(new NBALogo("Los Angeles Lakers", "Frank Vogel", imageViewNBATeam14));
			NBA30Logos.add ( new NBALogo("Memphis Grizzlies", "Taylor Jenkins", imageViewNBATeam15));
			NBA30Logos.add(new NBALogo("Miami Heat", "Erik Spoelstra", imageViewNBATeam16));
			NBA30Logos.add ( new NBALogo("Milwaukee Bucks", "Mike Budenholzers", imageViewNBATeam17));
			NBA30Logos.add(new NBALogo("Minnesota Timberwolves", "Chris Finch", imageViewNBATeam18));
			NBA30Logos.add ( new NBALogo("New Orleans Pelicans", "Willie Green", imageViewNBATeam19));
			NBA30Logos.add(new NBALogo("New York Knicks", "Tom Thibodeau", imageViewNBATeam20));
			NBA30Logos.add ( new NBALogo("Oklahoma City Thunders", "Mark Daigneault", imageViewNBATeam21));
			NBA30Logos.add(new NBALogo("Orlando Magic", "Jamahl Mosley", imageViewNBATeam22));
			NBA30Logos.add ( new NBALogo("Philadelphia 76ers", "Doc Rivers", imageViewNBATeam23));
			NBA30Logos.add(new NBALogo("Phoenix Suns", "Monty Williams", imageViewNBATeam24));
			NBA30Logos.add ( new NBALogo("Portland Trail Blazers", "Chauncey Billups", imageViewNBATeam25));
			NBA30Logos.add(new NBALogo("Sacramento Kings", "Luke Walton", imageViewNBATeam26));
			NBA30Logos.add ( new NBALogo("San Antonio Spurs", "Gregg Popovich", imageViewNBATeam27));
			NBA30Logos.add(new NBALogo("Toronto Raptors", "Nick Nurse", imageViewNBATeam28));
			NBA30Logos.add ( new NBALogo("Utah Jazz", "Quin Snyder", imageViewNBATeam29));
			NBA30Logos.add(new NBALogo("Washington Wizards", "Wes Unseld Jr", imageViewNBATeam30));
		
		    Image imageNFLTeam1 = new Image("cardinalslogo1.jpg");
	        ImageView imageViewNFLTeam1 = new ImageView(imageNFLTeam1);
	        imageViewNFLTeam1.setFitHeight(30);
	        imageViewNFLTeam1.setFitWidth(30);
	        Image imageNFLTeam2 = new Image("falconslogo2.jpeg");
	        ImageView imageViewNFLTeam2 = new ImageView(imageNFLTeam2);
	        imageViewNFLTeam2.setFitHeight(30);
	        imageViewNFLTeam2.setFitWidth(30);  
	        Image imageNFLTeam3 = new Image("ravenslogo3.jpg");
	        ImageView imageViewNFLTeam3 = new ImageView(imageNFLTeam3);
	        imageViewNFLTeam3.setFitHeight(30);
	        imageViewNFLTeam3.setFitWidth(30);
	        Image imageNFLTeam4 = new Image("billslogo4.jpg");
	        ImageView imageViewNFLTeam4 = new ImageView(imageNFLTeam4);
	        imageViewNFLTeam4.setFitHeight(30);
	        imageViewNFLTeam4.setFitWidth(30);
	        Image imageNFLTeam5 = new Image("pantherslogo5.jpg");
	        ImageView imageViewNFLTeam5 = new ImageView(imageNFLTeam5);
	        imageViewNFLTeam5.setFitHeight(30);
	        imageViewNFLTeam5.setFitWidth(30);
	        Image imageNFLTeam6 = new Image("bearslogo6.jpg");
	        ImageView imageViewNFLTeam6 = new ImageView(imageNFLTeam6);
	        imageViewNFLTeam6.setFitHeight(30);
	        imageViewNFLTeam6.setFitWidth(30);
	        Image imageNFLTeam7 = new Image("bengalslogo7.jpg");
	        ImageView imageViewNFLTeam7 = new ImageView(imageNFLTeam7);
	        imageViewNFLTeam7.setFitHeight(30);
	        imageViewNFLTeam7.setFitWidth(30);
	        Image imageNFLTeam8 = new Image("brownslogo8.gif");
	        ImageView imageViewNFLTeam8 = new ImageView(imageNFLTeam8);
	        imageViewNFLTeam8.setFitHeight(30);
	        imageViewNFLTeam8.setFitWidth(30);
	        Image imageNFLTeam9 = new Image("cowboyslogo9.jpg");
	        ImageView imageViewNFLTeam9 = new ImageView(imageNFLTeam9);
	        imageViewNFLTeam9.setFitHeight(30);
	        imageViewNFLTeam9.setFitWidth(30);
	        Image imageNFLTeam10 = new Image("broncoslogo10.jpg");
	        ImageView imageViewNFLTeam10 = new ImageView(imageNFLTeam10);
	        imageViewNFLTeam10.setFitHeight(30);
	        imageViewNFLTeam10.setFitWidth(30);
	        Image imageNFLTeam11 = new Image("lionslogo11.jpg");
	        ImageView imageViewNFLTeam11 = new ImageView(imageNFLTeam11);
	        imageViewNFLTeam11.setFitHeight(30);
	        imageViewNFLTeam11.setFitWidth(30);
	        Image imageNFLTeam12 = new Image("packerslogo12.jpg");
	        ImageView imageViewNFLTeam12 = new ImageView(imageNFLTeam12);
	        imageViewNFLTeam12.setFitHeight(30);
	        imageViewNFLTeam12.setFitWidth(30);
	        Image imageNFLTeam13 = new Image("texanslogo13.jpg");
	        ImageView imageViewNFLTeam13 = new ImageView(imageNFLTeam13);
	        imageViewNFLTeam13.setFitHeight(30);
	        imageViewNFLTeam13.setFitWidth(30);
	        Image imageNFLTeam14 = new Image("coltslogo14.jpg");
	        ImageView imageViewNFLTeam14 = new ImageView(imageNFLTeam14);
	        imageViewNFLTeam14.setFitHeight(30);
	        imageViewNFLTeam14.setFitWidth(30);
	        Image imageNFLTeam15 = new Image("jaguarslogo15.jpg");
	        ImageView imageViewNFLTeam15 = new ImageView(imageNFLTeam15);
	        imageViewNFLTeam15.setFitHeight(30);
	        imageViewNFLTeam15.setFitWidth(30);
	        Image imageNFLTeam16 = new Image("chiefslogo16.png");
	        ImageView imageViewNFLTeam16 = new ImageView(imageNFLTeam16);
	        imageViewNFLTeam16.setFitHeight(30);
	        imageViewNFLTeam16.setFitWidth(30);
	        Image imageNFLTeam17 = new Image("raiderslogo17.jpg");
	        ImageView imageViewNFLTeam17 = new ImageView(imageNFLTeam17);
	        imageViewNFLTeam17.setFitHeight(30);
	        imageViewNFLTeam17.setFitWidth(30);
	        Image imageNFLTeam18 = new Image("chargerslogo18.jpg");
	        ImageView imageViewNFLTeam18 = new ImageView(imageNFLTeam18);
	        imageViewNFLTeam18.setFitHeight(30);
	        imageViewNFLTeam18.setFitWidth(30);
	        Image imageNFLTeam19 = new Image("ramslogo19.jpg");
	        ImageView imageViewNFLTeam19 = new ImageView(imageNFLTeam19);
	        imageViewNFLTeam19.setFitHeight(30);
	        imageViewNFLTeam19.setFitWidth(30);
	        Image imageNFLTeam20 = new Image("dolphinslogo20.jpg");
	        ImageView imageViewNFLTeam20 = new ImageView(imageNFLTeam20);
	        imageViewNFLTeam20.setFitHeight(30);
	        imageViewNFLTeam20.setFitWidth(30);
	        Image imageNFLTeam21 = new Image("vikingslogo21.jpg");
	        ImageView imageViewNFLTeam21 = new ImageView(imageNFLTeam21);
	        imageViewNFLTeam21.setFitHeight(30);
	        imageViewNFLTeam21.setFitWidth(30);
	        Image imageNFLTeam22 = new Image("patriotslogo22.gif");
	        ImageView imageViewNFLTeam22 = new ImageView(imageNFLTeam22);
	        imageViewNFLTeam22.setFitHeight(30);
	        imageViewNFLTeam22.setFitWidth(30);
	        Image imageNFLTeam23 = new Image("saintslogo23.jpg");
	        ImageView imageViewNFLTeam23 = new ImageView(imageNFLTeam23);
	        imageViewNFLTeam23.setFitHeight(30);
	        imageViewNFLTeam23.setFitWidth(30);
	        Image imageNFLTeam24 = new Image("giantslogo24.jpg");
	        ImageView imageViewNFLTeam24 = new ImageView(imageNFLTeam24);
	        imageViewNFLTeam24.setFitHeight(30);
	        imageViewNFLTeam24.setFitWidth(30);
	        Image imageNFLTeam25 = new Image("jetslogo25.jpg");
	        ImageView imageViewNFLTeam25 = new ImageView(imageNFLTeam25);
	        imageViewNFLTeam25.setFitHeight(30);
	        imageViewNFLTeam25.setFitWidth(30);
	        Image imageNFLTeam26 = new Image("eagleslogo26.jpg");
	        ImageView imageViewNFLTeam26 = new ImageView(imageNFLTeam26);
	        imageViewNFLTeam26.setFitHeight(30);
	        imageViewNFLTeam26.setFitWidth(30);
	        Image imageNFLTeam27 = new Image("steelerslogo27.jpg");
	        ImageView imageViewNFLTeam27 = new ImageView(imageNFLTeam27);
	        imageViewNFLTeam27.setFitHeight(30);
	        imageViewNFLTeam27.setFitWidth(30);
	        Image imageNFLTeam28 = new Image("49erslogo28.png");
	        ImageView imageViewNFLTeam28 = new ImageView(imageNFLTeam28);
	        imageViewNFLTeam28.setFitHeight(30);
	        imageViewNFLTeam28.setFitWidth(30);
	        Image imageNFLTeam29 = new Image("seahawkslogo29.jpg");
	        ImageView imageViewNFLTeam29 = new ImageView(imageNFLTeam29);
	        imageViewNFLTeam29.setFitHeight(30);
	        imageViewNFLTeam29.setFitWidth(30);
	        Image imageNFLTeam30 = new Image("buccaneerslogo30.jpg");
	        ImageView imageViewNFLTeam30 = new ImageView(imageNFLTeam30);
	        imageViewNFLTeam30.setFitHeight(30);
	        imageViewNFLTeam30.setFitWidth(30);
	        Image imageNFLTeam31 = new Image("titanslogo31.jpeg");
	        ImageView imageViewNFLTeam31 = new ImageView(imageNFLTeam31);
	        imageViewNFLTeam31.setFitHeight(30);
	        imageViewNFLTeam31.setFitWidth(30);
	        Image imageNFLTeam32 = new Image("WashingtonFTlogo32.png");
	        ImageView imageViewNFLTeam32 = new ImageView(imageNFLTeam32);
	        imageViewNFLTeam32.setFitHeight(30);
	        imageViewNFLTeam32.setFitWidth(30); 
	        
	    	ArrayList<NFLTeam> NFL30Teams = new ArrayList<NFLTeam>();
			
			ArrayList<NFLLogo> NFL30Logos = new ArrayList<NFLLogo>();
			NFL30Logos.add ( new NFLLogo("Arizona Cardinals", "Kliff Kingsbury", imageViewNFLTeam1));
			NFL30Logos.add ( new NFLLogo("Atlanta Falcons", "Arthur Smith", imageViewNFLTeam2));
			NFL30Logos.add ( new NFLLogo("Baltimore Ravens", "John Harbaugh", imageViewNFLTeam3));
			NFL30Logos.add ( new NFLLogo("Buffalo Bills", "Sean McDermott", imageViewNFLTeam4));
			NFL30Logos.add ( new NFLLogo("Carolina Panthers", "Matt Rhule", imageViewNFLTeam5));
			NFL30Logos.add ( new NFLLogo("Chicago Bears", "Matt Nagy", imageViewNFLTeam6));
			NFL30Logos.add ( new NFLLogo("Cincinnati Bengals", "Zac Taylor", imageViewNFLTeam7));
			NFL30Logos.add ( new NFLLogo("Cleveland Browns", "Kevin Stefanski", imageViewNFLTeam8));
			NFL30Logos.add ( new NFLLogo("Dallas Cowboys", "Mike McCarthy", imageViewNFLTeam9));
			NFL30Logos.add ( new NFLLogo("Denver Broncos", "Vic Fangio", imageViewNFLTeam10));
			NFL30Logos.add ( new NFLLogo("Detroit Lions", "Dan Campbell", imageViewNFLTeam11));
			NFL30Logos.add ( new NFLLogo("Green Bay Packers", "Matt LaFleur", imageViewNFLTeam12));
			NFL30Logos.add ( new NFLLogo("Houston Texans", "David Culley", imageViewNFLTeam13));
			NFL30Logos.add ( new NFLLogo("Indianapolis Colts", "Frank Reich", imageViewNFLTeam14));
			NFL30Logos.add ( new NFLLogo("Jacksonville Jaguars", "Urban Meyer", imageViewNFLTeam15));
			NFL30Logos.add ( new NFLLogo("Kansas City Chiefs", "Andy Reid", imageViewNFLTeam16));
			NFL30Logos.add ( new NFLLogo("Las Vegas Raiders", "Jon Gruden", imageViewNFLTeam17));
			NFL30Logos.add ( new NFLLogo("Los Angeles Chargers", "Brandon Staley", imageViewNFLTeam18));
			NFL30Logos.add ( new NFLLogo("Los Angeles Rams", "Sean McVay", imageViewNFLTeam19));
			NFL30Logos.add ( new NFLLogo("Miami Dolphins", "Brian Flores", imageViewNFLTeam20));
			NFL30Logos.add ( new NFLLogo("Minnesota Vikings", "Mike Zimmer", imageViewNFLTeam21));
			NFL30Logos.add ( new NFLLogo("New England Patriots", "Bill Belichick", imageViewNFLTeam22));
			NFL30Logos.add ( new NFLLogo("New Orleans Saints", "Sean Payton", imageViewNFLTeam23));
			NFL30Logos.add ( new NFLLogo("New York Giants", "Joe Judge", imageViewNFLTeam24));
			NFL30Logos.add ( new NFLLogo("New York Jets", "Robert Saleh", imageViewNFLTeam25));
			NFL30Logos.add ( new NFLLogo("Philadelphia Eagles", "Nick Sirianni", imageViewNFLTeam26));
			NFL30Logos.add ( new NFLLogo("Pittsburgh Steelers", "Mike Tomlin", imageViewNFLTeam27));
			NFL30Logos.add ( new NFLLogo("San Francisco 49ers", "Kyle Shanahan", imageViewNFLTeam28));
			NFL30Logos.add ( new NFLLogo("Seattle Seahawks", "Pete Carroll", imageViewNFLTeam29));
			NFL30Logos.add ( new NFLLogo("Tampa Bay Buccaneers", "Bruce Arians", imageViewNFLTeam30));
			NFL30Logos.add ( new NFLLogo("Tennessee Titans", "Mike Vrabel", imageViewNFLTeam31));
		    NFL30Logos.add ( new NFLLogo("Washington Football Team", "Ron Rivera", imageViewNFLTeam32));
		
		Button  NBANFLBackButton = new Button("Previous page");
		Button NBANFLBB = new Button("Go back to the pick a league page");
		Button logOutButton = new Button("Logout");
		
		Label label = new Label("Email Address :");
		TextField textField = new TextField();
		
		Label label2 = new Label("Password :");
		TextField textField2 = new TextField();
		
		paneForLabelTextField.getChildren().addAll(label, textField);
		paneForLabelTextField2.getChildren().addAll(label2, textField2);
		paneForlbTextField.getChildren().addAll(paneForLabelTextField, paneForLabelTextField2);
		
		
		Button B = new Button("Login");
		pane.setBottom(B);
		pane.setCenter(paneForlbTextField);
		
		B.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
			
        	public void handle(ActionEvent event) {
        		Label label3 = new Label();
        		boolean error = true;
        		Button bt = new Button("Login");
        		Image image = new Image("nba30teamlogo.jpg");
        		ImageView imageView = new ImageView(image);
        		imageView.setFitHeight(200);
        		imageView.setFitWidth(200);
        		Image image2 = new Image("nfl32teamlogo.jpg");
        		ImageView imageView2 = new ImageView(image2);
        		imageView2.setFitHeight(200);
        		imageView2.setFitWidth(200);
        		Button Button = new Button("NBA");
        		Button Button2 = new Button("NFL");
      
        		try {
        		
        		    String query = "SELECT emailaddress, password FROM administratoraccount";
        		
        		    ResultSet resultSet = statement.executeQuery(query);
        		
        		
        		    while(resultSet.next()) {
        		
        		     if(!textField.getText().equals(resultSet.getString(1)) && !textField2.getText().equals(resultSet.getString(2))) {
        		           label3.setText("Your email address and password are Incorrect");	
        		    }
        		     else if(!textField.getText().equals(resultSet.getString(1))){
        			       label3.setText("Your email address is incorrect");
        			  
        			}
        			
        			   else if(!textField2.getText().equals(resultSet.getString(2))) {
        				   label3.setText("Your password is incorrect"); 
        			   
        			}
        			   else { 
        				   label3.setText("Welcome Back");
        				   label3.setFont(Font.font("Times", 23));
        				   paneForMessage.getChildren().addAll(label3);
        				   borderPane.setCenter(paneForMessage);
        				   paneForNBALogo.getChildren().addAll(imageView, Button);
          				   paneForNFLLogo.getChildren().addAll(imageView2, Button2);
          				   paneForLeague.getChildren().addAll(paneForNBALogo, paneForNFLLogo);
          				   borderPane.setCenter(paneForLeague);
        				   error = false;
        				   
        				   primaryStage.setTitle("Pick a League");
        				   primaryStage.setScene (scene2);
        				   primaryStage.setHeight(320);
						   primaryStage.setWidth(430);
        				   primaryStage.show();
        				   
        				   }
        		    }
        			
        		
    				
        			if (error) {
    					pane.setTop(label3);
    				    pane.setBottom(bt);
    					
    					
        		}
        			bt.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
        				
        	        	public void handle(ActionEvent event) {
        	        	   label3.setText("Welcome Back");
        	        	   label3.setFont(Font.font("Times", 23));
          				   paneForNBALogo.getChildren().addAll(imageView, Button);
          				   paneForNFLLogo.getChildren().addAll(imageView2, Button2);
          				   paneForLeague.getChildren().addAll(paneForNBALogo, paneForNFLLogo);
          				   borderPane.setCenter(paneForLeague);
          				   borderPane.setTop(label3);
        			      
          				   primaryStage.setTitle("Pick a League");
          				   primaryStage.setScene(scene2);
          				   primaryStage.setHeight(320);
							primaryStage.setWidth(430);
          				   primaryStage.show();
          				
        	        	}
        			});     	
        			
        		}catch (Exception e) {
        			e.printStackTrace();
        		
        		}
        		
        		Button.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
        			
                	public void handle(ActionEvent event) {
                		Button NBATeamButton = null ;
                		
                		Label NBATeamLabel = new Label("Team Name/Head Coach");
                		NBATeamLabel.setTextFill(Color.RED);
                		NBATeamLabel.setFont(Font.font("Times", 23));
                		Label NBALabel1 = new Label("Schedule");
                		NBALabel1.setTextFill(Color.BLUE);
                		NBALabel1.setFont(Font.font("Times", 23));
                		Label NBALabel2 = new Label("Standing");
                		NBALabel2.setTextFill(Color.RED);
                		NBALabel2.setFont(Font.font("Times", 23));
                		NBATeam NBATeam = null;
                		
                		  paneForNBATeamHC.getChildren().add(NBATeamLabel);
     				     
  			            try {
  			        	  
  							String query = "SELECT teamName, headCoach FROM team WHERE teamId Between 1 AND 30";
  					
  							ResultSet resultSet = statement.executeQuery(query);
  							
  							while(resultSet.next()) {
  							
  							    NBATeam = new NBATeam(resultSet.getString(1), resultSet.getString(2));
  							    NBA30Teams.add(NBATeam);
  						
  						
  						        NBALogo logo = findLogoForNBATeam(NBATeam.getName(), NBA30Logos);
  						 
  						        NBATeamButton = new Button();
  						      
  							    NBATeamButton.setGraphic(logo.getLogo());
  						        NBATeamButton.setText(logo.getName() + ", " + logo.getCoach());
  				
  						        paneForNBATeamHC.getChildren().add(NBATeamButton);
  						        
  						        NBATeamButton.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
  									
  									 public void handle(ActionEvent event) {
  	                                       
  								    	 
  					                      Button  b = (Button) event.getSource();
  					                      String text = b.getText();
  					                      String[] NBATeamName = text.split(",", 3); 
  					                      String TeamName = NBATeamName[0];
  					                      
  					                      TeamName = buildTeamRoster(TeamName);
  									 }
  						        });
  							}
  				               
  				  }catch (Exception e) {
  					e.printStackTrace();
  					
  				}	
  			            scrollBarNBATHC.setContent(paneForNBATeamHC);
  					     bpNBALeague.setLeft(scrollBarNBATHC);
  					     
                		Image ImageNBAg = new Image("nba2021-2022RSschedule.jpg");
                		ImageView ImageViewNBAg = new ImageView(ImageNBAg);
                		ImageViewNBAg.setFitHeight(260);
                		ImageViewNBAg.setFitWidth(300);
                		Button NBAScheduleButton = new Button();
                		NBAScheduleButton.setGraphic(ImageViewNBAg);
                		Image ImageNBAStandings = new Image("nbastandings1.jpg");
                		ImageView ImageViewNBAStandings = new ImageView(ImageNBAStandings);
                		ImageViewNBAStandings.setFitHeight(260);
                		ImageViewNBAStandings.setFitWidth(300);
                		Button NBAStandingsButton = new Button();
                		NBAStandingsButton.setGraphic(ImageViewNBAStandings);
                		
                		paneForNBAScheduleGames.getChildren().addAll(NBALabel1, NBAScheduleButton);
                		paneForNBAStandings.getChildren().addAll(NBALabel2, NBAStandingsButton);
                		paneForNBALeague.getChildren().addAll(paneForNBATeamHC, paneForNBAScheduleGames, paneForNBAStandings);
                		bpNBALeague.setCenter(paneForNBALeague);
                		bpNBALeague.setBottom(NBANFLBB);
                		primaryStage.setTitle("NBA League");
                		primaryStage.setScene(sceneNBA);
                		primaryStage.setHeight(700);
   					    primaryStage.setWidth(1000);
                		primaryStage.show();
                		 NBANFLBB.setOnAction(click -> {
 						    primaryStage.setTitle("Pick a League");
 							primaryStage.setScene(scene2);
 							primaryStage.setHeight(300);
 							primaryStage.setWidth(430);
                		 });
                		
                		NBAScheduleButton.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
                			
                        	public void handle(ActionEvent event) {
                        	  
           				    
    	  			             try {
    								 
    									String query = "SELECT date, awayTeam, awayTeamScore, homeTeam, homeTeamScore, "
    											+ "time, nationalTv, arenaName, ticketPrice, gamesId FROM games WHERE gamesId between 1 AND 1229 ";

    									
    									ResultSet resultSet = statement.executeQuery(query);
    									
    									while(resultSet.next()) {
    										
    										TextField NBAGames = new TextField(resultSet.getString(1));
    										NBAGames.setPrefWidth(150);
    										NBAGames.textProperty().addListener(new ChangeListeners2(NBAGames, resultSet.getString(10),1));
    										TextField NBAGames2 = new TextField(resultSet.getString(2));
    										NBAGames2.setPrefWidth(150);
    										TextField NBAGames3 = new TextField(resultSet.getString(3));
    										NBAGames3.setPrefWidth(70);
    										NBAGames3.textProperty().addListener(new ChangeListeners2(NBAGames3, resultSet.getString(10),2));
    										TextField NBAGames4 = new TextField(resultSet.getString(4));
    										NBAGames4.setPrefWidth(150);
    										TextField NBAGames5 = new TextField(resultSet.getString(5));
    										NBAGames5.setPrefWidth(70);
    										NBAGames5.textProperty().addListener(new ChangeListeners2(NBAGames5, resultSet.getString(10),3));
    										TextField NBAGames6 = new TextField(resultSet.getString(6));
    										NBAGames6.setPrefWidth(70);
    										NBAGames6.textProperty().addListener(new ChangeListeners2(NBAGames6, resultSet.getString(10),4));
    										TextField NBAGames7 = new TextField(resultSet.getString(7));
    										NBAGames7.setPrefWidth(70);
    										NBAGames7.textProperty().addListener(new ChangeListeners2(NBAGames7, resultSet.getString(10),5));
    										TextField NBAGames8 = new TextField(resultSet.getString(8));
    										NBAGames8.setPrefWidth(150);
    										TextField NBAGames9 = new TextField(resultSet.getString(9));
    										NBAGames9.setPrefWidth(70);
    										NBAGames9.textProperty().addListener(new ChangeListeners2(NBAGames9, resultSet.getString(10),6));
    										
    										paneForNBASG.getChildren().addAll(NBAGames);
     									    paneForNBASG2.getChildren().addAll(NBAGames2);
     									    paneForNBASG3.getChildren().addAll(NBAGames3);
     									    paneForNBASG4.getChildren().addAll(NBAGames4);
     									    paneForNBASG5.getChildren().addAll(NBAGames5);
     									    paneForNBASG6.getChildren().addAll(NBAGames6); 
     									    paneForNBASG7.getChildren().addAll(NBAGames7);
     									    paneForNBASG8.getChildren().addAll(NBAGames8);
     									    paneForNBASG9.getChildren().addAll(NBAGames9);
     									}
    									
    									  Label NBASchedule = new Label("Date");
    									  NBASchedule.setTextFill(Color.BLUE);
    		           					  Label NBASchedule2 = new Label("Away Team");
    		           					  NBASchedule2.setTextFill(Color.BLUE);
    		           					  Label NBASchedule3 = new Label("Away Team Score");
    		           					  NBASchedule3.setTextFill(Color.BLUE);
    		           					  Label NBASchedule4 = new Label("Home Team");
    		           					  NBASchedule4.setTextFill(Color.BLUE);
    		           					  Label NBASchedule5 = new Label("Home Team Score");
    		           					  NBASchedule5.setTextFill(Color.BLUE);
    		           					  Label NBASchedule6 = new Label("Time");
    		           					  NBASchedule6.setTextFill(Color.BLUE);
    		           					  Label NBASchedule7 = new Label("National Tv");
    		           					  NBASchedule7.setTextFill(Color.BLUE);
    		           					  Label NBASchedule8 = new Label("Arena Name");
    		           					  NBASchedule8.setTextFill(Color.BLUE);
    		           					  Label NBASchedule9 = new Label("Ticket Price");
    		           					  NBASchedule9.setTextFill(Color.BLUE);
    		           					  
     			                       
    									  paneForNBASchedule.getChildren().addAll(NBASchedule, paneForNBASG);
    									  paneForNBASchedule2.getChildren().addAll(NBASchedule2, paneForNBASG2);
    									  paneForNBASchedule3.getChildren().addAll(NBASchedule3, paneForNBASG3);
    									  paneForNBASchedule4.getChildren().addAll(NBASchedule4, paneForNBASG4);
    									  paneForNBASchedule5.getChildren().addAll(NBASchedule5, paneForNBASG5);
    									  paneForNBASchedule6.getChildren().addAll(NBASchedule6, paneForNBASG6);
    									  paneForNBASchedule7.getChildren().addAll(NBASchedule7, paneForNBASG7);
    									  paneForNBASchedule8.getChildren().addAll(NBASchedule8, paneForNBASG8);
    									  paneForNBASchedule9.getChildren().addAll(NBASchedule9, paneForNBASG9);
    									  
    									  paneForNBAGames.getChildren().addAll(paneForNBASchedule, paneForNBASchedule2,
    											  paneForNBASchedule3, paneForNBASchedule4, paneForNBASchedule5, 
    											  paneForNBASchedule6, paneForNBASchedule7, paneForNBASchedule8, paneForNBASchedule9);
    									   paneForNBASButton.getChildren().addAll(NBANFLBackButton, logOutButton);
    									   
    									   bpNBAGames.setCenter(paneForNBAGames);
    									   bpNBAGames.setBottom(paneForNBASButton); 
    									   spNBASchedule.setContent(paneForNBAGames);
    									   bpNBAGames.setRight(spNBASchedule);   								
    									   primaryStage.setTitle("NBA Schedule");
    									   primaryStage.setScene(sceneNBASG);
    									   primaryStage.setHeight(500);
    									   primaryStage.setWidth(1100);
    									   primaryStage.show();
    							 }catch (Exception e) {
    									e.printStackTrace();
    							 }	
    						
    						       
    						     
								   logOutButton.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
				    					
				    				 public void handle(ActionEvent event) {
				    					 Label lbLogout = new Label("You have logout \n" + "Have a great day!");
				    					 lbLogout.setFont(Font.font("Times", 23));
				    					 bpLogout.setTop(lbLogout);
				    					 
				    					 primaryStage.setTitle("Logout page");
				    					 primaryStage.setScene(sceneLogout);
				    					 primaryStage.setHeight(150);
				    					 primaryStage.setWidth(200);
				    					 primaryStage.show();
				    							 
				    				 }
						         });
								   NBANFLBackButton.setOnAction(click -> {
										
									    primaryStage.setTitle("NBA League");
										primaryStage.setScene(sceneNBA);
										primaryStage.setHeight(700);
										primaryStage.setWidth(1000);
								 });		
    				 }
    			 });
    			 
    			NBAStandingsButton.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
    					
    				 public void handle(ActionEvent event) {
    					 
    					 Image Image5 = new Image("NBAEC1.png");
    					 ImageView imageView5 = new ImageView(Image5);
    					 imageView5.setFitHeight(100);
    					 imageView5.setFitWidth(100);
    					 
    					 Image Image6 = new Image("NBAWCLogo.jpg");
    					 ImageView imageView6 = new ImageView(Image6);
    					 imageView6.setFitHeight(100);
    					 imageView6.setFitWidth(100);
    					  
    					
    					 try {
    							
    							String query = "SELECT  t.teamName, s.Rank, s.winRecord, s.loseRecord, s.winPercent, s.homeRecord, s.awayRecord, s.conferenceRecord, s.streak, t.teamId "
    									 + "FROM team t JOIN standing s ON t.teamId = s.team_teamId "
    									+ " WHERE t.teamId  = 1 OR t.teamId = 2 OR t.teamId = 3 OR teamId = 4 OR t.teamId = 5 OR teamId = 6 OR teamId = 9 OR teamId = 12 OR teamId = 16 OR teamId = 17 OR teamId = 20 OR teamId = 22 OR teamId = 23 OR  teamId = 28 OR teamId = 30";
    							
    						    
    							ResultSet resultSet = statement.executeQuery(query);
    							
    							while(resultSet.next()) {
    								
    								
    								 TextField NBAECS = new TextField(resultSet.getString(1)); 
    								 TextField NBAECS2 = new TextField(resultSet.getString(2));
    								 NBAECS2.setPrefWidth(50);
    								 NBAECS2.textProperty().addListener(new ChangeListeners(NBAECS2, resultSet.getString(10),1));
    								 TextField NBAECS3 = new TextField(resultSet.getString(3));
    								 NBAECS3.setPrefWidth(50);
    								 NBAECS3.textProperty().addListener(new ChangeListeners(NBAECS3, resultSet.getString(10),2));
    								 TextField NBAECS4 = new TextField(resultSet.getString(4));
    								 NBAECS4.setPrefWidth(50);
    								 NBAECS4.textProperty().addListener(new ChangeListeners(NBAECS4, resultSet.getString(10),3));
    								 TextField NBAECS5 = new TextField(resultSet.getString(5));
    								 NBAECS5.setPrefWidth(50);
    								 NBAECS5.textProperty().addListener(new ChangeListeners(NBAECS5, resultSet.getString(10),4));
    								 TextField NBAECS6 = new TextField(resultSet.getString(6));
    								 NBAECS6.setPrefWidth(50);
    								 NBAECS6.textProperty().addListener(new ChangeListeners(NBAECS6, resultSet.getString(10),5));
    								 TextField NBAECS7 = new TextField(resultSet.getString(7));
    								 NBAECS7.setPrefWidth(50);
    								 NBAECS7.textProperty().addListener(new ChangeListeners(NBAECS7, resultSet.getString(10),6));
    								 TextField NBAECS8 = new TextField(resultSet.getString(8));
    								 NBAECS8.setPrefWidth(50);
    								 NBAECS8.textProperty().addListener(new ChangeListeners(NBAECS8, resultSet.getString(10),7));
    								 TextField NBAECS9 = new TextField(resultSet.getString(9));
    								 NBAECS9.setPrefWidth(50);
    								 NBAECS9.textProperty().addListener(new ChangeListeners(NBAECS9, resultSet.getString(10),8));
    								 
    								paneForNBAECStandings.getChildren().addAll(NBAECS);
 									paneForNBAECStandings2.getChildren().addAll(NBAECS2);
 									paneForNBAECStandings3.getChildren().addAll(NBAECS3);
 									paneForNBAECStandings4.getChildren().addAll(NBAECS4);
 									paneForNBAECStandings5.getChildren().addAll(NBAECS5);
 									paneForNBAECStandings6.getChildren().addAll(NBAECS6);
 									paneForNBAECStandings7.getChildren().addAll(NBAECS7);
 									paneForNBAECStandings8.getChildren().addAll(NBAECS8);
 									paneForNBAECStandings9.getChildren().addAll(NBAECS9);
    									
    							}	
    							     
		    							 Label NBAEC = new Label("Eastern Conference");
		    							 NBAEC.setTextFill(Color.RED);
		    							 NBAEC.setFont(Font.font("Times", 23));
		    							 Label NBAEC2 = new Label("Team Name");
		    							 NBAEC2.setTextFill(Color.BLUE);
		    							 Label NBAEC3 = new Label("Rank");
		    							 NBAEC3.setTextFill(Color.BLUE);
		    							 Label NBAEC4 = new Label("Win");
		    							 NBAEC4.setTextFill(Color.BLUE);
		    							 Label NBAEC5 = new Label("Lose");
		    							 NBAEC5.setTextFill(Color.BLUE);
		    							 Label NBAEC6 = new Label("Win Percent");
		    							 NBAEC6.setTextFill(Color.BLUE);
		    							 Label NBAEC7 = new Label("Home Record");
		    							 NBAEC7.setTextFill(Color.BLUE);
		    							 Label NBAEC8 = new Label("Away Record");
		    							 NBAEC8.setTextFill(Color.BLUE);
		    							 Label NBAEC9 = new Label("Conference Record");
		    							 NBAEC9.setTextFill(Color.BLUE);
		    							 Label NBAEC10 = new Label("Streak");
		    							 NBAEC10.setTextFill(Color.BLUE);
		    							 
		    							 paneForNBAECS.getChildren().addAll(NBAEC2, paneForNBAECStandings);
		    								paneForNBAECS2.getChildren().addAll(NBAEC3, paneForNBAECStandings2);
		    								paneForNBAECS3.getChildren().addAll(NBAEC4, paneForNBAECStandings3);
		    								paneForNBAECS4.getChildren().addAll(NBAEC5, paneForNBAECStandings4);
		    								paneForNBAECS5.getChildren().addAll(NBAEC6, paneForNBAECStandings5);
		    								paneForNBAECS6.getChildren().addAll(NBAEC7, paneForNBAECStandings6);
		    								paneForNBAECS7.getChildren().addAll(NBAEC8, paneForNBAECStandings7);
		    								paneForNBAECS8.getChildren().addAll(NBAEC9, paneForNBAECStandings8);
		    								paneForNBAECS9.getChildren().addAll(NBAEC10, paneForNBAECStandings9);
		    								
		    								
		    								paneForNBAEasternConference.getChildren().addAll(paneForNBAECS, 
		    										paneForNBAECS2, paneForNBAECS3, paneForNBAECS4, 
		    										paneForNBAECS5, paneForNBAECS6, paneForNBAECS7, 
		    										paneForNBAECS8, paneForNBAECS9);
		    							
		    								paneForNBAEC.getChildren().addAll(NBAEC, paneForNBAEasternConference);
		    								
		    								paneForNBAEClogo.getChildren().addAll(imageView5, paneForNBAEC);
		   
		    								NBAStandings.setCenter(paneForNBAEClogo); 
    								
    					 } catch (SQLException e) {
    							
    							e.printStackTrace();
    						}
    					 
    						    try {
    						    	String query = "SELECT  t.teamName, s.Rank, s.winRecord, s.loseRecord, s.winPercent, s.homeRecord, s.awayRecord, s.conferenceRecord, s.streak, t.teamId "
       									 + "FROM team t JOIN standing s ON t.teamId = s.team_teamId "
       									 + " WHERE teamId  = 7 OR teamId = 8 OR teamId = 10 OR teamId = 11 OR teamId = 13 OR teamId = 14 OR teamId = 15 OR teamId = 18 OR teamId = 19 OR teamId = 21 OR teamId = 24 OR teamId = 25 OR teamId = 26 OR  teamId = 27 OR teamId = 29";
    							    
    								ResultSet resultSet = statement.executeQuery(query);
    								
    								while(resultSet.next()) {
    									 
    									 TextField NBAWCS = new TextField(resultSet.getString(1));
    									 TextField NBAWCS2 = new TextField(resultSet.getString(2));
    									 NBAWCS2.setPrefWidth(50);
    									 NBAWCS2.textProperty().addListener(new ChangeListeners(NBAWCS2, resultSet.getString(10),1));
    									 TextField NBAWCS3 = new TextField(resultSet.getString(3));
    									 NBAWCS3.setPrefWidth(50);
    									 NBAWCS3.textProperty().addListener(new ChangeListeners(NBAWCS3, resultSet.getString(10),2));
    									 TextField NBAWCS4 = new TextField(resultSet.getString(4));
    									 NBAWCS4.setPrefWidth(50);
    									 NBAWCS4.textProperty().addListener(new ChangeListeners(NBAWCS4, resultSet.getString(10),3));
    									 TextField NBAWCS5 = new TextField(resultSet.getString(5));
    									 NBAWCS5.setPrefWidth(50);
    									 NBAWCS5.textProperty().addListener(new ChangeListeners(NBAWCS5, resultSet.getString(10),4));
    									 TextField NBAWCS6 = new TextField(resultSet.getString(6));
    									 NBAWCS6.setPrefWidth(50);
    									 NBAWCS6.textProperty().addListener(new ChangeListeners(NBAWCS6, resultSet.getString(10),5));
    									 TextField NBAWCS7 = new TextField(resultSet.getString(7));
    									 NBAWCS7.setPrefWidth(50);
    									 NBAWCS7.textProperty().addListener(new ChangeListeners(NBAWCS7, resultSet.getString(10),6));
    									 TextField NBAWCS8 = new TextField(resultSet.getString(8));
    									 NBAWCS8.setPrefWidth(50);
    									 NBAWCS8.textProperty().addListener(new ChangeListeners(NBAWCS8, resultSet.getString(10),7));
    									 TextField NBAWCS9 = new TextField(resultSet.getString(9));
    									 NBAWCS9.setPrefWidth(50);
    									 NBAWCS9.textProperty().addListener(new ChangeListeners(NBAWCS9, resultSet.getString(10),8));
    									 
    									 paneForNBAWCStandings.getChildren().addAll(NBAWCS);
    									 paneForNBAWCStandings2.getChildren().addAll(NBAWCS2);
    									 paneForNBAWCStandings3.getChildren().addAll(NBAWCS3);
    									 paneForNBAWCStandings4.getChildren().addAll(NBAWCS4);
    									 paneForNBAWCStandings5.getChildren().addAll(NBAWCS5);
    									 paneForNBAWCStandings6.getChildren().addAll(NBAWCS6);
    									 paneForNBAWCStandings7.getChildren().addAll(NBAWCS7);
    									 paneForNBAWCStandings8.getChildren().addAll(NBAWCS8);
    									 paneForNBAWCStandings9.getChildren().addAll(NBAWCS9);
    									 
    									 
    										
    								}
    									 Label NBAWC = new Label("Western Conference");
    									 NBAWC.setTextFill(Color.BLUE);
    									 NBAWC.setFont(Font.font("Times", 23));
    									 Label NBAWC2 = new Label("Team Name");
    									 NBAWC2.setTextFill(Color.RED);
    									 Label NBAWC3 = new Label("Rank");
    									 NBAWC3.setTextFill(Color.RED);
    									 Label NBAWC4 = new Label("Win");
    									 NBAWC4.setTextFill(Color.RED);
    									 Label NBAWC5 = new Label("Lose");
    									 NBAWC5.setTextFill(Color.RED);
    									 Label NBAWC6 = new Label("Win Percent");
    									 NBAWC6.setTextFill(Color.RED);
    									 Label NBAWC7 = new Label("Home Record");
    									 NBAWC7.setTextFill(Color.RED);
    									 Label NBAWC8 = new Label("Away Record");
    									 NBAWC8.setTextFill(Color.RED);
    									 Label NBAWC9 = new Label("Conference Record");
    									 NBAWC9.setTextFill(Color.RED);
    									 Label NBAWC10 = new Label("Streak");
    									 NBAWC10.setTextFill(Color.RED);
    									 
    									 paneForNBAWCS.getChildren().addAll(NBAWC2, paneForNBAWCStandings);
     									paneForNBAWCS2.getChildren().addAll(NBAWC3, paneForNBAWCStandings2);
     									paneForNBAWCS3.getChildren().addAll(NBAWC4, paneForNBAWCStandings3);
     									paneForNBAWCS4.getChildren().addAll(NBAWC5, paneForNBAWCStandings4);
     									paneForNBAWCS5.getChildren().addAll(NBAWC6, paneForNBAWCStandings5);
     									paneForNBAWCS6.getChildren().addAll(NBAWC7, paneForNBAWCStandings6);
     									paneForNBAWCS7.getChildren().addAll(NBAWC8, paneForNBAWCStandings7);
     									paneForNBAWCS8.getChildren().addAll(NBAWC9, paneForNBAWCStandings8);
     									paneForNBAWCS9.getChildren().addAll(NBAWC10, paneForNBAWCStandings9);
     									
     									
     									
     									
     									paneForNBAWesternConference.getChildren().addAll(paneForNBAWCS, 
     											paneForNBAWCS2, paneForNBAWCS3, paneForNBAWCS4, paneForNBAWCS5, 
     											paneForNBAWCS6, paneForNBAWCS7, paneForNBAWCS8, paneForNBAWCS9);
     										
     									paneForNBAWC.getChildren().addAll(NBAWC, paneForNBAWesternConference);
     									
     									paneForNBAWCLogo.getChildren().addAll(imageView6, paneForNBAWC);
     									
     									paneForNBAWCS1.getChildren().addAll(paneForNBAEClogo, paneForNBAWCLogo);
     									
     								    paneForNBASButton1.getChildren().addAll(NBANFLBackButton, logOutButton);

    								    
    									spNBAStandings.setContent(paneForNBAWCS1);
    									NBAStandings.setBottom(paneForNBASButton1);
    									NBAStandings.setLeft(spNBAStandings);
    									NBAStandings.setCenter(paneForNBAWCS1); 
    									primaryStage.setTitle("NBA Standings");
    									primaryStage.setScene(sceneNBAStandings);
    									primaryStage.setHeight(500);
 								        primaryStage.setWidth(860);
    									primaryStage.show();
    									NBANFLBackButton.setOnAction(click -> {
    										   NBAStandings.setBottom(NBANFLBackButton);
    										   primaryStage.setScene(sceneNBA);
    										   
    									 }); 
    									
    									
    									logOutButton.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
    										
    										 public void handle(ActionEvent event) {
    											 Label lbLogout = new Label("You have logout \n" + "Have a great day!");
        				    					 lbLogout.setFont(Font.font("Times", 23));
        				    					 bpLogout.setTop(lbLogout);
        				    					 
        				    					 primaryStage.setTitle("Logout page");
        				    					 primaryStage.setScene(sceneLogout);
        				    					 primaryStage.setHeight(150);
        				    					 primaryStage.setWidth(200);
        				    					 primaryStage.show();
    										 }
    									});
    				                } catch (SQLException e) {
    										e.printStackTrace();
    								 }			
    			  
                        	}
                		});
                	}
        		});
        		Button2.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
					
				 public void handle(ActionEvent event) {
					   Button NFLTeamButton = null;
					   
					   Label NFLTeamLabel = new Label("Team Name/Head Coach");
					   NFLTeamLabel.setTextFill(Color.BLUE);
					   NFLTeamLabel.setFont(Font.font("Times", 23));
					   Label NFLSchedule = new Label("Schedule");
					   NFLSchedule.setTextFill(Color.RED);
					   NFLSchedule.setFont(Font.font("Times", 23));
					   Label NFLStandings = new Label("Standings");
					   NFLStandings.setTextFill(Color.BLUE);
					   NFLStandings.setFont(Font.font("Times", 23));
                       NFLTeam NFLTeam = null;
					   
					   paneForNFLTHC.getChildren().add(NFLTeamLabel);
					   
					   try {
							String query = "SELECT teamName, headCoach FROM team WHERE teamId Between 31 AND 62";
					
							ResultSet resultSet = statement.executeQuery(query);
							
							while(resultSet.next()) {
							
							NFLTeam = new NFLTeam(resultSet.getString(1), resultSet.getString(2));
							NFL30Teams.add(NFLTeam);
							
				
						
						    NFLLogo NFLlogo = findNFLLogoForTeam(NFLTeam.getName(), NFL30Logos);
							NFLTeamButton = new Button();
							NFLTeamButton.setGraphic(NFLlogo.getNFLLogo());
						    NFLTeamButton.setText(NFLlogo.getName() + ", " + NFLlogo.getCoach());
				       
						   paneForNFLTHC.getChildren().add(NFLTeamButton);
						   NFLTeamButton.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
								
								 public void handle(ActionEvent event) {
                                    
							    	   
				                      Button  button = (Button) event.getSource();
				                      String text = button.getText();
				                      String[] NFLTeamName = text.split(",", 3); 
				                      String TeamName = NFLTeamName[0];
				                      
				                      TeamName = buildNFLTeamRoster(TeamName);
				                  
				                
								 }
					        });
						 
								}
				
				}catch (Exception e) {
					e.printStackTrace();
					
				}	
				       spNFLTeam.setContent(paneForNFLTHC);
				       bpNFLLeague.setLeft(spNFLTeam);
					   Image imageNFLSG = new Image("nflschedule21logo.jpg");
					   ImageView  imageViewNFLSG = new ImageView(imageNFLSG);
					   imageViewNFLSG.setFitHeight(260);
					   imageViewNFLSG.setFitWidth(300);
					   Button NFLSGButton = new Button();
					   NFLSGButton.setGraphic(imageViewNFLSG);
					   Image imageNFLS2 = new Image("nflstandingslogo.jpg");
					   ImageView imageViewNFLS2 = new ImageView(imageNFLS2);
					   imageViewNFLS2.setFitHeight(260);
					   imageViewNFLS2.setFitWidth(300);
					   Button NFLSButton = new Button();
					   NFLSButton.setGraphic(imageViewNFLS2);
					   
					   paneForNFLSchedule.getChildren().addAll(NFLSchedule, NFLSGButton);
					   paneForNFLStandings.getChildren().addAll(NFLStandings, NFLSButton);
					   paneForNFLLeague.getChildren().addAll(paneForNFLTHC, paneForNFLSchedule, paneForNFLStandings);
					   bpNFLLeague.setCenter(paneForNFLLeague);
					   bpNFLLeague.setBottom(NBANFLBB);
					   primaryStage.setTitle("NFL League");
					   primaryStage.setScene(NFLLeague);
					   primaryStage.setHeight(700);
					   primaryStage.setWidth(1000);
					   primaryStage.show();
					   NBANFLBB.setOnAction(click -> {
						    primaryStage.setTitle("Pick a League");
							primaryStage.setScene(scene2);
							primaryStage.setHeight(320);
							primaryStage.setWidth(430);
					   });
					   NFLSGButton.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
							
							 public void handle(ActionEvent event) {
								
								  
										 try {
											 
												String query = "SELECT date, awayTeam, awayTeamScore, homeTeam, homeTeamScore, "
														+ "time, nationalTv, arenaName, ticketPrice, gamesId FROM games WHERE gamesId between 1230 AND 1501";

												
												ResultSet resultSet = statement.executeQuery(query);
												
												while(resultSet.next()) {
												
													TextField NFLgames = new TextField(resultSet.getString(1));
													NFLgames.setPrefWidth(150);
													NFLgames.textProperty().addListener(new ChangeListeners2(NFLgames, resultSet.getString(10),1));    										
													TextField NFLgames2 = new TextField(resultSet.getString(2));
													NFLgames2.setPrefWidth(150);
													TextField NFLgames3 = new TextField(resultSet.getString(3));
													NFLgames3.setPrefWidth(70);
													NFLgames3.textProperty().addListener(new ChangeListeners2(NFLgames3, resultSet.getString(10),2));    										
													TextField NFLgames4 = new TextField(resultSet.getString(4));
													NFLgames4.setPrefWidth(150);
													TextField NFLgames5 = new TextField(resultSet.getString(5));
													NFLgames5.setPrefWidth(70);
													NFLgames5.textProperty().addListener(new ChangeListeners2(NFLgames5, resultSet.getString(10),3));    										
													TextField NFLgames6 = new TextField(resultSet.getString(6));
													NFLgames6.setPrefWidth(70);
													NFLgames.textProperty().addListener(new ChangeListeners2(NFLgames, resultSet.getString(10),4));    										
													TextField NFLgames7 = new TextField(resultSet.getString(7));
													NFLgames7.setPrefWidth(70);
													NFLgames7.textProperty().addListener(new ChangeListeners2(NFLgames, resultSet.getString(10),5));    										
													TextField NFLgames8 = new TextField(resultSet.getString(8));
													NFLgames8.setPrefWidth(150);
													TextField NFLgames9 = new TextField(resultSet.getString(9));
													NFLgames9.setPrefWidth(70);
													NFLgames9.textProperty().addListener(new ChangeListeners2(NFLgames9, resultSet.getString(10),6));    										
												  
													    paneForNFLgames.getChildren().addAll(NFLgames);
													    paneForNFLgames2.getChildren().addAll(NFLgames2);
													    paneForNFLgames3.getChildren().addAll(NFLgames3);
													    paneForNFLgames4.getChildren().addAll(NFLgames4);
													    paneForNFLgames5.getChildren().addAll(NFLgames5);
													    paneForNFLgames6.getChildren().addAll(NFLgames6);
													    paneForNFLgames7.getChildren().addAll(NFLgames7);
													    paneForNFLgames8.getChildren().addAll(NFLgames8);
													    paneForNFLgames9.getChildren().addAll(NFLgames9);
													    
												   }
							                           
													  Label NFLSchedule = new Label("Date");
													  NFLSchedule.setTextFill(Color.BLUE);
													  Label NFLSchedule2 = new Label("Away Team");
													  NFLSchedule.setTextFill(Color.BLUE);
													  Label NFLSchedule3 = new Label("Away Team Score");
													  NFLSchedule.setTextFill(Color.BLUE);
													  Label NFLSchedule4 = new Label("Home Team");
													  NFLSchedule.setTextFill(Color.BLUE);
													  Label NFLSchedule5 = new Label("Home Team Score");
													  NFLSchedule.setTextFill(Color.BLUE);
													  Label NFLSchedule6 = new Label("Time");
													  NFLSchedule.setTextFill(Color.BLUE);
													  Label NFLSchedule7 = new Label("National Tv");
													  NFLSchedule.setTextFill(Color.BLUE);
													  Label NFLSchedule8 = new Label("Arena Name");
													  NFLSchedule.setTextFill(Color.BLUE);
													  Label NFLSchedule9 = new Label("Ticket Price");
													  NFLSchedule.setTextFill(Color.BLUE);
												  
													   paneForNFLSG.getChildren().addAll(NFLSchedule, paneForNFLgames);
													   paneForNFLSG2.getChildren().addAll(NFLSchedule2, paneForNFLgames2);
													   paneForNFLSG3.getChildren().addAll(NFLSchedule3, paneForNFLgames3);
													   paneForNFLSG4.getChildren().addAll(NFLSchedule4, paneForNFLgames4);
													   paneForNFLSG5.getChildren().addAll(NFLSchedule5, paneForNFLgames5);
													   paneForNFLSG6.getChildren().addAll(NFLSchedule6, paneForNFLgames6);
													   paneForNFLSG7.getChildren().addAll(NFLSchedule7, paneForNFLgames7);
													   paneForNFLSG8.getChildren().addAll(NFLSchedule8, paneForNFLgames8);
													   paneForNFLSG9.getChildren().addAll(NFLSchedule9, paneForNFLgames9); 
													 			
													  
													  paneForNFLSG1.getChildren().addAll(paneForNFLSG, paneForNFLSG2, 
															  paneForNFLSG3, paneForNFLSG4, paneForNFLSG5, paneForNFLSG6, 
															  paneForNFLSG7, paneForNFLSG8, paneForNFLSG9);
													  
												  paneForNFLSButton2.getChildren().addAll(NBANFLBackButton, logOutButton);
												  
												  bpNFLSchedule.setCenter(paneForNFLSG1);
												  bpNFLSchedule.setBottom(paneForNFLSButton2);
												  spNFLSchedule.setContent(paneForNFLSG1);
												  bpNFLSchedule.setRight(spNFLSchedule);
												   primaryStage.setTitle("NFL Schedule");
												   primaryStage.setScene(sceneNFLSG);
												   primaryStage.setHeight(500);
												   primaryStage.setWidth(1100);
												   primaryStage.show();
									
									
												   logOutButton.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
		        				    					
			          				    				 public void handle(ActionEvent event) {
			          				    					 Label lbLogout = new Label("You have logout \n" + "Have a great day!");
			          				    					 lbLogout.setFont(Font.font("Times", 23));
			          				    					 bpLogout.setTop(lbLogout);
			          				    					 
			          				    					 primaryStage.setTitle("Logout page");
			          				    					 primaryStage.setScene(sceneLogout);
			          				    					 primaryStage.setHeight(150);
			        				    					 primaryStage.setWidth(200);
			          				    					 primaryStage.show();
			          				    							 
			          				    				 }
			          						         });
										 }catch (Exception e) {
												e.printStackTrace();
										 }	
										
									 NBANFLBackButton.setOnAction(click -> {
										   primaryStage.setTitle("NFL League");
										   primaryStage.setScene(NFLLeague);
										   primaryStage.setHeight(700);
										   primaryStage.setWidth(920);
									 });
									 
							 }
						 });
					   
					   NFLSButton.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
							
							 public void handle(ActionEvent event) {
								 Image i3 = new Image("nflNFClogo.png");
								 ImageView iV3 = new ImageView(i3);
								 iV3.setFitHeight(100);
								 iV3.setFitWidth(100);
								 
								 Image i4 = new Image("nflAFClogo.png");
								 ImageView iV4 = new ImageView(i4);
								 iV4.setFitHeight(100);
								 iV4.setFitWidth(100);
								 
								try {
									
									String query = "SELECT t.teamName, s.Rank, s.winRecord, s.loseRecord, s.tiedRecord, s.winPercent, s.homeRecord, s.awayRecord, s.conferenceRecord, s.streak, t.teamId "
								    + "FROM team t JOIN standing s ON t.teamId = s.team_teamId "
								    + " WHERE teamId  = 31 OR teamId = 39 OR teamId = 60 OR teamId = 42 OR teamId = 49 OR teamId = 35 OR teamId = 62 OR teamId = 36 OR teamId = 58 OR teamId = 53 OR teamId = 59 OR  teamId = 51 OR teamId = 56 OR teamId = 32 OR teamId = 54 OR teamId = 41";
									
								    
									ResultSet resultSet = statement.executeQuery(query);
									
									while(resultSet.next()) {
							
									     TextField NFLNFC = new TextField(resultSet.getString(1));
									     NFLNFC.setPrefWidth(150);
									     TextField NFLNFC2 = new TextField(resultSet.getString(2));
									     NFLNFC2.setPrefWidth(50);
									     NFLNFC2.textProperty().addListener(new ChangeListeners1(NFLNFC2, resultSet.getString(11),1));
									     TextField NFLNFC3 = new TextField(resultSet.getString(3));
									     NFLNFC3.setPrefWidth(50);
									     NFLNFC3.textProperty().addListener(new ChangeListeners1(NFLNFC2, resultSet.getString(11),2));
									     TextField NFLNFC4 = new TextField(resultSet.getString(4));
									     NFLNFC4.setPrefWidth(50);
									     NFLNFC4.textProperty().addListener(new ChangeListeners1(NFLNFC2, resultSet.getString(11),3));
									     TextField NFLNFC5 = new TextField(resultSet.getString(5));
									     NFLNFC5.setPrefWidth(50);
									     NFLNFC5.textProperty().addListener(new ChangeListeners1(NFLNFC2, resultSet.getString(11),4));
									     TextField NFLNFC6 = new TextField(resultSet.getString(6));
									     NFLNFC6.setPrefWidth(50);
									     NFLNFC6.textProperty().addListener(new ChangeListeners1(NFLNFC2, resultSet.getString(11),5));
									     TextField NFLNFC7 = new TextField(resultSet.getString(7));
									     NFLNFC7.setPrefWidth(150);
									     NFLNFC7.textProperty().addListener(new ChangeListeners1(NFLNFC2, resultSet.getString(11),6));
									     TextField NFLNFC8 = new TextField(resultSet.getString(8));
									     NFLNFC8.setPrefWidth(150);
									     NFLNFC8.textProperty().addListener(new ChangeListeners1(NFLNFC2, resultSet.getString(11),7));
									     TextField NFLNFC9 = new TextField(resultSet.getString(9));
									     NFLNFC9.setPrefWidth(50);
									     NFLNFC9.textProperty().addListener(new ChangeListeners1(NFLNFC2, resultSet.getString(11),8));
									     TextField NFLNFC10 = new TextField(resultSet.getString(10));
									     NFLNFC10.setPrefWidth(50);
									     NFLNFC10.textProperty().addListener(new ChangeListeners1(NFLNFC2, resultSet.getString(11),9));
									     
									     paneForNFLNFC.getChildren().addAll(NFLNFC);
									     paneForNFLNFC2.getChildren().addAll(NFLNFC2);
									     paneForNFLNFC3.getChildren().addAll(NFLNFC3);
									     paneForNFLNFC4.getChildren().addAll(NFLNFC4);
									     paneForNFLNFC5.getChildren().addAll(NFLNFC5);
									     paneForNFLNFC6.getChildren().addAll(NFLNFC6);
									     paneForNFLNFC7.getChildren().addAll(NFLNFC7);
									     paneForNFLNFC8.getChildren().addAll(NFLNFC8);
									     paneForNFLNFC9.getChildren().addAll(NFLNFC9);
									     paneForNFLNFC10.getChildren().addAll(NFLNFC10);
									     
									     
									}
									
									   Label NFLNFCS = new Label("National Football Conference (NFC)");
									   NFLNFCS.setTextFill(Color.BLUE);
									   NFLNFCS.setFont(Font.font("Times",23));
									   Label NFLNFCS2 = new Label("Team Name");
									   NFLNFCS2.setTextFill(Color.RED);
									   Label NFLNFCS3 = new Label("Rank");
									   NFLNFCS3.setTextFill(Color.RED);
									   Label NFLNFCS4 = new Label("Win");
									   NFLNFCS4.setTextFill(Color.RED);
								       Label NFLNFCS5 = new Label("Lose");
								       NFLNFCS5.setTextFill(Color.RED);
								       Label NFLNFCS6 = new Label("Tied");
								       NFLNFCS6.setTextFill(Color.RED);
								       Label NFLNFCS7 = new Label("Win Percent");
								       NFLNFCS7.setTextFill(Color.RED);
								       Label NFLNFCS8 = new Label("Home Record");
								       NFLNFCS8.setTextFill(Color.RED);
								       Label NFLNFCS9 = new Label("Away Record");
								       NFLNFCS9.setTextFill(Color.RED);
								       Label NFLNFCS10 = new Label("Conference Record");
								       NFLNFCS10.setTextFill(Color.RED);
								       Label NFLNFCS11 = new Label("Streak");
								       NFLNFCS11.setTextFill(Color.RED);

								       paneForNFLNFCS.getChildren().addAll(NFLNFCS2, paneForNFLNFC);
								       paneForNFLNFCS2.getChildren().addAll(NFLNFCS3, paneForNFLNFC2);
								       paneForNFLNFCS3.getChildren().addAll(NFLNFCS4, paneForNFLNFC3);
								       paneForNFLNFCS4.getChildren().addAll(NFLNFCS5, paneForNFLNFC4);
								       paneForNFLNFCS5.getChildren().addAll(NFLNFCS6, paneForNFLNFC5);
								       paneForNFLNFCS6.getChildren().addAll(NFLNFCS7, paneForNFLNFC6);
								       paneForNFLNFCS7.getChildren().addAll(NFLNFCS8, paneForNFLNFC7);
								       paneForNFLNFCS8.getChildren().addAll(NFLNFCS9, paneForNFLNFC8);
								       paneForNFLNFCS9.getChildren().addAll(NFLNFCS10, paneForNFLNFC9);
								       paneForNFLNFCS10.getChildren().addAll(NFLNFCS11, paneForNFLNFC10);
								       
								       
								       paneForNFLNFCStandings.getChildren().addAll(paneForNFLNFCS, paneForNFLNFCS2, 
								    		   paneForNFLNFCS3, paneForNFLNFCS4, paneForNFLNFCS5, paneForNFLNFCS6, 
								    		   paneForNFLNFCS7, paneForNFLNFCS8, paneForNFLNFCS9, paneForNFLNFCS10); 
								       
								       paneForNFLNFCS1.getChildren().addAll(NFLNFCS, paneForNFLNFCStandings);
								       
								       paneForNFLNFCLogo.getChildren().addAll(iV3, paneForNFLNFCS1);

								       
								      
								       
								 } catch (SQLException e) {
										
										e.printStackTrace();
								}
								try {
									 
									  String query = "SELECT t.teamName, s.Rank, s.winRecord, s.loseRecord, s.tiedRecord, s.winPercent, s.homeRecord, s.awayRecord, s.conferenceRecord, s.streak, t.teamId "
								      + "FROM team t JOIN standing s ON t.teamId = s.team_teamId "
								      + " WHERE teamId  = 48 OR teamId = 37 OR teamId = 34 OR teamId = 61 OR teamId = 47 OR teamId = 33 OR teamId = 40 OR teamId = 38 OR teamId = 46 OR teamId = 57 OR teamId = 43 OR  teamId = 44 OR teamId = 50 OR teamId = 52 OR teamId = 55 OR teamId = 45";
								 
	                                  ResultSet resultSet = statement.executeQuery(query);
									  
									while(resultSet.next()) {
							
										
										 TextField NFLAFC = new TextField(resultSet.getString(1));
										 NFLAFC.setPrefWidth(150);
										 TextField NFLAFC2 = new TextField(resultSet.getString(2));
										 NFLAFC2.setPrefWidth(50);
										 NFLAFC2.textProperty().addListener(new ChangeListeners1(NFLAFC2, resultSet.getString(11),1));
										 TextField NFLAFC3 = new TextField(resultSet.getString(3));
										 NFLAFC3.setPrefWidth(50);		
										 NFLAFC3.textProperty().addListener(new ChangeListeners1(NFLAFC3, resultSet.getString(11),2));
										 TextField NFLAFC4 = new TextField(resultSet.getString(4));
										 NFLAFC4.setPrefWidth(50);
										 NFLAFC4.textProperty().addListener(new ChangeListeners1(NFLAFC4, resultSet.getString(11),3));
										 TextField NFLAFC5 = new TextField(resultSet.getString(5));
										 NFLAFC5.setPrefWidth(50);
										 NFLAFC5.textProperty().addListener(new ChangeListeners1(NFLAFC5, resultSet.getString(11),4));
										 TextField NFLAFC6 = new TextField(resultSet.getString(6));
										 NFLAFC6.setPrefWidth(50);
										 NFLAFC6.textProperty().addListener(new ChangeListeners1(NFLAFC6, resultSet.getString(11),5));
										 TextField NFLAFC7 = new TextField(resultSet.getString(7));
										 NFLAFC7.setPrefWidth(150);
										 NFLAFC7.textProperty().addListener(new ChangeListeners1(NFLAFC7, resultSet.getString(11),6));
										 TextField NFLAFC8 = new TextField(resultSet.getString(8));
										 NFLAFC8.setPrefWidth(150);
										 NFLAFC8.textProperty().addListener(new ChangeListeners1(NFLAFC8, resultSet.getString(11),7));
										 TextField NFLAFC9 = new TextField(resultSet.getString(9));
										 NFLAFC9.setPrefWidth(50);
										 NFLAFC9.textProperty().addListener(new ChangeListeners1(NFLAFC9, resultSet.getString(11),8));
										 TextField NFLAFC10 = new TextField(resultSet.getString(10));
										 NFLAFC10.setPrefWidth(50);
										 NFLAFC10.textProperty().addListener(new ChangeListeners1(NFLAFC10, resultSet.getString(11),9));
										
										 paneForNFLAFC.getChildren().addAll(NFLAFC);
									     paneForNFLAFC2.getChildren().addAll(NFLAFC2);
									     paneForNFLAFC3.getChildren().addAll(NFLAFC3);
									     paneForNFLAFC4.getChildren().addAll(NFLAFC4);
									     paneForNFLAFC5.getChildren().addAll(NFLAFC5);
									     paneForNFLAFC6.getChildren().addAll(NFLAFC6);
									     paneForNFLAFC7.getChildren().addAll(NFLAFC7);
									     paneForNFLAFC8.getChildren().addAll(NFLAFC8);
									     paneForNFLAFC9.getChildren().addAll(NFLAFC9);
									     paneForNFLAFC10.getChildren().addAll(NFLAFC10);
									     
									}
									
									     Label NFLAFCS = new Label("American Football Conference (AFC)");
									     NFLAFCS.setTextFill(Color.RED);
									     NFLAFCS.setFont(Font.font("Times", 23));
									     Label NFLAFCS2 = new Label("Team Name");
									     NFLAFCS2.setTextFill(Color.BLUE);
									     Label NFLAFCS3 = new Label("Rank");
									     NFLAFCS3.setTextFill(Color.BLUE);
									     Label NFLAFCS4 = new Label("Win");
									     NFLAFCS4.setTextFill(Color.BLUE);
									     Label NFLAFCS5 = new Label("Lose");
									     NFLAFCS5.setTextFill(Color.BLUE);
									     Label NFLAFCS6 = new Label("Tied");
									     NFLAFCS6.setTextFill(Color.BLUE);
									     Label NFLAFCS7 = new Label("Win Percent");
									     NFLAFCS7.setTextFill(Color.BLUE);
									     Label NFLAFCS8 = new Label("Home Record");
									     NFLAFCS8.setTextFill(Color.BLUE);
									     Label NFLAFCS9 = new Label("Away Record");
									     NFLAFCS9.setTextFill(Color.BLUE);
									     Label NFLAFCS10 = new Label("Conference Record");
									     NFLAFCS10.setTextFill(Color.BLUE);
									     Label NFLAFCS11 = new Label("Streak");
									     NFLAFCS11.setTextFill(Color.BLUE);
								
									     
									     paneForNFLAFCS.getChildren().addAll(NFLAFCS2, paneForNFLAFC);
									     paneForNFLAFCS2.getChildren().addAll(NFLAFCS3, paneForNFLAFC2);
									     paneForNFLAFCS3.getChildren().addAll(NFLAFCS4, paneForNFLAFC3);
									     paneForNFLAFCS4.getChildren().addAll(NFLAFCS5, paneForNFLAFC4);
									     paneForNFLAFCS5.getChildren().addAll(NFLAFCS6, paneForNFLAFC5);
									     paneForNFLAFCS6.getChildren().addAll(NFLAFCS7, paneForNFLAFC6);
									     paneForNFLAFCS7.getChildren().addAll(NFLAFCS8, paneForNFLAFC7);
									     paneForNFLAFCS8.getChildren().addAll(NFLAFCS9, paneForNFLAFC8);
									     paneForNFLAFCS9.getChildren().addAll(NFLAFCS10, paneForNFLAFC9);
									     paneForNFLAFCS10.getChildren().addAll(NFLAFCS11, paneForNFLAFC10);
									     
									     paneForNFLAFCS1.getChildren().addAll(paneForNFLAFCS, paneForNFLAFCS2, 
									    		 paneForNFLAFCS3, paneForNFLAFCS4, paneForNFLAFCS5, 
									    		 paneForNFLAFCS6, paneForNFLAFCS7, paneForNFLAFCS8, paneForNFLAFCS9, paneForNFLAFCS10);
									     
									     paneForNFLAFCStandings.getChildren().addAll(NFLAFCS, paneForNFLAFCS1);
									     
									     paneForNFLAFCLogo.getChildren().addAll(iV4, paneForNFLAFCStandings);
									     
									     paneForNFLS.getChildren().addAll(paneForNFLNFCLogo, paneForNFLAFCLogo);
									     
									     paneForNFLSButton3.getChildren().addAll(NBANFLBackButton, logOutButton);
									     spNFLStandings.setContent(paneForNFLS);
										 bpNFLStandings.setRight(spNFLStandings);
										 bpNFLStandings.setBottom(paneForNFLSButton3);
									     bpNFLStandings.setCenter(paneForNFLS);
									       
									       spNFLStandings.setContent(paneForNFLS);
										   bpNFLStandings.setRight(spNFLStandings);
										   bpNFLStandings.setBottom(paneForNFLSButton3);
									       bpNFLStandings.setCenter(paneForNFLS);
									     
									       primaryStage.setTitle("NFL Standings");
									       primaryStage.setScene(sceneNFLStandings);
									       primaryStage.setHeight(500);
									       primaryStage.setWidth(1080);
									       primaryStage.show();
									       
									       logOutButton.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
       				    					
	          				    				 public void handle(ActionEvent event) {
	          				    					 Label lbLogout = new Label("You have logout \n" + "Have a great day!");
	          				    					 lbLogout.setFont(Font.font("Times", 23));
	          				    					 bpLogout.setTop(lbLogout);
	          				    					 
	          				    					 primaryStage.setTitle("Logout page");
	          				    					 primaryStage.setScene(sceneLogout);
	          				    					 primaryStage.setHeight(150);
	        				    					 primaryStage.setWidth(200);
	          				    					 primaryStage.show();
	          				    							 
	          				    				 }
	          						         });
								} catch (SQLException e) {
										
										e.printStackTrace();
									}
							 }
					   });
					   NBANFLBackButton.setOnAction(click -> {
						   primaryStage.setTitle("NFL League");
						   primaryStage.setScene(NFLLeague);
						   primaryStage.setHeight(700);
						   primaryStage.setWidth(920);
					 });
				 } 
        	});
        	}
		});
	
		primaryStage.setTitle("Administrator");
		primaryStage.setScene(scene1);
		primaryStage.setHeight(300);
		primaryStage.setWidth(300);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	

	class ChangeListeners implements ChangeListener<String> {

	    private TextField tf;
        private String teamId;
        private int column;
	    public ChangeListeners(TextField tf, String teamId, int column) {
	        this.tf = tf;
	        this.teamId = teamId;
	        this.column = column;
	    }

	    public void changed(ObservableValue<? extends String> observable, String beforeData, String afterData) {
	        String setString = null;
	        
	        switch  (column) {
	          case 1 :
	        	  setString = " set Rank =  "; 
	        	   break;
	          case 2 :
	        	  setString = " set winRecord =  "; 
	        	    break;
	          case 3 : 
	        	  setString = " set loseRecord =  "; 
	        	  break;
	          case 4 : 
	        	  setString = " set tiedRecord = ";
	          case 5 : 
	        	  setString = " set winPercent =  "; 
	        	  break;
	          case 6 : 
	        	  setString = " set homeRecord =  "; 
	        	  break;
	          case 7 : 
	        	  setString = " set awayRecord =  "; 
	        	  break;
	          case 8 : 
	        	  setString = " set conferenceRecord =  "; 
	        	  break;
	          case 9 : 
	        	  setString = " set streak =  "; 
	        	  break;
	        	  
	        }
	        
	      String sql = "UPDATE standing  " + setString + "'" + afterData + "' WHERE team_teamId =   " + teamId;
                 try {
					statement.executeUpdate(sql);
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
                 
	    }
	}
	class ChangeListeners1 implements ChangeListener<String> {

	    private TextField tf;
        private String teamId;
        private int column;
	    public ChangeListeners1(TextField tf, String teamId, int column) {
	        this.tf = tf;
	        this.teamId = teamId;
	        this.column = column;
	    }

	    public void changed(ObservableValue<? extends String> observable, String beforeData, String afterData) {
	        String setString = null;
	        
	        switch  (column) {
	          case 1 :
	        	  setString = " set Rank =  "; 
	        	   break;
	          case 2 :
	        	  setString = " set winRecord =  "; 
	        	    break;
	          case 3 : 
	        	  setString = " set loseRecord =  "; 
	        	  break;
	          case 4 : 
	        	  setString = " set winPercent =  "; 
	        	  break;
	          case 5 : 
	        	  setString = " set homeRecord =  "; 
	        	  break;
	          case 6 : 
	        	  setString = " set awayRecord =  "; 
	        	  break;
	          case 7 : 
	        	  setString = " set conferenceRecord =  "; 
	        	  break;
	          case 8 : 
	        	  setString = " set streak =  "; 
	        	  break;
	        	  
	        }
	        
	      String sql = "UPDATE standing  " + setString + "'" + afterData + "' WHERE team_teamId =   " + teamId;
                 try {
					statement.executeUpdate(sql);
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
                 
	    }
	}
	class ChangeListeners2 implements ChangeListener<String> {

	    private TextField tf;
        private String gamesId;
        private int column;
	    public ChangeListeners2(TextField tf, String gamesId, int column) {
	        this.tf = tf;
	        this.gamesId = gamesId;
	        this.column = column;
	    }

	    public void changed(ObservableValue<? extends String> observable, String beforeData, String afterData) {
	        String setString = null;
	        
	        switch  (column) {
	          case 1 :
	        	  setString = " set date =  "; 
	        	   break;
	          case 2 :
	        	  setString = " set awayTeam =  "; 
	        	    break;
	          case 3 : 
	        	  setString = " set awayTeamScore =  "; 
	        	  break;
	          case 4 : 
	        	  setString = " set homeTeam =  "; 
	        	  break;
	          case 5 : 
	        	  setString = " set homeTeamScore =  "; 
	        	  break;
	          case 6 : 
	        	  setString = " set time =  "; 
	        	  break;
	          case 7 : 
	        	  setString = " set nationalTv =  "; 
	        	  break;
	          case 8 : 
	        	  setString = " set arenaName =  "; 
	        	  break;
	          case 9 : 
	        	  setString = " set ticketPrice = ";
	        	  break;
	        	  
	        }
	        
	      String sql = "UPDATE games  " + setString + "'" + afterData + "' WHERE gamesId =   " + gamesId;
                 try {
					statement.executeUpdate(sql);
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
                 
	    }
	}
	private  NBALogo findLogoForNBATeam(String TeamName, ArrayList<NBALogo> logos) {
		NBALogo logo = null;
		for (NBALogo l : logos) {
			if(l.getName().equals(TeamName)){
				logo = l;
				
			}
		}
		return logo;
	}
		
	private  NFLLogo findNFLLogoForTeam(String TeamName, ArrayList<NFLLogo> NFLlogos) {
		NFLLogo NFLlogo = null;
		for (NFLLogo NFLl : NFLlogos) {
			if(NFLl.getName().equals(TeamName)){
				NFLlogo = NFLl;
				
			}
		}
		return NFLlogo;
	}
   private String buildTeamRoster (String TeamName) {
	   
	        //NBATeam//
	 		BorderPane NBATeamRoster = new BorderPane();
	 		VBox paneForNBATR = new VBox(10);
	 		VBox paneForNBATR2 = new VBox(10);
	 		VBox paneForNBATR3 = new VBox(10);
	 		VBox paneForNBATR4 = new VBox(10);
	 		VBox paneForNBATR5 = new VBox(10);
	 		VBox paneForNBATR6 = new VBox(10);
	 		VBox paneForNBATR7 = new VBox(10);
	 		VBox paneForNBATeamRoster1 = new VBox(10);
	 		VBox paneForNBATeamRoster2 = new VBox(10);
	 		VBox paneForNBATeamRoster3 = new VBox(10);
	 		VBox paneForNBATeamRoster4 = new VBox(10);
	 		VBox paneForNBATeamRoster5 = new VBox(10);
	 		VBox paneForNBATeamRoster6 = new VBox(10);
	 		VBox paneForNBATeamRoster7 = new VBox(10);
	 		HBox paneForNBATeamsTR = new HBox(10);
	 		Scene sceneNBATR = new Scene(NBATeamRoster);
	 		
	 		
	 		 Label NBATeams = new Label("Jersey Number");
	 		 NBATeams.setTextFill(Color.RED);
			 Label NBATeams2 = new Label("Player Name");
			 NBATeams2.setTextFill(Color.BLUE);
			 Label NBATeams3 = new Label("Position ");
			 NBATeams3.setTextFill(Color.RED);
			 Label NBATeams4 = new Label("Height");
			 NBATeams4.setTextFill(Color.BLUE);
			 Label NBATeams5 = new Label("Weight");
			 NBATeams5.setTextFill(Color.RED);
			 Label NBATeams6 = new Label("Experience");
			 NBATeams6.setTextFill(Color.BLUE);
			 Label NBATeams7 = new Label("College");
			 NBATeams7.setTextFill(Color.RED);
			 
			 Stage primaryStage = new Stage();
			 
			 
			  String [][] querys = new String [] [] {
					  {"Atlanta Hawks", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 1 AND 17"},
					  {"Boston Celtics", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 18 AND 34"},
					  {"Brooklyn Nets", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 35 AND 50"},
					  {"Charlotte Hornets", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 51 AND 66"},
					  {"Chicago Bulls", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 67 AND 83"},
					  {"Cleveland Cavaliers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 84 AND 100"},
					  {"Dallas Mavericks", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 101 AND 117"},
					  {"Denver Nuggets", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 118 AND 136"},
					  {"Detroit Pistons", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 135 AND 151"},
					  {"Golden State Warriors", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 152 AND 168"},
					  {"Houston Rockets", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 169 AND 185"},
					  {"Indiana Pacers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 186 AND 202"},
					  {"Los Angeles Clippers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 203 AND 218"},
					  {"Los Angeles Lakers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 219 AND 235"},
					  {"Memphis Grizzlies", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 236 AND 251"},
					  {"Miami Heat", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 252 AND 267"},
					  {"Milwaukee Bucks", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 268 AND 283"},
					  {"Minnesota Timberwolves", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 284 AND 299"},
					  {"New Orleans Pelicans", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 300 AND 316"},
					  {"New York Knicks", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 317 AND 333"},
					  {"Oklahoma City Thunders", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 334 AND 350"},
					  {"Orlando Magic", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 351 AND 366"},
					  {"Philadelphia 76ers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 367 AND 383"},
					  {"Phoenix Suns", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 384 AND 399"},
					  {"Portland Trail Blazers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 400 AND 416"},
					  {"Sacramento Kings", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 417 AND 432"},
					  {"San Antonio Spurs", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 433 AND 450"},
					  {"Toronto Raptors", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 451 AND 468"},
					  {"Utah Jazz", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 469 AND 484"},
					  {"Washington Wizards", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 485 AND 501"}
			  };
			     String queryString = null;
			    for(int i = 0; i < 30; i++) {
			    	if(querys [i] [0].equals(TeamName)) {
			    		queryString = querys [i] [1]; 
			    		break;
			    	}
			    }
			  
			     try {
      	 
			
			
		    ResultSet resultSet = statement.executeQuery(queryString);
			
			while(resultSet.next()) {
				 TextField Team = new TextField(resultSet.getString(1));
				 Team.setMaxWidth(150);
				 Team.textProperty().addListener(new ChangeListenersForNBFL(Team, resultSet.getString(8),1));
				 TextField Team2 = new TextField(resultSet.getString(2));
				 Team2.setMaxWidth(150);
				 Team2.textProperty().addListener(new ChangeListenersForNBFL(Team2, resultSet.getString(8),2));
				 TextField Team3 = new TextField(resultSet.getString(3));
				 Team3.setMaxWidth(150);
				 Team3.textProperty().addListener(new ChangeListenersForNBFL(Team3, resultSet.getString(8),3));
				 TextField Team4 = new TextField(resultSet.getString(4));
				 Team4.setMaxWidth(100);
				 Team4.textProperty().addListener(new ChangeListenersForNBFL(Team4, resultSet.getString(8),4));
				 TextField Team5 = new TextField(resultSet.getString(5));
				 Team5.setMaxWidth(100);
				 Team5.textProperty().addListener(new ChangeListenersForNBFL(Team5, resultSet.getString(8),5));
				 TextField Team6 = new TextField(resultSet.getString(6));
				 Team6.setMaxWidth(100);
				 Team6.textProperty().addListener(new ChangeListenersForNBFL(Team6, resultSet.getString(8),6));
				 TextField Team7 = new TextField(resultSet.getString(7));
				 Team7.setMaxWidth(150);
				 Team7.textProperty().addListener(new ChangeListenersForNBFL(Team7, resultSet.getString(8),7));
				 
				 paneForNBATR.getChildren().addAll(Team); 
				 paneForNBATR2.getChildren().addAll(Team2);
				 paneForNBATR3.getChildren().addAll(Team3);
				 paneForNBATR4.getChildren().addAll(Team4);
				 paneForNBATR5.getChildren().addAll(Team5);
				 paneForNBATR6.getChildren().addAll(Team6);
				 paneForNBATR7.getChildren().addAll(Team7);
				 
			
				    
			}
			    paneForNBATeamRoster1.getChildren().addAll(NBATeams, paneForNBATR);
			    paneForNBATeamRoster2.getChildren().addAll(NBATeams2, paneForNBATR2);
			    paneForNBATeamRoster3.getChildren().addAll(NBATeams3, paneForNBATR3);
			    paneForNBATeamRoster4.getChildren().addAll(NBATeams4, paneForNBATR4);
			    paneForNBATeamRoster5.getChildren().addAll(NBATeams5, paneForNBATR5);
			    paneForNBATeamRoster6.getChildren().addAll(NBATeams6, paneForNBATR6);
			    paneForNBATeamRoster7.getChildren().addAll(NBATeams7, paneForNBATR7);
			    
			    paneForNBATeamsTR.getChildren().addAll(paneForNBATeamRoster1, 
			    		paneForNBATeamRoster2, paneForNBATeamRoster3, paneForNBATeamRoster4, 
			    		paneForNBATeamRoster5, paneForNBATeamRoster6, paneForNBATeamRoster7);
			    
			    NBATeamRoster.setTop(paneForNBATeamsTR); 
			    primaryStage.setTitle(TeamName + " Team Roster");
			    primaryStage.setScene(sceneNBATR);
			    primaryStage.setHeight(700);
			    primaryStage.setWidth(850);
			    primaryStage.show();
			    
	
	 }catch (Exception e) {
			e.printStackTrace();
			
	 } 
	   
				return queryString;	
   }
   private String buildNFLTeamRoster (String TeamName) {
	        //NFLTeam//
	 		BorderPane NFLTeamRoster = new BorderPane();
	 		VBox paneForNFLTR = new VBox(10);
	 		VBox paneForNFLTR2 = new VBox(10);
	 		VBox paneForNFLTR3 = new VBox(10);
	 		VBox paneForNFLTR4 = new VBox(10);
	 		VBox paneForNFLTR5 = new VBox(10);
	 		VBox paneForNFLTR6 = new VBox(10);
	 		VBox paneForNFLTR7 = new VBox(10);
	 		VBox paneForNFLTeamRoster = new VBox(10);
	 		VBox paneForNFLTeamRoster2 = new VBox(10);
	 		VBox paneForNFLTeamRoster3 = new VBox(10);
	 		VBox paneForNFLTeamRoster4 = new VBox(10);
	 		VBox paneForNFLTeamRoster5 = new VBox(10);
	 		VBox paneForNFLTeamRoster6 = new VBox(10);
	 		VBox paneForNFLTeamRoster7 = new VBox(10);
	 		HBox paneForNFLTeamTR = new HBox(10);
	 		ScrollPane spNFLTR = new ScrollPane();
	 		Scene scene7 = new Scene(NFLTeamRoster);
	 		
		    Label NFLTeams = new Label("Jersey Number");
		    NFLTeams.setTextFill(Color.BLUE);
		    Label NFLTeams2 = new Label("Player Name");
		    NFLTeams2.setTextFill(Color.RED);
		    Label NFLTeams3 = new Label("Position ");
		    NFLTeams3.setTextFill(Color.BLUE);
		    Label NFLTeams4 = new Label("Height");
		    NFLTeams4.setTextFill(Color.RED);
		    Label NFLTeams5 = new Label("Weight");
		    NFLTeams5.setTextFill(Color.BLUE);
		    Label NFLTeams6 = new Label("Experience");
		    NFLTeams6.setTextFill(Color.RED);
		    Label NFLTeams7 = new Label("College");
		    NFLTeams7.setTextFill(Color.BLUE);

		    Stage primaryStage = new Stage();
		    
		 
		    String [][] queryNFL = new String [] [] {
				  {"Arizona Cardinals", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 502 AND 577"},
				  {"Atlanta Falcons", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 578 AND 650"},
				  {"Baltimore Ravens", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 651 AND 731"},
				  {"Buffalo Bills", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 732 AND 800"},
				  {"Carolina Panthers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 801 AND 867"},
				  {"Chicago Bears", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 868 AND 937"},
				  {"Cincinnati Bengals", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 938 AND 1003"},
				  {"Cleveland Browns", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 1004 AND 1070"},
				  {"Dallas Cowboys", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 1071 AND 1143"},
				  {"Denver Broncos", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 1144 AND 1222"},
				  {"Detroit Lions", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 1223 AND 1298"},
				  {"Green Bay Packers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 1299 AND 1369"},
				  {"Houston Texans", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 1370 AND 1436"},
				  {"Indianapolis Colts", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 1437 AND 1512"},
				  {"Jacksonville Jaguars", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 1513 AND 1579"},
				  {"Kansas City Chiefs", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 1580 AND 1646"},
				  {"Las Vegas Raiders", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 1647 AND 1719"},
				  {"Los Angeles Chargers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 1720 AND 1789"},
				  {"Los Angeles Rams", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 1790 AND 1864"},
				  {"Miami Dolphins", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 1865 AND 1935"},
				  {"Minnesota Vikings", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 1936 AND 2012"},
				  {"New England Patriots", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 2013 AND 2090"},
				  {"New Orleans Saints", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 2091 AND 2164"},
				  {"New York Giants", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 2165 AND 2241"},
				  {"New York Jets", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 2242 AND 2318"},
				  {"Philadelphia Eagles", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 2319 AND 2391"},
				  {"Pittsbutgh Steelers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 2392 AND 2465"},
				  {"San Francisco 49ers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 2466 AND 2538"},
				  {"Seattle Seahawks", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 2539 AND 2612"},
				  {"Tampa Bay Buccaneers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 2613 AND 2687"},
				  {"Tennessee Titans", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 2688 AND 2762"},
				  {"Washington Football Team", "SELECT jerseyNumber, playerName, position, height, weight, experience, college, teamRosterId FROM teamroster WHERE teamRosterId Between 2763 AND 2830"}
		    };
		     String queryStringNFL = null;
		    for(int i = 0; i < 32; i++) {
		    	if(queryNFL [i] [0].equals(TeamName)) {
		    		queryStringNFL = queryNFL [i] [1]; 
		    		break;
		    	}
		    }
		  
		    try {
				  
				
				
			    ResultSet resultSet = statement.executeQuery(queryStringNFL);
				
				while(resultSet.next()) {
					 TextField NFLTeam = new TextField(resultSet.getString(1));
					 NFLTeam.setMaxWidth(100);
					 NFLTeam.textProperty().addListener(new ChangeListenersForNBFL(NFLTeam, resultSet.getString(8),1));
					 TextField NFLTeam2 = new TextField(resultSet.getString(2));
					 NFLTeam2.setMaxWidth(150);
					 NFLTeam2.textProperty().addListener(new ChangeListenersForNBFL(NFLTeam, resultSet.getString(8),2));
					 TextField NFLTeam3 = new TextField(resultSet.getString(3));
					 NFLTeam3.setMaxWidth(150);
					 NFLTeam3.textProperty().addListener(new ChangeListenersForNBFL(NFLTeam, resultSet.getString(8),3));
					 TextField NFLTeam4 = new TextField(resultSet.getString(4));
					 NFLTeam3.setMaxWidth(100);
					 NFLTeam4.textProperty().addListener(new ChangeListenersForNBFL(NFLTeam, resultSet.getString(8),4));
					 TextField NFLTeam5 = new TextField(resultSet.getString(5));
					 NFLTeam5.setMaxWidth(100);
					 NFLTeam5.textProperty().addListener(new ChangeListenersForNBFL(NFLTeam, resultSet.getString(8),5));
					 TextField NFLTeam6 = new TextField(resultSet.getString(6));
					 NFLTeam6.setMaxWidth(100);
					 NFLTeam6.textProperty().addListener(new ChangeListenersForNBFL(NFLTeam, resultSet.getString(8),6));
					 TextField NFLTeam7 = new TextField(resultSet.getString(7));
					 NFLTeam7.textProperty().addListener(new ChangeListenersForNBFL(NFLTeam, resultSet.getString(8),7));
					 NFLTeam7.setMaxWidth(150);
					 paneForNFLTR.getChildren().addAll(NFLTeam); 
					 paneForNFLTR2.getChildren().addAll(NFLTeam2);
					 paneForNFLTR3.getChildren().addAll(NFLTeam3);
					 paneForNFLTR4.getChildren().addAll(NFLTeam4);
					 paneForNFLTR5.getChildren().addAll(NFLTeam5);
					 paneForNFLTR6.getChildren().addAll(NFLTeam6);
					 paneForNFLTR7.getChildren().addAll(NFLTeam7);
					 
				
					    
				}
				    paneForNFLTeamRoster.getChildren().addAll(NFLTeams, paneForNFLTR);
				    paneForNFLTeamRoster2.getChildren().addAll(NFLTeams2, paneForNFLTR2);
				    paneForNFLTeamRoster3.getChildren().addAll(NFLTeams3, paneForNFLTR3);
				    paneForNFLTeamRoster4.getChildren().addAll(NFLTeams4, paneForNFLTR4);
				    paneForNFLTeamRoster5.getChildren().addAll(NFLTeams5, paneForNFLTR5);
				    paneForNFLTeamRoster6.getChildren().addAll(NFLTeams6, paneForNFLTR6);
				    paneForNFLTeamRoster7.getChildren().addAll(NFLTeams7, paneForNFLTR7);
				    
				    paneForNFLTeamTR.getChildren().addAll(paneForNFLTeamRoster, 
				    		paneForNFLTeamRoster2, paneForNFLTeamRoster3, paneForNFLTeamRoster4, 
				    		paneForNFLTeamRoster5, paneForNFLTeamRoster6, paneForNFLTeamRoster7);
				    
				    spNFLTR.setContent(paneForNFLTeamTR);						    
					NFLTeamRoster.setRight(spNFLTR);
				    NFLTeamRoster.setTop(paneForNFLTeamTR);
				    primaryStage.setTitle(TeamName + " Team Roster");
				    primaryStage.setScene(scene7);
				    primaryStage.setHeight(700);
				    primaryStage.setWidth(900);
				    primaryStage.show();
				    
				   
		 }catch (Exception e) {
				e.printStackTrace();
				
		}	
			return queryStringNFL;	

	   	  

}
   class ChangeListenersForNBFL implements ChangeListener<String> {

	    private TextField tf;
        private String teamRosterId;
        private int column;
	    public ChangeListenersForNBFL (TextField tf, String teamRosterId, int column) {
	        this.tf = tf;
	        this.teamRosterId = teamRosterId;
	        this.column = column;
	    }

	    public void changed(ObservableValue<? extends String> observable, String beforeData, String afterData) {
	        String setString = null;
	        
	        switch  (column) {
	          case 1 :
	        	  setString = " set jerseyNumber =  "; 
	        	   break;
	          case 2 :
	        	  setString = " set playerName =  "; 
	        	    break;
	          case 3 : 
	        	  setString = " set position =  "; 
	        	  break;
	          case 4 : 
	        	  setString = " set height =  "; 
	        	  break;
	          case 5 : 
	        	  setString = " set weight =  "; 
	        	  break;
	          case 6 : 
	        	  setString = " set experience =  "; 
	        	  break;
	          case 7 : 
	        	  setString = " set college =  "; 
	        	  break;
	        	  
	        }
	        
	      String sql = "UPDATE teamroster  " + setString + "'" + afterData + "' WHERE teamRosterId =   " + teamRosterId;
                 try {
					statement.executeUpdate(sql);
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
                 
	    }
	} 
}
