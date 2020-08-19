package bridgelabz.com;

import com.bridgelabz.UserValidation;
import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateFirstName("Tejaswini");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateFirstName("Te");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateLastName("Kulkarni");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateFirstName("Ku");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmailId_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateEmailId("tejasvinirpk@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmailId_WhenShort_ShouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateEmailId("@yahoo.com");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validatePhoneNumber("91 9920275347");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validatePhoneNumber("919920275347");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validatePassword("Tejaswini+1998");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validatePassword("teju");
		Assert.assertFalse(result);
	}
}


