package com.bridgelabz.Day21;

import MoodAnalyzerProb.MoodAnalyserException;

public class MoodAnalyzer {
	String message;

	public MoodAnalyzer(String message) {

		this.message = message;
	}

	public String analyzeMood() throws MoodAnalyserException {
		try {
			if (this.message.length() == 0) {
				throw new MoodAnalyserException("Invalid Mood");
			}
			if (this.message.toLowerCase().contains("sad")) {
				return "sad";
			} else {
				return "happy";
			}
		} catch (NullPointerException e) {

		}
		return "happy";

	}

}
