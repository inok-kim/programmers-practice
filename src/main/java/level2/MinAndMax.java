package level2;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MinAndMax {

    class Solution {
        public String solution(String s) {
            String answer = "";

            String[] numbers = s.split(" ");

            int min = 0;
            int max = 0;
            for(String n : numbers) {
                int number = Integer.valueOf(n);
                if(min == 0 || number < min) min = number;
                if(max == 0 || number > max) max = number;
            }

            answer = min + " " + max;

            return answer;
        }
    }

}
