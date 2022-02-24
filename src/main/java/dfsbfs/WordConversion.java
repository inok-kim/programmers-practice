package dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

public class WordConversion {

    public int solution(String begin, String target, String[] words) {
        int answer = 0;

        Queue<Node> queue = new LinkedList<>();
        boolean[] visited = new boolean[words.length];

        queue.offer(new Node(begin,0));

        while(!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.println("node.word = " + node.word);
            System.out.println("node.cnt = " + node.cnt);

            if(node.word.equals(target)){
                return node.cnt;
            }

            for(int i=0; i<words.length; i++) {
                if(visited[i]) continue; // 방문한적 있으면 넘어가기..
                if(changeable(node.word, words[i])) {
                    System.out.println("changeable words[i] = " + words[i]);
                    queue.offer(new Node(words[i], node.cnt+1)); // 바꿀 수 있는 단어 queue에 넣기, cnt+1
                    visited[i] = true; // 방문 체크
                }else {
                    System.out.println("not changeable words[i] = " + words[i]);
                }
            }
        }

        return answer;
    }

    public boolean changeable(String from, String to) {
        int diffCount = 0;

        for(int i=0; i<to.length(); i++) {
            if(from.charAt(i) != to.charAt(i))
                diffCount++;
        }

        if(diffCount == 1) return true;
        return false;
    }

}

class Node {
    String word;
    int cnt;

    Node(String word, int cnt) {
        this.word = word;
        this.cnt = cnt;
    }
}