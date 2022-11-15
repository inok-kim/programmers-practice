package level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeastCommonMultipleTest {

    LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple();

    @Test
    void 테스트1() {
        int[] arr = {2,6,8,14};
        int answer = 168;
        int result = leastCommonMultiple.solution(arr);
        Assertions.assertThat(result).isEqualTo(answer);
    }

    @Test
    void 테스트2() {
        int[] arr = {1,2,3};
        int answer = 6;
        int result = leastCommonMultiple.solution(arr);
        Assertions.assertThat(result).isEqualTo(answer);
    }

}