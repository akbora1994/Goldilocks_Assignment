
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Map<String, Integer> hm = new HashMap<>();

        hm.put("Ram", 36);
        hm.put("Shyam", 60);

        // Searching for values by name here..
        String searchByName = "Shyam";

        // Checking if the name exists in the HashMap or not..
        if(hm.containsKey(searchByName)) {
        	
            int age = hm.get(searchByName);
            System.out.println("Age of " + searchByName + " is " + age);
            
        }
        else{
            System.out.println(searchByName + " Not found!");
        }
	}

}
