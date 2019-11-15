package Assignment.JSON;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONtoJAVAObject {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Staff staff = mapper.readValue(new File("C:\\Users\\KATURI\\Desktop\\staff.json"), Staff.class);
			System.out.println("Read JSON to JAVA Object --> "+staff);
			
			Map<String, String> map = new HashMap<String, String>();
			map.put("name", "Krishna");
			map.put("age", "25");
			
			System.out.println("Map --> " +map);
			
			String personJSON = mapper.writeValueAsString(map);
			
			//Convert to Map
        	Map<String, String> staffMap = mapper.readValue(new File("C:\\Users\\KATURI\\Desktop\\staff.json"), Map.class);
        	System.out.println("Read JSON to Map --> "+ staffMap);
			
			//map to JAVA Object
			Person person = mapper.readValue(personJSON, Person.class);
			System.out.println("Map to JAVA Object --> "+person);
			
			String testJSON = "[{\"name\":\"Krishna\", \"age\":25}, {\"name\":\"GK\", \"age\":25}]";
			//Creating JAVA List Object
			List<Person> personList = Arrays.asList(mapper.readValue(testJSON, Person[].class));
			System.out.println("Read JSON String to JAVA List Object --> "+personList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
