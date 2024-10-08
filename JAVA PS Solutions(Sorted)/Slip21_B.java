import java.util.Enumeration;
import java.util.Hashtable;

public class Slip21_B {
    public static void main(String[] args) {
        Hashtable<String, String> cities = new Hashtable<>();
        cities.put("New York", "212");
        cities.put("Los Angeles", "213");
        cities.put("Chicago", "312");
        cities.put("Houston", "713");
        
        // Display all entries
        System.out.println("City and STD Code:");
        Enumeration<String> keys = cities.keys();
        while (keys.hasMoreElements()) {
            String city = keys.nextElement();
            System.out.println(city + ": " + cities.get(city));
        }
        
        // Search for a specific city
        String searchCity = "Chicago";
        System.out.println("\nSTD Code for " + searchCity + ": " + cities.get(searchCity));
    }
}
