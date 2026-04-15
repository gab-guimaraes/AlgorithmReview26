package graphs;

import java.util.*;

public class GraphDeepCopy {

    public GraphNode copy(GraphNode graphNode) {
        if (graphNode == null) return null;
        Map<GraphNode, GraphNode> copies = new HashMap<>();
        Deque<GraphNode> queue = new ArrayDeque<>();
        copies.put(graphNode, new GraphNode(graphNode.getVal()));
        queue.add(graphNode);
        while (!queue.isEmpty()) {
            GraphNode current = queue.poll();
            // Percorre todos os vizinhos do nó atual.
            for (GraphNode neighbor : current.neighbors) {
                // Se esse vizinho ainda NÃO foi clonado:
                if (!copies.containsKey(neighbor)) {
                    // Criamos sua cópia.
                    copies.put(
                            neighbor,
                            new GraphNode(neighbor.getVal())
                    );
                    // E colocamos ele na fila para processar seus vizinhos depois.
                    queue.add(neighbor);
                }
                // Agora conectamos:
                // clone do current -> clone do neighbor
                // Isso recria as arestas do grafo original no novo grafo.
                GraphNode clonedCurrent = copies.get(current);
                GraphNode clonedNeighbor = copies.get(neighbor);
                clonedCurrent.neighbors.add(clonedNeighbor);
            }
        }
        // Retornamos a cópia do nó inicial.
        // Esse nó é a "entrada" do novo grafo clonado.
        return copies.get(graphNode);
    }
}