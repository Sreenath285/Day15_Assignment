import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    /***
     * findFrequency method is created to find frequency of words in  sentence
     * @param str - str is the data has to find the frequency
     */
    static void findFrequency(String str) {

        // created hashtable and array of string type
        Hashtable<String,Integer> map=new Hashtable<>();
        String arr[] = str.split(" ");

        // for loop to iterate
        for(int i = 0; i < arr.length; i++) {
            // condition to check if key contains word in the index
            if(map.containsKey(arr[i])) {
                // if true adding value into the map
                map.put(arr[i], map.get(arr[i])+1);
            }
            else {
                // if condition not true passing value as 1
                map.put(arr[i],1);
            }
        }
        // iterating map to print the key and value
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ " - " + entry.getValue());
        }
    }

    /***
     * main method for manipulation
     * @param args - default param(not used)
     */
    public static void main(String[] args) {

        // initializing string
        String str = "To be or not to be";
        // calling findFrequency method and passing str parameter
        findFrequency(str);

        // initializing string
        String paranoidStr = "Paranoids are not paranoid because they are paranoid but" +
                "because they keep putting themselves deliberately into paranoid situations";
        // calling findFrequency method and passing paranoidStr parameter
        System.out.println("-----------------------------");
        findFrequency(paranoidStr);
    }
}
