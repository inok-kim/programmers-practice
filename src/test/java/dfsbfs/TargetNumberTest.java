package dfsbfs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TargetNumberTest {

    TargetNumber targetNumber = new TargetNumber();

    @Test
    void solution1() {
        // given
        int[] numbers = {1,1,1,1,1};
        int target = 3;

        // when
        int answer = targetNumber.solution(numbers, target);

        // then
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void solution2() {
        // given
        int[] numbers = {4,1,2,1};
        int target = 4;

        // when
        int answer = targetNumber.solution(numbers, target);

        // then
        Assertions.assertThat(answer).isEqualTo(2);
    }

}