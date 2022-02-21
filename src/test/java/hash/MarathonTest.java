package hash;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MarathonTest {

    Marathon marathon = new Marathon();

    @Test
    void solution1() {
        // given
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        // when
        String answer = marathon.solution(participant, completion);

        // then
        assertThat(answer).isEqualTo("leo");
    }

    @Test
    void solution2() {
        // given
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        // when
        String answer = marathon.solution(participant, completion);

        // then
        assertThat(answer).isEqualTo("vinko");

    }

    @Test
    void solution3() {
        // given
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        // when
        String answer = marathon.solution(participant, completion);

        // then
        assertThat(answer).isEqualTo("mislav");

    }
}