package DfsAndBfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static String BFS(int start, int[] graph, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        StringBuffer sb = new StringBuffer();

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int idx = queue.poll();
            sb.append(idx + " > ");
            for (int i = 0; i < graph.length; i++) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        return sb.substring(0, sb.length() - 2);
    }

    public static void main(String[] args) {
        int[] graph = {1, 2, 3, 4, 5};
        boolean[] visited = new boolean[graph.length];

        System.out.println(BFS(0, graph, visited));

    }

}
