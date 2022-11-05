package level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAlphabetTest {

    RemoveAlphabet removeAlphabet = new RemoveAlphabet();

    @Test
    void test1() {
        String s = "baabaa";
        int answer = removeAlphabet.solution(s);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void test2() {
        String s = "cdcd";
        int answer = removeAlphabet.solution(s);
        Assertions.assertThat(answer).isEqualTo(0);
    }

}