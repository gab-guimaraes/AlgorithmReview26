package graphs;
import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    private int val;
    public List<GraphNode> neighbors;

    public GraphNode(int val) {
        this.val = val;
        this.neighbors = new ArrayList<>();
    }

    public GraphNode() {};

    public int getVal() {
        return val;
    }
}