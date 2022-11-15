package level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LifeboatTest {

    Lifeboat lifeboat = new Lifeboat();

    @Test
    void 테스트1() {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        int answer = 3;
        int result = lifeboat.solution(people, limit);
        Assertions.assertThat(result).isEqualTo(answer);
    }

  @Test
    void 테스트2() {
        int[] people = {70, 80, 50};
        int limit = 100;
        int answer = 3;
        int result = lifeboat.solution(people, limit);
        Assertions.assertThat(result).isEqualTo(answer);
    }

}