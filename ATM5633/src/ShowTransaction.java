package Submit;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ShowTransaction {
	
	String[] arr;
	
	
	Scene scene;
	HomeScreen homeScreen;
	Stage stage; 
	
	
	public ShowTransaction (Stage stage) {
		this.stage=stage;
	}
	
	 
	 
	 public void prepareScene() {
			
			Label show = new Label();
			 Button Back = new Button ("Back");
			 Button Next= new Button ("Next");
			 Button prev= new Button ("Previous");
			 
			 GridPane grid = new GridPane();
			  grid.add(show,0,2);
			  grid.add(Back,2,8);
			  grid.add(Next,0,5);
			  grid.add(prev,2,5);
			  
			  
			  
				Back.setOnAction( new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						stage.setScene(homeScreen.getScene());
					}
				});
			
			  
			  grid.setVgap(20);
			  grid.setHgap(20);
			  
			  show.setText("Your Transactions :");
			  show.setFont(new Font("Verdana",18));
			  
			  scene=new Scene(grid,700,400);
			
		}
	 public Scene getScene(){
			return scene;
			}
	 public void setHomeScreen(HomeScreen homeScreen) {
		  this.homeScreen=homeScreen;
	  }
	
}
