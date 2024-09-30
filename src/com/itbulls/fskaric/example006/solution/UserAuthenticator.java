package com.itbulls.fskaric.example006.solution;

public class UserAuthenticator {
	
    public static boolean authenticateUser(String username, String password) {
       
    	// Validate username and password
        if (UserValidator.validateUsername(username) && UserValidator.validatePassword(password)) {
            // Authenticate user
            System.out.println("User logged in successfully.");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }
}