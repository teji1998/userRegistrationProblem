package bridgelabz.com;

import com.bridgelabz.UserValidation;
import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

	@Test
	public void givenFirstName_whenProper_shouldReturnTrue() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateFirstName("Tejaswini");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstName_whenShort_shouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateFirstName("Te");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_whenProper_shouldReturnTrue() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateLastName("Kulkarni");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_whenShort_shouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateFirstName("Ku");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmailId_whenProper_shouldReturnTrue() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateEmailId("tejasvinirpk@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmailId_whenShort_shouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateEmailId("@yahoo.com");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmailId_whenMissingTheRequiredSymbols_shouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateEmailId("tejirpkyahoo.com");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmailId_whenDoesNotContainTheCompulsoryPart_shouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateEmailId("tejik@hotmail.");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPhoneNumber_whenProper_shouldReturnTrue() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validatePhoneNumber("91 9920275347");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPhoneNumber_whenNotProper_shouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validatePhoneNumber("919920275347");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_whenProper_shouldReturnTrue() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validatePassword("Tejaswini+1998");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_whenNotProper_shouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validatePassword("teju");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_whenContainsNoSpecialCharacter_shouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validatePassword("teju12345");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_whenContainsNoNumbers_shouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validatePassword("teju@kulk");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_whenContainsNoUpperCaseLetter_shouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validatePassword("teji$1356");
		Assert.assertFalse(result);
	}
}


