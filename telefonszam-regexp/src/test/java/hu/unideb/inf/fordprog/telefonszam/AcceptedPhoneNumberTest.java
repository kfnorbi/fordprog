package hu.unideb.inf.fordprog.telefonszam;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AcceptedPhoneNumberTest {

	@Parameters(name = "{index}: phone number: {0}")
	public static Object[] data() {
		return new Object[] { "+36-1-123123", "+36-52-123123", "+36301234567", "+36-30-123-45-67", "304290661",
				"+36-52-333-333", "+36-30-123-12-12", "+36-30-123-1234", "+36-30-12-12-123", "+36-30-1234-123" };
	}

	@Parameter
	public String input;

	@Test
	public void testAutomataAcceptInputs() {
		Assert.assertTrue(PhoneNumberMatcher.match(input));
	}

}
