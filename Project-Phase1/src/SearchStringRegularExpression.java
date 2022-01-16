//10.Write a program to search a specific string from the given set 
//of strings using regular expressions.

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	
	public class SearchStringRegularExpression {

		  public static void main(String[] args) {
			  
		    String stringToSearch = "java is easy to understand";

		    Pattern p = Pattern.compile("easy");   // the pattern to search for
		    Matcher m = p.matcher(stringToSearch);
		    
		    // now try to find at least one match
		    if (m.find())
		      System.out.println("Found a match");
		    else
		      System.out.println("Did not find a match");
		  }
	}


