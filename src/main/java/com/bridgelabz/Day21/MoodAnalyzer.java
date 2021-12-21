package com.bridgelabz.Day21;

public class MoodAnalyzer {
	String message;

	public MoodAnalyzer(String message) {

		this.message = message;
	}

	public String analyzeMood() {
		try {
			if (message.contains("happy")) {
				return "happy";
			} else
				return "sad";
		} catch (NullPointerException e) {
			System.out.println("Exception occured: " + e);
			return "happy";
		}
	}

//Driver class
	/*
	 * public static void main(String[] args) {
	 * 
	 * MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
	 * System.out.println(moodAnalyzer.analyzeMood(NULL));
	 * 
	 * }
	 */

}
