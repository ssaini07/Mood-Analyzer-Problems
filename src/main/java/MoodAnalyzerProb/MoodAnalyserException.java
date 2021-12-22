package MoodAnalyzerProb;

public class MoodAnalyserException extends Exception {
	public enum ExceptionType {
		EMPTY, NULL;
	}
	public String message;

	public MoodAnalyserException(String message){
        this.message = message;
        
}
}
