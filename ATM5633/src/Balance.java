package Submit;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Balance {
	HomeScreen homeScreen;
    Scene scene;
    Stage stage;
    UserBalance balance;
    
   
    
  public  Balance(Stage stage) {
	  this.stage=stage;
	  
  }
  
  public void setUserBalance(UserBalance balance) {
	  this.balance=balance;
  }
 
 
 public void prepareScene() {
	 Label Balance = new Label("Your Balance is : "+ 1000);
	 Button Back = new Button ("Back");
	 
	 GridPane grid = new GridPane();
	  grid.add(Balance,0,2);
	  grid.add(Back,1,4);
	  
	Back.setOnAction( new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent event) {
			stage.setScene(homeScreen.getScene());
		}
	});
		  
	grid.setVgap(20);
	grid.setHgap(20);
	  scene=new Scene(grid,700,400);
	   
 }
 public  Scene getScene() {
		
		return this.scene;
	}
  
  public void setHomeScreen(HomeScreen homeScreen) {
	  this.homeScreen=homeScreen;
  }
 
}
