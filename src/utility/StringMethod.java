package utility;

// Type your code

public class StringMethod{
	private String input;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}
	
	public String lower(String s)
	{
		return s.toLowerCase();
	}
	public String upper(String s)
	{
		return s.toUpperCase();
	}
	
	public String firstcharacter(String s)
	{
		char ch = s.charAt(0);
		return Character.toString(ch);
	}
	public String lengthString(String s)
	{
		int len = s.length();
		return Integer.toString(len);
	}
	public String trimString(String s)
	{
		return s.trim();
		
	}
}