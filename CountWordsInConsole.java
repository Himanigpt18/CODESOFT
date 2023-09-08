import java.util.Scanner;
import java.util.StringTokenizer;


public class CountWordsInConsole {
	
	public int countWords(String sentence){
		
		StringTokenizer t = new StringTokenizer(sentence, ".!?, ");
		
		int counter = t.countTokens();
 
		return counter;
	}
	
	public static void main(String [] args){
		
		CountWordsInConsole count = new CountWordsInConsole();
		
		System.out.println("Please specify a sentence: ");
		
		Scanner in = new Scanner(System.in);
		
		String sentence = in.nextLine();
		
		System.out.println("Your sentence is " + sentence);
		
		int mainCounter = count.countWords(sentence);
		
		System.out.println("Your sentence has " + mainCounter + " words.");
	}
	
}
