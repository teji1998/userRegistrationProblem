package bridgelabz.com;

import com.bridgelabz.UserValidation;
import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateFirstName("Tejaswini");
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
}
