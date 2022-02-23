package dfsbfs;

public class TargetNumber {

    public int solution(int[] numbers, int target) {
        int answer = 0;

        answer = recursiveSum(numbers, target,0, 0);

        return answer;
    }

    public int recursiveSum(int[] numbers, int target, int sum, int index) {
        if(index == numbers.length) {
            if(sum == target){
                return 1;
            }
            return 0;
        }
        // sum 값에서 +,- 두 갈래로 나누어서 계산하기..
        return recursiveSum(numbers, target, sum + numbers[index], index+1)
                + recursiveSum(numbers, target, sum - numbers[index], index+1);
    }
}
