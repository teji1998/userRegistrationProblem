package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidation {
	private static final String NAME_PATTERN="^[A-Z][A-Za-z]{2,}";

	public boolean validateFirstName(String firstName) {
		Pattern pattern=Pattern.compile(NAME_PATTERN);
		return pattern.matcher(firstName).matches();
	}

	public boolean validateLastName(String lastName) {
		Pattern pattern=Pattern.compile(NAME_PATTERN);
		return pattern.matcher(lastName).matches();
	}
}