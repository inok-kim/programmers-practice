package dfsbfs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TravelRouteTest {

    TravelRoute travelRoute = new TravelRoute();

    @Test
    void solution1() {
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};

        String[] answer = travelRoute.solution(tickets);

        assertThat(answer).containsExactly("ICN", "JFK", "HND", "IAD");
    }

    @Test
    void solution2() {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};

        String[] answer = travelRoute.solution(tickets);

        assertThat(answer).containsExactly("ICN", "ATL", "ICN", "SFO", "ATL", "SFO");
    }

}