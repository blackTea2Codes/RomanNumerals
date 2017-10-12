import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
	private String userInput;
	private boolean checkIf_I_X_C_M_V_L_D_repeatedMoreThanAllowed(String input) {
//		System.out.println(input);
		boolean repeatedMoreThanAllowed = false;
		char[] charArray = input.toCharArray();
//		System.out.println(charArray);
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character c : charArray) {
//			System.out.println(c);

			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c,  1);
			}
		}
//		System.out.println("I: " + charMap.get('I'));

		if(charMap.get('I') != null && charMap.get('I') > 3) {
//			System.out.println("I more than 3 times");
			repeatedMoreThanAllowed = true;
		}
//		System.out.println("C: " + charMap.get('C'));

		if(charMap.get('X') != null && charMap.get('X') > 3 ) {
//			System.out.println("X more than 3 times");
			repeatedMoreThanAllowed = true;
		}
		if(charMap.get('C') != null && charMap.get('C') > 3 ) {
//			System.out.println("X more than 3 times");
			repeatedMoreThanAllowed = true;
		}
		if(charMap.get('M') != null && charMap.get('M') > 3 ) {
//			System.out.println("X more than 3 times");
			repeatedMoreThanAllowed = true;
		}
		if(charMap.get('V') != null && charMap.get('V') > 1 ) {
			repeatedMoreThanAllowed = true;
		}
		if(charMap.get('L') != null && charMap.get('L') > 1 ) {
			repeatedMoreThanAllowed = true;
		}
		if(charMap.get('D') != null && charMap.get('D') > 1 ) {
			repeatedMoreThanAllowed = true;
		}
		
		return repeatedMoreThanAllowed;
	}
	public int convertToInteger(String romanNum) throws IncorrectInputException {
		userInput = romanNum.toUpperCase();
		//		System.out.println(userInput);
		if(checkIf_I_X_C_M_V_L_D_repeatedMoreThanAllowed(userInput)) {
			throw new IncorrectInputException(userInput);
		}
		
		return 0;
		
	}
}
