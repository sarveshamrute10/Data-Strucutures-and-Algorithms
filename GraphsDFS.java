import java.util.*;
import java.io.*;

public class GraphsDFS {

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

        List<Integer> dfsArr = new ArrayList<>();
        dfsFunc(graphMap, startVertex, dfsArr);

        for (int i : dfsArr) {
            System.out.print(i + " ");
        }
    }

    public static void dfsFunc(HashMap<Integer, ArrayList<Integer>> hmap, int node, List<Integer> arr) {

        HashSet<Integer> visited = new HashSet<Integer>();
        dfs(hmap, node, arr, visited);
    }

    public static void dfs(HashMap<Integer, ArrayList<Integer>> hmap, int node, List<Integer> arr,
            HashSet<Integer> set) {
        set.add(node);
        arr.add(node);

        for (int adjacents : hmap.get(node)) {
            if (!set.contains(adjacents)) {
                dfs(hmap, adjacents, arr, set);
            }
        }
    }
}
