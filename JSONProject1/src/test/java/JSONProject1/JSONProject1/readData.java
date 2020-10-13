package JSONProject1.JSONProject1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class readData {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jesonparser=new JSONParser();
		try {
			FileReader reader=new FileReader(".\\jsonfiles\\weather.json");
			Object obj=jesonparser.parse(reader);
			JSONObject weatherJSONObj=(JSONObject)obj;
			JSONArray jsonArray = (JSONArray) weatherJSONObj.get("WeatherData");
			System.out.println(jsonArray.size());
			for(int i=0;i<jsonArray.size();i++) {
				JSONObject obj1=(JSONObject)jsonArray.get(i);
				String date=(String)obj1.get("date");
				System.out.println("Date is " +date);
				JSONArray cityArray=(JSONArray) obj1.get("City");
				
				double max=0;
				double min=1000;
				int a=0;
				int b=0;
				
				for(int j=0;j<cityArray.size();j++) {
					JSONObject obj2=(JSONObject)cityArray.get(j);
					String name=(String)obj2.get("name");
					System.out.println("the ciy is "+name);
					JSONObject weather=(JSONObject)obj2.get("weather");
					long hum=(long) weather.get("humidity");
					double temp=(double) weather.get("temp_max");
					double temp1=(double) weather.get("temp_min");
					
					//humidity calculating
					if(hum>=90) {
						System.out.println("chances of rain is higher,the humidity is " +hum);
					}
					else if(75 <= hum && hum< 90){
						System.out.println("chances of rain is not so high,,the humidity is " +hum);
					}
					else {
						System.out.println("chances of rain is low,the humidity is " +hum);
						
					}
					
					
					//calculating the temperature
					if(temp>max) {
						max=temp;
						a++;
					}
					if(a==1) {
						System.out.println("kolkata's temperature is  high");
					}
					else if(a==2) {
						System.out.println("Mumbai's temperature is high");
					}
					
					//calculating minimum temperature
					if(temp1<min) {
						min=temp1;
						b++;
					}
					if(b==1) {
						System.out.println("kolkata's temperature is  low");
					}
					else if(b==2) {
						System.out.println("Mumbai's temperature is low");
					}
					
					
					
						
				}
				
				
				
			}
			 
		}catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	            e.printStackTrace();
	      } catch (ParseException e) {
	            e.printStackTrace();
	      }

	}

	
}


