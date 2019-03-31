package file_normierung_infosys_a3;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NormFiles {
	
	public String zwischenspeicher="";
	public String ausgabetext ="";
	public String line;

	public String read(String filename, String filenameNeu)
	{
	  try
	  {
		  BufferedReader reader=new BufferedReader( new InputStreamReader( new FileInputStream(filename) , "UTF-8") );
		  FileWriter writer = new FileWriter(filenameNeu,true);
	    String linestr;
	    while ((line = reader.readLine()) != null){
	    	
	    	for(int i = 0; line.length()>i;i++) {
	    		
	    		if(line.charAt(i)=='"') {
	    			linestr="";
	    		}else {
	    			linestr = String.valueOf(line.charAt(i));
	    		}
	    		
	    		switch (linestr) {
//	    		case "ä": linestr="ae";break;
//	    		case "ö": linestr="oe";break;
//	    		case "ü": linestr="ue";break;
//	    		case "Ä": linestr="ae";break;
//	    		case "Ö": linestr="oe";break;
//	    		case "Ü": linestr="ue";break;
//	    		case ".": linestr="";break;
	    		case ",": linestr="";break;
	    		case "+": linestr="";break;
	    		case "-": linestr="";break;
	    		case "_": linestr="";break;
	    		case "'": linestr="";break;
	    		case "!": linestr="";break;
	    		case "$": linestr="";break;
	    		case "%": linestr="";break;
	    		case "&": linestr="";break;
	    		case "/": linestr="";break;
	    		case "(": linestr="";break;
	    		case ")": linestr="";break;
	    		case "=": linestr="";break;
	    		case "`": linestr="";break;
	    		case "´": linestr="";break;
	    		case "*": linestr="";break;
	    		case "~": linestr="";break;
	    		case ">": linestr="";break;
	    		case "<": linestr="";break;
	    		case "|": linestr="";break;
	    		case "#": linestr="";break;
	    		case ";": linestr="";break;
	    		case ":": linestr="";break;
	    		case "}": linestr="";break;
	    		case "{": linestr="";break;
	    		case "]": linestr="";break;
	    		case "[": linestr="";break;
	    		case "?": linestr="";break;
	    		}
	    	
	    		
	    		zwischenspeicher+=linestr;
	    	}
	    	
	    	ausgabetext =zwischenspeicher;
	    	 writer.write(ausgabetext);
	    	 writer.write(System.lineSeparator());
	    	zwischenspeicher ="";
	      
	    }
	    
	   
	    writer.close();
	    reader.close();
	    return ausgabetext;
	  }
	  catch (Exception e)
	  {
	    System.err.format("Exception occurred trying to read '%s'.", filename);
	    e.printStackTrace();
	    return null;
	  }
	}

}
