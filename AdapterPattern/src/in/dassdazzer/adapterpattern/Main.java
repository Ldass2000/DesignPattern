package in.dassdazzer.adapterpattern;

public class Main {

	public static void main(String[] args) {
		XMLSoftware  xmlDataSoft = new XMLSoftware();
		
		JSONData xmlAdapter= new XMLToJSONDataAdapter (xmlDataSoft);
        
		xmlAdapter.readJSONData();
	}

}

/*
 * OUTPUT: 
 * UNDERSTAND ONLY XML DATA
  Convert here XML data to JSON Data
 */
