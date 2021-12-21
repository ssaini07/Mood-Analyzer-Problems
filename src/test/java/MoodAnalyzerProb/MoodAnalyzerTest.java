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
}
