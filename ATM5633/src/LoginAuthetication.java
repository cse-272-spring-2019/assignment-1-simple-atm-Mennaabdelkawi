package Submit;
import java.util.HashMap;
public class LoginAuthetication {
   HashMap usersDictionary;
   public LoginAuthetication () {
	   usersDictionary=new HashMap();
	   usersDictionary.put("Menna","1234");
	 
   }
   
   
	public boolean validate (String username,String password) {
		boolean validationResult;
		String fetchedPassword=(String) usersDictionary.get(username);
		if(fetchedPassword!=null)
		{
		validationResult=fetchedPassword.equals(password);
		}else {
			validationResult=false;
		}
		return validationResult;
		
	}
}
