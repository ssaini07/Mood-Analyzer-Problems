package MoodAnalyzerProb;

import org.junit.Before;
import org.junit.Test;

import com.bridgelabz.Day21.MoodAnalyzer;

import junit.framework.Assert;

public class MoodAnalyzerTest {
	MoodAnalyzer moodAnalyze;

	@Before
	public void setUp() {
		moodAnalyze = new MoodAnalyzer();
	}

	@Test
	public void testingSadMood() {
		String message = "I am in SAD Mood";
		String expected = moodAnalyze.analyzeMood("SAD");
		Assert.assertEquals(expected, message);
	}

	@Test
	public void testinHappyMood() {
		String message = "I am in Any Mood";
		String expected = moodAnalyze.analyzeMood("HAPPY");
		Assert.assertEquals(expected, message);
	}

}
