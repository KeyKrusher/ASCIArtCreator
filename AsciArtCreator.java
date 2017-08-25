import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;

// Code written by Jackson "Chubs" Clark
// This code turns a string into ascii art that works!

// int count = line.length() - line.replace(".", "").length();

// TODOS:
// Make it so that you can use either command line args are standard input (but not both) or even use an input and output file
// Make it so that the program not only outputs a string to use, but it can do a list of strings, and lines of code to copy paste
// Make it support multiple programming languages
// Make help function for both command line and 

// https://www.mkyong.com/java/how-to-read-file-from-java-bufferedreader-example/
// fw = new FileWriter(FILENAME);
// bw = new BufferedWriter(fw);

public class AsciArtCreator
{
	Scanner input = new Scanner(System.in);
	
	public String asciStringCreator(String input)
	{
		for (int i = 0; i < input.length(); i++)
		{
			// Replace every backslash with 2 backslashes, or just add another backslash right after
		}
		
		return input;
	}
	public void writeStringToFile(String outputString, String filename)
	{
		// Write string to file
	}
	public void writeFileTofile(/* Get each file name and path and such */)
	{
		// Write input file to output file
	}
	public static void help()
	{
		// Show all commands like a good neighbor (STATEFARM IS THERE)
	}
	public static void intro()
	{
		// Output tutorial type thing
		System.out.println("Welcome to the AsciArt creator for Java!");
		System.out.println("To use, either give input as directed, or type 'options' to see what you can do.");
		System.out.println("If you would like to see a help menu, type 'help' now:")
		doesUserNeedHelp = input.next().toLowerCase();
		helpIsNeeded = doesUserNeedHelp == "help" ? help();
		
	}
	public void options(String option)
	{
		
	}
	public boolean test()
	{
		// Give the program test data, and check results then return it as a boolen
		// Yes, I'm not writing a seperate unit test, deal with it.
	}
	public static void main(String[] args)
	{
		// Get input from either the command line arguments or the normal console
		intro();
		// Check for command line arguments, if none, use Scanner input, else, use command line arguments
		if (args.length != 0)
		{
			// Run command line arguments
			args[0] == "help" ? help();
		}
		else
		{
			// Run normal scanner input
		}
	}
}
