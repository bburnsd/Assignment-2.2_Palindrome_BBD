import java.util.Stack;
import java.util.Scanner;
/**
 * @author Brad Davis
 * @version 9/22/2022
 * This application class uses a stack to test and see if the string is a palindrome
 */
public class Application {
	public static void main(String[] args) {
Palindrome s1 = new Palindrome("Race Car"); //Setting up the palindrome object with an actual palindrome, one capital letter and a space to make sure that it still confirms that it is a palindrome
System.out.println("Test 1 | String = " + s1.getPalindromeString() +". isPalindrome = "+ s1.isPalindrome()); //checking to see if the string is a palindrome
s1.setPalindromeString("brad");// setting the string to a word that isn't a palindrome
System.out.println("Test 2 | String = "+ s1.getPalindromeString() +". isPalindrome = "+ s1.isPalindrome()); //checking to make sure that it returns false since it isn't a palindrome
}
}
