package level2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EndToEndTest {

    EndToEnd endToEnd = new EndToEnd();

//n	words	result
//3	["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]	[3,3]
//5	["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"]	[0,0]
//2	["hello", "one", "even", "never", "now", "world", "draw"]	[1,3]

    @Test
    void test1() {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] answer = {3,3};
        int[] result = endToEnd.solution(n, words);
        Assertions.assertThat(result).isEqualTo(answer);

    }

    @Test
    void tset2() {
        int n = 5;
        String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        int[] answer = {0,0};
        int[] result = endToEnd.solution(n, words);
        Assertions.assertThat(result).isEqualTo(answer);
    }

    @Test
    void tset3() {
        int n = 2;
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        int[] answer = {1,3};
        int[] result = endToEnd.solution(n, words);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}