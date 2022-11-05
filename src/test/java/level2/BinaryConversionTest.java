package level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryConversionTest {

    BinaryConversion binaryConversion = new BinaryConversion();

    @Test
    void solution1() {
        int[] answer = binaryConversion.solution("110010101001");
        Assertions.assertThat(answer).isEqualTo(new int[]{3, 8});
    }
    @Test
    void solution2() {
        int[] answer = binaryConversion.solution("01110");
        Assertions.assertThat(answer).isEqualTo(new int[]{3, 3});
    }
    @Test
    void solution3() {
        int[] answer = binaryConversion.solution("1111111");
        Assertions.assertThat(answer).isEqualTo(new int[]{4, 1});
    }

}