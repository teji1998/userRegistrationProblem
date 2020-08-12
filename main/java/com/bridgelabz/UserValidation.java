package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidation {
	private static final String NAME_PATTERN="^[A-Z][A-Za-z]{2,}";
	private static final String EMAIL_ID_PATTERN="^[0-9a-z]+[+_.-]?[0-9a-z]+[@][0-9a-z]+[.][a-z]{2,}[.]?[a-z]+$";
	private static final String PHONE_NUMBER_PATTERN="^[0-9]{2}[ ][0-9]{10}";
	private static final String PASSWORD_PATTERN = "^(?=.*[A-Z].*)(?=.*[0-9].*)(?=.*[@#$%^&*+_].*)[0-9a-zA-Z@#$%^&*+_]{8,}";


	public boolean validateFirstName(String firstName) {
		Pattern pattern=Pattern.compile(NAME_PATTERN);
		return pattern.matcher(firstName).matches();
	}

	public boolean validateLastName(String lastName) {
		Pattern pattern=Pattern.compile(NAME_PATTERN);
		return pattern.matcher(lastName).matches();
	}

	public boolean validateEmailId(String emailid) {
		Pattern pattern=Pattern.compile(EMAIL_ID_PATTERN);
		return pattern.matcher(emailid).matches();
	}

	public boolean validatePhoneNumber(String phoneNumber) {
		Pattern pattern=Pattern.compile(PHONE_NUMBER_PATTERN);
		return pattern.matcher(phoneNumber).matches();

	}

	public boolean validatePassword(String passsword) {
		Pattern pattern=Pattern.compile(PASSWORD_PATTERN);
		return pattern.matcher(passsword).matches();
	}
}
