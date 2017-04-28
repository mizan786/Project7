import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mizan on 4/15/2017.
 */
public class extendedHasMap {
    public static void main(String[] args) {
        List<String> employeeOfChaseBank = new ArrayList<String>();
        employeeOfChaseBank.add("John");
        employeeOfChaseBank.add("Micheal");
        employeeOfChaseBank.add("Austin");
        List<String> employeeOfCitiBank = new ArrayList<String>();
        employeeOfCitiBank.add("Sender");
        employeeOfCitiBank.add("Ami");
        employeeOfCitiBank.add("Jenin");
        List<String> employeeOfTdBank = new ArrayList<String>();
        employeeOfTdBank.add("Rafique");
        employeeOfTdBank.add("Tomal");
        employeeOfTdBank.add("Mitu");

        Map<String,List<String>> employeeList = new LinkedHashMap<String,List<String>>();

        employeeList.put("Chase Bank",employeeOfChaseBank);
        employeeList.put("Citi Bank",employeeOfCitiBank);
        employeeList.put("Td Bank",employeeOfTdBank);

        for(Map.Entry<String,List<String>> map:employeeList.entrySet()){
            List<String> employeeName = map.getValue();
            System.out.print("The names of " +map.getKey()+ " employees are" +"\n");

            for(String employee:employeeName){
                System.out.println(" " + employee);
            }
            System.out.println();
        }

    }
}
