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
// Make help function for both command line and normal CLI
// Make it so that the program doesn't use spaces, but instead it uses escape sequences

// https://www.mkyong.com/java/how-to-read-file-from-java-bufferedreader-example/
// fw = new FileWriter(FILENAME);
// bw = new BufferedWriter(fw);

public class AsciArtCreator {
	static Scanner input = new Scanner(System.in);
	
	public static void help(boolean commandArg) {
		if (commandArg) {
			System.out.println("First argument is file or string");
			System.out.println("If a file, give the input filename, and output filename.");
			System.out.println("If a string, place the string, then say if you want a string output, or a file output.");
			System.out.println("If you select a file output, then you must give the filename.");
			input.next();
			System.exit(0);
		}
		else {
			System.out.println("");
		}
	}
	public String parser(String input) {
		for (int i = 0; i < input.length(); i++) {
			// If the character is a \. Replace with \\ to handle escapes
//			char replacement = (char) input.indexOf(i);
//			replacement.replace("\", "\\");
		}
		return input;
		//return parsedAsciArt;
	}
	public static void main(String[] args) {
		// Most of the program will be in the main function so that the program doesn't get too messy
		if (args.length != 0) {
			if (args[0] == "help") {
				help(true);
			}
			else if (args[0] == "file") {
				public static String _inputFile = args[0];
				public static String _outputFile = args[1];
			}
		}
	}
}
