package dfsbfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TravelRoute {

    public String[] solution(String[][] tickets) {
        String[] answer;
        String firstAirport = "ICN";
        List<String> travelRoutes = new ArrayList<>();
        boolean[] visited = new boolean[tickets.length];
        int cnt = 0;

        travelRoutes = visitAirport(firstAirport, tickets, visited, cnt, firstAirport, travelRoutes);

        Collections.sort(travelRoutes);

        answer = travelRoutes.get(0).split(" ");

        return answer;
    }

    public List<String> visitAirport(String from, String[][] tickets, boolean[] visited, int cnt, String travelRoute, List<String> travelRoutes) {

        if(cnt == tickets.length) {
            travelRoutes.add(travelRoute);
            return travelRoutes;
        }

        for(int i=0; i<tickets.length; i++) {
            if(visited[i]) continue;

            if(tickets[i][0].equals(from)) {
                visited[i] = true;
                String available = tickets[i][1];
                visitAirport(available, tickets, visited, cnt+1, travelRoute+" "+available, travelRoutes);
                visited[i] = false;
            }
        }
        return travelRoutes;
    }
}
