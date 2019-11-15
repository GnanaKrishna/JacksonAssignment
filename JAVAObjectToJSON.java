package Assignment.JSON;

import java.io.File;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Parse JSON Object
 *
 */
public class JAVAObjectToJSON {
	
    public static void main( String[] args ) {
    	ObjectMapper mapper = new ObjectMapper();
    	try {
        	Staff staff = createstaff();
        	//create a JSON file for staff Object
        	mapper.writeValue(new File("C:\\Users\\KATURI\\Desktop\\staff.json"), staff);
        	
        	//print staff object to JSON
        	String stringStaff = mapper.writeValueAsString(staff);
        	System.out.println("Write JAVA Object into a file -->");
        	System.out.println(stringStaff + "\n");
        	
        	//pretty printing the JSON object
        	String prettyJSONStaff = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
        	System.out.println("Printing Pretty JSON Object -->");
        	System.out.println(prettyJSONStaff);
        	
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public static Staff createstaff() {
    	Staff staff = new Staff();
    	staff.setName("Krishna");
    	staff.setAge(25);
    	staff.setPositon(new String[] {"ADMIN", "USER"});
    	Map<String, BigDecimal> salary = new HashMap<String, BigDecimal>();
    	salary.put("2018", new BigDecimal(60000));
    	salary.put("2019", new BigDecimal(70000));

    	staff.setSalary(salary);
    	staff.setSkills(Arrays.asList("Java", "Spring", "Spring Boot"));
    	return staff;
    }
}
