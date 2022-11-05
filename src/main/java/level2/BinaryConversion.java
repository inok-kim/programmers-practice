package level2;

import java.util.Arrays;

public class BinaryConversion {

    public int[] solution(String s) {
        int[] answer = {};
        int convertCount = 0;
        int removeCount = 0;
        while(!s.equals("1")) {
            int binaryNumber = 0;
            String removeZero = s.replaceAll("0","");
            removeCount += s.length() - removeZero.length();
            int number = removeZero.length();
            int count = 0;

            s = Integer.toBinaryString(Integer.valueOf(removeZero));

            while(number != 0) {
                int remainder = number % 2;
                double temp = Math.pow(10, count);
                binaryNumber += remainder * temp;
                number /= 2;
                count++;
            }
            s = String.valueOf(binaryNumber);
            convertCount++;
        }

        return new int[]{convertCount, removeCount};
    }

}
