import java.util.*;

class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();
        for (int[] e : edges) { adj[e[0]].add(e[1]); adj[e[1]].add(e[0]); }

        boolean[] vis = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (vis[i]) continue;
            Queue<Integer> q = new LinkedList<>(Arrays.asList(i));
            vis[i] = true;
            int vCount = 0, eCount = 0;

            while (!q.isEmpty()) {
                int curr = q.poll();
                vCount++;
                eCount += adj[curr].size();
                for (int next : adj[curr]) {
                    if (!vis[next]) { vis[next] = true; q.offer(next); }
                }
            }
            if (eCount == vCount * (vCount - 1)) count++;
        }
        return count;
    }
}
