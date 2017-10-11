import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEmptyInput() {
		RomanNumerals roNum = new RomanNumerals();
		
		assertEquals(0, roNum.convertToInteger(""));
	}
	
	@Test
	public void testStringLengthCalculator() {
		InputSlicer iSlice = new InputSlicer();
		
		assertEquals(5, iSlice.stringLength("MMXIV"));
	}
	
	@Test
	public void testInputSlicerSliceValidString() {
		InputSlicer iSlice = new InputSlicer();
		
		char[] eResult ={ 'M', 'M', 'X', 'I', 'V' };
		
		assertArrayEquals(eResult, iSlice.sliceString("MMXIV"));
	}
	
	@Test
	public void testInputValidatorIRepeated4TimesInRow() {
		InputValidator iValidator = new InputValidator();
		
		assertEquals(true, iValidator.inputValidatorRomNum("MIIII"));
	}
	
	@Test
	public void testInputValidatorXRepeated4TimesInRow() {
		InputValidator iValidator = new InputValidator();
		
		assertEquals(true, iValidator.inputValidatorRomNum("MXXXX"));
	}
	
	@Test
	public void testInputValidatorCRepeated4TimesInRow() {
		InputValidator iValidator = new InputValidator();
		
		assertEquals(true, iValidator.inputValidatorRomNum("MCCCC"));
	}
	
	@Test
	public void testInputValidatorMRepeated4TimesInRow() {
		InputValidator iValidator = new InputValidator();
		
		assertEquals(true, iValidator.inputValidatorRomNum("MMMM"));
	}
	
	@Test
	public void testConverterWithInvalidRomNum() {
		RomanNumerals romNum = new RomanNumerals();
		
		assertEquals(0, romNum.convertToInteger("IIII"));
	}
	
	@Test
	public void testConverterWithSingleNumbers() {
		RomanNumerals romNum = new RomanNumerals();
		
		assertEquals(2, romNum.convertToInteger("II"));
	}
	
	@Test
	public void testConverterWithFourNumbers() {
		RomanNumerals romNum = new RomanNumerals();
		
		assertEquals(2014, romNum.convertToInteger("MMXIV"));
	}
	
	@Test
	public void testConverterWithNineNumbers() {
		RomanNumerals romNum = new RomanNumerals();
		
		assertEquals(1984, romNum.convertToInteger("MCMLXXXIV"));
	}

}
