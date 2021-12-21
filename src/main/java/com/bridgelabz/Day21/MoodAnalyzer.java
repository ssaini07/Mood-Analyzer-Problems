package com.bridgelabz.Day21;

public class MoodAnalyzer {
	// creating here method
	public String analyzeMood(String message) {

		if (message.contains("HAPPY")) {
			return "HAPPY";
		} else
			return "SAD";
	}

//Driver class
	public static void main(String[] args) {

		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		// System.out.println(moodAnalyzer.analyzeMood("sad"));

	}

}
