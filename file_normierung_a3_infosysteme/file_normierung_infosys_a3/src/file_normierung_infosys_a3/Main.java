package file_normierung_infosys_a3;

public class Main {
	
	private static NormFiles read;
	private static String pfad;
	private static String pfadOut;

	
	public static void main(String[] args) {
		
		pfad ="C:\\Users\\Nikita\\Desktop\\Informationssysteme\\Aufgabe 3\\wahlverwandschaften.txt";
		pfadOut ="C:\\Users\\Nikita\\Desktop\\Informationssysteme\\Aufgabe 3\\wahlverwandschaften_clean.txt";
		
		read = new NormFiles();
		read.read(pfad,pfadOut);

	}

}
