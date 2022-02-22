package lambdafunctions;

import java.util.HashMap;
import java.util.Map;

public class AssignmentQ7 {
	public static void main(String[] args) 
    {
    	HashMap<String, Integer> map = new HashMap<String, Integer>();
    	map.put("one", 1);
    	map.put("Two", 2);
    	map.put("Three", 3);
    	map.put("Four", 4);
    	String str = convertKeyValueToString(map);
    	System.out.println(str);
    }
    public static String convertKeyValueToString(HashMap<String, Integer> map) {
        StringBuilder str = new StringBuilder();
        for(Map.Entry mapElement:map.entrySet()){
            str.append(mapElement.getKey());
            str.append(mapElement.getValue());
        }

        return str.toString();
    }

}
