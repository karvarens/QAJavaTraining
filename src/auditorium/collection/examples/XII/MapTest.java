package auditorium.collection.examples.XII;

import java.util.*;

/**
 * Created by karenvardanyan on 6/23/16.
 */
public class MapTest {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner("sss\u0010reeeee");
//        System.out.println(scanner.next());
//        System.out.println(scanner.next());


        Map<String, Double> salaryMap = new HashMap<>();
        salaryMap.put(null, 8888.8);
        salaryMap.put(null, 0.8);
        salaryMap.put("Paul", 8888.8);
        salaryMap.put("Shreya", 99999.9);
        salaryMap.put("Selvan", 5555.5);
        salaryMap.put("NullValue", null);

        for (String key : salaryMap.keySet() ) {
            System.out.println(salaryMap.get(key));
        }

        for (Map.Entry<String, Double> entry : salaryMap.entrySet() ) {
            System.out.println(entry);
//            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


        Iterator<Map.Entry<String,Double>> iteratorEset = salaryMap.entrySet().iterator();
        for(;iteratorEset.hasNext();){
            System.out.println(iteratorEset.next());
        }

        Collection<Double> values = salaryMap.values();
        Iterator<Double> iteratorValues = values.iterator();



        Map<String, Object> copySalaryMap = new HashMap(salaryMap);
        Set<String> keys = copySalaryMap.keySet();
        for (String k : keys)
            System.out.println(k);

        System.out.println("-----------------------");

        salaryMap.remove("Paul");
        keys = copySalaryMap.keySet();
        for (String k : keys)
            System.out.println(k);



        Set<Map.Entry<String, Double>> entries = salaryMap.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            System.out.println(entry);
        }

    }


}
