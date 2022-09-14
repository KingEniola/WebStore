/*
 * Eniola Adegbegha
 */
public class WebStore extends Store {

	private String url;
	private String language;
	
	public WebStore(String newName,String newUrl, String newLanguage)
	{
		super(newName);
		url=newUrl;
		language=newLanguage;
	}
	
	public String getUrl()
	{
		return url;
	}
	
	public String getLanguage()
	{
		return language;
	}
	
	public String toString()
	{
		return super.toString() + "\tURL> " + url + "\tProgramming Language: " + language;
	}
}
