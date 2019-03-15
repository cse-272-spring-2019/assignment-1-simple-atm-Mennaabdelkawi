package Submit;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HomeScreen {
	LoginForm loginForm;
	Stage stage;
    Scene scene;
    Deposit deposit;
    WithDraw withDraw;
    ShowTransaction showTransaction;
	Balance balance;
    
  
  
  public  HomeScreen(Stage stage)
  {
	  this.stage=stage;
  }
  public void prepareScene() {
	  Label Menu = new Label ();
	  Label choose = new Label ();
	  Button Logout = new Button ();
	  Button withdraw = new Button ();
	  Button Deposit = new Button ();
	  Button Enquiry = new Button ();
	  Button ShowTransaction = new Button ();
	  
	  
	  
	  GridPane grid = new GridPane();
	  grid.add(Menu,0,0);
	  grid.add(Logout,1,8);
	  grid.add(withdraw,0,4);
	  grid.add(choose,0,2);
	  grid.add(Deposit,0,5);
	  grid.add(Enquiry,0,6);
	  grid.add(ShowTransaction,0,7);
	  
	  Logout.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
		
			stage.setScene(loginForm.getScene());
		
		}
	  });
	  Enquiry.setOnAction(new EventHandler<ActionEvent>() {
		  @Override
		  public void handle(ActionEvent event) {
			  stage.setScene(balance.getScene());
		  }
	  });
	  withdraw.setOnAction( new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(withDraw.getScene());
			}
			});
	  Deposit.setOnAction( new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(deposit.getScene());
			}
			});
	 ShowTransaction.setOnAction( new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(showTransaction.getScene());
			}
			});
	  
	  grid.setVgap(15);
		grid.setHgap(15);
	  scene=new Scene (grid,700,400);
	  
	  Menu.setText("               ---  Menu --- ");
	  Menu.setFont(new Font("Verdana",40));
	  
	  choose.setText("Please Select Your Transaction : ");
	  choose.setFont(new Font("Verdana",25));
	  
	  Deposit.setText("Deposit");
	  Deposit.setFont(new Font("Verdana",17));
	  
	  Logout.setText("Logout");
	  Logout.setFont(new Font("Verdana",17));
	  
	  Enquiry.setText("Balance Enquiry");
	  Enquiry.setFont(new Font("Verdana",17));
	  
	  withdraw.setText("Withdraw");
	  withdraw.setFont(new Font("Verdana",17));
	  
	  ShowTransaction.setText("Show Transaction");
	  ShowTransaction.setFont(new Font("Verdana",17));
	  
  }
  public Scene getScene() {
	  return scene;
	  
	  
  }
  public void setLoginForm(LoginForm loginForm )
  {
	  this.loginForm=loginForm;
  }
  
  public void setBalance(Balance balance) {
	 this.balance=balance;
  }
  public void setWithDraw(WithDraw withDraw) {
	  this.withDraw=withDraw;
  }
  public void setDeposit(Deposit deposit) {
	  this.deposit=deposit;
  }
  public void setShowTransaction(ShowTransaction showTransaction) {
	  this.showTransaction=showTransaction;
  }
  
}
