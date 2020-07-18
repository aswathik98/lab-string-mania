package utility;

// Type your code

public class StringAdvanceMethod{
	private String str1;
	private String str2;
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public String getStr2() {
		return str2;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	
	public String concat(String s1,String s2)
	{
		return s1+s2;
	}
	
	public String splitString(String s1,String s2)
	{
		return s1.split(s2,1).toString();
	}
	public String index(String s1,String s2)
	{
		int i = s1.indexOf(s2);
		return Integer.toString(i);
	}
}
