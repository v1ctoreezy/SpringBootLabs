package ru.cherkasov.FirstLab.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class HelloController {
    ArrayList<String> stringList;
    HashMap<String, String> hashMap;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/update-array")
    public String updateArrayList(@RequestParam(value = "input", defaultValue = "Hasbik") String input) {
        if (stringList == null) {
            stringList = new ArrayList<String>();
        }
        stringList.add(input);
        return "Value added to the ArrayList: " + input;
    }

    @GetMapping("/show-array")
    public ArrayList<String> showArrayList() {
        return stringList;
    }

    @GetMapping("/update-map")
    public String updateHashMap(@RequestParam(value = "input", defaultValue = "Cho-to") String input) {
        if (hashMap == null) {
            hashMap = new HashMap<String, String>();
        }
        hashMap.put(String.format("input %count", hashMap.size() + 1), input);
        return "Value added to the HashMap: " + input;
    }

    @GetMapping("/show-map")
    public HashMap<String, String> showHashMap() {
        return hashMap;
    }

    @GetMapping("/show-all-lenght")
    public String showAllLenght() {
        int arrayListSize = stringList != null ? stringList.size() : 0;
        int hashMapSize = hashMap != null ? hashMap.size() : 0;
        return "ArrayList size: " + arrayListSize + ", HashMap size: " + hashMapSize;
    }
}
