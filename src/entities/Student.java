package entities;

public class Student {
	public String name;
	public double firstScore;
	public double secondScore;
	public double thirdScore;
	
	public double finalGrade() {
		return firstScore + secondScore + thirdScore;
	}

	public String passFail() {
		if ((firstScore + secondScore + thirdScore) >= 60) {
			return "PASS";
		} else {
			return "FAILED";
		}
	}
}
