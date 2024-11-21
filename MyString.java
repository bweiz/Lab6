
public class MyString {
	private String letter;
	
	public MyString(String letter) {
		this.letter = letter;
	}
	
	@Override
	public int hashCode() {
		int letterCode = (int)letter.charAt(0) - 64;
		letterCode = 31 * letterCode;
		return letterCode;
	}
	
	public String printLetter() {
		return letter;
	}
}
