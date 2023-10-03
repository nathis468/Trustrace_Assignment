import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Graph {
    int vertex;
    List<List<Integer>> al;

    public Graph(int vertex) {
        this.vertex = vertex;
        al = new ArrayList<>(vertex);
        for (int i = 0; i < vertex; i++) {
            al.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        al.get(u).add(v);
        al.get(v).add(u);
    }

    public void DFS(int source) {
        boolean[] visited = new boolean[vertex];
        Stack<Integer> stack = new Stack<>();

        visited[source] = true;
        stack.push(source);

        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            System.out.print(vertex + " ");

            for (int neighbor : al.get(vertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
    }
}

public class Graph1 {
    public static void main(String[] args) {
        int vertices = 7;
        Graph graph = new Graph(vertices);
        
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        System.out.println("Depth First Traversal (starting from vertex 0): ");
        graph.DFS(0);
    }
}