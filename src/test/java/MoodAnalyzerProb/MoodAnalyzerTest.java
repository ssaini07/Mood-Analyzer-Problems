package MoodAnalyzerProb;

import org.junit.Test;

import com.bridgelabz.Day21.MoodAnalyzer;

import junit.framework.Assert;

public class MoodAnalyzerTest {
	MoodAnalyzer moodAnalyze = new MoodAnalyzer(null);

	@Test
	public void testing() throws MoodAnalyserException {
		String actual;
		actual = moodAnalyze.analyzeMood();
		String expected = "happy";
		Assert.assertEquals(expected, actual);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void nullMood() throws MoodAnalyserException {
		MoodAnalyzer moodAnalyze = new MoodAnalyzer(" ");
		String actual = null;
		try {
			actual = moodAnalyze.analyzeMood();
		} catch (MoodAnalyserException e) {
			String expected = "Hello";
			System.out.println(e);
			Assert.assertEquals(expected, actual);
		}
	}
}
