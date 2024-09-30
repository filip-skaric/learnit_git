package com.itbulls.fskaric.example006.solution;

public class UserRegistration {
	
    public static boolean registerUser(String username, String password) {
        // Validate username and password
        if (UserValidator.validateUsername(username) && UserValidator.validatePassword(password)) {
            // Register user in the database
            System.out.println("User registered successfully.");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }
}