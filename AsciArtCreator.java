import java.util.Scanner;

// Code written by Jackson "Chubs" Clark
// This code turns a string into ascii art that works!

// int count = line.length() - line.replace(".", "").length();

// TODOS:
// Make it so that you can use either command line args are standard input (but not both) or even use an input and output file
// Make it so that the program not only outputs a string to use, but it can do a list of strings, and lines of code to copy paste
// Make it support multiple programming languages
// Make help function for both command line and 

public class AsciArtCreator {
	public String asciStringCreator(String input)
	{
		for (int i = 0; i < input.length(); i++)
		{
			// Replace
		}
		
		return input;
	}
	public void writeStringToFile(String outputString, String filename)
	{
		// Write stream to file
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
	}
	public static void main(String[] args) {
		// Get input from either the command line arguments or the normal console
		intro();
		// Check for command line arguments, if none, use Scanner input, else, use command line arguments
		if (args.length != 0)
		{
			// Run command line arguments
		}
		else
		{
			// Run normal scanner input
		}
	}
}
