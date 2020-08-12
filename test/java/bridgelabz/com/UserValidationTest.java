package bridgelabz.com;

import com.bridgelabz.UserValidation;
import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

	UserValidation userValidation = new UserValidation();
	boolean result = userValidation.validateFirstName("Tejaswini");@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateFirstName("Te");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation=new UserValidation();
		boolean result=userValidation.validateLastName("Kulkarni");
		Assert.assertEquals(true,result);
	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserValidation userValidation=new UserValidation();
		boolean result=userValidation.validateFirstName("Ku");
		Assert.assertEquals(false,result);
	}
	@Test
	public void givenEmailId_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation=new UserValidation();
		boolean result=userValidation.validateEmailId("tejasvinirpk@gmail.com");
		Assert.assertEquals(true,result);
	}

	@Test
	public void givenEmailId_WhenShort_ShouldReturnFalse() {
		UserValidation userValidation=new UserValidation();
		boolean result=userValidation.validateEmailId("@yahoo.com");
		Assert.assertEquals(false,result);
	}

	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation=new UserValidation();
		boolean result=userValidation.validatePhoneNumber("91 9920275347");
		Assert.assertEquals(true,result);
	}

	@Test
	public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
		UserValidation userValidation=new UserValidation();
		boolean result=userValidation.validatePhoneNumber("919920275347");
		Assert.assertEquals(false,result);
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation=new UserValidation();
		boolean result=userValidation.validatePassword("Tejaswini+1998");
		Assert.assertEquals(true,result);
	}
	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() {
		UserValidation userValidation=new UserValidation();
		boolean result=userValidation.validatePassword("teju");
		Assert.assertEquals(false,result);
	}
}


