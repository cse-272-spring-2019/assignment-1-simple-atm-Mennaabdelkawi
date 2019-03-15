package Submit;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;




public class ATM extends Application {

	public static void main (String[]args)
	   {
		   launch(args);
	   }
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("ATM");
		LoginForm loginForm =new LoginForm(primaryStage);
		HomeScreen homeScreen= new HomeScreen(primaryStage);
		Balance balance=new Balance(primaryStage);
		WithDraw withDraw=new WithDraw(primaryStage);
		Deposit deposit= new Deposit(primaryStage);
		UserBalance userBalance=new UserBalance(1000);
		ShowTransaction showTransaction=new ShowTransaction(primaryStage);
		
		withDraw.setUserBalance(userBalance);
		deposit.setUserBalance(userBalance);
		balance.setUserBalance(userBalance);
		
		
		homeScreen.prepareScene();
		balance.prepareScene();
		loginForm.PrepareScene();
		withDraw.prepareScene();
		deposit.prepareScene();
		showTransaction.prepareScene();
		
		loginForm.setHomeScreen(homeScreen);
		homeScreen.setLoginForm(loginForm);
		homeScreen.setBalance(balance);
		balance.setHomeScreen(homeScreen);
		homeScreen.setWithDraw(withDraw);
		homeScreen.setDeposit(deposit);
		withDraw.setHomeScreen(homeScreen);
		deposit.setHomeScreen(homeScreen);
		showTransaction.setHomeScreen(homeScreen);
		homeScreen.setShowTransaction(showTransaction);
		
		
		primaryStage.setScene(loginForm.getScene());
		primaryStage.show();
		
		}
	}
	
	


