package dfsbfs;

public class Network {

    public int solution(int n, int[][] computers) {
        int answer = 0;

        // 방문했는지 체크할 배열
        boolean[] check = new boolean[n];

        for(int i=0; i<n ; i++) {
            // 방문한 적 없는 경우 탐색 & +1 , 방문한 적 있는 경우 연결되어있기 때문에 하나의 네트워크로 연결되어 있다고 보면됨.. (+1 필요없음)
            if(!check[i]) {
                dfs(computers,i,check);
                answer++;
            }
        }
        return answer;
    }

    boolean[] dfs(int[][] computers, int current, boolean[] check) {
        check[current] = true;

        for(int i=0; i<computers.length; i++) {
            // 내 위치가 아니면서, 연결되어 있고, 방문한적 없을때.. 재귀 호출해서 해당 위치 true로 변경
            if(current != i && computers[current][i] == 1 && check[i] == false) {
                check = dfs(computers, i, check);
            }
        }
        return check;
    }

}
