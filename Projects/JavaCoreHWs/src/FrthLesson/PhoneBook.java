package FrthLesson;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class PhoneBook {
    private Map<String, String> phoneList = new HashMap<>();

    public void add(String phone, String name){
        phoneList.put(phone,name);
    }



        public String getPhoneByName(String name){
            if(phoneList.containsValue(name)){
                String result = "Phone numbers: ";
                for(String key: phoneList.keySet()){
                    if(phoneList.get(key).equals(name)) result += key +" "+ name +"; ";
                }
                return result;
            } else return "Can't find";

        }

        public Set<String> getPhoneByNameStream(String name){
            return phoneList.entrySet()
                    .stream()
                    .filter(entry -> Objects.equals(entry.getValue(), name))
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toSet());
        }
        /*System.out.println(phoneList.containsValue("Смирнов"));
        for (Map.Entry<String, String> o : phoneList.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue(phoneList.containsValue("Смирнов")));
        }*/

        //containsValue(true);
}
