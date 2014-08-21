package org.sajjad;

public class LoginService{
	 
	public String performLogin(LoginCredentials loginCredentials) throws IncorrectLoginCredentialsException{
	 
	if(loginCredentials.getLoginName() != null && loginCredentials.getLoginName().trim().equalsIgnoreCase("sajjad")
	&& loginCredentials.getPassword() != null && loginCredentials.getPassword().trim().equalsIgnoreCase("sajjad")){
	//user successfully logged in
	return "success";
		} else {
			throw new IncorrectLoginCredentialsException();
		}
	}
 
}