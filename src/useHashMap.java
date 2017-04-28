import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mizan on 4/15/2017.
 */
public class useHashMap {
    public static void main(String[] args) {
        Map<String, String> cityList = new HashMap<String, String>();

        cityList.put("USA", "NY");
        cityList.put("UK", "London");
        cityList.put("JAPAN", "Tokyo");

        for(Map.Entry map:cityList.entrySet()){
            System.out.println(map.getKey()+ " " + map.getValue());
        }
    }
}
