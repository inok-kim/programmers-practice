package level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class JadenCaseTest {

    JadenCase jadenCase = new JadenCase();

    @Test
    void solution1() {
        // given
        String s = "3people unFollowed me";
        // when
        String answer = jadenCase.solution(s);
        // then
        Assertions.assertThat(answer).isEqualTo("3people Unfollowed Me");
    }
}