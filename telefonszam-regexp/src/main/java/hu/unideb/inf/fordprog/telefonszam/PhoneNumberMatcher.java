package hu.unideb.inf.fordprog.telefonszam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberMatcher {

	private static final String REGEXP = "(^\\+?\\d{2}?(-?\\d-?\\d{3}-?\\d{3}|-\\d{2}-\\d{3}-\\d{2}-\\d{2}|-\\d{2}-\\d{3}-\\d{4}|-\\d{2}-\\d{2}-\\d{2}-\\d{3}|-\\d{2}-\\d{4}-\\d{3}|\\d{9}|-\\d{2}-\\d{7}))";


	public static boolean match(String phoneNumber) {
		final Pattern pattern = Pattern.compile(REGEXP);
		final Matcher matcher = pattern.matcher(phoneNumber);
		return matcher.matches();
	}
}
