package com.itbulls.fskaric.example002;

public class MortgageLoanHandler implements LoanHandler {

	private Validator validator;
	
	public MortgageLoanHandler(Validator validator) {
		this.validator = validator;
	}
	
	@Override
	public void approveLoan(User user) {
		if (validator.isValid(user)) {
			// proceed with loan approval
			System.out.println("MortgageLoanHandler -> nutra");
		}
		System.out.println("MortgageLoanHandler -> vani");
	}
		
}
