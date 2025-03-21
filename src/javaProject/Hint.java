package javaProject;

public class Hint {
	
	private int hintNumber;
	private String hintInfomaion;
	
	public Hint() {}

	public Hint(int hintNumber, String hintInfomaion) {
		this.hintNumber = hintNumber;
		this.hintInfomaion = hintInfomaion;
	}

	public int getHintNumber() {
		return hintNumber;
	}

	public void setHintNumber(int hintNumber) {
		this.hintNumber = hintNumber;
	}

	public String getHintInfomaion() {
		return hintInfomaion;
	}

	public void setHintInfomaion(String hintInfomaion) {
		this.hintInfomaion = hintInfomaion;
	}

	@Override
	public String toString() {
		return "Hint [hintNumber=" + hintNumber + ", hintInfomaion=" + hintInfomaion + "]";
	}
	
	
}
