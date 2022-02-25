package bruteforcesearch;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    PrimeNumber primeNumber = new PrimeNumber();

    @Test
    void solution1() {
        String numbers = "17";
        int answer = primeNumber.solution(numbers);
        assertThat(answer).isEqualTo(3);
    }

    @Test
    void solution2() {
        String numbers = "011";
        int answer = primeNumber.solution(numbers);
        assertThat(answer).isEqualTo(2);
    }
}