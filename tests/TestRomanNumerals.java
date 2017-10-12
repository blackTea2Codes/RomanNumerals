import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRomanNumerals {
	RomanNumerals converter;
	String input;
	@Before
	public void setUp() {
		converter = new RomanNumerals();
		input ="";
	}

	@Test(expected = IncorrectInputException.class )
	public void test_exception_repeated_I_4times() throws IncorrectInputException {
//		RomanNumerals converter = new RomanNumerals();
//		String input = "IIII";
		input = "IIII";
		converter.convertToInteger(input);
	}
	@Test(expected = IncorrectInputException.class )
	public void test_exception_repeated_i_4times() throws IncorrectInputException {
		input = "iiii";
//		RomanNumerals converter = new RomanNumerals();
//		String input = "iiii";
		converter.convertToInteger(input);
	}
	@Test(expected = IncorrectInputException.class )
	public void test_exception_xiiii() throws IncorrectInputException {
		input = "xiiii";
//		RomanNumerals converter = new RomanNumerals();
//		String input = "xiiii";
		converter.convertToInteger(input);
	}
	@Test(expected = IncorrectInputException.class )
	public void test_exception_xxxx() throws IncorrectInputException {
		input = "xxxx";
//		RomanNumerals converter = new RomanNumerals();
//		String input = "cccc";
		converter.convertToInteger(input);
	}
	@Test(expected = IncorrectInputException.class )
	public void test_exception_cccc() throws IncorrectInputException {
		input = "cccc";
//		RomanNumerals converter = new RomanNumerals();
//		String input = "cccc";
		converter.convertToInteger(input);
	}
	@Test(expected = IncorrectInputException.class )
	public void test_exception_mmmm() throws IncorrectInputException {
		input = "mmmm";
//		RomanNumerals converter = new RomanNumerals();
//		String input = "cccc";
		converter.convertToInteger(input);
	}
	@Test(expected = IncorrectInputException.class )
	public void test_exception_vv() throws IncorrectInputException {
		input = "vv";
//		RomanNumerals converter = new RomanNumerals();
//		String input = "cccc";
		converter.convertToInteger(input);
	}
	@Test(expected = IncorrectInputException.class )
	public void test_exception_viv() throws IncorrectInputException {
		input = "viv";
//		RomanNumerals converter = new RomanNumerals();
//		String input = "cccc";
		converter.convertToInteger(input);
	}
	@Test(expected = IncorrectInputException.class )
	public void test_exception_ll() throws IncorrectInputException {
		input = "ll";
		converter.convertToInteger(input);
	}
	@Test(expected = IncorrectInputException.class )
	public void test_exception_lxl() throws IncorrectInputException {
		input = "lxl";
		converter.convertToInteger(input);
	}
	@Test(expected = IncorrectInputException.class )
	public void test_exception_dd() throws IncorrectInputException {
		input = "dd";
		converter.convertToInteger(input);
	}
	@Test(expected = IncorrectInputException.class )
	public void test_exception_dcd() throws IncorrectInputException {
		input = "dcd";
		converter.convertToInteger(input);
	}

}
