package hu.unideb.inf.fordprog.telefonszam;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NotAcceptedPhoneNumberTest {

	@Parameters(name = "{index}: phone number: {0}")
	public static Object[] data() {
		return new Object[] { "+36-30-1-2345-67","+36+1234567","+36","-36123456789","Telefonszám","+36123456" };
	}

	@Parameter
	public String input;

	@Test
	public void testAutomataAcceptInputs() {
		Assert.assertFalse(PhoneNumberMatcher.match(input));
	}

}
