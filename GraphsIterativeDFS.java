import java.util.*;
import java.io.*;

public class GraphsIterativeDFS {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ve = br.readLine().split(" ");
        int V = Integer.parseInt(ve[0]);
        int E = Integer.parseInt(ve[1]);

        HashMap<Integer, ArrayList<Integer>> graphMap = new HashMap<>();

        for (int i = 0; i < E; i++) {
            String[] edge = br.readLine().split(" ");
            int X = Integer.parseInt(edge[0]);
            int Y = Integer.parseInt(edge[1]);

            if (!graphMap.containsKey(X)) {
                graphMap.put(X, new ArrayList<Integer>());
            }
            graphMap.get(X).add(Y);

            // if graph is undirected
            if (!graphMap.containsKey(Y)) {
                graphMap.put(Y, new ArrayList<Integer>());
            }
            graphMap.get(Y).add(X);
        }

        int startVertex = Integer.parseInt(br.readLine());

        List<Integer> bfs = new ArrayList<>();
        dfsFunc(graphMap, startVertex, bfs);

        for (int i : bfs) {
            System.out.print(i + " ");
        }
    }

    public static void dfsFunc(HashMap<Integer, ArrayList<Integer>> hmap, int node, List<Integer> list) {

        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(node);
        visited.add(node);

        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            list.add(vertex);

            for (int adjacents : hmap.get(vertex)) {
                if (!visited.contains(adjacents)) {
                    stack.push(adjacents);
                    visited.add(adjacents);
                }
            }
        }
    }
}