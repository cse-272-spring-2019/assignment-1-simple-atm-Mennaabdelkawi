package Submit;
import Submit.LoginAuthetication;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class LoginForm {
    Scene scene;
    HomeScreen homeScreen;
	LoginAuthetication authetication;
	Stage stage;
public LoginForm(Stage stage)
{
	this.stage=stage;
}

	public void PrepareScene(){
		
	    authetication= new LoginAuthetication();
		
		
		Label usernameLabel = new Label();
		Label passwordLabel = new Label();
		TextField usernameField = new TextField();
		PasswordField passwordField = new PasswordField();
		Button Submit = new Button ();
		Label validationLabel= new Label();
		
		GridPane grid= new GridPane();
		grid.add(usernameLabel,0,1);
		grid.add(passwordLabel,0,2);
		grid.add(usernameField,1,1);
		grid.add(passwordField,1,2);
		grid.add(Submit,1,4);
		grid.add(validationLabel,1,5);
		
		 usernameLabel.setText("User Name :");
		 usernameLabel.setFont(new Font("Bold",20));
		 
		 passwordLabel.setText("Password :");
		 passwordLabel.setFont(new Font("Bold",20));
		 Submit.setText("Login");
		 Submit.setFont(new Font("Bold",20));
		
		
		Submit.setOnAction(new EventHandler<ActionEvent>(){
			
			@Override
			public void handle(ActionEvent arg0) {
				
				String username=usernameField.getText();
				String password=passwordField.getText();
			
				boolean valid =authetication.validate(username,password);
				if(valid) {
					
					stage.setScene(homeScreen.getScene());
				}
					
				else {
					validationLabel.setText("Wrong username or password ");
					validationLabel.setFont(new Font("Bold",20));
					
				}
				}
			
				
		});
		
		grid.setVgap(20);
		grid.setHgap(20);
		 scene=new Scene(grid,700,400);
	}
	
		public Scene getScene() {
			
			return this.scene;
		}
		
		public void setHomeScreen (HomeScreen homeScreen)
		{
			this.homeScreen=homeScreen;
		}
		
		
}
		
	
	

	

