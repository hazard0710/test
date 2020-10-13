package JPractice.JPractice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class read {

		public static void main(String[] args) throws IOException, ParseException {
			JSONParser jesonparser=new JSONParser();
			try {
				FileReader reader=new FileReader(".\\obj\\a.json");
				Object obj=jesonparser.parse(reader);
				JSONObject myObject=(JSONObject)obj;
				String personName=(String) myObject.get("name");
				long personAge=(long) myObject.get("age");
				System.out.println("Name is" +personName+"age is "+personAge);
				JSONArray carArray=(JSONArray) myObject.get("cars");
				for(int i=0;i<carArray.size();i++) {
					JSONObject carObject=(JSONObject) carArray.get(i);
					String carName=(String) carObject.get("name");
					System.out.println(carName);
					JSONArray modelArray=(JSONArray) carObject.get("models");
					for(int j=0;j<modelArray.size();j++) {
						
						
						String a=(String) modelArray.get(j);
						System.out.println(a);	
						
					}
					System.out.println("-------------");
				}
			}
			catch(FileNotFoundException e) {
		         e.printStackTrace();
			}

		}

}
