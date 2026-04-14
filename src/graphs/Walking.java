package graphs;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Walking {

    public void bfs(GraphNode graphNode) {
        Set<GraphNode> visited = new HashSet<>();
        Queue<GraphNode> queue = new ArrayDeque<>();
        queue.add(graphNode);
        while (!queue.isEmpty()) {
            GraphNode current = queue.poll();
            if (!visited.contains(current)) {
                visited.add(current);
                System.out.println(current);
                for (GraphNode neighbors : current.neighbors) {
                    queue.add(neighbors);
                }
            }
        }
    }

    public void dfs(GraphNode graphNode, HashSet<GraphNode> visited) {
        if (visited.contains(graphNode)) return;
        visited.add(graphNode);
        System.out.println(graphNode.getVal());
        for (GraphNode g : graphNode.neighbors) {
            dfs(g, visited);
        }
    }
}
