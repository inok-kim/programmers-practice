package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Marathon {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> checkMap = new HashMap<>();
        for(String p : participant) {
            checkMap.put(p, checkMap.getOrDefault(p,0)+1);
        }
        for(String c : completion) {
            Integer tmp = checkMap.get(c);
            if(tmp == 1) {
                checkMap.remove(c);
            }else {
                checkMap.put(c, tmp-1);
            }
        }
        Set<String> keys = checkMap.keySet();
        answer = keys.iterator().next();

        return answer;
    }

}
