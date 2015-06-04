package web;

public class ServletHelper {


	
	public static String createHead( String title )

	{
		StringBuilder output = new StringBuilder();
		output.append("<html>");
		output.append("<head>");
		output.append("<title>" + title + "</title>");
		output.append("</head>");
		return output.toString();
	}
}
