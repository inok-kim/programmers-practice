package bruteforcesearch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarpetTest {

    Carpet carpet = new Carpet();

    @Test
    void solution1() {
        int brown = 10;
        int yellow = 2;
        int[] answer = carpet.solution(brown, yellow);
        assertThat(answer).containsExactly(4,3);
    }

    @Test
    void solution2() {
        int brown = 8;
        int yellow = 1;
        int[] answer = carpet.solution(brown, yellow);
        assertThat(answer).containsExactly(3,3);
    }

    @Test
    void solution3() {
        int brown = 24;
        int yellow = 24;
        int[] answer = carpet.solution(brown, yellow);
        assertThat(answer).containsExactly(8,6);
    }
}