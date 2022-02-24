package dfsbfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordConversionTest {

    WordConversion wordConversion = new WordConversion();

    @Test
    void solution1() {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        int answer = wordConversion.solution(begin,target,words);

        assertEquals(answer, 4);
    }

    @Test
    void solution2() {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log"};

        int answer = wordConversion.solution(begin,target,words);

        assertEquals(answer, 0);
    }

    @Test
    void solution3() {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "hog", "dot", "dog", "lot", "log", "cog"};

        int answer = wordConversion.solution(begin,target,words);

        assertEquals(answer, 3);
    }
}