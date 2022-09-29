/**
 * @author Brad Davis
 * A class where a user can input their own string and test to see if it is a palindrome
 */
import java.util.Stack;
public class Palindrome {
private Stack<Character> palindromestack = new Stack<Character>();
private String palindromestring;
private boolean palindromeCheck;

/**
 * Default constructor that creates an empty palindrome
 */
public Palindrome() {
	this.palindromestring="";
}//end default constructor

/**
 * Preferred constructor that creates a palindrome with the string the user inputs, then puts each character of that string onto a stack
 * @param palindrome  The string the user wants to test and see is a palindrome
 */
public Palindrome(String palindrome) {
	this.palindromestring=palindrome;
	this.palindromestack.clear();
	this.palindromestring = palindromestring.toLowerCase();
	this.palindromestring.replaceAll("\\s", "");
	
	for(int i=0;i<this.palindromestring.length();i++) {
		this.palindromestack.push(this.palindromestring.charAt(i));
	}
}//end preferred constructor

/**
 * Method that checks if the inputed string is a palindrome
 * @return True if it is a palindrome, false if not
 */
public boolean isPalindrome() {
	for(int i=0;i<this.palindromestring.length();i++) {
		this.palindromeCheck = true;
		if(this.palindromestring.charAt(i) != this.palindromestack.pop()) {
			this.palindromeCheck = false;
			continue;
		}
	}
	return this.palindromeCheck;
}//end isPalindrome

/**
 * get method for the palindrome string
 * @return  returns the current string in the palindrome object
 */
public String getPalindromeString() {
	return palindromestring;
}//end getPalindromeString

/**
 * method to change the current string of the palindrome object
 * @param palindromestring  what the user wants the new string for the palindrome to be
 */
public void setPalindromeString(String palindromestring) {
	this.palindromestring = palindromestring;
	this.palindromestack.clear();
	this.palindromestring = palindromestring.toLowerCase();
	this.palindromestring.replaceAll("\\s", "");
	
	for(int i=0;i<this.palindromestring.length();i++) {
		this.palindromestack.push(this.palindromestring.charAt(i));
	}
}//end setPalindromeString
	
@Override
public String toString() {
	return "Palindrome [palindromestring=" + palindromestring + ", palindromeCheck=" + palindromeCheck + "]";
}//end toString
}//end Palindrome
