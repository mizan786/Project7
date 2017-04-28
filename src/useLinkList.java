import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Mizan on 4/15/2017.
 */
public class useLinkList {
    public static void main(String[] args) {
        LinkedList<String> cityName = new LinkedList<String>();

        cityName.add("Elmhurst");
        cityName.add("woodside");
        cityName.add("Jamaica");

        Iterator it = cityName.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //for (String city:cityName){
        //   System.out.println(city);
       //}


    }
}
