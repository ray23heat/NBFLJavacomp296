package administratorsignUp;

import javafx.geometry.Insets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
public class AdministratorSignups extends Application {
 double paneWidth = 600;
 double paneHeight = 600;
	public void start(Stage primaryStage) {	
			BorderPane pane  = new BorderPane();
			HBox paneForlbTextField = new HBox(10);
			HBox paneForlbTextField2 = new HBox(10);
		    HBox paneForlbTextField3 = new HBox(10);
		    HBox paneForlbTextField4 = new HBox(10);
			VBox paneForLabelTF = new VBox(10);
			
			Scene scene1 = new Scene(pane);
			
			//scene2//	
			BorderPane Bp = new BorderPane();
			VBox paneForMessage = new VBox(10);
			paneForMessage.setPadding (new Insets(23,23,23,23));
			
			Scene scene2 = new Scene(Bp);
			HBox paneForLogo = new HBox(10);
			
			//Scene3//
			BorderPane bp = new BorderPane();
			Scene scene3 = new Scene(bp);
			
			Label lb = new Label("First Name :");
			lb.setContentDisplay(ContentDisplay.LEFT);
			TextField t = new TextField();
			
			
			Label lb2 = new Label("Last Name :");
			TextField t2 = new TextField();
			
			Label lb3 = new Label("Email Address :");
			TextField t3 = new TextField();
			
			
			Label lb4 = new Label("Password :");
			TextField t4 = new TextField();
		
			paneForlbTextField.getChildren().addAll(lb, t);
			paneForlbTextField2.getChildren().addAll(lb2, t2);
			paneForlbTextField3.getChildren().addAll(lb3, t3);
			paneForlbTextField4.getChildren().addAll(lb4, t4);
			
			paneForLabelTF.getChildren().addAll(paneForlbTextField, 
					paneForlbTextField2, paneForlbTextField3, paneForlbTextField4);
			
			Button B = new Button("Submit");
		    pane.setBottom(B);
			pane.setCenter(paneForLabelTF);
			
			
			B.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
	
	        	public void handle(ActionEvent event) {
	        	
	        		    boolean error = true;
	        		    Label lb5 = new Label();
	        			Image image = new Image("nbalogo.jpg");
	        			ImageView imageView = new ImageView(image);
	        			imageView.setFitHeight(120);
	        			imageView.setFitWidth(150);
	        			Image image2 = new Image("nfllogo.jpg");
	        			ImageView imageView2 = new ImageView(image2);
	        			imageView2.setFitHeight(120);
	        			imageView2.setFitWidth(150);
	        			Button Button = new Button("Submit");
	        			Button Button2 = new Button("Logout");
	        	
	        			
	        			if(t.getText().isEmpty()) {
	        				 lb5.setText("Enter a valid first name");
	        				 
	        			}
	        			   else if(t2.getText().isEmpty()) {
	        				 lb5.setText("Enter a valid last name");
	        				
	        				
	        			 }
	        			   else if(t3.getText().isEmpty()) {
	        				 lb5.setText("Enter a valid email address");
	        				
	        			   }  
	        			   else if(t4.getText().isEmpty()) {
		        			 lb5.setText("Enter a valid password");
		        			 
	        			 
	        			  }
	        			   
	        			   else {
	        				   
	        			 	 lb5.setText("Welcome to NBFL \n " + t.getText());
	        			 	 lb5.setFont(Font.font("Times", 23));
	        			 	 paneForMessage.getChildren().addAll(lb5);
	        			 	 Bp.setCenter(paneForMessage);
	        			     paneForLogo.getChildren().addAll(imageView, imageView2);
	        			     paneForMessage.getChildren().addAll(paneForLogo);
	        			     Bp.setBottom(Button2);
	        			     error = false;
	        			     
	        			     primaryStage.setTitle("Home Page");
	        			     primaryStage.setScene(scene2);
	        			     primaryStage.setHeight(300);
	        				 primaryStage.setWidth(400);
	        			 	 primaryStage.show();
	        			 	 
	        			 	 administrator(1, t.getText(), t2.getText(), t3.getText(), t4.getText());  			    
 	        			 
	    	        		}
	
	        				if (error) {
	        					pane.setTop(lb5);
	        					pane.setBottom(Button);
	        					
		        		}

	        				Button.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
	        					
	        					
	        					
	        		        	public void handle(ActionEvent event) {
	        		             lb5.setText("Welcome to NBFL \n " + t.getText());
	   	        			 	 lb5.setFont(Font.font("Times", 23));
	   	        			 	 paneForMessage.getChildren().addAll(lb5);
	   	        			     paneForLogo.getChildren().addAll(imageView, imageView2);
	   	        			     paneForMessage.getChildren().addAll(paneForLogo);
	   	        			     Bp.setBottom(Button2);
	   	        			     Bp.setTop (lb5);
		        			     Bp.setCenter(paneForMessage);
		        			     
		        			     primaryStage.setTitle("Home Page");
		        			     primaryStage.setScene(scene2);
		        			     primaryStage.setHeight(300);
		        				 primaryStage.setWidth(400);
		        			     primaryStage.show();

		        			    
		        				  
		        			  
	        		        	}
	        				});
	        				 Button2.setOnAction( (EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
		        					
			        				public void handle(ActionEvent event) {
			        					Label label = new Label("You have successfully logout");
			        					label.setFont(Font.font("Times", 23));
			        					bp.setTop(label);
			        					
			        					primaryStage.setTitle("Logout");
			        					primaryStage.setScene(scene3);
			        					primaryStage.setHeight(300);
			        					primaryStage.setWidth(350);
			        					primaryStage.show();
			        					
			        				}
		        			     });
		        	}
		        });

	        
			primaryStage.setTitle("Administrator Sign Up");
			primaryStage.setScene(scene1);
			primaryStage.setHeight(300);
			primaryStage.setWidth(300);
			primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);

	}

	private void administrator(int administratorId, String firstName, String lastName, String emailaddress, String password) {
	
	  try {
		  Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/nbfl", "root", "");

		 String sql = "INSERT INTO administratoraccount(administratorId, firstName, lastName, emailaddress, password) VALUES (default,?,?,?,?)";
		
		 PreparedStatement preparedStatement = connect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		 
	     preparedStatement.setString(1, firstName);
	     preparedStatement.setString(2, lastName);
	     preparedStatement.setString(3, emailaddress);
	     preparedStatement.setString(4, password);
		 
	     preparedStatement.executeUpdate();
	     
	     ResultSet resultSet = preparedStatement.getGeneratedKeys();
	     resultSet.next();
        
		}catch (Exception e) {
			e.printStackTrace();
	
		}
	}
}
