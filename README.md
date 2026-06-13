

class Solution {
    static final int MOD = 1000000007;
    int[][] up;
    int[] depth;
    int LOG = 17;

    public int[] assignEdgeWeights(int[][] edges, int[][] queries) {
        int n = edges.length + 1;

        ArrayList<Integer>[] g = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) g[i] = new ArrayList<>();

        for (int[] e : edges) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }

        depth = new int[n + 1];
        up = new int[LOG][n + 1];

        dfs(1, 0, g);

        for (int k = 1; k < LOG; k++) {
            for (int v = 1; v <= n; v++) {
                up[k][v] = up[k - 1][up[k - 1][v]];
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0];
            int v = queries[i][1];

            int lca = lca(u, v);

            int dist = depth[u] + depth[v] - 2 * depth[lca];

            if (dist == 0) ans[i] = 0;
            else ans[i] = power(2, dist - 1);
        }

        return ans;
    }

    void dfs(int node, int parent, ArrayList<Integer>[] g) {
        up[0][node] = parent;

        for (int next : g[node]) {
            if (next != parent) {
                depth[next] = depth[node] + 1;
                dfs(next, node, g);
            }
        }
    }

    int lca(int a, int b) {
        if (depth[a] < depth[b]) {
            int t = a;
            a = b;
            b = t;
        }

        int diff = depth[a] - depth[b];

        for (int k = 0; k < LOG; k++) {
            if ((diff & (1 << k)) != 0) {
                a = up[k][a];
            }
        }

        if (a == b) return a;

        for (int k = LOG - 1; k >= 0; k--) {
            if (up[k][a] != up[k][b]) {
                a = up[k][a];
                b = up[k][b];
            }
        }

        return up[0][a];
    }

    int power(long a, long b) {
        long res = 1;

        while (b > 0) {
            if ((b & 1) == 1) res = (res * a) % MOD;
            a = (a * a) % MOD;
            b >>= 1;
        }

        return (int) res;
    }
}
