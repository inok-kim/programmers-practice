package bruteforcesearch;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};

        int total = (brown+4)/2;
        int numberA = total/2;
        while(total-numberA>2) {
            int numberB = total-numberA;
            if(yellow == (numberA-2)*(numberB-2)) {
                if(numberA > numberB) {
                    return new int[]{numberA, numberB};
                }else {
                    return new int[]{numberB, numberA};
                }

            }else {
                numberA++;
            }
        }
        return answer;
    }
}
