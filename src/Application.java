import java.util.Stack;
import java.util.Scanner;
/**
 * @author Brad Davis
 * This application class uses a stack to test and see if the string is a palindrome
 */
public class Application {
	public static void main(String[] args) {
StringBuilder reverse = new StringBuilder();
Stack<Character> stackp = new Stack<Character>();
Scanner scan = new Scanner(System.in);
String palindrome;
System.out.print("Enter a string: "); //Has the user input a string
palindrome = scan.next();

for(int i=0;i<palindrome.length();i++) {//pushes each letter of the palindrome onto the stack
	stackp.push(palindrome.charAt(i));
}

for(int i=0;i<palindrome.length();i++) {//pops each letter off of the palindrome into a new string
	reverse.append(stackp.pop());
}

if(palindrome.equals(reverse.toString())) {//checks if the string is a palindrome
	System.out.println("The string is a palindrome" + "\nOriginal String: " + palindrome + "\nReversed String: " + reverse.toString() + "\n");
}
else {
	System.out.println("The string is not a palindrome" + "\nOriginal String: " + palindrome + "\nReversed String: " + reverse.toString() + "\n");
}
}
}
