package sportFans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;

import javafx.scene.control.ToggleGroup;
public class SportFans extends Application {

	double width = 600;
	double height = 600;
	Connection connect = null;
	Statement statement = null;
	public void start(Stage primaryStage) {	
		try {
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/nbfl", "root", "");
			statement = connect.createStatement();
			
		}catch (Exception e) {
			e.printStackTrace();
			
	}	
		BorderPane borderPane = new BorderPane();
		VBox paneForNBA = new VBox(10);
		VBox paneForNFL = new VBox(10);
		HBox paneForLeague = new HBox(10);
		Scene scene1 = new Scene(borderPane);
		
		//scene2//
		BorderPane bp = new BorderPane();
		VBox paneForNBATeamHC = new VBox(10);
		VBox paneForNBASchedule = new VBox(10);
		VBox paneForNBAStandings = new VBox(10);
		HBox paneForNBALeague = new HBox(10);
		ScrollPane scrollBarNBATHC = new ScrollPane();
		Scene scene2 = new Scene(bp);
	
		//scene4//
		BorderPane borderPane2 = new BorderPane();
		HBox paneForRadioButton = new HBox(10);
		VBox paneForNBAgames = new VBox(10);
		VBox paneForNBAgames2 = new VBox(10);
		VBox paneForNBAgames3 = new VBox(10);
		VBox paneForNBAgames4 = new VBox(10);
		VBox paneForNBAgames5 = new VBox(10);
		VBox paneForNBAgames6 = new VBox(10);
		VBox paneForNBAgames7 = new VBox(10);
		VBox paneForNBAgames8 = new VBox(10);
		VBox paneForNBAgames9 = new VBox(10);
		VBox paneForLabel = new VBox(10);
		VBox paneForLabel2 = new VBox(10);
		VBox paneForLabel3 = new VBox(10);
		VBox paneForLabel4 = new VBox(10);
		VBox paneForLabel5 = new VBox(10);
		VBox paneForLabel6 = new VBox(10);
		VBox paneForLabel7 = new VBox(10);
		VBox paneForLabel8 = new VBox(10);
		VBox paneForLabel9 = new VBox(10);
		HBox paneForNBAg = new HBox(10);
		VBox paneForNBANovgames = new VBox(10);
		VBox paneForNBANovgames2 = new VBox(10);
		VBox paneForNBANovgames3 = new VBox(10);
		VBox paneForNBANovgames4 = new VBox(10);
		VBox paneForNBANovgames5 = new VBox(10);
		VBox paneForNBANovgames6 = new VBox(10);
		VBox paneForNBANovgames7 = new VBox(10);
		VBox paneForNBANovgames8 = new VBox(10);
		VBox paneForNBANovgames9 = new VBox(10);
		VBox paneForNovLabel = new VBox(10);
		VBox paneForNovLabel2 = new VBox(10);
		VBox paneForNovLabel3 = new VBox(10);
		VBox paneForNovLabel4 = new VBox(10);
		VBox paneForNovLabel5 = new VBox(10);
		VBox paneForNovLabel6 = new VBox(10);
		VBox paneForNovLabel7 = new VBox(10);
		VBox paneForNovLabel8 = new VBox(10);
		VBox paneForNovLabel9 = new VBox(10);
		HBox paneForNBANovg = new HBox(10);
		VBox paneForNBADecgames = new VBox(10);
		VBox paneForNBADecgames2 = new VBox(10);
		VBox paneForNBADecgames3 = new VBox(10);
		VBox paneForNBADecgames4 = new VBox(10);
		VBox paneForNBADecgames5 = new VBox(10);
		VBox paneForNBADecgames6 = new VBox(10);
		VBox paneForNBADecgames7 = new VBox(10);
		VBox paneForNBADecgames8 = new VBox(10);
		VBox paneForNBADecgames9 = new VBox(10);
		VBox paneForDecLabel = new VBox(10);
		VBox paneForDecLabel2 = new VBox(10);
		VBox paneForDecLabel3 = new VBox(10);
		VBox paneForDecLabel4 = new VBox(10);
		VBox paneForDecLabel5 = new VBox(10);
		VBox paneForDecLabel6 = new VBox(10);
		VBox paneForDecLabel7 = new VBox(10);
		VBox paneForDecLabel8 = new VBox(10);
		VBox paneForDecLabel9 = new VBox(10);
		HBox paneForNBADecg = new HBox(10);
		VBox paneForNBAJangames = new VBox(10);
		VBox paneForNBAJangames2 = new VBox(10);
		VBox paneForNBAJangames3 = new VBox(10);
		VBox paneForNBAJangames4 = new VBox(10);
		VBox paneForNBAJangames5 = new VBox(10);
		VBox paneForNBAJangames6 = new VBox(10);
		VBox paneForNBAJangames7 = new VBox(10);
		VBox paneForNBAJangames8 = new VBox(10);
		VBox paneForNBAJangames9 = new VBox(10);
		VBox paneForJanLabel = new VBox(10);
		VBox paneForJanLabel2 = new VBox(10);
		VBox paneForJanLabel3 = new VBox(10);
		VBox paneForJanLabel4 = new VBox(10);
		VBox paneForJanLabel5 = new VBox(10);
		VBox paneForJanLabel6 = new VBox(10);
		VBox paneForJanLabel7 = new VBox(10);
		VBox paneForJanLabel8 = new VBox(10);
		VBox paneForJanLabel9 = new VBox(10);
		HBox paneForNBAJang = new HBox(10);
		VBox paneForNBAFebgames = new VBox(10);
		VBox paneForNBAFebgames2 = new VBox(10);
		VBox paneForNBAFebgames3 = new VBox(10);
		VBox paneForNBAFebgames4 = new VBox(10);
		VBox paneForNBAFebgames5 = new VBox(10);
		VBox paneForNBAFebgames6 = new VBox(10);
		VBox paneForNBAFebgames7 = new VBox(10);
		VBox paneForNBAFebgames8 = new VBox(10);
		VBox paneForNBAFebgames9 = new VBox(10);
		VBox paneForFebLabel = new VBox(10);
		VBox paneForFebLabel2 = new VBox(10);
		VBox paneForFebLabel3 = new VBox(10);
		VBox paneForFebLabel4 = new VBox(10);
		VBox paneForFebLabel5 = new VBox(10);
		VBox paneForFebLabel6 = new VBox(10);
		VBox paneForFebLabel7 = new VBox(10);
		VBox paneForFebLabel8 = new VBox(10);
		VBox paneForFebLabel9 = new VBox(10);
		HBox paneForNBAFebg = new HBox(10);
		VBox paneForNBAMarchgames = new VBox(10);
		VBox paneForNBAMarchgames2 = new VBox(10);
		VBox paneForNBAMarchgames3 = new VBox(10);
		VBox paneForNBAMarchgames4 = new VBox(10);
		VBox paneForNBAMarchgames5 = new VBox(10);
		VBox paneForNBAMarchgames6 = new VBox(10);
		VBox paneForNBAMarchgames7 = new VBox(10);
		VBox paneForNBAMarchgames8 = new VBox(10);
		VBox paneForNBAMarchgames9 = new VBox(10);
		VBox paneForMarchLabel = new VBox(10);
		VBox paneForMarchLabel2 = new VBox(10);
		VBox paneForMarchLabel3 = new VBox(10);
		VBox paneForMarchLabel4 = new VBox(10);
		VBox paneForMarchLabel5 = new VBox(10);
		VBox paneForMarchLabel6 = new VBox(10);
		VBox paneForMarchLabel7 = new VBox(10);
		VBox paneForMarchLabel8 = new VBox(10);
		VBox paneForMarchLabel9 = new VBox(10);
		HBox paneForNBAMarchg = new HBox(10);
		VBox paneForNBAAprilgames = new VBox(10);
		VBox paneForNBAAprilgames2 = new VBox(10);
		VBox paneForNBAAprilgames3 = new VBox(10);
		VBox paneForNBAAprilgames4 = new VBox(10);
		VBox paneForNBAAprilgames5 = new VBox(10);
		VBox paneForNBAAprilgames6 = new VBox(10);
		VBox paneForNBAAprilgames7 = new VBox(10);
		VBox paneForNBAAprilgames8 = new VBox(10);
		VBox paneForNBAAprilgames9 = new VBox(10);
		VBox paneForAprilLabel = new VBox(10);
		VBox paneForAprilLabel2 = new VBox(10);
		VBox paneForAprilLabel3 = new VBox(10);
		VBox paneForAprilLabel4 = new VBox(10);
		VBox paneForAprilLabel5 = new VBox(10);
		VBox paneForAprilLabel6 = new VBox(10);
		VBox paneForAprilLabel7 = new VBox(10);
		VBox paneForAprilLabel8 = new VBox(10);
		VBox paneForAprilLabel9 = new VBox(10);
		HBox paneForNBAAprilg = new HBox(10);
		ScrollPane spNBAgames = new ScrollPane();
	    Scene scene4 = new Scene(borderPane2);
		
		//scene5//
		BorderPane borderPane3 = new BorderPane();
		VBox paneForNBAStandingRecord = new VBox(10);
		VBox paneForNBAStandingRecord1 = new VBox(10);
		VBox paneForNBAStandingRecord2 = new VBox(10);
		VBox paneForNBAStandingRecord3 = new VBox(10);
		VBox paneForNBAStandingRecord4 = new VBox(10);
		VBox paneForNBAStandingRecord5 = new VBox(10);
		VBox paneForNBAStandingRecord6 = new VBox(10);
		VBox paneForNBAStandingRecord7 = new VBox(10);
		VBox paneForNBAStandingRecord8 = new VBox(10);
		VBox paneForNBAStandingLabel = new VBox(10);
		VBox paneForNBAStandingLabel1 = new VBox(10);
		VBox paneForNBAStandingLabel2 = new VBox(10);
		VBox paneForNBAStandingLabel3 = new VBox(10);
		VBox paneForNBAStandingLabel4 = new VBox(10);
		VBox paneForNBAStandingLabel5 = new VBox(10);
		VBox paneForNBAStandingLabel6 = new VBox(10);
		VBox paneForNBAStandingLabel7 = new VBox(10);
		VBox paneForNBAStandingLabel8 = new VBox(10);
		HBox paneForNBAS = new HBox(10);
		VBox paneForNBAEC = new VBox(10);
		HBox paneForNBAECLogo = new HBox(10);
		VBox paneForNBASR1 = new VBox(10);
		VBox paneForNBASR2 = new VBox(10);
		VBox paneForNBASR3 = new VBox(10);
		VBox paneForNBASR4 = new VBox(10);
		VBox paneForNBASR5 = new VBox(10);
		VBox paneForNBASR6 = new VBox(10);
		VBox paneForNBASR7 = new VBox(10);
		VBox paneForNBASR8 = new VBox(10);
		VBox paneForNBASR9 = new VBox(10);
		VBox paneForNBASL1 = new VBox(10);
		VBox paneForNBASL2 = new VBox(10);
		VBox paneForNBASL3 = new VBox(10);
		VBox paneForNBASL4 = new VBox(10);
		VBox paneForNBASL5 = new VBox(10);
		VBox paneForNBASL6 = new VBox(10);
		VBox paneForNBASL7 = new VBox(10);
		VBox paneForNBASL8 = new VBox(10);
		VBox paneForNBASL9 = new VBox(10);
		HBox paneForNBAS1 = new HBox(10);
		VBox paneForNBAWC = new VBox(10);
		HBox paneForNBAWCLogo = new HBox(10);
		VBox paneForNBAS2 = new VBox(10);
		ScrollPane spNBAStandings = new ScrollPane();
		Scene scene5 = new Scene(borderPane3);
	
		//scene6//
		BorderPane bp1 = new BorderPane();
		VBox paneForNFLTHC = new VBox(10);
		VBox paneForNFLSchedule = new VBox(10);
		VBox paneForNFLStandings = new VBox(10);
		HBox paneForNFLLeague = new HBox(10);
		ScrollPane spNFLTeam = new ScrollPane();
		Scene scene6 = new Scene(bp1);
		
		//scene8//
		BorderPane bpNFLGames = new BorderPane();
		HBox paneForrbNFLgames = new HBox();
		VBox paneForNFLgames = new VBox(10);
		VBox paneForNFLgames2 = new VBox(10);
		VBox paneForNFLgames3 = new VBox(10);
		VBox paneForNFLgames4 = new VBox(10);
		VBox paneForNFLgames5 = new VBox(10);
		VBox paneForNFLgames6 = new VBox(10);
		VBox paneForNFLgames7 = new VBox(10);
		VBox paneForNFLgames8 = new VBox(10);
		VBox paneForNFLgames9 = new VBox(10);
		VBox paneForlb = new VBox(10);
		VBox paneForlb2 = new VBox(10);
		VBox paneForlb3 = new VBox(10);
		VBox paneForlb4 = new VBox(10);
		VBox paneForlb5 = new VBox(10);
		VBox paneForlb6 = new VBox(10);
		VBox paneForlb7 = new VBox(10);
		VBox paneForlb8 = new VBox(10);
		VBox paneForlb9 = new VBox(10);
		HBox paneForNFLg = new HBox(10);
		VBox paneForNFLOctgames = new VBox(10);
		VBox paneForNFLOctgames2 = new VBox(10);
		VBox paneForNFLOctgames3 = new VBox(10);
		VBox paneForNFLOctgames4 = new VBox(10);
		VBox paneForNFLOctgames5 = new VBox(10);
		VBox paneForNFLOctgames6 = new VBox(10);
		VBox paneForNFLOctgames7 = new VBox(10);
		VBox paneForNFLOctgames8 = new VBox(10);
		VBox paneForNFLOctgames9 = new VBox(10);
		VBox paneForOctlb = new VBox(10);
		VBox paneForOctlb2 = new VBox(10);
		VBox paneForOctlb3 = new VBox(10);
		VBox paneForOctlb4 = new VBox(10);
		VBox paneForOctlb5 = new VBox(10);
		VBox paneForOctlb6 = new VBox(10);
		VBox paneForOctlb7 = new VBox(10);
		VBox paneForOctlb8 = new VBox(10);
		VBox paneForOctlb9 = new VBox(10);
		HBox paneForNFLOctg = new HBox(10);
		VBox paneForNFLNovgames = new VBox(10);
		VBox paneForNFLNovgames2 = new VBox(10);
		VBox paneForNFLNovgames3 = new VBox(10);
		VBox paneForNFLNovgames4 = new VBox(10);
		VBox paneForNFLNovgames5 = new VBox(10);
		VBox paneForNFLNovgames6 = new VBox(10);
		VBox paneForNFLNovgames7 = new VBox(10);
		VBox paneForNFLNovgames8 = new VBox(10);
		VBox paneForNFLNovgames9 = new VBox(10);
		VBox paneForNovlb = new VBox(10);
		VBox paneForNovlb2 = new VBox(10);
		VBox paneForNovlb3 = new VBox(10);
		VBox paneForNovlb4 = new VBox(10);
		VBox paneForNovlb5 = new VBox(10);
		VBox paneForNovlb6 = new VBox(10);
		VBox paneForNovlb7 = new VBox(10);
		VBox paneForNovlb8 = new VBox(10);
		VBox paneForNovlb9 = new VBox(10);
		HBox paneForNFLNovg = new HBox(10);
		VBox paneForNFLDecgames = new VBox(10);
		VBox paneForNFLDecgames2 = new VBox(10);
		VBox paneForNFLDecgames3 = new VBox(10);
		VBox paneForNFLDecgames4 = new VBox(10);
		VBox paneForNFLDecgames5 = new VBox(10);
		VBox paneForNFLDecgames6 = new VBox(10);
		VBox paneForNFLDecgames7 = new VBox(10);
		VBox paneForNFLDecgames8 = new VBox(10);
		VBox paneForNFLDecgames9 = new VBox(10);
		VBox paneForDeclb = new VBox(10);
		VBox paneForDeclb2 = new VBox(10);
		VBox paneForDeclb3 = new VBox(10);
		VBox paneForDeclb4 = new VBox(10);
		VBox paneForDeclb5 = new VBox(10);
		VBox paneForDeclb6 = new VBox(10);
		VBox paneForDeclb7 = new VBox(10);
		VBox paneForDeclb8 = new VBox(10);
		VBox paneForDeclb9 = new VBox(10);
		HBox paneForNFLDecg = new HBox(10);
		VBox paneForNFLJangames = new VBox(10);
		VBox paneForNFLJangames2 = new VBox(10);
		VBox paneForNFLJangames3 = new VBox(10);
		VBox paneForNFLJangames4 = new VBox(10);
		VBox paneForNFLJangames5 = new VBox(10);
		VBox paneForNFLJangames6 = new VBox(10);
		VBox paneForNFLJangames7 = new VBox(10);
		VBox paneForNFLJangames8 = new VBox(10);
		VBox paneForNFLJangames9 = new VBox(10);
		VBox paneForJanlb = new VBox(10);
		VBox paneForJanlb2 = new VBox(10);
		VBox paneForJanlb3 = new VBox(10);
		VBox paneForJanlb4 = new VBox(10);
		VBox paneForJanlb5 = new VBox(10);
		VBox paneForJanlb6 = new VBox(10);
		VBox paneForJanlb7 = new VBox(10);
		VBox paneForJanlb8 = new VBox(10);
		VBox paneForJanlb9 = new VBox(10);
		HBox paneForNFLJang = new HBox(10);
		ScrollPane scrollBarNFL = new ScrollPane();
		Scene scene8 = new Scene(bpNFLGames);
		
		//scene9//
		BorderPane bpNFLS = new BorderPane();
		VBox paneForNFLNFCR = new VBox(10);
		VBox paneForNFLNFCR2 = new VBox(10);
		VBox paneForNFLNFCR3 = new VBox(10);
		VBox paneForNFLNFCR4 = new VBox(10);
		VBox paneForNFLNFCR5 = new VBox(10);
		VBox paneForNFLNFCR6 = new VBox(10);
		VBox paneForNFLNFCR7 = new VBox(10);
		VBox paneForNFLNFCR8 = new VBox(10);
		VBox paneForNFLNFCR9 = new VBox(10);
		VBox paneForNFLNFCR10 = new VBox(10);
		VBox paneForNFLNFCL = new VBox(10);
		VBox paneForNFLNFCL2 = new VBox(10);
		VBox paneForNFLNFCL3 = new VBox(10);
		VBox paneForNFLNFCL4 = new VBox(10);
		VBox paneForNFLNFCL5 = new VBox(10);
		VBox paneForNFLNFCL6 = new VBox(10);
		VBox paneForNFLNFCL7 = new VBox(10);
		VBox paneForNFLNFCL8 = new VBox(10);
		VBox paneForNFLNFCL9 = new VBox(10);
		VBox paneForNFLNFCL10 = new VBox(10);
		HBox paneForNFLS = new HBox(10);
		VBox paneForNFLNFC = new VBox(10);
		HBox paneForNFLNFCLogo = new HBox(10);
		VBox paneForNFLAFCR = new VBox(10);
		VBox paneForNFLAFCR2 = new VBox(10);
		VBox paneForNFLAFCR3 = new VBox(10);
		VBox paneForNFLAFCR4 = new VBox(10);
		VBox paneForNFLAFCR5 = new VBox(10);
		VBox paneForNFLAFCR6 = new VBox(10);
		VBox paneForNFLAFCR7 = new VBox(10);
		VBox paneForNFLAFCR8 = new VBox(10);
		VBox paneForNFLAFCR9 = new VBox(10);
		VBox paneForNFLAFCR10 = new VBox(10);
		VBox paneForNFLAFCL = new VBox(10);
		VBox paneForNFLAFCL2 = new VBox(10);
		VBox paneForNFLAFCL3 = new VBox(10);
		VBox paneForNFLAFCL4 = new VBox(10);
		VBox paneForNFLAFCL5 = new VBox(10);
		VBox paneForNFLAFCL6 = new VBox(10);
		VBox paneForNFLAFCL7 = new VBox(10);
		VBox paneForNFLAFCL8 = new VBox(10);
		VBox paneForNFLAFCL9 = new VBox(10);
		VBox paneForNFLAFCL10 = new VBox(10);
		HBox paneForNFLS1 = new HBox(10);
		VBox paneForNFLAFC = new VBox(10);
		HBox paneForNFLAFCLogo = new HBox(10);
		VBox paneForNFLSL = new VBox(10);
		ScrollPane spNFLStandings = new ScrollPane();
		Scene scene9 = new Scene(bpNFLS);
		
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
			
			Button backButton = new Button("Go to the previous page");
			Button backButton1 = new Button("Go back to the first page");
			
			Image Image = new Image("nba30teamlogo.jpg");
			ImageView imageView1 = new ImageView(Image);
			imageView1.setFitHeight(200);
			imageView1.setFitWidth(200);
			
			Image Image2 = new Image("nfl32teamlogo.jpg");
			ImageView imageView2 = new ImageView(Image2);
			imageView2.setFitHeight(200);
			imageView2.setFitWidth(200);
	
			
	        Button button = new Button("NBA");
	        Button bt = new Button("NFL");
	   
	        paneForNBA.getChildren().addAll(imageView1,button);
	        paneForNFL.getChildren().addAll(imageView2, bt);
	        paneForLeague.getChildren().addAll(paneForNBA, paneForNFL);
	        borderPane.setCenter(paneForLeague);
	       
	        button.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
				
			   public void handle(ActionEvent event) {
				 
				 Button NBATeamButton = null ;
				    
				 Label LB1 = new Label("Team Name/Head Coach");
				 LB1.setTextFill(Color.BLUE);
				 LB1.setFont(Font.font("Times", 23));
				 LB1.setContentDisplay(ContentDisplay.LEFT);
				 Label LB2 = new Label("Schedule");
				 LB2.setFont(Font.font("Times", 23));
				 LB2.setContentDisplay(ContentDisplay.CENTER);
				 LB2.setTextFill(Color.RED);
			     Label LB3 = new Label("Standings");
			     LB3.setTextFill(Color.BLUE);
			     LB3.setFont(Font.font("Times", 23));
			     LB3.setContentDisplay(ContentDisplay.RIGHT);
			     NBATeam NBATeam = null;
			
			     paneForNBATeamHC.getChildren().add(LB1);
			     
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
				     bp.setLeft(scrollBarNBATHC);
		            Image image3 = new Image("nba2021-2022RSschedule.jpg");
				     ImageView imageView3 = new ImageView(image3);
				     imageView3.setFitHeight(260);
				     imageView3.setFitWidth(300);
				     Button bt1 = new Button();
				     bt1.setGraphic(imageView3);
				     Image image4 = new Image("nbastandings1.jpg");
				     ImageView imageView4 = new ImageView(image4);
				     imageView4.setFitHeight(260);
				     imageView4.setFitWidth(300);
				     Button bt2 = new Button();
				     bt2.setGraphic(imageView4);
				     
					 paneForNBASchedule.getChildren().addAll(LB2, bt1);
					 paneForNBAStandings.getChildren().addAll(LB3, bt2);
					 paneForNBALeague.getChildren().addAll(paneForNBATeamHC, paneForNBASchedule, paneForNBAStandings);
					 bp.setCenter(paneForNBALeague);
					 bp.setBottom(backButton1);
				     primaryStage.setTitle("NBA League");
					 primaryStage.setScene(scene2);    
					 primaryStage.setHeight(700);
					 primaryStage.setWidth(1000);
					 backButton1.setOnAction(click -> {
						    primaryStage.setTitle("Sport Fans");
							primaryStage.setScene(scene1);
							primaryStage.setHeight(320);
							primaryStage.setWidth(430);
						 });

			 bt1.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
					
				 public void handle(ActionEvent event) {

					  Label NBASchedule = new Label("Date");
					  Label NBASchedule2 = new Label("Away Team");
					  Label NBASchedule3 = new Label("Away Team Score");
					  Label NBASchedule4 = new Label("Home Team");
					  Label NBASchedule5 = new Label("Home Team Score");
					  Label NBASchedule6 = new Label("Time");
					  Label NBASchedule7 = new Label("National Tv");
					  Label NBASchedule8 = new Label("Arena Name");
					  Label NBASchedule9 = new Label("Ticket Price");
					  
					    RadioButton radioButton = new RadioButton("October");
						RadioButton radioButton2 = new RadioButton("November");
						RadioButton radioButton3 = new RadioButton("December");
						RadioButton radioButton4 = new RadioButton("January");
						RadioButton radioButton5 = new RadioButton("February");
						RadioButton radioButton6 = new RadioButton("March");
						RadioButton radioButton7 = new RadioButton("April");
						
						paneForRadioButton.getChildren().addAll(radioButton, radioButton2, 
								radioButton3, radioButton4, radioButton5, radioButton6, radioButton7);
					    borderPane2.setTop(paneForRadioButton);
					    
					    borderPane2.setBottom(backButton);
					    primaryStage.setTitle("NBA Schedule");
						primaryStage.setScene(scene4);
						primaryStage.show();
						
						ToggleGroup TG = new ToggleGroup();
						radioButton.setToggleGroup(TG);
						radioButton2.setToggleGroup(TG);
						radioButton3.setToggleGroup(TG);
						radioButton4.setToggleGroup(TG);
						radioButton5.setToggleGroup(TG);
						radioButton6.setToggleGroup(TG);
						radioButton7.setToggleGroup(TG);
						
						  
						 
						  
						radioButton.setOnAction(click -> {
							if(radioButton.isSelected()) {
	  			             try {
								    
									String query = "SELECT date, awayTeam, awayTeamScore, homeTeam, homeTeamScore, "
											+ "time, nationalTv, arenaName, ticketPrice FROM games WHERE gamesId between 1 AND 93 ";

									
									ResultSet resultSet = statement.executeQuery(query);
									
									while(resultSet.next()) {
										
									    Label NBAgames = new Label(resultSet.getString(1));
									    Label NBAgames2 = new Label(resultSet.getString(2));
									    Label NBAgames3 = new Label(resultSet.getString(3));
									    Label NBAgames4 = new Label(resultSet.getString(4));
									    Label NBAgames5 = new Label(resultSet.getString(5));
									    Label NBAgames6 = new Label(resultSet.getString(6));
									    Label NBAgames7 = new Label(resultSet.getString(7));
									    Label NBAgames8 = new Label(resultSet.getString(8));
									    Label NBAgames9 = new Label(resultSet.getString(9));
									  
									    paneForNBAgames.getChildren().addAll(NBAgames);
									    paneForNBAgames2.getChildren().addAll(NBAgames2);
									    paneForNBAgames3.getChildren().addAll(NBAgames3);
									    paneForNBAgames4.getChildren().addAll(NBAgames4);
									    paneForNBAgames5.getChildren().addAll(NBAgames5);
									    paneForNBAgames6.getChildren().addAll(NBAgames6);
									    paneForNBAgames7.getChildren().addAll(NBAgames7);
									    paneForNBAgames8.getChildren().addAll(NBAgames8);
									    paneForNBAgames9.getChildren().addAll(NBAgames9);
									   
									}
			                       
									  paneForLabel.getChildren().addAll(NBASchedule, paneForNBAgames);
									  paneForLabel2.getChildren().addAll(NBASchedule2, paneForNBAgames2);
									  paneForLabel3.getChildren().addAll(NBASchedule3, paneForNBAgames3);
									  paneForLabel4.getChildren().addAll(NBASchedule4, paneForNBAgames4);
									  paneForLabel5.getChildren().addAll(NBASchedule5, paneForNBAgames5);
									  paneForLabel6.getChildren().addAll(NBASchedule6, paneForNBAgames6);
									  paneForLabel7.getChildren().addAll(NBASchedule7, paneForNBAgames7);
									  paneForLabel8.getChildren().addAll(NBASchedule8, paneForNBAgames8);
									  paneForLabel9.getChildren().addAll(NBASchedule9, paneForNBAgames9);
									 			
									  
									  paneForNBAg.getChildren().addAll(paneForLabel, paneForLabel2, 
												paneForLabel3, paneForLabel4, paneForLabel5, paneForLabel6, 
												paneForLabel7, paneForLabel8, paneForLabel9);
									  
									   
									   borderPane2.setBottom(backButton);
									   borderPane2.setCenter(paneForNBAg);
									   spNBAgames.setContent(paneForNBAg);
									   borderPane2.setRight(spNBAgames);
									   primaryStage.setTitle("NBA Schedule");
									   primaryStage.setScene(scene4);
									   primaryStage.setHeight(500);
									   primaryStage.setWidth(1000);
									   primaryStage.show();
						
									 
							 }catch (Exception e) {
									e.printStackTrace();
							 }	
							}
						});	
						 backButton.setOnAction(click -> {
								
							    primaryStage.setTitle("NBA League");
								primaryStage.setScene(scene2);
								primaryStage.setHeight(700);
								primaryStage.setWidth(1000);
						 });		
						radioButton2.setOnAction(click -> {
							if(radioButton2.isSelected()) {
								 try {
									 
										String query = "SELECT date, awayTeam, awayTeamScore, homeTeam, homeTeamScore, "
												+ "time, nationalTv, arenaName, ticketPrice FROM games WHERE gamesId between 94 AND 318 ";

										
										ResultSet resultSet = statement.executeQuery(query);
										
										while(resultSet.next()) {
											
											Label labelNBAnovs = new Label(resultSet.getString(1));
											Label labelNBAnovs2 = new Label(resultSet.getString(2));
											Label labelNBAnovs3 = new Label(resultSet.getString(3));
											Label labelNBAnovs4 = new Label(resultSet.getString(4));
											Label labelNBAnovs5 = new Label(resultSet.getString(5));
											Label labelNBAnovs6 = new Label(resultSet.getString(6));
											Label labelNBAnovs7 = new Label(resultSet.getString(7));
											Label labelNBAnovs8 = new Label(resultSet.getString(8));
											Label labelNBAnovs9 = new Label(resultSet.getString(9));
											
											    paneForNBANovgames.getChildren().addAll(labelNBAnovs);
											    paneForNBANovgames2.getChildren().addAll(labelNBAnovs2);
											    paneForNBANovgames3.getChildren().addAll(labelNBAnovs3);
											    paneForNBANovgames4.getChildren().addAll(labelNBAnovs4);
											    paneForNBANovgames5.getChildren().addAll(labelNBAnovs5);
											    paneForNBANovgames6.getChildren().addAll(labelNBAnovs6);
											    paneForNBANovgames7.getChildren().addAll(labelNBAnovs7);
											    paneForNBANovgames8.getChildren().addAll(labelNBAnovs8);
											    paneForNBANovgames9.getChildren().addAll(labelNBAnovs9);
										}
										
										  paneForNovLabel.getChildren().addAll(NBASchedule, paneForNBANovgames);
										  paneForNovLabel2.getChildren().addAll(NBASchedule2, paneForNBANovgames2);
										  paneForNovLabel3.getChildren().addAll(NBASchedule3, paneForNBANovgames3);
										  paneForNovLabel4.getChildren().addAll(NBASchedule4, paneForNBANovgames4);
										  paneForNovLabel5.getChildren().addAll(NBASchedule5, paneForNBANovgames5);
										  paneForNovLabel6.getChildren().addAll(NBASchedule6, paneForNBANovgames6);
										  paneForNovLabel7.getChildren().addAll(NBASchedule7, paneForNBANovgames7);
										  paneForNovLabel8.getChildren().addAll(NBASchedule8, paneForNBANovgames8);
										  paneForNovLabel9.getChildren().addAll(NBASchedule9, paneForNBANovgames9);
										 			
										  
										  paneForNBANovg.getChildren().addAll(paneForNovLabel, paneForNovLabel2, 
													paneForNovLabel3, paneForNovLabel4, paneForNovLabel5, paneForNovLabel6, 
													paneForNovLabel7, paneForNovLabel8, paneForNovLabel9);
										   
										  borderPane2.setBottom(backButton);
										  borderPane2.setCenter(paneForNBANovg);
										  spNBAgames.setContent(paneForNBANovg);
										  borderPane2.setRight(spNBAgames);										 ;
										   primaryStage.setTitle("NBA Schedule");
										   primaryStage.setScene(scene4);
										   primaryStage.setHeight(500);
										   primaryStage.setWidth(1000);
										   primaryStage.show();
										 }catch (Exception e) {
												e.printStackTrace();
										 }
							}
						});
						   
						 backButton.setOnAction(click -> {
								
							    primaryStage.setTitle("NBA League");
								primaryStage.setScene(scene2);
								primaryStage.setHeight(700);
								primaryStage.setWidth(1000);
						 });		
						   radioButton3.setOnAction(click -> {
							   if(radioButton3.isSelected() ) {
								   try { 
									   
									   String query = "SELECT date, awayTeam, awayTeamScore, homeTeam, homeTeamScore, "
												+ "time, nationalTv, arenaName, ticketPrice FROM games WHERE gamesId between 319 AND 538 ";

									   ResultSet resultSet = statement.executeQuery(query);
									   
									   while(resultSet.next()) {
										   
										      
										    Label labelNBADecg = new Label(resultSet.getString(1));
											Label labelNBADecg2 = new Label(resultSet.getString(2));
											Label labelNBADecg3 = new Label(resultSet.getString(3));
											Label labelNBADecg4 = new Label(resultSet.getString(4));
											Label labelNBADecg5 = new Label(resultSet.getString(5));
											Label labelNBADecg6 = new Label(resultSet.getString(6));
											Label labelNBADecg7 = new Label(resultSet.getString(7));
											Label labelNBADecg8 = new Label(resultSet.getString(8));
											Label labelNBADecg9 = new Label(resultSet.getString(9));
											
											    paneForNBADecgames.getChildren().addAll(labelNBADecg);
											    paneForNBADecgames2.getChildren().addAll(labelNBADecg2);
											    paneForNBADecgames3.getChildren().addAll(labelNBADecg3);
											    paneForNBADecgames4.getChildren().addAll(labelNBADecg4);
											    paneForNBADecgames5.getChildren().addAll(labelNBADecg5);
											    paneForNBADecgames6.getChildren().addAll(labelNBADecg6);
											    paneForNBADecgames7.getChildren().addAll(labelNBADecg7);
											    paneForNBADecgames8.getChildren().addAll(labelNBADecg8);
											    paneForNBADecgames9.getChildren().addAll(labelNBADecg9);
										   
									   }
									   
									    
										  
										  
										  paneForDecLabel.getChildren().addAll(NBASchedule, paneForNBADecgames);
										  paneForDecLabel2.getChildren().addAll(NBASchedule2, paneForNBADecgames2);
										  paneForDecLabel3.getChildren().addAll(NBASchedule3, paneForNBADecgames3);
										  paneForDecLabel4.getChildren().addAll(NBASchedule4, paneForNBADecgames4);
										  paneForDecLabel5.getChildren().addAll(NBASchedule5, paneForNBADecgames5);
										  paneForDecLabel6.getChildren().addAll(NBASchedule6, paneForNBADecgames6);
										  paneForDecLabel7.getChildren().addAll(NBASchedule7, paneForNBADecgames7);
										  paneForDecLabel8.getChildren().addAll(NBASchedule8, paneForNBADecgames8);
										  paneForDecLabel9.getChildren().addAll(NBASchedule9, paneForNBADecgames9);
										  
										  paneForNBADecg.getChildren().addAll(paneForDecLabel, paneForDecLabel2, paneForDecLabel3, 
											 paneForDecLabel4, paneForDecLabel5, paneForDecLabel6, paneForDecLabel7, paneForDecLabel8, paneForDecLabel9);
                                          
										  borderPane2.setCenter(paneForNBADecg);
										  borderPane2.setBottom(backButton);
										  spNBAgames.setContent(paneForNBADecg);
										  borderPane2.setRight(spNBAgames);
										   primaryStage.setTitle("NBA Schedule");
										   primaryStage.setScene(scene4);
										   primaryStage.setHeight(500);
										   primaryStage.setWidth(1000);
										   primaryStage.show();
								   }catch (Exception e) {
										e.printStackTrace();
								 }
									   
								   }
								   
							   
						   });
						   
						   backButton.setOnAction(click -> {
								
							    primaryStage.setTitle("NBA League");
								primaryStage.setScene(scene2);
								primaryStage.setHeight(700);
								primaryStage.setWidth(1000);
						 });		
						   radioButton4.setOnAction(click -> {
							   if(radioButton4.isSelected()) {
								   try { 

									   String query = "SELECT date, awayTeam, awayTeamScore, homeTeam, homeTeamScore, "
												+ "time, nationalTv, arenaName, ticketPrice FROM games WHERE gamesId between 539 AND 764 ";

									   ResultSet resultSet = statement.executeQuery(query);
									   
									   while(resultSet.next()) {
										   
										   
										   Label NBAjans = new Label(resultSet.getString(1));
										   Label NBAjans2 = new Label(resultSet.getString(2));
										   Label NBAjans3 = new Label(resultSet.getString(3));
										   Label NBAjans4 = new Label(resultSet.getString(4));
										   Label NBAjans5 = new Label(resultSet.getString(5));
										   Label NBAjans6 = new Label(resultSet.getString(6));
										   Label NBAjans7 = new Label(resultSet.getString(7));
										   Label NBAjans8 = new Label(resultSet.getString(8));
										   Label NBAjans9 = new Label(resultSet.getString(9));
										   
										   paneForNBAJangames.getChildren().addAll(NBAjans);
										   paneForNBAJangames2.getChildren().addAll(NBAjans2);
										   paneForNBAJangames3.getChildren().addAll(NBAjans3);
										   paneForNBAJangames4.getChildren().addAll(NBAjans4);
										   paneForNBAJangames5.getChildren().addAll(NBAjans5);
										   paneForNBAJangames6.getChildren().addAll(NBAjans6);
										   paneForNBAJangames7.getChildren().addAll(NBAjans7);
										   paneForNBAJangames8.getChildren().addAll(NBAjans8);
										   paneForNBAJangames9.getChildren().addAll(NBAjans9);
									   }
									     
										  
	                                       paneForJanLabel.getChildren().addAll(NBASchedule, paneForNBAJangames);
	                                       paneForJanLabel2.getChildren().addAll(NBASchedule2, paneForNBAJangames2);
	                                       paneForJanLabel3.getChildren().addAll(NBASchedule3, paneForNBAJangames3);
	                                       paneForJanLabel4.getChildren().addAll(NBASchedule4, paneForNBAJangames4);
	                                       paneForJanLabel5.getChildren().addAll(NBASchedule5, paneForNBAJangames5);
	                                       paneForJanLabel6.getChildren().addAll(NBASchedule6, paneForNBAJangames6);
	                                       paneForJanLabel7.getChildren().addAll(NBASchedule7, paneForNBAJangames7);
	                                       paneForJanLabel8.getChildren().addAll(NBASchedule8, paneForNBAJangames8);
	                                       paneForJanLabel9.getChildren().addAll(NBASchedule9, paneForNBAJangames9);
	                                       
	                                       paneForNBAJang.getChildren().addAll(paneForJanLabel, paneForJanLabel2, paneForJanLabel3,
	                                    		   paneForJanLabel4, paneForJanLabel5, paneForJanLabel6, paneForJanLabel7, paneForJanLabel8, paneForJanLabel9);
	                                       
	                                       borderPane2.setCenter(paneForNBAJang);
	                                       borderPane2.setBottom(backButton);
	                                       spNBAgames.setContent(paneForNBAJang);
										   borderPane2.setRight(spNBAgames);
	            						   primaryStage.setTitle("NBA Schedule");
	            						   primaryStage.setScene(scene4);
	            						   primaryStage.setHeight(500);
										   primaryStage.setWidth(1000);
	            						   primaryStage.show();
								   }catch (Exception e) {
										e.printStackTrace();
								 }
							   }
						   });
						   
						   backButton.setOnAction(click -> {
								
							    primaryStage.setTitle("NBA League");
								primaryStage.setScene(scene2);
								primaryStage.setHeight(700);
								primaryStage.setWidth(1000);
						 });		
						   radioButton5.setOnAction(click -> {
							   if(radioButton5.isSelected()) {
								   try { 
   
									   String query = "SELECT date, awayTeam, awayTeamScore, homeTeam, homeTeamScore, "
												+ "time, nationalTv, arenaName, ticketPrice FROM games WHERE gamesId between 765 AND 924 ";

									   ResultSet resultSet = statement.executeQuery(query);
									   
									   while(resultSet.next()) {
										   Label Februarygames = new Label(resultSet.getString(1));
										   Label Februarygames2 = new Label(resultSet.getString(2));
										   Label Februarygames3 = new Label(resultSet.getString(3));
										   Label Februarygames4 = new Label(resultSet.getString(4));
										   Label Februarygames5 = new Label(resultSet.getString(5));
										   Label Februarygames6 = new Label(resultSet.getString(6));
										   Label Februarygames7 = new Label(resultSet.getString(7));
										   Label Februarygames8 = new Label(resultSet.getString(8));
										   Label Februarygames9 = new Label(resultSet.getString(9));
										   
										   paneForNBAFebgames.getChildren().addAll(Februarygames);
										   paneForNBAFebgames2.getChildren().addAll(Februarygames2);
										   paneForNBAFebgames3.getChildren().addAll(Februarygames3);
										   paneForNBAFebgames4.getChildren().addAll(Februarygames4);
										   paneForNBAFebgames5.getChildren().addAll(Februarygames5);
										   paneForNBAFebgames6.getChildren().addAll(Februarygames6);
										   paneForNBAFebgames7.getChildren().addAll(Februarygames7);
										   paneForNBAFebgames8.getChildren().addAll(Februarygames8);
										   paneForNBAFebgames9.getChildren().addAll(Februarygames9);
									   }
									    
										  paneForFebLabel.getChildren().addAll(NBASchedule, paneForNBAFebgames);
										  paneForFebLabel2.getChildren().addAll(NBASchedule2, paneForNBAFebgames2);
										  paneForFebLabel3.getChildren().addAll(NBASchedule3, paneForNBAFebgames3);
										  paneForFebLabel4.getChildren().addAll(NBASchedule4, paneForNBAFebgames4);
										  paneForFebLabel5.getChildren().addAll(NBASchedule5, paneForNBAFebgames5);
										  paneForFebLabel6.getChildren().addAll(NBASchedule6, paneForNBAFebgames6);
										  paneForFebLabel7.getChildren().addAll(NBASchedule7, paneForNBAFebgames7);
										  paneForFebLabel8.getChildren().addAll(NBASchedule8, paneForNBAFebgames8);
										  paneForFebLabel9.getChildren().addAll(NBASchedule9, paneForNBAFebgames9);
										  
										  paneForNBAFebg.getChildren().addAll(paneForFebLabel, paneForFebLabel2, 
												  paneForFebLabel3, paneForFebLabel4, paneForFebLabel5, paneForFebLabel6, 
												  paneForFebLabel7, paneForFebLabel8, paneForFebLabel9);
										 
										  borderPane2.setCenter(paneForNBAFebg);
										  borderPane2.setBottom(backButton);
										  spNBAgames.setContent(paneForNBAFebg);
										  borderPane2.setRight(spNBAgames);
										   primaryStage.setTitle("NBA Schedule");
										   primaryStage.setScene(scene4);
										   primaryStage.setHeight(500);
										   primaryStage.setWidth(1000);
										   primaryStage.show();
								   }catch (Exception e) {
										e.printStackTrace();
								 }
							   }
							   
						   });
						   
						   backButton.setOnAction(click -> {
								
							    primaryStage.setTitle("NBA League");
								primaryStage.setScene(scene2);
								primaryStage.setHeight(700);
								primaryStage.setWidth(1000);
						 });		
						   radioButton6.setOnAction(click -> {
							   if(radioButton6.isSelected()) {
								   try { 

									   String query = "SELECT date, awayTeam, awayTeamScore, homeTeam, homeTeamScore, "
												+ "time, nationalTv, arenaName,  ticketPrice FROM games WHERE gamesId between 925 AND 1148 ";

									   ResultSet resultSet = statement.executeQuery(query);
									   
									   while(resultSet.next()) {
										   Label Marchgames = new Label(resultSet.getString(1));
										   Label Marchgames2 = new Label(resultSet.getString(2));
										   Label Marchgames3 = new Label(resultSet.getString(3));
										   Label Marchgames4 = new Label(resultSet.getString(4));
										   Label Marchgames5 = new Label(resultSet.getString(5));
										   Label Marchgames6 = new Label(resultSet.getString(6));
										   Label Marchgames7 = new Label(resultSet.getString(7));
										   Label Marchgames8 = new Label(resultSet.getString(8));
										   Label Marchgames9 = new Label(resultSet.getString(9));
										   
										   paneForNBAMarchgames.getChildren().addAll(Marchgames);
										   paneForNBAMarchgames2.getChildren().addAll(Marchgames2);
										   paneForNBAMarchgames3.getChildren().addAll(Marchgames3);
										   paneForNBAMarchgames4.getChildren().addAll(Marchgames4);
										   paneForNBAMarchgames5.getChildren().addAll(Marchgames5);
										   paneForNBAMarchgames6.getChildren().addAll(Marchgames6);
										   paneForNBAMarchgames7.getChildren().addAll(Marchgames7);
										   paneForNBAMarchgames8.getChildren().addAll(Marchgames8);
										   paneForNBAMarchgames9.getChildren().addAll(Marchgames9);
									   }
									    
										  paneForMarchLabel.getChildren().addAll(NBASchedule, paneForNBAMarchgames);
										  paneForMarchLabel2.getChildren().addAll(NBASchedule2, paneForNBAMarchgames2);
										  paneForMarchLabel3.getChildren().addAll(NBASchedule3, paneForNBAMarchgames3);
										  paneForMarchLabel4.getChildren().addAll(NBASchedule4, paneForNBAMarchgames4);
										  paneForMarchLabel5.getChildren().addAll(NBASchedule5, paneForNBAMarchgames5);
										  paneForMarchLabel6.getChildren().addAll(NBASchedule6, paneForNBAMarchgames6);
										  paneForMarchLabel7.getChildren().addAll(NBASchedule7, paneForNBAMarchgames7);
										  paneForMarchLabel8.getChildren().addAll(NBASchedule8, paneForNBAMarchgames8);
										  paneForMarchLabel9.getChildren().addAll(NBASchedule9, paneForNBAMarchgames9);
										  
										  paneForNBAMarchg.getChildren().addAll(paneForMarchLabel, paneForMarchLabel2, 
												  paneForMarchLabel3, paneForMarchLabel4, paneForMarchLabel5, paneForMarchLabel6, 
												  paneForMarchLabel7, paneForMarchLabel8, paneForMarchLabel9);
										   
										  borderPane2.setCenter(paneForNBAMarchg);
										  borderPane2.setBottom(backButton);
										  spNBAgames.setContent(paneForNBAMarchg);
										  borderPane2.setRight(spNBAgames);
										   primaryStage.setTitle("NBA Schedule");
										   primaryStage.setScene(scene4);
										   primaryStage.setHeight(500);
										   primaryStage.setWidth(1000);
										   primaryStage.show();
								   }catch (Exception e) {
										e.printStackTrace();
								 }
							   }
							   
						   });
						   backButton.setOnAction(click -> {
								
							    primaryStage.setTitle("NBA League");
								primaryStage.setScene(scene2);
								primaryStage.setHeight(700);
								primaryStage.setWidth(1000);
						 });		
						   radioButton7.setOnAction(click -> {
							   if(radioButton7.isSelected()) {
								   try { 
									   
									   String query = "SELECT date, awayTeam, awayTeamScore, homeTeam, homeTeamScore, "
												+ "time, nationalTv, arenaName, ticketPrice FROM games WHERE gamesId between 1149 AND 1229 ";

									   ResultSet resultSet = statement.executeQuery(query);
									   
									   while(resultSet.next()) {
										   Label Aprilgames = new Label(resultSet.getString(1));
										   Label Aprilgames2 = new Label(resultSet.getString(2));
										   Label Aprilgames3 = new Label(resultSet.getString(3));
										   Label Aprilgames4 = new Label(resultSet.getString(4));
										   Label Aprilgames5 = new Label(resultSet.getString(5));
										   Label Aprilgames6 = new Label(resultSet.getString(6));
										   Label Aprilgames7 = new Label(resultSet.getString(7));
										   Label Aprilgames8 = new Label(resultSet.getString(8));
										   Label Aprilgames9 = new Label(resultSet.getString(9));
										   
										   paneForNBAAprilgames.getChildren().addAll(Aprilgames);
										   paneForNBAAprilgames2.getChildren().addAll(Aprilgames2);
										   paneForNBAAprilgames3.getChildren().addAll(Aprilgames3);
										   paneForNBAAprilgames4.getChildren().addAll(Aprilgames4);
										   paneForNBAAprilgames5.getChildren().addAll(Aprilgames5);
										   paneForNBAAprilgames6.getChildren().addAll(Aprilgames6);
										   paneForNBAAprilgames7.getChildren().addAll(Aprilgames7);
										   paneForNBAAprilgames8.getChildren().addAll(Aprilgames8);
										   paneForNBAAprilgames9.getChildren().addAll(Aprilgames9);
									   }
									    
										  paneForAprilLabel.getChildren().addAll(NBASchedule, paneForNBAAprilgames);
										  paneForAprilLabel2.getChildren().addAll(NBASchedule2, paneForNBAAprilgames2);
										  paneForAprilLabel3.getChildren().addAll(NBASchedule3, paneForNBAAprilgames3);
										  paneForAprilLabel4.getChildren().addAll(NBASchedule4, paneForNBAAprilgames4);
										  paneForAprilLabel5.getChildren().addAll(NBASchedule5, paneForNBAAprilgames5);
										  paneForAprilLabel6.getChildren().addAll(NBASchedule6, paneForNBAAprilgames6);
										  paneForAprilLabel7.getChildren().addAll(NBASchedule7, paneForNBAAprilgames7);
										  paneForAprilLabel8.getChildren().addAll(NBASchedule8, paneForNBAAprilgames8);
										  paneForAprilLabel9.getChildren().addAll(NBASchedule9, paneForNBAAprilgames9);
										  
										  paneForNBAAprilg.getChildren().addAll(paneForAprilLabel, paneForAprilLabel2, 
												  paneForAprilLabel3, paneForAprilLabel4, paneForAprilLabel5, paneForAprilLabel6, 
												  paneForAprilLabel7, paneForAprilLabel8, paneForAprilLabel9);
										  
										   borderPane2.setCenter(paneForNBAAprilg);
										   borderPane2.setBottom(backButton);
										   spNBAgames.setContent(paneForNBAAprilg);
										   borderPane2.setRight(spNBAgames);
										   primaryStage.setTitle("NBA Schedule");
										   primaryStage.setScene(scene4);
										   primaryStage.setHeight(500);
										   primaryStage.setWidth(1000);
										   primaryStage.show();
								   }catch (Exception e) {
										e.printStackTrace();
								 }
							   }
							   
						   });
						   backButton.setOnAction(click -> {
								
							    primaryStage.setTitle("NBA League");
								primaryStage.setScene(scene2);
								primaryStage.setHeight(700);
								primaryStage.setWidth(1000);
						 });		
				 }
			 });
			 
			 bt2.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
					
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
							String query = "SELECT t.teamName, s.Rank, s.winRecord, s.loseRecord, s.winPercent, s.homeRecord, s.awayRecord, s.conferenceRecord, s.streak "
									 + "FROM team t JOIN standing s ON t.teamId = s.team_teamId "
									+ " WHERE teamId  = 1 OR teamId = 2 OR teamId = 3 OR teamId = 4 OR teamId = 5 OR teamId = 6 OR teamId = 9 OR teamId = 12 OR teamId = 16 OR teamId = 17 OR teamId = 20 OR teamId = 22 OR teamId = 23 OR  teamId = 28 OR teamId = 30";
							
						    
							ResultSet resultSet = statement.executeQuery(query);
							
							while(resultSet.next()) {
							
									 
								 Label label11 = new Label(resultSet.getString(1));
								 Label label12 = new Label(resultSet.getString(2));
								 Label label13 = new Label(resultSet.getString(3));
								 Label label14 = new Label(resultSet.getString(4));
								 Label label15 = new Label(resultSet.getString(5));
								 Label label16 = new Label(resultSet.getString(6));
								 Label label17 = new Label(resultSet.getString(7));
								 Label label18 = new Label(resultSet.getString(8));
								 Label label19 = new Label(resultSet.getString(9));
								 
									paneForNBAStandingRecord.getChildren().addAll(label11);
									paneForNBAStandingRecord1.getChildren().addAll(label12);
									paneForNBAStandingRecord2.getChildren().addAll(label13);
									paneForNBAStandingRecord3.getChildren().addAll(label14);
									paneForNBAStandingRecord4.getChildren().addAll(label15);
									paneForNBAStandingRecord5.getChildren().addAll(label16);
									paneForNBAStandingRecord6.getChildren().addAll(label17);
									paneForNBAStandingRecord7.getChildren().addAll(label18);
									paneForNBAStandingRecord8.getChildren().addAll(label19);
							}	
							
							     Label label = new Label("Eastern Conference");
								 label.setFont(Font.font("Times", 23));
								 Label label2 = new Label("Team Name");
								 Label label3 = new Label("Rank");
								 Label label4 = new Label("Win");
								 Label label5 = new Label("Lose");
								 Label label6 = new Label("Win Percent");
								 Label label7 = new Label("Home Record");
								 Label label8 = new Label("Away Record");
								 Label label9 = new Label("Conference Record");
								 Label label10 = new Label("Streak");
					
								paneForNBAStandingLabel.getChildren().addAll(label2, paneForNBAStandingRecord);
								paneForNBAStandingLabel1.getChildren().addAll(label3, paneForNBAStandingRecord1);
								paneForNBAStandingLabel2.getChildren().addAll(label4, paneForNBAStandingRecord2);
								paneForNBAStandingLabel3.getChildren().addAll(label5, paneForNBAStandingRecord3);
								paneForNBAStandingLabel4.getChildren().addAll(label6, paneForNBAStandingRecord4);
								paneForNBAStandingLabel5.getChildren().addAll(label7, paneForNBAStandingRecord5);
								paneForNBAStandingLabel6.getChildren().addAll(label8, paneForNBAStandingRecord6);
								paneForNBAStandingLabel7.getChildren().addAll(label9, paneForNBAStandingRecord7);
								paneForNBAStandingLabel8.getChildren().addAll(label10, paneForNBAStandingRecord8);
								
								paneForNBAS.getChildren().addAll(paneForNBAStandingLabel, paneForNBAStandingLabel1, 
									paneForNBAStandingLabel2, paneForNBAStandingLabel3, paneForNBAStandingLabel4, 
									paneForNBAStandingLabel5, paneForNBAStandingLabel6, paneForNBAStandingLabel7, 
									paneForNBAStandingLabel8);
							
								paneForNBAEC.getChildren().addAll(label, paneForNBAS);
								
								paneForNBAECLogo.getChildren().addAll(imageView5, paneForNBAEC);
							
								
								borderPane3.setCenter(paneForNBAECLogo); 
								
					 } catch (SQLException e) {
							
							e.printStackTrace();
						}
						    try {
								String query = "SELECT t.teamName, s.Rank, s.winRecord, s.loseRecord, s.winPercent, s.homeRecord, s.awayRecord, s.conferenceRecord, s.streak "
							    + "FROM team t JOIN standing s ON t.teamId = s.team_teamId "
							    + " WHERE teamId  = 7 OR teamId = 8 OR teamId = 10 OR teamId = 11 OR teamId = 13 OR teamId = 14 OR teamId = 15 OR teamId = 18 OR teamId = 19 OR teamId = 21 OR teamId = 24 OR teamId = 25 OR  teamId = 26 OR teamId = 27 OR teamId = 29";
								
							    
								ResultSet resultSet = statement.executeQuery(query);
								
								while(resultSet.next()) {
									 Label LB14 = new Label(resultSet.getString(1));
									
									 Label LB15 = new Label(resultSet.getString(2));
									 Label LB16 = new Label(resultSet.getString(3));
									 Label LB17 = new Label(resultSet.getString(4));
									 Label LB18 = new Label(resultSet.getString(5));
									 Label LB19 = new Label(resultSet.getString(6));
									 Label LB20 = new Label(resultSet.getString(7));
									 Label LB21 = new Label(resultSet.getString(8));
									 Label LB22 = new Label(resultSet.getString(9));
									 
									 paneForNBASR1.getChildren().addAll(LB14);
									 paneForNBASR2.getChildren().addAll(LB15);
									 paneForNBASR3.getChildren().addAll(LB16);
									 paneForNBASR4.getChildren().addAll(LB17);
									 paneForNBASR5.getChildren().addAll(LB18);
									 paneForNBASR6.getChildren().addAll(LB19);
									 paneForNBASR7.getChildren().addAll(LB20);
									 paneForNBASR8.getChildren().addAll(LB21);
									 paneForNBASR9.getChildren().addAll(LB22);
										
								}
									 Label LB4 = new Label("Western Conference");
									 LB4.setFont(Font.font("Times", 23));
									 Label LB5 = new Label("Team Name");
									 Label LB6 = new Label("Rank");
									 Label LB7 = new Label("Win");
									 Label LB8 = new Label("Lose");
									 Label LB9 = new Label("Win Percent");
									 Label LB10 = new Label("Home Record");
									 Label LB11 = new Label("Away Record");
									 Label LB12 = new Label("Conference Record");
									 Label LB13 = new Label("Streak");
									 
									paneForNBASL1.getChildren().addAll(LB5, paneForNBASR1);
									paneForNBASL2.getChildren().addAll(LB6, paneForNBASR2);
									paneForNBASL3.getChildren().addAll(LB7, paneForNBASR3);
									paneForNBASL4.getChildren().addAll(LB8, paneForNBASR4);
									paneForNBASL5.getChildren().addAll(LB9, paneForNBASR5);
									paneForNBASL6.getChildren().addAll(LB10, paneForNBASR6);
									paneForNBASL7.getChildren().addAll(LB11, paneForNBASR7);
									paneForNBASL8.getChildren().addAll(LB12, paneForNBASR8);
									paneForNBASL9.getChildren().addAll(LB13, paneForNBASR9);
									
									paneForNBAS1.getChildren().addAll(paneForNBASL1, paneForNBASL2, 
										paneForNBASL3, paneForNBASL4, paneForNBASL5, 
										paneForNBASL6, paneForNBASL7, paneForNBASL8, 
										paneForNBASL9);
								
									paneForNBAWC.getChildren().addAll(LB4, paneForNBAS1);
									
									paneForNBAWCLogo.getChildren().addAll(imageView6, paneForNBAWC);
									
									paneForNBAS2.getChildren().addAll(paneForNBAECLogo, paneForNBAWCLogo);
									spNBAStandings.setContent(paneForNBAS2);
									borderPane3.setRight(spNBAStandings);
									borderPane3.setCenter(paneForNBAS2); 
								    borderPane3.setBottom(backButton);
									primaryStage.setTitle("NBA Standings");
									primaryStage.setScene(scene5);
									primaryStage.setHeight(500);
								    primaryStage.setWidth(750);
									primaryStage.show();
								
								
				                } catch (SQLException e) {
										e.printStackTrace();
								 }			
				 }
			 });
			 backButton.setOnAction(click -> {
					
				    primaryStage.setTitle("NBA League");
					primaryStage.setScene(scene2);
					primaryStage.setHeight(700);
					primaryStage.setWidth(1000);
			 });		
			 
		 }
      });
       
      bt.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
			
			 public void handle(ActionEvent event) {
					Button NFLTeamButton = null;
					
				   Label labelTeams = new Label("Team Name/Head Coach");
				   labelTeams.setTextFill(Color.RED);
				   labelTeams.setFont(Font.font("Times", 23));
				   labelTeams.setContentDisplay(ContentDisplay.LEFT);
				   Label labelSchedule = new Label("Schedule");
				   labelSchedule.setTextFill(Color.BLUE);
				   labelSchedule.setFont(Font.font("Times", 23));
				   labelSchedule.setContentDisplay(ContentDisplay.CENTER);
				   Label labelStandings = new Label("Standings");
				   labelStandings.setTextFill(Color.BLUE);
				   labelStandings.setFont(Font.font("Times", 23));
				   labelStandings.setContentDisplay(ContentDisplay.RIGHT);
				   NFLTeam NFLTeam = null;
				   
				   paneForNFLTHC.getChildren().add(labelTeams);
				   
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
                                     
							    	   System.out.println("Got event");
				                      Button  button = (Button) event.getSource();
				                      String text = button.getText();
				                      String[] NFLTeamName = text.split(",", 3); 
				                      String TeamName = NFLTeamName[0];
				                      
				                      TeamName = buildNFLTeamRoster(TeamName);
				                     System.out.println(TeamName);
				                
								 }
					        });
						 
								}
				
				}catch (Exception e) {
					e.printStackTrace();
					
				}	
				   spNFLTeam.setContent(paneForNFLTHC);
				   bp1.setLeft(spNFLTeam);
				   Image i = new Image("nflschedule21logo.jpg");
				   ImageView iV = new ImageView(i);
				   iV.setFitHeight(260);
				   iV.setFitWidth(300);
				   Button b = new Button();
				   b.setGraphic(iV);
				   Image i2 = new Image("nflstandingslogo.jpg");
				   ImageView iV2 = new ImageView(i2);
				   iV2.setFitHeight(260);
				   iV2.setFitWidth(300);
				   Button b2 = new Button();
				   b2.setGraphic(iV2);
				   
				     paneForNFLSchedule.getChildren().addAll(labelSchedule, b);
					 paneForNFLStandings.getChildren().addAll(labelStandings, b2);
					 paneForNFLLeague.getChildren().addAll(paneForNFLTHC, paneForNFLSchedule, paneForNFLStandings);
					 bp1.setCenter(paneForNFLLeague);
					 bp1.setBottom(backButton1);
				     primaryStage.setTitle("NFL League");
					 primaryStage.setScene(scene6);    
					 primaryStage.setHeight(700);
					 primaryStage.setWidth(1000);
					 backButton1.setOnAction(click -> {
						    primaryStage.setTitle("Sport Fans");
							primaryStage.setScene(scene1);
							primaryStage.setHeight(300);
							primaryStage.setWidth(430);
							 
						 });
					 
							 
						
				   b.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
						
						 public void handle(ActionEvent event) {
							
							  Label NFLSchedule = new Label("Date");
							  NFLSchedule.setTextFill(Color.BLUE);
							  Label NFLSchedule2 = new Label("Away Team");
							  NFLSchedule2.setTextFill(Color.BLUE);
							  Label NFLSchedule3 = new Label("Away Team Score");
							  NFLSchedule3.setTextFill(Color.BLUE);
							  Label NFLSchedule4 = new Label("Home Team");
							  NFLSchedule4.setTextFill(Color.BLUE);
							  Label NFLSchedule5 = new Label("Home Team Score");
							  NFLSchedule5.setTextFill(Color.BLUE);
							  Label NFLSchedule6 = new Label("Time");
							  NFLSchedule6.setTextFill(Color.BLUE);
							  Label NFLSchedule7 = new Label("National Tv");
							  NFLSchedule7.setTextFill(Color.BLUE);
							  Label NFLSchedule8 = new Label("Arena Name");
							  NFLSchedule8.setTextFill(Color.BLUE);
							  Label NFLSchedule9 = new Label("Ticket Price");
							  NFLSchedule9.setTextFill(Color.BLUE);
							  
							    RadioButton NFLrb = new RadioButton("September");
							    RadioButton NFLrb2 = new RadioButton("October");
								RadioButton NFLrb3 = new RadioButton("November");
								RadioButton NFLrb4 = new RadioButton("December");
								RadioButton NFLrb5 = new RadioButton("January");
						
								paneForrbNFLgames.getChildren().addAll(NFLrb, NFLrb2, 
										NFLrb3, NFLrb4, NFLrb5);
								
							    bpNFLGames.setTop(paneForrbNFLgames);
		
								ToggleGroup radioButtonNFL = new ToggleGroup();
								NFLrb.setToggleGroup(radioButtonNFL);
								NFLrb2.setToggleGroup(radioButtonNFL);
								NFLrb3.setToggleGroup(radioButtonNFL);
								NFLrb4.setToggleGroup(radioButtonNFL);
								NFLrb5.setToggleGroup(radioButtonNFL);
								
								primaryStage.setTitle("NFL Schedule");
								primaryStage.setScene(scene8);
								primaryStage.show();
								
								 NFLrb.setOnAction(click -> {
									   if(NFLrb.isSelected()) {
									 try {
										 
											String query = "SELECT date, awayTeam, awayTeamScore, homeTeam, homeTeamScore, "
													+ "time, nationalTv, arenaName, ticketPrice FROM games WHERE gamesId between 1230 AND 1278";

											
											ResultSet resultSet = statement.executeQuery(query);
											
											while(resultSet.next()) {
												
												
												Label NFLgames = new Label(resultSet.getString(1));
											    Label NFLgames2 = new Label(resultSet.getString(2));
											    Label NFLgames3 = new Label(resultSet.getString(3));
											    Label NFLgames4 = new Label(resultSet.getString(4));
											    Label NFLgames5 = new Label(resultSet.getString(5));
											    Label NFLgames6 = new Label(resultSet.getString(6));
											    Label NFLgames7 = new Label(resultSet.getString(7));
											    Label NFLgames8 = new Label(resultSet.getString(8));
											    Label NFLgames9 = new Label(resultSet.getString(9));
											  
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
					            
											  paneForlb.getChildren().addAll(NFLSchedule, paneForNFLgames);
											  paneForlb2.getChildren().addAll(NFLSchedule2, paneForNFLgames2);
											  paneForlb3.getChildren().addAll(NFLSchedule3, paneForNFLgames3);
											  paneForlb4.getChildren().addAll(NFLSchedule4, paneForNFLgames4);
											  paneForlb5.getChildren().addAll(NFLSchedule5, paneForNFLgames5);
											  paneForlb6.getChildren().addAll(NFLSchedule6, paneForNFLgames6);
											  paneForlb7.getChildren().addAll(NFLSchedule7, paneForNFLgames7);
											  paneForlb8.getChildren().addAll(NFLSchedule8, paneForNFLgames8);
											  paneForlb9.getChildren().addAll(NFLSchedule9, paneForNFLgames9);			
											  
											  paneForNFLg.getChildren().addAll(paneForlb, paneForlb2, 
														paneForlb3, paneForlb4, paneForlb5, paneForlb6, 
														paneForlb7, paneForlb8, paneForlb9);
											  
											   bpNFLGames.setCenter(paneForNFLg);
											   bpNFLGames.setBottom(backButton);
											   scrollBarNFL.setContent(paneForNFLg);
											   bpNFLGames.setLeft(scrollBarNFL);										
											   primaryStage.setTitle("NFL Schedule");
											   primaryStage.setScene(scene8);
											   primaryStage.setHeight(500);
											   primaryStage.setWidth(1000);
											   primaryStage.show();
								
								
											 
									 }catch (Exception e) {
											e.printStackTrace();
									 }	
									 
									   }
								 });
								 
								 backButton.setOnAction(click -> {
									   primaryStage.setTitle("NFL League");
									   primaryStage.setScene(scene6);
									   primaryStage.setHeight(700);
									   primaryStage.setWidth(920);
								 });
								 
								 NFLrb2.setOnAction(click -> {
									   if(NFLrb2.isSelected()) {
									 try {
										
											String query = "SELECT date, awayTeam, awayTeamScore, homeTeam, homeTeamScore, "
													+ "time, nationalTv, arenaName, ticketPrice FROM games WHERE gamesId between 1279 AND 1350";

											
											ResultSet resultSet = statement.executeQuery(query);
											
											while(resultSet.next()) {
												
												Label Octgames = new Label(resultSet.getString(1));
											    Label Octgames2 = new Label(resultSet.getString(2));
											    Label Octgames3 = new Label(resultSet.getString(3));
											    Label Octgames4 = new Label(resultSet.getString(4));
											    Label Octgames5 = new Label(resultSet.getString(5));
											    Label Octgames6 = new Label(resultSet.getString(6));
											    Label Octgames7 = new Label(resultSet.getString(7));
											    Label Octgames8 = new Label(resultSet.getString(8));
											    Label Octgames9 = new Label(resultSet.getString(9));
											    
											    paneForNFLOctgames.getChildren().addAll(Octgames);
											    paneForNFLOctgames2.getChildren().addAll(Octgames2);
											    paneForNFLOctgames3.getChildren().addAll(Octgames3);
											    paneForNFLOctgames4.getChildren().addAll(Octgames4);
											    paneForNFLOctgames5.getChildren().addAll(Octgames5);
											    paneForNFLOctgames6.getChildren().addAll(Octgames6);
											    paneForNFLOctgames7.getChildren().addAll(Octgames7);
											    paneForNFLOctgames8.getChildren().addAll(Octgames8);
											    paneForNFLOctgames9.getChildren().addAll(Octgames9);
											   
											}
					                           
											  
											
											
											  paneForOctlb.getChildren().addAll(NFLSchedule, paneForNFLOctgames);
											  paneForOctlb2.getChildren().addAll(NFLSchedule2, paneForNFLOctgames2);
											  paneForOctlb3.getChildren().addAll(NFLSchedule3, paneForNFLOctgames3);
											  paneForOctlb4.getChildren().addAll(NFLSchedule4, paneForNFLOctgames4);
											  paneForOctlb5.getChildren().addAll(NFLSchedule5, paneForNFLOctgames5);
											  paneForOctlb6.getChildren().addAll(NFLSchedule6, paneForNFLOctgames6);
											  paneForOctlb7.getChildren().addAll(NFLSchedule7, paneForNFLOctgames7);
											  paneForOctlb8.getChildren().addAll(NFLSchedule8, paneForNFLOctgames8);
											  paneForOctlb9.getChildren().addAll(NFLSchedule9, paneForNFLOctgames9);			
											  
											  paneForNFLOctg.getChildren().addAll(paneForOctlb, paneForOctlb2, 
														paneForOctlb3, paneForOctlb4, paneForOctlb5, paneForOctlb6, 
														paneForOctlb7, paneForOctlb8, paneForOctlb9);
											  
											
											   bpNFLGames.setCenter(paneForNFLOctg);
											   bpNFLGames.setBottom(backButton);
											   scrollBarNFL.setContent(paneForNFLOctg);
											   bpNFLGames.setLeft(scrollBarNFL);
											   primaryStage.setTitle("NFL Schedule");
											   primaryStage.setScene(scene8);
											   primaryStage.setHeight(500);
											   primaryStage.setWidth(1000);
											   primaryStage.show();
								
											 
									 }catch (Exception e) {
											e.printStackTrace();
									 }	
									 
									   }
								 });
								 
								 backButton.setOnAction(click -> {
									   primaryStage.setTitle("NFL League");
									   primaryStage.setScene(scene6);
									   primaryStage.setHeight(700);
									   primaryStage.setWidth(920);
								 });
								 
								 NFLrb3.setOnAction(click -> {
									   if(NFLrb3.isSelected()) {
									 try {
										 
											String query = "SELECT date, awayTeam, awayTeamScore, homeTeam, homeTeamScore, "
													+ "time, nationalTv, arenaName, ticketPrice FROM games WHERE gamesId between 1351 AND 1409";

											
											ResultSet resultSet = statement.executeQuery(query);
											
											while(resultSet.next()) {
												
												
												Label Novgames = new Label(resultSet.getString(1));
											    Label Novgames2 = new Label(resultSet.getString(2));
											    Label Novgames3 = new Label(resultSet.getString(3));
											    Label Novgames4 = new Label(resultSet.getString(4));
											    Label Novgames5 = new Label(resultSet.getString(5));
											    Label Novgames6 = new Label(resultSet.getString(6));
											    Label Novgames7 = new Label(resultSet.getString(7));
											    Label Novgames8 = new Label(resultSet.getString(8));
											    Label Novgames9 = new Label(resultSet.getString(9));
											    
											    paneForNFLNovgames.getChildren().addAll(Novgames);
											    paneForNFLNovgames2.getChildren().addAll(Novgames2);
											    paneForNFLNovgames3.getChildren().addAll(Novgames3);
											    paneForNFLNovgames4.getChildren().addAll(Novgames4);
											    paneForNFLNovgames5.getChildren().addAll(Novgames5);
											    paneForNFLNovgames6.getChildren().addAll(Novgames6);
											    paneForNFLNovgames7.getChildren().addAll(Novgames7);
											    paneForNFLNovgames8.getChildren().addAll(Novgames8);
											    paneForNFLNovgames9.getChildren().addAll(Novgames9);
											}
					                           
											  
											
											
											  paneForNovlb.getChildren().addAll(NFLSchedule, paneForNFLNovgames);
											  paneForNovlb2.getChildren().addAll(NFLSchedule2, paneForNFLNovgames2);
											  paneForNovlb3.getChildren().addAll(NFLSchedule3, paneForNFLNovgames3);
											  paneForNovlb4.getChildren().addAll(NFLSchedule4, paneForNFLNovgames4);
											  paneForNovlb5.getChildren().addAll(NFLSchedule5, paneForNFLNovgames5);
											  paneForNovlb6.getChildren().addAll(NFLSchedule6, paneForNFLNovgames6);
											  paneForNovlb7.getChildren().addAll(NFLSchedule7, paneForNFLNovgames7);
											  paneForNovlb8.getChildren().addAll(NFLSchedule8, paneForNFLNovgames8);
											  paneForNovlb9.getChildren().addAll(NFLSchedule9, paneForNFLNovgames9);			
											  
											  paneForNFLNovg.getChildren().addAll(paneForNovlb, paneForNovlb2, 
														paneForNovlb3, paneForNovlb4, paneForNovlb5, paneForNovlb6, 
														paneForNovlb7, paneForNovlb8, paneForNovlb9);
											  
											
											  
											   bpNFLGames.setCenter(paneForNFLNovg);
											   bpNFLGames.setBottom(backButton);
											   scrollBarNFL.setContent(paneForNFLNovg);
											   bpNFLGames.setLeft(scrollBarNFL);
											   primaryStage.setTitle("NFL Schedule");
											   primaryStage.setScene(scene8);
											   primaryStage.setHeight(500);
											   primaryStage.setWidth(1000);
											   primaryStage.show();
								
								
											 
									 }catch (Exception e) {
											e.printStackTrace();
									 }	
									
									   }
								 });
								 
								 backButton.setOnAction(click -> {
									   primaryStage.setTitle("NFL League");
									   primaryStage.setScene(scene6);
									   primaryStage.setHeight(700);
									   primaryStage.setWidth(920);
								 });
								 
								 NFLrb4.setOnAction(click -> {
									   if(NFLrb4.isSelected()) {
									 try {
										
											String query = "SELECT date, awayTeam, awayTeamScore, homeTeam, homeTeamScore, "
													+ "time, nationalTv, arenaName, ticketPrice FROM games WHERE gamesId between 1410 AND 1469";

											
											ResultSet resultSet = statement.executeQuery(query);
											
											while(resultSet.next()) {
												
												
												Label NFLDec = new Label(resultSet.getString(1));
											    Label NFLDec2 = new Label(resultSet.getString(2));
											    Label NFLDec3 = new Label(resultSet.getString(3));
											    Label NFLDec4 = new Label(resultSet.getString(4));
											    Label NFLDec5 = new Label(resultSet.getString(5));
											    Label NFLDec6 = new Label(resultSet.getString(6));
											    Label NFLDec7 = new Label(resultSet.getString(7));
											    Label NFLDec8 = new Label(resultSet.getString(8));
											    Label NFLDec9 = new Label(resultSet.getString(9));
											  
											    paneForNFLDecgames.getChildren().addAll(NFLDec);
											    paneForNFLDecgames2.getChildren().addAll(NFLDec2);
											    paneForNFLDecgames3.getChildren().addAll(NFLDec3);
											    paneForNFLDecgames4.getChildren().addAll(NFLDec4);
											    paneForNFLDecgames5.getChildren().addAll(NFLDec5);
											    paneForNFLDecgames6.getChildren().addAll(NFLDec6);
											    paneForNFLDecgames7.getChildren().addAll(NFLDec7);
											    paneForNFLDecgames8.getChildren().addAll(NFLDec8);
											    paneForNFLDecgames9.getChildren().addAll(NFLDec9);
											}
					                           
											  
											
											
											  paneForDeclb.getChildren().addAll(NFLSchedule, paneForNFLDecgames);
											  paneForDeclb2.getChildren().addAll(NFLSchedule2, paneForNFLDecgames2);
											  paneForDeclb3.getChildren().addAll(NFLSchedule3, paneForNFLDecgames3);
											  paneForDeclb4.getChildren().addAll(NFLSchedule4, paneForNFLDecgames4);
											  paneForDeclb5.getChildren().addAll(NFLSchedule5, paneForNFLDecgames5);
											  paneForDeclb6.getChildren().addAll(NFLSchedule6, paneForNFLDecgames6);
											  paneForDeclb7.getChildren().addAll(NFLSchedule7, paneForNFLDecgames7);
											  paneForDeclb8.getChildren().addAll(NFLSchedule8, paneForNFLDecgames8);
											  paneForDeclb9.getChildren().addAll(NFLSchedule9, paneForNFLDecgames9);		
											  
											  paneForNFLDecg.getChildren().addAll(paneForDeclb, paneForDeclb2, 
														paneForDeclb3, paneForDeclb4, paneForDeclb5, paneForDeclb6, 
														paneForDeclb7, paneForDeclb8, paneForDeclb9);
											  
											
											  
											   bpNFLGames.setCenter(paneForNFLDecg);
											   bpNFLGames.setBottom(backButton);
											   scrollBarNFL.setContent(paneForNFLDecg);
											   bpNFLGames.setLeft(scrollBarNFL);
											   primaryStage.setTitle("NFL Schedule");
											   primaryStage.setScene(scene8);
											   primaryStage.setHeight(500);
											   primaryStage.setWidth(1000);
											   primaryStage.show();
								
											 
									 }catch (Exception e) {
											e.printStackTrace();
									 }	
									   }
								 });
								 backButton.setOnAction(click -> {
									   primaryStage.setTitle("NFL League");
									   primaryStage.setScene(scene6);
									   primaryStage.setHeight(700);
									   primaryStage.setWidth(920);
								 });
								 NFLrb5.setOnAction(click -> {
									   if(NFLrb5.isSelected()) {
									 try {
										 
											String query = "SELECT date, awayTeam, awayTeamScore, homeTeam, homeTeamScore, "
													+ "time, nationalTv, arenaName, ticketPrice FROM games WHERE gamesId between 1470 AND 1501";

											
											ResultSet resultSet = statement.executeQuery(query);
											
											while(resultSet.next()) {
												
												
												Label NFLJan = new Label(resultSet.getString(1));
											    Label NFLJan2 = new Label(resultSet.getString(2));
											    Label NFLJan3 = new Label(resultSet.getString(3));
											    Label NFLJan4 = new Label(resultSet.getString(4));
											    Label NFLJan5 = new Label(resultSet.getString(5));
											    Label NFLJan6 = new Label(resultSet.getString(6));
											    Label NFLJan7 = new Label(resultSet.getString(7));
											    Label NFLJan8 = new Label(resultSet.getString(8));
											    Label NFLJan9 = new Label(resultSet.getString(9));
											    
											    paneForNFLJangames.getChildren().addAll(NFLJan);
											    paneForNFLJangames2.getChildren().addAll(NFLJan2);
											    paneForNFLJangames3.getChildren().addAll(NFLJan3);
											    paneForNFLJangames4.getChildren().addAll(NFLJan4);
											    paneForNFLJangames5.getChildren().addAll(NFLJan5);
											    paneForNFLJangames6.getChildren().addAll(NFLJan6);
											    paneForNFLJangames7.getChildren().addAll(NFLJan7);
											    paneForNFLJangames8.getChildren().addAll(NFLJan8);
											    paneForNFLJangames9.getChildren().addAll(NFLJan9);
											}
					                           
											  
											
											
											  paneForJanlb.getChildren().addAll(NFLSchedule, paneForNFLJangames);
											  paneForJanlb2.getChildren().addAll(NFLSchedule2, paneForNFLJangames2);
											  paneForJanlb3.getChildren().addAll(NFLSchedule3, paneForNFLJangames3);
											  paneForJanlb4.getChildren().addAll(NFLSchedule4, paneForNFLJangames4);
											  paneForJanlb5.getChildren().addAll(NFLSchedule5, paneForNFLJangames5);
											  paneForJanlb6.getChildren().addAll(NFLSchedule6, paneForNFLJangames6);
											  paneForJanlb7.getChildren().addAll(NFLSchedule7, paneForNFLJangames7);
											  paneForJanlb8.getChildren().addAll(NFLSchedule8, paneForNFLJangames8);
											  paneForJanlb9.getChildren().addAll(NFLSchedule9, paneForNFLJangames9);		
											  
											  paneForNFLJang.getChildren().addAll(paneForJanlb, paneForJanlb2, 
														paneForJanlb3, paneForJanlb4, paneForJanlb5, paneForJanlb6, 
														paneForJanlb7, paneForJanlb8, paneForJanlb9);
											  
											
											   bpNFLGames.setCenter(paneForNFLJang);
											   bpNFLGames.setBottom(backButton);
											   scrollBarNFL.setContent(paneForNFLJang);
											   bpNFLGames.setLeft(scrollBarNFL);
											   primaryStage.setTitle("NFL Schedule");
											   primaryStage.setScene(scene8);
											   primaryStage.setHeight(500);
											   primaryStage.setWidth(1000);
											   primaryStage.show();
								
											 
									 }catch (Exception e) {
											e.printStackTrace();
									 }	
									
									   }
								 });
								 
								 backButton.setOnAction(click -> {
									   primaryStage.setTitle("NFL League");
									   primaryStage.setScene(scene6);
									   primaryStage.setHeight(700);
									   primaryStage.setWidth(920);
								 });
								 
						 }
					 });
				   
				   b2.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
						
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
								
								String query = "SELECT t.teamName, s.Rank, s.winRecord, s.loseRecord, s.tiedRecord, s.winPercent, s.homeRecord, s.awayRecord, s.conferenceRecord, s.streak "
							    + "FROM team t JOIN standing s ON t.teamId = s.team_teamId "
							    + " WHERE teamId  = 31 OR teamId = 39 OR teamId = 60 OR teamId = 42 OR teamId = 49 OR teamId = 35 OR teamId = 62 OR teamId = 36 OR teamId = 58 OR teamId = 53 OR teamId = 59 OR  teamId = 51 OR teamId = 56 OR teamId = 32 OR teamId = 54 OR teamId = 41";
								
							    
								ResultSet resultSet = statement.executeQuery(query);
								
								while(resultSet.next()) {
						
									
								
								     Label labelResult = new Label(resultSet.getString(1));
								     labelResult.setTextFill(Color.RED);
								     Label labelResult1 = new Label(resultSet.getString(2));
								     Label labelResult2 = new Label(resultSet.getString(3));
								     Label labelResult3 = new Label(resultSet.getString(4));
								     Label labelResult4 = new Label(resultSet.getString(5));
								     Label labelResult5 = new Label(resultSet.getString(6));
								     Label labelResult6 = new Label(resultSet.getString(7));
								     Label labelResult7 = new Label(resultSet.getString(8));
								     Label labelResult8 = new Label(resultSet.getString(9));
								     Label labelResult9 = new Label(resultSet.getString(10));
								     
								     paneForNFLNFCR.getChildren().addAll(labelResult);
								     paneForNFLNFCR2.getChildren().addAll(labelResult1);
								     paneForNFLNFCR3.getChildren().addAll(labelResult2);
								     paneForNFLNFCR4.getChildren().addAll(labelResult3);
								     paneForNFLNFCR5.getChildren().addAll(labelResult4);
								     paneForNFLNFCR6.getChildren().addAll(labelResult5);
								     paneForNFLNFCR7.getChildren().addAll(labelResult6);
								     paneForNFLNFCR8.getChildren().addAll(labelResult7);
								     paneForNFLNFCR9.getChildren().addAll(labelResult8);
								     paneForNFLNFCR10.getChildren().addAll(labelResult9);
								}
								
								   Label labelNFl = new Label("National Football Conference (NFC)");
								   labelNFl.setTextFill(Color.RED);
								   labelNFl.setFont(Font.font("Times",23));
								   Label labelNFl1 = new Label("Team Name");
								   labelNFl1.setTextFill(Color.BLUE);
								   Label labelNFl2 = new Label("Rank"); 
								   labelNFl2.setTextFill(Color.BLUE);
							       Label labelNFl3 = new Label("Win");
							       labelNFl3.setTextFill(Color.BLUE);
							       Label labelNFl4 = new Label("Lose");
							       labelNFl4.setTextFill(Color.BLUE);
							       Label labelNFl5 = new Label("Tied");
							       labelNFl5.setTextFill(Color.BLUE);
							       Label labelNFl6 = new Label("Win Percent");
							       labelNFl6.setTextFill(Color.BLUE);
							       Label labelNFl7 = new Label("Home Record");
							       labelNFl7.setTextFill(Color.BLUE);
							       Label labelNFl8 = new Label("Away Record");
							       labelNFl8.setTextFill(Color.BLUE);
							       Label labelNFl9 = new Label("Conference Record");
							       labelNFl9.setTextFill(Color.BLUE);
							       Label labelNFl10 = new Label("Streak");
							       labelNFl10.setTextFill(Color.BLUE);

							       
							       paneForNFLNFCL.getChildren().addAll(labelNFl1, paneForNFLNFCR);
							       paneForNFLNFCL2.getChildren().addAll(labelNFl2, paneForNFLNFCR2);
							       paneForNFLNFCL3.getChildren().addAll(labelNFl3, paneForNFLNFCR3);
							       paneForNFLNFCL4.getChildren().addAll(labelNFl4, paneForNFLNFCR4);
							       paneForNFLNFCL5.getChildren().addAll(labelNFl5, paneForNFLNFCR5);
							       paneForNFLNFCL6.getChildren().addAll(labelNFl6, paneForNFLNFCR6);
							       paneForNFLNFCL7.getChildren().addAll(labelNFl7, paneForNFLNFCR7);
							       paneForNFLNFCL8.getChildren().addAll(labelNFl8, paneForNFLNFCR8);
							       paneForNFLNFCL9.getChildren().addAll(labelNFl9, paneForNFLNFCR9);
							       paneForNFLNFCL10.getChildren().addAll(labelNFl10, paneForNFLNFCR10);
							       
							       
							       paneForNFLS.getChildren().addAll(paneForNFLNFCL, paneForNFLNFCL2, 
							    		   paneForNFLNFCL3, paneForNFLNFCL4, paneForNFLNFCL5, paneForNFLNFCL6, 
							    		   paneForNFLNFCL7, paneForNFLNFCL8, paneForNFLNFCL9, paneForNFLNFCL10); 
							       
							       paneForNFLNFC.getChildren().addAll(labelNFl, paneForNFLS);
							       
							       paneForNFLNFCLogo.getChildren().addAll(iV3, paneForNFLNFC);
							       
							      
							       
							 } catch (SQLException e) {
									
									e.printStackTrace();
								}
							try {
								  
								  String query = "SELECT t.teamName, s.Rank, s.winRecord, s.loseRecord, s.tiedRecord, s.winPercent, s.homeRecord, s.awayRecord, s.conferenceRecord, s.streak "
							      + "FROM team t JOIN standing s ON t.teamId = s.team_teamId "
							      + " WHERE teamId  = 48 OR teamId = 37 OR teamId = 34 OR teamId = 61 OR teamId = 47 OR teamId = 33 OR teamId = 40 OR teamId = 38 OR teamId = 46 OR teamId = 57 OR teamId = 43 OR  teamId = 44 OR teamId = 50 OR teamId = 52 OR teamId = 55 OR teamId = 45";
							 
                                  ResultSet resultSet = statement.executeQuery(query);
								  
								while(resultSet.next()) {
						
									
									 Label labelRS = new Label(resultSet.getString(1));
									 labelRS.setTextFill(Color.BLUE);
								     Label labelRS2 = new Label(resultSet.getString(2));
								     Label labelRS3 = new Label(resultSet.getString(3));
								     Label labelRS4 = new Label(resultSet.getString(4));
								     Label labelRS5 = new Label(resultSet.getString(5));
								     Label labelRS6 = new Label(resultSet.getString(6));
								     Label labelRS7 = new Label(resultSet.getString(7));
								     Label labelRS8 = new Label(resultSet.getString(8));
								     Label labelRS9 = new Label(resultSet.getString(9));
								     Label labelRS10 = new Label(resultSet.getString(10));
								     
								     paneForNFLAFCR.getChildren().addAll(labelRS);
								     paneForNFLAFCR2.getChildren().addAll(labelRS2);
								     paneForNFLAFCR3.getChildren().addAll(labelRS3);
								     paneForNFLAFCR4.getChildren().addAll(labelRS4);
								     paneForNFLAFCR5.getChildren().addAll(labelRS5);
								     paneForNFLAFCR6.getChildren().addAll(labelRS6);
								     paneForNFLAFCR7.getChildren().addAll(labelRS7);
								     paneForNFLAFCR8.getChildren().addAll(labelRS8);
								     paneForNFLAFCR9.getChildren().addAll(labelRS9);
								     paneForNFLAFCR10.getChildren().addAll(labelRS10);
								     
								}
								
								     Label labelAFC = new Label("American Football Conference (AFC)");
								     labelAFC.setTextFill(Color.BLUE);
								     labelAFC.setFont(Font.font("Times", 23));
								     Label labelAFC2 = new Label("Team Name");
								     labelAFC2.setTextFill(Color.RED);
								     Label labelAFC3 = new Label("Rank");
								     labelAFC3.setTextFill(Color.RED);
								     Label labelAFC4 = new Label("Win");
								     labelAFC4.setTextFill(Color.RED);
								     Label labelAFC5 = new Label("Lose");
								     labelAFC5.setTextFill(Color.RED);
								     Label labelAFC6 = new Label("Tied");
								     labelAFC6.setTextFill(Color.RED);
								     Label labelAFC7 = new Label("Win Percent");
								     labelAFC7.setTextFill(Color.RED);
								     Label labelAFC8 = new Label("Home Record");
								     labelAFC8.setTextFill(Color.RED);
								     Label labelAFC9 = new Label("Away Record");
								     labelAFC9.setTextFill(Color.RED);
								     Label labelAFC10 = new Label("Conference Record");
								     labelAFC10.setTextFill(Color.RED);
								     Label labelAFC11 = new Label("Streak");
								     labelAFC11.setTextFill(Color.RED);
								
								     paneForNFLAFCL.getChildren().addAll(labelAFC2, paneForNFLAFCR);
								     paneForNFLAFCL2.getChildren().addAll(labelAFC3, paneForNFLAFCR2);
								     paneForNFLAFCL3.getChildren().addAll(labelAFC4, paneForNFLAFCR3);
								     paneForNFLAFCL4.getChildren().addAll(labelAFC5, paneForNFLAFCR4);
								     paneForNFLAFCL5.getChildren().addAll(labelAFC6, paneForNFLAFCR5);
								     paneForNFLAFCL6.getChildren().addAll(labelAFC7, paneForNFLAFCR6);
								     paneForNFLAFCL7.getChildren().addAll(labelAFC8, paneForNFLAFCR7);
								     paneForNFLAFCL8.getChildren().addAll(labelAFC9, paneForNFLAFCR8);
								     paneForNFLAFCL9.getChildren().addAll(labelAFC10, paneForNFLAFCR9);
								     paneForNFLAFCL10.getChildren().addAll(labelAFC11, paneForNFLAFCR10);
								     
								     paneForNFLS1.getChildren().addAll(paneForNFLAFCL, paneForNFLAFCL2, 
								    		 paneForNFLAFCL3, paneForNFLAFCL4, paneForNFLAFCL5, 
								    		 paneForNFLAFCL6, paneForNFLAFCL7, paneForNFLAFCL8, paneForNFLAFCL9, paneForNFLAFCL10);
								     
								     paneForNFLAFC.getChildren().addAll(labelAFC, paneForNFLS1);
								     
								     paneForNFLAFCLogo.getChildren().addAll(iV4, paneForNFLAFC);
								     
								     paneForNFLSL.getChildren().addAll(paneForNFLNFCLogo, paneForNFLAFCLogo);
								     
								       spNFLStandings.setContent(paneForNFLSL);
								       bpNFLS.setRight(spNFLStandings);
								       bpNFLS.setCenter(paneForNFLSL);
								       bpNFLS.setBottom(backButton);
								       primaryStage.setTitle("NFL Standings");
								       primaryStage.setScene(scene9);
								       primaryStage.setHeight(500);
								       primaryStage.setWidth(800);
								       primaryStage.show();
							} catch (SQLException e) {
									
									e.printStackTrace();
								}
						 }
				   });
				   backButton.setOnAction(click -> {
					   primaryStage.setTitle("NFL League");
					   primaryStage.setScene(scene6);
					   primaryStage.setHeight(700);
					   primaryStage.setWidth(920);
				 });
				
				   
					 }
				 });
		
		primaryStage.setTitle("Sport Fans");
		primaryStage.setScene(scene1);
		primaryStage.setHeight(300);
		primaryStage.setWidth(430);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
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
	 		 NBATeams.setTextFill(Color.BLUE);
			 Label NBATeams2 = new Label("Player Name");
			 NBATeams2.setTextFill(Color.RED);
			 Label NBATeams3 = new Label("Position ");
			 NBATeams3.setTextFill(Color.BLUE);
			 Label NBATeams4 = new Label("Height");
			 NBATeams4.setTextFill(Color.RED);
			 Label NBATeams5 = new Label("Weight");
			 NBATeams5.setTextFill(Color.BLUE);
			 Label NBATeams6 = new Label("Experience");
			 NBATeams6.setTextFill(Color.RED);
			 Label NBATeams7 = new Label("College");
			 NBATeams7.setTextFill(Color.BLUE);
			 
			 Stage primaryStage = new Stage();
			 
			 
			  String [][] querys = new String [] [] {
					  {"Atlanta Hawks", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 1 AND 17"},
					  {"Boston Celtics", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 18 AND 34"},
					  {"Brooklyn Nets", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 35 AND 50"},
					  {"Charlotte Hornets", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 51 AND 66"},
					  {"Chicago Bulls", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 67 AND 83"},
					  {"Cleveland Cavaliers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 84 AND 100"},
					  {"Dallas Mavericks", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 101 AND 117"},
					  {"Denver Nuggets", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 118 AND 136"},
					  {"Detroit Pistons", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 135 AND 151"},
					  {"Golden State Warriors", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 152 AND 168"},
					  {"Houston Rockets", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 169 AND 185"},
					  {"Indiana Pacers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 186 AND 202"},
					  {"Los Angeles Clippers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 203 AND 218"},
					  {"Los Angeles Lakers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 219 AND 235"},
					  {"Memphis Grizzlies", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 236 AND 251"},
					  {"Miami Heat", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 252 AND 267"},
					  {"Milwaukee Bucks", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 268 AND 283"},
					  {"Minnesota Timberwolves", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 284 AND 299"},
					  {"New Orleans Pelicans", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 300 AND 316"},
					  {"New York Knicks", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 317 AND 333"},
					  {"Oklahoma City Thunders", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 334 AND 350"},
					  {"Orlando Magic", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 351 AND 366"},
					  {"Philadelphia 76ers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 367 AND 383"},
					  {"Phoenix Suns", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 384 AND 399"},
					  {"Portland Trail Blazers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 400 AND 416"},
					  {"Sacramento Kings", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 417 AND 432"},
					  {"San Antonio Spurs", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 433 AND 450"},
					  {"Toronto Raptors", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 451 AND 468"},
					  {"Utah Jazz", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 469 AND 484"},
					  {"Washington Wizards", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 485 AND 501"}
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
				 Label Team = new Label(resultSet.getString(1));
				 Label Team2 = new Label(resultSet.getString(2));
				 Label Team3 = new Label(resultSet.getString(3));
				 Label Team4 = new Label(resultSet.getString(4));
				 Label Team5 = new Label(resultSet.getString(5));
				 Label Team6 = new Label(resultSet.getString(6));
				 Label Team7 = new Label(resultSet.getString(7));
				
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
				  {"Arizona Cardinals", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 502 AND 577"},
				  {"Atlanta Falcons", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 578 AND 650"},
				  {"Baltimore Ravens", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 651 AND 731"},
				  {"Buffalo Bills", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 732 AND 800"},
				  {"Carolina Panthers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 801 AND 867"},
				  {"Chicago Bears", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 868 AND 937"},
				  {"Cincinnati Bengals", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 938 AND 1003"},
				  {"Cleveland Browns", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 1004 AND 1070"},
				  {"Dallas Cowboys", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 1071 AND 1143"},
				  {"Denver Broncos", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 1144 AND 1222"},
				  {"Detroit Lions", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 1223 AND 1298"},
				  {"Green Bay Packers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 1299 AND 1369"},
				  {"Houston Texans", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 1370 AND 1436"},
				  {"Indianapolis Colts", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 1437 AND 1512"},
				  {"Jacksonville Jaguars", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 1513 AND 1579"},
				  {"Kansas City Chiefs", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 1580 AND 1646"},
				  {"Las Vegas Raiders", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 1647 AND 1719"},
				  {"Los Angeles Chargers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 1720 AND 1789"},
				  {"Los Angeles Rams", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 1790 AND 1864"},
				  {"Miami Dolphins", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 1865 AND 1935"},
				  {"Minnesota Vikings", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 1936 AND 2012"},
				  {"New England Patriots", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 2013 AND 2090"},
				  {"New Orleans Saints", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 2091 AND 2164"},
				  {"New York Giants", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 2165 AND 2241"},
				  {"New York Jets", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 2242 AND 2318"},
				  {"Philadelphia Eagles", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 2319 AND 2391"},
				  {"Pittsbutgh Steelers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 2392 AND 2465"},
				  {"San Francisco 49ers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 2466 AND 2538"},
				  {"Seattle Seahawks", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 2539 AND 2612"},
				  {"Tampa Bay Buccaneers", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 2613 AND 2687"},
				  {"Tennessee Titans", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 2688 AND 2762"},
				  {"Washington Football Team", "SELECT jerseyNumber, playerName, position, height, weight, experience, college FROM teamroster WHERE teamRosterId Between 2763 AND 2830"}
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
					 Label NFLTeam = new Label(resultSet.getString(1));
					 Label NFLTeam2 = new Label(resultSet.getString(2));
					 Label NFLTeam3 = new Label(resultSet.getString(3));
					 Label NFLTeam4 = new Label(resultSet.getString(4));
					 Label NFLTeam5 = new Label(resultSet.getString(5));
					 Label NFLTeam6 = new Label(resultSet.getString(6));
					 Label NFLTeam7 = new Label(resultSet.getString(7));
					
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
				    primaryStage.setHeight(500);
				    primaryStage.setWidth(600);
				    primaryStage.show();
				    
				   
		 }catch (Exception e) {
				e.printStackTrace();
				
		}	
			return queryStringNFL;	

	   	  

}
   
}

