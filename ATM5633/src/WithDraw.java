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

public class WithDraw {

	Scene scene;
	HomeScreen homeScreen;
	Stage stage; 
    UserBalance balance;
    
    
	public WithDraw(Stage stage) {
		this.stage=stage;
		 
	}

	public void prepareScene() {
		
		Label Amount = new Label("Your Withdraw amount :");
		 Button Back = new Button ("Back");
		 TextField AmountField = new TextField();
		 Button Submit = new Button ("Submit");
		 Label validationLabel= new Label();
		
		 GridPane grid = new GridPane();
		  grid.add(Amount,0,2);
		  grid.add(AmountField,1,2);
		  grid.add(Back,2,8);
		  grid.add(Submit,1,4);
		  grid.add(validationLabel,0,6);
 
		 
		  
			Back.setOnAction( new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					stage.setScene(homeScreen.getScene());
				}
			});
			Submit.setOnAction( new EventHandler<ActionEvent>() {
				
				@Override
				
				public void handle(ActionEvent event) {
					double amount=Double.parseDouble(AmountField.getText()) ;
					
					double var=balance.getBalance();
					
					if (amount > var)
					{
						validationLabel.setText("There is no insuffient funds in your account");
					}
					else 
					{
						var-=amount;
						validationLabel.setText(" Thank you , new balance is: "+ var);
					}
				   
				}
			});
		
			grid.setVgap(20);
			grid.setHgap(20);
			scene=new Scene(grid,700,400);
		
	}
	public Scene getScene(){
	return scene;
	}
	
	 public void setHomeScreen(HomeScreen homeScreen) {
		  this.homeScreen=homeScreen;
	  }
	 
	 
	 public  void setUserBalance(UserBalance balance) {
		this.balance=balance;
	  }
	
	 
	
  
    }
	
	
	
	
	
	
	
	

