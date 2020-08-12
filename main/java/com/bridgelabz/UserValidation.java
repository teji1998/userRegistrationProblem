package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidation {
	private static final String NAME_PATTERN="^[A-Z][A-Za-z]{2,}";
<<<<<<< HEAD
=======
	private static final String EmailId_PATTERN="^[0-9a-z]+[+_.-]?[0-9a-z]+[@][0-9a-z]+[.][a-z]{2,}[.]?[a-z]+$";
>>>>>>> UC3

	public boolean validateFirstName(String firstName) {
		Pattern pattern=Pattern.compile(NAME_PATTERN);
		return pattern.matcher(firstName).matches();
	}

	public boolean validateLastName(String lastName) {
		Pattern pattern=Pattern.compile(NAME_PATTERN);
		return pattern.matcher(lastName).matches();
	}
<<<<<<< HEAD
}
=======

	public boolean validateEmailId(String emailid) {
		Pattern pattern=Pattern.compile(EmailId_PATTERN);
		return pattern.matcher(emailid).matches();
	}
}
>>>>>>> UC3
