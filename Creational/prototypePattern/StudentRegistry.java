package main.java.prototypePattern;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map = new HashMap<String, Student>();

    public void register(String key, Student student){
        map.put(key, student);
    }

    public Student get(String key){
        return map.get(key);
    }
}
