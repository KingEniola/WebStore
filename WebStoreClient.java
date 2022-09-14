/*
 *  Eniola Adegbegha
 */
public class WebStoreClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebStore ws = new WebStore("li","www.li.com","java");

	     System.out.println( "The store name > " + ws.getName() );

	     System.out.println(ws.toString());

	     System.out.println("The sales tax rate is " + ws.SALES_TAX_RATE);
	     
	     String uRL = ws.getUrl( );
	     System.out.println( "Number of players for g2 > " + uRL );

	     String programming = ws.getLanguage( );
	     System.out.println( "Programmming language is > " + programming);

	}

}
