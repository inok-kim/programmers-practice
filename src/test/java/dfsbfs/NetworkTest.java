package dfsbfs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class NetworkTest {

    Network network = new Network();

    @Test
    void solution1() {
        int n = 3;
        int[][] computers= {{1,1,0},{1,1,0},{0,0,1}};

        int answer = network.solution(n,computers);

        assertThat(answer).isEqualTo(2);
    }

    @Test
    void solution2() {
        int n = 3;
        int[][] computers= {{1,1,0},{1,1,1},{0,1,1}};

        int answer = network.solution(n,computers);

        assertThat(answer).isEqualTo(1);
    }

}