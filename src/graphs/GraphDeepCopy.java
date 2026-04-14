package graphs;

import java.util.*;

public class GraphDeepCopy {

    public GraphNode copy(GraphNode graphNode) {

        // Edge case:
        // Se o grafo recebido for nulo, não há nada para copiar.
        if (graphNode == null) return null;

        // HashMap que relaciona:
        // Nó original -> Nó clonado
        // Isso é ESSENCIAL porque:
        // quando encontrarmos novamente um nó já visitado,
        // precisamos reutilizar sua cópia ao invés de criar outra.
        Map<GraphNode, GraphNode> copies = new HashMap<>();

        // Fila para BFS traversal do grafo.
        Deque<GraphNode> queue = new ArrayDeque<>();

        // Criamos imediatamente a cópia do nó inicial.
        // Esse será o ponto de entrada do novo grafo.
        copies.put(graphNode, new GraphNode(graphNode.getVal()));


        // Começamos BFS pelo nó inicial.
        queue.add(graphNode);


        // Enquanto ainda houver nós para processar...
        while (!queue.isEmpty()) {

            // Remove próximo nó da fila.
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
                //
                // clone do current -> clone do neighbor
                //
                // Isso recria as arestas do grafo original no novo grafo.
                copies.get(current).neighbors.add(
                        copies.get(neighbor)
                );
            }
        }


        // Retornamos a cópia do nó inicial.
        // Esse nó é a "entrada" do novo grafo clonado.
        return copies.get(graphNode);
    }
}