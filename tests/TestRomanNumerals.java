import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test() {
		String romanNum = "MMMCM";
		RomanNumerals rom = new RomanNumerals();
		int sum = rom.convertToInteger(romanNum);
		
		assertEquals(sum, 3900, sum);
		
	}
	
	@Test
	public void TooManyM() {
		String romanNum = "MMMMMMMMC";
		RomanNumerals rom = new RomanNumerals();
		int sum = rom.convertToInteger(romanNum);
		
		assertEquals(sum, 0, sum);
	}
	
	@Test
	public void WrongLetterWithM() {
		String romanNum = "IM";
		RomanNumerals rom = new RomanNumerals();
		int sum = rom.convertToInteger(romanNum);
		
		assertEquals(sum, 0, sum);
	}
	
	@Test
	public void TooManyV() {
		String romanNum = "VV";
		RomanNumerals rom = new RomanNumerals();
		int sum = rom.convertToInteger(romanNum);
		
		assertEquals(sum, 0, sum);
	}
	
	@Test
	public void SomeRow() {
		String romanNum = "MCMIV";
		RomanNumerals rom = new RomanNumerals();
		int sum = rom.convertToInteger(romanNum);
		
		assertEquals(sum, 0, sum);
	}
	
	@Test
	public void SomeWrongRow() {
		String romanNum = "MCMIIV";
		RomanNumerals rom = new RomanNumerals();
		int sum = rom.convertToInteger(romanNum);
		
		assertEquals(sum, 0, sum);
	}
	
	@Test
	public void IIIRow() {
		String romanNum = "III";
		RomanNumerals rom = new RomanNumerals();
		int sum = rom.convertToInteger(romanNum);
		
		assertEquals(sum, 3, sum);
	}
	
	@Test
	public void VLRow() {
		String romanNum = "VL";
		RomanNumerals rom = new RomanNumerals();
		int sum = rom.convertToInteger(romanNum);
		
		assertEquals(sum, 0, sum);
	}

}
