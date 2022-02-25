package bruteforcesearch;

import java.util.*;

public class PrimeNumber {

    public int solution(String numbers) {
        int answer = 0;
        boolean[] visited = new boolean[numbers.length()];
                
        Set<Integer> numbersSet = new HashSet<>();
        numbersSet = combineNumber(numbers,visited,numbersSet,"",0);

        for(Integer number : numbersSet) {
            if(isPrimeNumber(number)) {
                answer++;
            }
        }

        return answer;
    }
    
    public Set<Integer> combineNumber(String numbers, boolean[] visited, Set<Integer> numbersSet, String current, int cnt) {
        if(cnt == numbers.length()) {
            return numbersSet;
        }

        for(int i=0; i<numbers.length(); i++) {
            if(visited[i]) continue;
            visited[i] = true;
            String number = String.valueOf(numbers.charAt(i));
            numbersSet.add(Integer.valueOf(current+number));
            combineNumber(numbers, visited, numbersSet, current+number, cnt+1);
            visited[i] = false;
        }
        return numbersSet;
    }

    public boolean isPrimeNumber(int number) {
        if(number == 2) return true;
        if(number == 0 || number == 1 || number % 2 == 0) return false;

        for(int i=3; i<number/2; i+=2) {
            if(number%i ==0) {
                return false;
            }
        }
        return true;
    }

}
